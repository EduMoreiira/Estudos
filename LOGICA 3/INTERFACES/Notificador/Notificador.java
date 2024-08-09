package INTERFACES.Notificador;

import java.util.Date;

public interface Notificador {
    public void enviarNotificacao(String mensagem);
    public void agendarNotificacao(String mensagem, Date hora);

}
