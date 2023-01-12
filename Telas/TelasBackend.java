package Telas;
import java.sql.*;

public class TelasBackend {
  Login telaLogin = new Login();
  Cadastro telaCadastro = new Cadastro();

  //Chama a tela inicial/login
  public void ChamarTelaInicial(){
    telaLogin.setVisible(true);
  }  
  //Chama a tela de cadastro
  public void ChamarTeladeCadastro(){
    telaCadastro.setVisible(true);
  }
  //Chama a tela de login de cliente
  public void ChamarTelaCliente(String email){
    Client client = new Client();
    client.setUser("Cliente", email);
    client.setVisible(true);
  }
  //Chama a tela de login de profissional
  public void ChamarTelaProf(String email, String type){
    Professional prof = new Professional();
    prof.setUser(type, email);
    prof.setVisible(true);
  }
}