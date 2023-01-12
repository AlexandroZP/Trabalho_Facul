package Services.Connect;

import java.sql.*;

public class ConSQLRegister{
  private Connection connection;
  SearchSQLite search = new SearchSQLite();
  //Função de cadastro
  public void cadastrar(String email, String password, String perfil) {  
    try
    {        
      this.connection = DriverManager.getConnection("jdbc:sqlite:registros.db");
      Statement statement = this.connection.createStatement();
      statement.setQueryTimeout(30);  
      statement.execute("create table if not exists person (name string, password string, perfil string);");
      //Checa se o login e senha já existem no banco dados
      boolean find = search.buscarSQL(email, password);
      //Se não existir ele efetua o cadastro normalmente
      if(find == false){
        statement.executeUpdate("insert into person values('"+email+"','"+password+"','"+perfil+"');");
        System.out.println("Usuario Cadastrado com sucesso!");
      }else{
        System.out.println("ERRO! Usuario já existe em nosso banco de dados! ");
      }
    } catch(SQLException e)
    {
      System.err.println(e.getMessage());
    }
  }

}