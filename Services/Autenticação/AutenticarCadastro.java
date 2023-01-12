package Services.Autenticação;

import Services.Connect.ConSQLRegister;

public class AutenticarCadastro{
  VerificarSenhaEmail check = new VerificarSenhaEmail();
  //Faz a Autenticação da tela de cadastro
  public void AuntenticaCadastro(String email, String senha, String confS, String perfil){
    boolean checkEmail = check.veriEmail(email);
    boolean checkSenha = check.veriSenha(senha);
    if(checkEmail == true && checkSenha == true && senha.compareTo(confS) == 0){
      //Chama a função de cadastro na classe ConnectSQLite
      ConSQLRegister cadastro = new ConSQLRegister();   
      cadastro.cadastrar(email, senha, perfil);
    }
  }
}