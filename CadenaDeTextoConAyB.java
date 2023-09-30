import java.util.Scanner;

public class CadenaDeTextoConAyB {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String aux = null;
        System.out.println("Ingresa la cadena de texto a validar: ");
        aux = sc.nextLine();
        sc.close();
        aux = aux.toLowerCase();
        if (aux.contains("a") && aux.contains("b"))
            System.out.println("La cadena contiene A & B");
        else
            System.out.println("La cadena NO contiene A & B");
        
    }

}
