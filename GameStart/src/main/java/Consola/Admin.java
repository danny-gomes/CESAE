package Consola;

public class Admin {
    public static void menuAdmin() {
        System.out.println("MENU ADMIN AINDA NAO IMPLEMENTADO.");
    }

    /**
     * Método que valida login de Admin.
     * @param login Matriz com os dados de login dos admin.
     * @param username User introduzido pelo utilizador para login
     * @param password Password introduzida pelo utilizador para login.
     * @return true se login válido.
     */
    public static boolean loginAdmin(String[][] login, String username, String password) {
        for (int i = 0; i < login.length; i++) {
            if (login[i][0].equals(username) && login[i][1].equals(password)) {
                return true;
            }
        }
        return false;
    }
}
