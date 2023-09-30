import java.util.Scanner;

public class DivisiblePor2y3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        boolean exit;
        int numero = 0;
        do {
            exit = false;
            clean();
            System.out.println("Ingresa el numero a validar");
            aux = sc.nextLine();
            try {
                numero = Integer.parseInt(aux);
                exit = true;
            } catch (NumberFormatException ex) {
                System.out.println(
                        "El numero ingresado no es correcto, debe ser entero y no debe contener caracteres");
                System.out.println(
                        "Presiona enter para volver a intentar...");
                sc.nextLine();
            }
        } while (!exit);
        sc.close();
        if (numero % 2 == 0 && numero % 3 == 0)
            System.out.println("El numero es divisible entre 2 y 3");
        else
            System.out.println("El numero NO es divisible entre 2 y 3");
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
