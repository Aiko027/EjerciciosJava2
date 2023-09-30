import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContraseniaValida {
    public static void main(String args[])
    {
        List<Usuarios> usuarios = new ArrayList<Usuarios>();
        Usuarios usuarioTemp;
        usuarioTemp=new Usuarios("admin","admin");
        usuarios.add(usuarioTemp);
        usuarioTemp=new Usuarios("itadmin","pass");
        usuarios.add(usuarioTemp);
        usuarioTemp=new Usuarios("aiko","midori2020");
        usuarios.add(usuarioTemp);
        usuarioTemp=new Usuarios("BestProgramerEver404","HTMLIsAProgramerLenguajeXoXo");
        usuarios.add(usuarioTemp);
        usuarioTemp=new Usuarios("bar","youneedtobuyadrinkfirst"); 
        usuarios.add(usuarioTemp);
        /* Sobre el cuarto usuario, va con un chiste que anexo abajo :p
        
        Me : What's the wifi password?
        Bartender : you need to buy a drink first.
        
        Me : Okay, I'll have a coke.
        
        Bartender : Is Pepsi ok?
        
        Me : Sure, How much is that?
        
        Bartender : 3$
        
        Me : There you go. So what's the wifi password?
        
        Bartender : you need to buy a drink first. No spaces, all lowercase. */
        Scanner sc = new Scanner(System.in);
        String user=null,pass=null;
        boolean usuarioEncontrado=false;
        System.out.println("Ingresa tu usuario:");
        user=sc.nextLine();
        System.out.println("Ingresa tu contrasenia:");
        pass=sc.nextLine();
        sc.close();
        usuarioTemp = new Usuarios(user,pass);
        for (Usuarios usuarioAux : usuarios) {
            if(usuarioAux.user.equals(usuarioTemp.user)&&usuarioAux.pass.equals(usuarioTemp.pass))
            {
                System.out.println("Bienvenid@ "+usuarioTemp.user);
                usuarioEncontrado=true;
                break;
            }
        }
        if(!usuarioEncontrado)
            System.out.println("Su usuario no existe, saquese de aqui");
    }
    
    public static class Usuarios
    {
        String user;
        String pass;
        
        public Usuarios(String user, String pass)
        {
            this.user=user;
            this.pass=pass;
        }
    }
}