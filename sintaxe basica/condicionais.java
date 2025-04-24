public class condicionais {
    public static void main(String[] args) {
        // Condicional simples
        int idade = 18;
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }

        // Condicional composta
        int nota = 7;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Condicional aninhada
        int numero = 10;
        if (numero > 0) {
            if (numero % 2 == 0) {
                System.out.println("Número positivo e par");
            } else {
                System.out.println("Número positivo e ímpar");
            }
        } else {
            System.out.println("Número negativo ou zero");
        }
    }
   

    
}
