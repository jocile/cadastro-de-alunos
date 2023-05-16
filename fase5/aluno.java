import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;

public class CadastroalunosGUI extends JFrame {
    private JTextField nomeField, idadeField, matriculaField, cursoField;

    public CadastroalunosGUI() {
        setTitle("Cadastro de alunos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));

        panel.add(new JLabel("Nome:"));
        nomeField = new JTextField();
        panel.add(nomeField);

        panel.add(new JLabel("Idade:"));
        idadeField = new JTextField();
        panel.add(idadeField);

        panel.add(new JLabel("Matrícula:"));
        matriculaField = new JTextField();
        panel.add(matriculaField);

        panel.add(new JLabel("Curso:"));
        cursoField = new JTextField();
        panel.add(cursoField);

        JButton cadastrarButton = new JButton("Cadastrar");
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastraraluno();
            }
        });
        panel.add(new JLabel());
        panel.add(cadastrarButton);

        add(panel);
        setVisible(true);
    }

    private void cadastraraluno() {
        String nome = nomeField.getText();
        int idade = Integer.parseInt(idadeField.getText());
        int matricula = Integer.parseInt(matriculaField.getText());
        String curso = cursoField.getText();

        aluno aluno = new aluno(nome, idade, matricula, curso);
        salvaraluno(aluno);

        JOptionPane.showMessageDialog(this, "aluno cadastrado com sucesso!");

        // Limpar campos do formulário
        nomeField.setText("");
        idadeField.setText("");
        matriculaField.setText("");
        cursoField.setText("");
    }

    private void salvaraluno(aluno aluno) {
        try (FileWriter writer = new FileWriter("alunos.txt", true)) {
            String linha = aluno.nome + ";" + aluno.idade + ";" + aluno.matricula + ";" + aluno.curso + "\\n";
            writer.write(linha);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroalunosGUI();
            }
        });
    }
}

class aluno {
    public String nome;
    public int idade, matricula;
    public String curso;

    public aluno(String nome, int idade, int matricula, String curso) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.curso = curso;
    }
}
