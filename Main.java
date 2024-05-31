import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos nomes deseja informar? ");
        int quantity = sc.nextInt();
        sc.nextLine();
        List<String> maleList = new ArrayList<>();
        List<String> femaleList = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            System.out.print("Informe o " + (i + 1) + "° nome: ");
            String name = sc.nextLine();
            System.out.print("Esta pessoa é do sexo <F>eminino ou <M>asculino? ");
            String gender = sc.nextLine();
            if ("F".equalsIgnoreCase(gender)) {
                femaleList.add(name);
            } else if ("M".equalsIgnoreCase(gender)) {
                maleList.add(name);
            } else {
                System.out.println("Não identifiquei o sexo informado, esta pessoa não será registrada");
            }
        }

        System.out.println("Lista das mulheres: " + String.join(", ", femaleList));
        System.out.println("Lista dos homens: " + String.join(", ", maleList));

        sc.close();
    }
}
