/*Criar uma tela (swing) de login e senha com as seguintes condições:

1) o login deve ser email 
2) A senha deve ser no minimo 6 caracteres.

Ao clicar no botao "entrar', o sistema deve verificar no banco de dados mysql se o usuário e a seha existem. Em caso positivo enviar a mensagem "usuário logado".

Em caso negativo enviar a mensagem 'login ou senha inválidos'.

Criar uma tela para permitir o cadastro do login e senha de novos usuários.*/
import Telas.*;

class Main {
  public static void main(String[] args) {
    //Chama a tela inicial(LOGIN)
    TelasBackend tela = new TelasBackend();
    tela.ChamarTelaInicial();
  }
}