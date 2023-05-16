
import java.util.Scanner;

public class aluno {
    public String nome, sexo, endereco, cidade,
            estado, nomeDoPai,nomeDaMae ;
    public int cep, rg, grauDeEscolaridade, telefone, dataDeNascimento;
    
    public static void main(String[] args) {
                
        Scanner scanner = new Scanner(System.in);
        aluno aluno1 = new aluno();
        System.out.println("Entre com o nome:");
        aluno1.nome = scanner.next();
        System.out.println("Entre com o sexo:");
        aluno1.sexo = scanner.next();
        System.out.println("Entre com o endereço:");
        aluno1.endereco = scanner.next();
        System.out.println("Entre com a cidade onde o aluno reside:");
        aluno1.cidade = scanner.next();
        System.out.println("Entre com a sigla do estado onde o aluno reside:");
        aluno1.estado = scanner.next();
        System.out.println("Entre com o CEP (somente números):");
        aluno1.cep = scanner.nextInt();
        System.out.println("Entre com o telefone (somente números):");
        aluno1.telefone = scanner.nextInt();
        System.out.println("Entre com o nome do pai do aluno:");
        aluno1.nomeDoPai = scanner.next();
        System.out.println("Entre com o nome da mãe do aluno:");
        aluno1.nomeDaMae = scanner.next();
        System.out.println("Entre com o Registro Geral (RG) do aluno (somente números)");
        aluno1.rg = scanner.nextInt();
        System.out.println("Entre com o grau de escolaridade do aluno (0, 1, 2, 3):");
        aluno1.grauDeEscolaridade = scanner.nextInt();
        
        System.out.println("Aluno: "+ aluno1.nome);
        System.out.println("Sexo: "+ aluno1.sexo);
        System.out.println("Registro Geral (RG): "+ aluno1.rg);
        System.out.println("Grau de escolaridade: "+ aluno1.grauDeEscolaridade);
        System.out.println("Endereço: "+ aluno1.endereco + ", Cidade:" + aluno1.cidade +
                ", Estado: " + aluno1.estado);
        System.out.println("CEP: "+ aluno1.cep);
        System.out.println("Telefone: "+ aluno1.telefone);
        System.out.println("Nome do pai:" + aluno1.nomeDoPai);
        System.out.println("Nome da mãe: "+ aluno1.nomeDaMae);
    }
}
