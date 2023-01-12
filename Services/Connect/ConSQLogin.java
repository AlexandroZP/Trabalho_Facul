package Services.Connect;

import Telas.*;
import java.sql.*;

public class ConSQLogin{
  private Connection connection;
  SearchSQLite search = new SearchSQLite();
  private TelasBackend Tela = new TelasBackend();
  //Função de logar
  public void logar(String email, String password){
    //Checa se os dados existem no banco de dados
    boolean find = search.buscarSQL(email, password); 
    try{
      // Se o usuario for encontrado, efetua o login
      if(find){
        this.connection = DriverManager.getConnection("jdbc:sqlite:registros.db");
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(30);
        String query = "select * from person";
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()){

          if(email.compareTo(rs.getString("name")) == 0 && password.compareTo(rs.getString("password")) == 0 ){        
            System.out.println("Logado com sucesso!!");
            System.out.println("Email: " + rs.getString("name"));
            System.out.println("Senha: " + rs.getString("password"));
            System.out.println("Perfil: " + rs.getString("perfil"));
            if(rs.getString("perfil").compareTo("Cliente") == 0){
              Tela.ChamarTelaCliente(rs.getString("name"));
            }else{
              Tela.ChamarTelaProf(rs.getString("name"),rs.getString("perfil"));
            }
          }
        }
        

      }else{
        System.out.println("ERRO! Usuario não existe, por favor efetue o cadastro! ");
      }
    }catch(SQLException e)
    {
      System.err.println(e.getMessage());
    } 
  }
}