import java.util.Scanner;

public class PrimoMenorQue100 {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        boolean exit, primo=true;
        int numero=0;
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
        if(numero>100)
            System.out.print("Numero mayor a 100");
        else
        {
            for(int x=2;x<numero/2;x++)
            {
                if(numero%x==0)
                {
                    primo=false;
                    break;
                }
            }
            if(primo)
                System.out.println("Es primo");
            else
                System.out.println("No es primo");
        }
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
