package login;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class koneksiDb {

    Connection koneksi = null;

    public static Connection koneksiDb() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection koneksi
                    = DriverManager.getConnection("jdbc:mysql://localhost/login", "root", "");
            return koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
