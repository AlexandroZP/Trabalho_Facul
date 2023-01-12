package Services.Connect;

import java.sql.*;

public class SearchSQLite{

  private Connection connection;
  //Função que busca os dados na tabela e retorna se existe ou não
  public boolean buscarSQL (String email, String password){
    try{
      this.connection = DriverManager.getConnection("jdbc:sqlite:registros.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);
      String query = "select * from person";
      ResultSet rs = statement.executeQuery(query);
      // Checa linha a linha do banco
      while(rs.next())
      { 
        //Se encontrado o usuario, cuja a senha e login batem, ele retorna true
        if(email.compareTo(rs.getString("name")) == 0 && password.compareTo(rs.getString("password")) == 0 ){
          return true;
        }
      }
      return  false;
      
    }catch(SQLException e)
    {
      System.err.println(e.getMessage());
      return false;
    }    
  }
}