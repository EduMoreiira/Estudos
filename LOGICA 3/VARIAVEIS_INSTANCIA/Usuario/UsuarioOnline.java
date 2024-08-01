package VARIAVEIS_INSTANCIA.Usuario;

public class UsuarioOnline {
    static int totalUsuariosOnline = 0;
    String local;
    String horaDeAcesso;

    void setLocal(String local){
        this.local = local;
    }

    void setHoraDeAcesso(String horaDeAcesso){
        this.horaDeAcesso = horaDeAcesso;
    }

    void setTotalUsuariosOnline(){
        totalUsuariosOnline++;
    }

    static int getTotalUsuariosOnline(){
        return totalUsuariosOnline;
    }

    @Override
    public String toString() {
        return "UsuarioOnline{" +
                "local='" + local + '\'' +
                ", horaDeAcesso='" + horaDeAcesso + '\'' +
                '}';
    }
}
