public class aluno {
    public String nome, sexo, endereco, cidade,
            estado, nomeDoPai,nomeDaMae ;
    public int cep, rg, grauDeEscolaridade, telefone, dataDeNascimento;
    
    public static void main(String[] args) {
        aluno aluno1 = new aluno();
        aluno1.nome = "André Martins";
        aluno1.sexo = "Masculino";
        aluno1.endereco = "Rua Santo Antonio, 29 - Centro";
        aluno1.cidade = "São Paulo";
        aluno1.estado = "SP";
        aluno1.nomeDoPai = "João Martins";
        aluno1.nomeDaMae = "Maria Martins";
        aluno1.telefone = 2344565;
        aluno1.cep = 102456827;
        aluno1.rg = 345644334;
        aluno1.dataDeNascimento = 71281;
        aluno1.grauDeEscolaridade = 2;
        
        System.out.println("Nome do aluno: "+ aluno1.nome);
        System.out.println("Sexo do aluno: "+ aluno1.sexo);
        System.out.println("endereço do aluno: "+ aluno1.endereco);
        System.out.println("cidade do aluno: "+ aluno1.cidade);
        System.out.println("estado do aluno: "+ aluno1.estado);
        System.out.println("Nome do pai do aluno: "+ aluno1.nomeDoPai);
        System.out.println("Nome da mãe do aluno: "+ aluno1.nomeDaMae);
        System.out.println("Telefone do aluno: "+ aluno1.telefone);
        System.out.println("CEP do aluno: "+ aluno1.cep);
        System.out.println("RG do aluno: "+ aluno1.rg);
        System.out.println("Data de Nascimento do aluno: "+ aluno1.dataDeNascimento);
        System.out.println("Grau de escolaridade do aluno: "+ aluno1.grauDeEscolaridade);
    }
}
