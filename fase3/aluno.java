
import java.util.Scanner;

public class aluno {
    private String nome, sexo, endereco,
            cidade, estado, nomeDoPai, nomeDaMae;
    private int cep, telefone, rg,
            dataDeNascimento, grauDeEscolaridade;

    public static void cadastraraluno(aluno aluno, Scanner scanner) {
        System.out.println("Entre com o nome:");
        aluno.nome = scanner.next();

        System.out.println("Entre com o sexo:");
        aluno.sexo = scanner.next();

        System.out.println("Entre com o endereço:");
        aluno.endereco = scanner.next();

        System.out.println("Entre com a cidade onde o aluno reside:");
        aluno.cidade = scanner.next();

        System.out.println("Entre com a sigla do estado onde o aluno reside:");
        aluno.estado = scanner.next();

        System.out.println("Entre com o CEP (somente números):");
        aluno.cep = scanner.nextInt();

        System.out.println("Entre com o telefone (somente números):");
        aluno.telefone = scanner.nextInt();

        System.out.println("Entre com o nome do pai do aluno:");
        aluno.nomeDoPai = scanner.next();

        System.out.println("Entre com o nome da mãe do aluno:");
        aluno.nomeDaMae = scanner.next();

        System.out.println("Entre com o Registro Geral (RG) do aluno (somente números):");
        aluno.rg = scanner.nextInt();

        System.out.println("Entre com o grau de escolaridade do aluno (0, 1, 2, 3):");
        aluno.grauDeEscolaridade = scanner.nextInt();
        
        System.out.println("Entre com a data de nascimento do aluno (somente números):");
        aluno.dataDeNascimento = scanner.nextInt();
    }

    public static void exibirDadosaluno(aluno aluno) {
        System.out.println("Dados do Aluno:");
        System.out.println("aluno: " + aluno.nome);
        System.out.println("Sexo: " + aluno.sexo);
        System.out.println("Registro Geral (RG): " + aluno.rg);
        System.out.println("Grau de escolaridade: " + aluno.grauDeEscolaridade);
        System.out.println("Endereço: " + aluno.endereco + ", Cidade: " + aluno.cidade + ", Estado: " + aluno.estado);
        System.out.println("CEP: " + aluno.cep);
        System.out.println("Telefone: " + aluno.telefone);
        System.out.println("Nome do pai: " + aluno.nomeDoPai);
        System.out.println("Nome da mãe: " + aluno.nomeDaMae);
        System.out.println("Data de nascimento: " + aluno.dataDeNascimento);
    }
    
    public static void main(String[] args) {
        aluno aluno = new aluno();
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 50; i++) {
            System.out.println("Entre com os dados do aluno " + i + ":");
            cadastraraluno(aluno, scanner);
            exibirDadosaluno(aluno);
            System.out.println("Quer continuar? (s ou n)");
            String resposta = scanner.next();
            if (resposta.contentEquals("n")) {
                i = 51;
            }
        }
    }
}
