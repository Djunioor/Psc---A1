import java.util.Scanner;

public class Livro {
    private Scanner input = new Scanner(System.in);
    private int numAlunos;

    public int getNumAlunos() {
        return numAlunos;
    }

    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public void calcularMediaDeCadaAluno() {
        while (true) {
            System.out.println("Digite a quantidade de alunos: ");
            numAlunos = input.nextInt();

            if (numAlunos <= 0) {
                System.out.println("Número inválido!");
            } else {
                break;
            }
        }

        double somaMedias = 0;

        for (int i = 1; i <= numAlunos; i++) {
            System.out.println("Notas do aluno " + i + ":");
            System.out.println("Nota da A1: ");
            double a1 = input.nextDouble();
            System.out.println("Nota da A2: ");
            double a2 = input.nextDouble();
            System.out.println("Nota da A3: ");
            double a3 = input.nextDouble();

            double media = (a1 + a2 + a3) / 3;
            somaMedias += media;

            System.out.println("A média do aluno " + i + " é: " + media);
        }

        double mediaGeral = somaMedias / numAlunos;
        System.out.println("A média geral da turma é: " + mediaGeral);
        input.close(); 
    }

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.calcularMediaDeCadaAluno();
    
    }
}
