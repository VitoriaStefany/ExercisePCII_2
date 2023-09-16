

package transporte;

public class Transporte {
    
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta();
        b1.setMarca("Caloi");
        b1.setCor("Branca");
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        b1.acelerar();
        
        System.out.println(b1.toString());        
        System.out.println(b1.imprimirEstados());
    }
    
}
