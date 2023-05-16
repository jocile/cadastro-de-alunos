import java.util.Scanner;

public class aluno {
    public String nome, sexo, endereco, cidade, estado, nomeDoPai, nomeDaMae;
    public int cep, rg, grauDeEscolaridade, telefone, dataDeNascimento;

    public aluno(String nome, String sexo, String endereco, String cidade, String estado, String nomeDoPai, String nomeDaMae,
                 int cep, int rg, int grauDeEscolaridade, int telefone, int dataDeNascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.nomeDoPai = nomeDoPai;
        this.nomeDaMae = nomeDaMae;
        this.cep = cep;
        this.rg = rg;
        this.grauDeEscolaridade = grauDeEscolaridade;
        this.telefone = telefone;
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "aluno: " + nome + "\\n" +
                "Sexo: " + sexo + "\\n" +
                "Registro Geral (RG): " + rg + "\\n" +
                "Grau de escolaridade: " + grauDeEscolaridade + "\\n" +
                "Endereço: " + endereco + ", Cidade: " + cidade + ", Estado: " + estado + "\\n" +
                "CEP: " + cep + "\\n" +
                "Telefone: " + telefone + "\\n" +
                "Nome do pai: " + nomeDoPai + "\\n" +
                "Nome da mãe: " + nomeDaMae;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 50; i++) {
            System.out.println("Entre com os dados do aluno " + i + ":");
            aluno aluno = cadastraraluno(scanner);
            System.out.println(aluno);
        }
    }

    public static aluno cadastraraluno(Scanner scanner) {
        System.out.println("Entre com o nome:");
        String nome = scanner.next();

        System.out.println("Entre com o sexo:");
        String sexo = scanner.next();

        System.out.println("Entre com o endereço:");
        String endereco = scanner.next();

        System.out.println("Entre com a cidade onde o aluno reside:");
        String cidade = scanner.next();

        System.out.println("Entre com a sigla do estado onde o aluno reside:");
        String estado = scanner.next();

        System.out.println("Entre com o CEP (somente números):");
        int cep = scanner.nextInt();

        System.out.println("Entre com o telefone (somente números):");
        int telefone = scanner.nextInt();

        System.out.println("Entre com o nome do pai do aluno:");
        String nomeDoPai = scanner.next();

        System.out.println("Entre com o nome da mãe do aluno:");
        String nomeDaMae = scanner.next();

        System.out.println("Entre com o Registro Geral (RG) do aluno (somente números):");
        int rg = scanner.nextInt();

        System.out.println("Entre com o grau de escolaridade do aluno (0,

 1, 2, 3):");
        int grauDeEscolaridade = scanner.nextInt();

        return new aluno(nome, sexo, endereco, cidade, estado, nomeDoPai, nomeDaMae, cep, rg, grauDeEscolaridade, telefone, 0);
    }
}
