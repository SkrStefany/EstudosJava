public class vetor {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = i + 1;
        }
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
        System.out.println("O tamanho do vetor é: " + vetor.length);
    
} }
