package Patterns.Factory_Method;
//Classe para testar se funciona o principio de OCP
public class EnvioWhatsApp implements IntNotificacoes{

    @Override
    public void enviar() {
        System.out.println("Enviando por WhatsApp");
    }
}
