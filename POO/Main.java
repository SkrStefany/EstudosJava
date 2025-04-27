package POO;

public class Main {
    public static void main(String[] args) {
        // Criar o objeto Rex
        Cachorro rex = new Cachorro();
        
        // Definir o nome e a idade
        rex.nome = "Rex";
        rex.idade = 2;

        // Fazer o Rex latir
        rex.latir();

        // Fazer o Rex fazer aniversário
        rex.aniversario();

        // Fazer o Rex latir de novo
        rex.latir();
    }
}
