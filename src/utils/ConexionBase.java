package utils;

import java.io.File;
import java.io.Reader;
import java.io.FileReader;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ConexionBase {
    public static Connection obtenerConexionBaseDatos() {
        Connection conn = null;
        try {
            // Se lee archivo de configuracion que esta en la misma carpeta
            String archivo = ConexionBase.class.getResource("utils_settings.json").getFile();
            File f = new File(archivo);
            Reader reader = new FileReader(f);
            // Se utiliza la libreria Json Simple para leer un archivo json
            JSONParser parser = new JSONParser();
            JSONObject json = (JSONObject) parser.parse(reader);
            String url = (String) json.get("url");
            String user = (String) json.get("user");
            String password = (String) json.get("password");
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("*** Conectado a base de datos ***");
                return conn;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en la conexion con base de datos!"); 
            e.printStackTrace();
        }
        return conn;
    }
}
