package Dao;

import jakarta.servlet.http.HttpSession;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import static Utils.DatabaseConnector.getConnection;

public class LoginDao {

      public static boolean Login(String email , String password){

          try {
              Connection conn = getConnection();
              String sql = "SELECT * FROM User WHERE Email = ?";
              PreparedStatement stmt = conn.prepareStatement(sql);
              stmt.setString(1, email);

              ResultSet rs = stmt.executeQuery();

              if (rs.next()) {

                  String pass=rs.getString("Password");
                  if(pass.equals(password)){
                      return true;
                  }

              }
              rs.close();
              stmt.close();
              conn.close();

          } catch (Exception e) {
              e.printStackTrace();
              return false;
          }
          return false;
      }
}
