
package trabajocua;
 ramadiv
public class Division {
    public double operacion(double a, double b, double c){
    
    return a+b/c;
    }
    
}


public class Division {
    
      public double operacion(double a, double b, double c) {

        if (b == 0 || c == 0) {
            throw new ArithmeticException("No se puede dividir entre cero");
        }

        return (a + b) / c;
    }
}

 master
