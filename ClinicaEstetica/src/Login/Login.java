package Login;


import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Login {

    private String loginRecorded;
    private String passwordRecorded;

    public String getLoginRecorded() {
        return loginRecorded;
    }

    public void setLoginRecorded(String loginRecorded) {
        this.loginRecorded = loginRecorded;
    }

    public String getPasswordRecorded() {
        return passwordRecorded;
    }

    public void setPasswordRecorded(String passwordRecorded) {
        this.passwordRecorded = passwordRecorded;
    }

    public Login(String loginRecorded, String passwordRecorded) {
        this.loginRecorded = loginRecorded;
        this.passwordRecorded = passwordRecorded;
    }

    public static boolean authenticate() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu login com 6 digitos");
        String loginRecorded = sc.next();
        System.out.println("Digite sua senha com 4 digitos, 2 letra e 2 números");
        String passwordRecorded = sc.next();

        if (loginRecorded.equals("Laís") && passwordRecorded.equals("12ab")) {
            System.out.printf("| Usuário ' %s ' logado com sucesso.\n", loginRecorded);
            return true;
        } else {
            System.out.println("Login ou password inválidos!");
            return false;
        }

    }
}

