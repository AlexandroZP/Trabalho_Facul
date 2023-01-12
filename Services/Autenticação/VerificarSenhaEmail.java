package Services.Autenticação;

public class VerificarSenhaEmail {
  public boolean veriEmail(String email){
    //Checa se o email passado é valído. Se tem '@'
    if(email.contains("@")){
      return true;
    }else{
      return false;
    }
  }
  public boolean veriSenha(String senha){
    // Verifica se a senha contém no minimo 6 caracteres
      if(senha.length() >= 6){
        return true;
      }else {
        return false;
      }
  }
}