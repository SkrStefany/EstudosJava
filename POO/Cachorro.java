package POO;

public class Cachorro {
    String nome;
    int idade;

    void latir() {
        System.out.println("Au au!");
    }

    void aniversario() {
        idade++;
        System.out.println(nome + " agora tem " + idade + " anos!");
    }
}
