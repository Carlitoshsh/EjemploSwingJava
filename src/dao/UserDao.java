/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.User;
import utils.ConexionBase;

/**
 *
 * @author Test
 */
public class UserDao implements IUserDao{

    @Override
    public void insertarUsuario(User user) {
        try {
            // Obtiene la conexion de base de datos (revise implementacion)
            Connection conexionSql = ConexionBase.obtenerConexionBaseDatos();
            String sql = "INSERT INTO user(id, email, name) values(?,?,?)";
            PreparedStatement statement = conexionSql.prepareStatement(sql);
            // Inicia desde 1
            statement.setInt(1, user.getId());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getName());
            int rowsUpdated = statement.executeUpdate();
            // Muestra un mensaje exitoso
            if(rowsUpdated > 0){
                JOptionPane.showMessageDialog(null, "El registro "+user.getName()
                        +" fue creado exitosamente !"); 
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Código : "
                    + ex.getErrorCode() + "\nError :" + ex.getMessage());
        }
    }

    @Override
    public ArrayList<User> obtenerUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<User> obtenerUsuarios(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void borrarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actualizarEmailUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
