import java.util.Scanner;

public class ParOMultiploDe5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        int numero=0;
        boolean exit;
        boolean par=false, multiplo5=false;
        do {
            exit = false;
            clean();
            System.out.println("Ingresa el numero a validar ");
            aux = sc.nextLine();
            
            try {
                numero=Integer.parseInt(aux);
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
        if(numero%2==0)
            par=true;
        if(numero%5==0)
            multiplo5=true;
        System.out.print("El numero ");
        if(!par)
            System.out.print("no ");
        System.out.print("es par. ");
        System.out.print("El numero ");
        if(!multiplo5)
            System.out.print("no ");
        System.out.print("es multiplo de 5 ");
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }


}
