package Patterns.Factory_Method;

public class Main {
    public static void main(String[] args) {
        FabricaNotificacoes email = new FabricaEmail();
        IntNotificacoes emailnotificacoes = email.criarNotificacoes();
        emailnotificacoes.enviar();

        FabricaNotificacoes sms = new FabricaSMS();
        IntNotificacoes smsNotificacoes = sms.criarNotificacoes();
        smsNotificacoes.enviar();

        //Implementação do novo métod0 de enviar notificações por WhatsApp
        FabricaNotificacoes whatsapp = new FabricaWhatsApp();
        IntNotificacoes whatsappNotificacoes = whatsapp.criarNotificacoes();
        whatsappNotificacoes.enviar();
    }
}
