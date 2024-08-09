package INTERFACES.Notificador;

import java.util.Date;

public class NotificadorEmail implements Notificador {
    public String enderecoEmail;

    @Override
    public void enviarNotificacao(String mensagem) {

    }

    @Override
    public void agendarNotificacao(String mensagem, Date hora) {

    }
}
