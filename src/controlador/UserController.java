/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.IUserDao;
import modelo.User;

/**
 *
 * @author Test
 */
public class UserController {
    IUserDao userDao;
    
    public UserController(IUserDao userDao){
        this.userDao = userDao;
    }
    
    public void ingresarInformacion(User user){
        this.userDao.insertarUsuario(user);
    }
    
}
