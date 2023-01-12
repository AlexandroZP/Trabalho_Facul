package Services.Autenticação;

import Services.Connect.ConSQLogin;

public class AutenticarLogin{
  VerificarSenhaEmail check = new VerificarSenhaEmail();
//Faz a autenticação da tela de login
  public void AutenticaLogin(String email, String senha){
    boolean checkEmail = check.veriEmail(email);
    boolean checkSenha = check.veriSenha(senha);
    if(checkEmail == true && checkSenha == true) {
      //Chama a função de login na classe ConnectSQLite
      ConSQLogin login = new ConSQLogin();
      login.logar(email, senha);      
    }
  }
}