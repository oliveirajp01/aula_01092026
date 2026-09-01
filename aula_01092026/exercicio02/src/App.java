import java.util.Scanner; 
public class App {
    public static void main(String[] args) throws Exception {
    Scanner leitor = new Scanner(System.in);

    System.out.print(" Nome do aluno: ");
    String nome = leitor.next();
    System.out.println("Idade: ");
    int idade = leitor.nextInt();
    System.out.println("Idade: ");

    System.out.println("Olá, " + nome + ", você tem " + idade + " anos!");

   leitor.close();
    }
}
