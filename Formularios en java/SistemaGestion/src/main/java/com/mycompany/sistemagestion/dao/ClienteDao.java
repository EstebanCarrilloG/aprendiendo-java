/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemagestion.dao;

import com.mycompany.sistemagestion.models.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ESTEBAN
 */
public class ClienteDao {

    public Connection conectar() throws ClassNotFoundException {
        String baseDeDatos = "cursojava";
        String usuario = "root";
        String password = "123456789";
        String host = "localhost";
        String puerto = "3306";
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://" + host + ":" + puerto + "/" + baseDeDatos + "?useSSL=false";

        Connection conexion = null;

        try {
            Class.forName(driver);
            conexion = DriverManager.getConnection(url, usuario, password);

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conexion;

    }

    public void agregar(Cliente cliente) throws ClassNotFoundException {

        try {
            Connection conexion = this.conectar();
            String sql = "INSERT INTO clientes (`nombre`, `apellido`, `telefono`, `email`) VALUES ('" + cliente.getNombre() + "', '" + cliente.getApellido() + "', '" + cliente.getTelefono() + "', '" + cliente.getEmail() + " ');";
            Statement statemen = conexion.createStatement();
            statemen.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @return @throws ClassNotFoundException
     */
    public List<Cliente> listar() throws ClassNotFoundException {

        List<Cliente> listado = new ArrayList<>();

        try {
            Connection conexion = this.conectar();
            String sql = "SELECT * FROM clientes;";
            Statement statemen = conexion.createStatement();
            ResultSet resultado = statemen.executeQuery(sql);
            while (resultado.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(resultado.getString("id"));
                cliente.setNombre(resultado.getString("nombre"));
                cliente.setApellido(resultado.getString("apellido"));
                cliente.setTelefono(resultado.getString("telefono"));
                cliente.setEmail(resultado.getString("email"));
                listado.add(cliente);

            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listado;

    }

    public void editar(Cliente cliente) throws ClassNotFoundException {

        try {
            Connection conexion = this.conectar();
            String sql = "UPDATE `cursojava`.`clientes` SET `nombre` = '" + cliente.getNombre() + "', `apellido` = '" + cliente.getApellido() + "', `telefono` = '" + cliente.getTelefono() + "', `email` = '" + cliente.getEmail() + "' WHERE (`id` = '" + cliente.getId() + "');";
            Statement statemen = conexion.createStatement();
            statemen.execute(sql);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ClienteDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /**
     *
     * @param id
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void eliminar(String id) throws ClassNotFoundException, SQLException {

        Connection conexion = this.conectar();
        String sql = "DELETE FROM clientes WHERE `id` = " + id + ";";

        Statement statemen = conexion.createStatement();
        statemen.execute(sql);

    }

    public void guardar(Cliente persona, int id) throws ClassNotFoundException {
        if (id != -1) {
            editar(persona);
        } else {
            agregar(persona);
        }

    }
}
