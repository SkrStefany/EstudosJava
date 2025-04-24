
public class casting {
    
    public static void main(String[] args) {
        // Casting implícito (widening conversion)
        int numeroInt = 10;
        double numeroDouble = numeroInt; // int para double
        System.out.println("Casting implícito: " + numeroDouble);

        // Casting explícito (narrowing conversion)
        double numeroDouble2 = 10.5;
        int numeroInt2 = (int) numeroDouble2; // double para int
        System.out.println("Casting explícito: " + numeroInt2);

}
