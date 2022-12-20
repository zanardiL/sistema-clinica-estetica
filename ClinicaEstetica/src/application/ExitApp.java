package application;

public class ExitApp {
    private static boolean exitApp = false;
    public void exitApp() {
            new Thread(() -> {
                try {
                    Thread.sleep(3000);
                    exitApp = true;
                } catch (InterruptedException e) {
                    System.out.println("Até logo!");
                }
            }).start();

            while (!exitApp) {
                System.out.println(".");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("Até a próxima!");
                }
            }
            System.out.println("Até logo!");
            System.exit(0);
        }
    }

