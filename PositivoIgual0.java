import java.util.Scanner;

public class PositivoIgual0 {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        float numero=0;
        int numeroaux;
        boolean exit=false,entero=false,positivo=false;
        do {
            exit = false;
            clean();
            System.out.println("Ingresa el numero a validar ");
            aux = sc.nextLine();
            try {
                numero=Float.parseFloat(aux);
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

        if(numero>0)
            positivo=true;
        numeroaux=(int)numero;
        if(numero-numeroaux==0)
            entero=true;
        
        if(numero==0)
            System.out.println("El numero es 0, es neutro");
        else
        {
            System.out.print("El numero ");
        if(!positivo)
            System.out.print("no ");
        System.out.print("es positivo y ");
        if(!entero)
            System.out.print("no ");
        System.out.print("es entero");
        }
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
