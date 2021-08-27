/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import modelo.User;

/**
 *
 * @author Test
 */
public interface IUserDao {
    // Insert
    void insertarUsuario(User user);
    // Select
    ArrayList<User> obtenerUsuarios();   
    ArrayList<User> obtenerUsuarios(int id);
    // Delete
    void borrarUsuario(int id);
    // Update
    void actualizarEmailUsuario(int id);
    
}
