import java.util.Scanner;

public class projetinho {
    private static int x;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[5];
        int[] idade = new int[5];
        String[] sexo = new String[5];

        for (int x = 0; x < 5; x++) {
            System.out.println("Insira o seu nome:");
            nome[x] = sc.nextLine();
            System.out.println("Insira a sua idade:");
            idade[x] = Integer.parseInt(sc.nextLine());
            System.out.println("Insira o seu sexo:");
            sexo[x] = sc.nextLine();

        }


        System.out.print("Lista de usuários:");
        for (int x = 0; x < 5; x++) {
            System.out.println("Nome:" + nome[x] + "Idade: " + idade[x] + "Sexo:" + sexo[x]);
        }


    }
}
