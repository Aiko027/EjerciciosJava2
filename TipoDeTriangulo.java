import java.util.Scanner;

public class TipoDeTriangulo {
        public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        boolean exit;
        int[] numero = new int[3];
        for(int x=0;x<3;x++)
        {
            do {
                exit = false;
                clean();
                System.out.println("Ingresa el lado "+(x+1));
                aux = sc.nextLine();
                try {
                    numero[x]=Integer.parseInt(aux);
                    exit = true;
                } catch (NumberFormatException ex) {
                    System.out.println(
                            "El numero ingresado no es correcto, debe ser entero y no debe contener caracteres");
                    System.out.println(
                            "Presiona enter para volver a intentar...");
                    sc.nextLine();
                }
            } while (!exit);
        }
        sc.close();
        numero = burbuja(numero);
        if(numero[2]<numero[1]+numero[0])
        {
            if(numero[0]==numero[1])
            {
                if(numero[1]==numero[2])
                {
                    System.out.println("Triangulo equilatero");
                }
                else
                {
                    System.out.println("Triangulo isosceles");
                }
            }
            else
            {
                if(numero[1]==numero[2])
                {
                    System.out.println("Triangulo isosceles");
                }
                else
                {
                    System.out.println("Triangulo escaleno");
                }
            }
        }   
        else
        {
            System.out.println("No se puede formar un triangulo con esas medidas!");
        }
    }

    public static void clean() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static int[] burbuja(int[] A) {
        int i, j, aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;
    }
}
