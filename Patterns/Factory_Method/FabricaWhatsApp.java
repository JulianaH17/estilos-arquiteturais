package Patterns.Factory_Method;

public class FabricaWhatsApp implements FabricaNotificacoes{

    @Override
    public IntNotificacoes criarNotificacoes() {
        return new EnvioWhatsApp();
    }
}
