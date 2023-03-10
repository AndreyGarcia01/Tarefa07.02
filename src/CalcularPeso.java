import java.util.Scanner;

public class CalculoPesoPlaneta {

    public static void main(String[] args) {
        // solicita o peso da pessoa na Terra
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o seu peso em kg: ");
        double peso = scanner.nextDouble();

        class Planeta{
            private String nome;
            private double gravidade;

            public Planeta(String nome, double gravidade){
                this.nome = nome;
                this.
            }
        }
        // define os dados dos planetas
        double gravidades[] = {0.38, 0.91, 1.00, 0.38, 2.34, 0.93, 0.92, 1.12};
        String planetas[] = {"Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno"};

        // apresenta a lista de planetas disponíveis
        System.out.println("Escolha um planeta para viajar:");
        for (int i = 0; i < planetas.length; i++) {
            System.out.println(i + ". " + planetas[i]);
        }

        // solicita a escolha do planeta
        System.out.print("Digite o número do planeta escolhido: ");
        int indexPlaneta = scanner.nextInt();

        if (indexPlaneta < 0 || indexPlaneta >= planetas.length) {
            System.out.println("Planeta inválido!");
        } else {
            // calcula o peso da pessoa no planeta escolhido
            double pesoPlaneta = peso * gravidades[indexPlaneta];
            System.out.println("Seu peso no planeta " + planetas[indexPlaneta] + " é de " + pesoPlaneta + " N.");
        }
        scanner.close();
    }
}

