package trabajocua;

import java.util.Scanner;

public class TrabajoCUA {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa un numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresa el sugundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingresa un tercer numero: ");
        int c = sc.nextInt();
        //Division division = new Division();
        Multiplicacion multiplicacion = new Multiplicacion();
        //System.out.println("Tu resultado de la division es: "+Division.Operacion(a, b, c));
        System.out.println("Tu resultado de la multiplicacion es: "+multiplicacion.Operacion(a, b, c));
        
    }
    
}
