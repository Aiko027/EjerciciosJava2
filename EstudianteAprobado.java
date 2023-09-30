import java.util.Scanner;

public class EstudianteAprobado {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        boolean exit;
        int calificacion=0;
        do {
            exit = false;
            clean();
            System.out.println("Ingresa la calificacion del alumno: ");
            aux = sc.nextLine();
            try {
                calificacion=Integer.parseInt(aux);
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
        if(calificacion>=60)
        {
            if(calificacion<=100)
                System.out.println("El alumno aprobo");
            else
                System.out.println("Como el alumno saco mas de 100? o.o 🤨");
        }
        else
            System.out.println("El alumno no aprobo");
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

}
