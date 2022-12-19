package Login;

import java.util.Scanner;


public class TestLogin {

    public static void main(String[] args) {


        authenticate();

}
    public static boolean authenticate() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu login com 6 digitos");
        String loginRecorded = sc.next();
        System.out.println("Digite sua senha com 4 digitos, 2 letra e 2 números");
        String passwordRecorded = sc.next();

        if (loginRecorded.equals("Lais") && passwordRecorded.equals("12ab")) {
            System.out.printf("Usuário(a) ' %s ' logado com sucesso.\n", loginRecorded);
            return true;
        } else {
            System.out.println("Login ou password inválidos!");
            return false;
        }

    }
}