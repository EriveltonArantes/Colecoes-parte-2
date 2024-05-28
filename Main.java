import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalHomens = 0;
        int totalMulheres = 0;

        while (true) {
            System.out.print("Digite o nome da pessoa (ou 'sair' para encerrar): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("sair") || nome.equalsIgnoreCase("s")) {
                break;
            }

            System.out.print("Digite o sexo da pessoa (M/F): ");
            char sexo = scanner.next().charAt(0);
            scanner.nextLine(); // Consumir a quebra de linha após a leitura do sexo

            if (sexo == 'M' || sexo == 'm') {
                totalHomens++;
            } else if (sexo == 'F' || sexo == 'f') {
                totalMulheres++;
            } else {
                System.out.println("Sexo inválido! Digite M para masculino ou F para feminino.");
            }
        }

        System.out.println("Total de homens: " + totalHomens);
        System.out.println("Total de mulheres: " + totalMulheres);
    }
}





// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         int totalHomens;
//         int totalMulheres;

//         while (true) {
//             System.out.println("Digite seu nome: ");
//             String name = scanner.nextLine();

//             System.out.println("Digite seu sexo: ");
//             String sexo = scanner.nextLine();
//             if (totalHomens == homem) {
//                 totalHomens++;
//                 totalHomens.equals.ignorecase("Homem"); || totalMulheres.ignorecase("h")

//                 } else if (totalMulheres == mulher) {
//                     totalMulheres.ignorecase("mulher") || totalMulheres.ignorecase("m")
//             }
//             System.out.println("Adicionar mais nomes? ");
//             String resposta = scanner.nextLine();

//         }


// }