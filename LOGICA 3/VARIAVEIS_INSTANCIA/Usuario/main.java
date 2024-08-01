package VARIAVEIS_INSTANCIA.Usuario;

public class main {
    public static void main(String[] args) {
        UsuarioOnline user1 = new UsuarioOnline();
        UsuarioOnline user2 = new UsuarioOnline();

        user1.horaDeAcesso = "12h";
        user1.setTotalUsuariosOnline();
        System.out.println(user1.toString());
        System.out.println(UsuarioOnline.getTotalUsuariosOnline());

        user2.horaDeAcesso = "1h";
        user2.setTotalUsuariosOnline();
        System.out.println(user2.toString());
        System.out.println(UsuarioOnline.getTotalUsuariosOnline());


    }
}
