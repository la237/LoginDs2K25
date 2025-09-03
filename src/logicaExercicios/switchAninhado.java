package logicaExercicios;

import java.util.Scanner;

//EXERCICIO 3
public class switchAninhado {
    public static void main(String[] args) {
        int categoria, opcao;
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== MENU PRINCIPAL =====");
        System.out.println("       1- Comidas        ");
        System.out.println("       2- Bebidas        ");
        System.out.println(" Escolha uma categoria  acima");
        categoria = scanner.nextInt();


        switch (categoria) {
            case 1: // Comidas
                System.out.println("Categoria: Comidas");
                System.out.println("1 - Entradas");
                System.out.println("2 - Prato Principal");
                System.out.println("3 - Sobremesa");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu: Entradas");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Prato Principal");
                        break;
                    case 3:
                        System.out.println("Você escolheu: Sobremesa");
                        break;
                    default:
                        System.out.println("Opção inválida em Comidas.");
                        break;
                }
                break;

            case 2: // Bebidas
                System.out.println(" Categoria: Bebidas");
                System.out.println("1 - Vinhos");
                System.out.println("2 - Drinks");
                System.out.println("3 - Sucos");
                System.out.print("Escolha uma opção: ");
                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.println("Você escolheu: Vinhos");
                        break;
                    case 2:
                        System.out.println("Você escolheu: Drinks");
                        break;
                    case 3:
                        System.out.println("Você escolheu: Sucos");
                        break;
                    default:
                        System.out.println("Opção inválida em Bebidas.");
                        break;
                }
                break;

            default:
                System.out.println("Categoria inválida!");
                break;
        }

        scanner.close();






    }
}
