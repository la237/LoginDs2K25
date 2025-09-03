package logicaExercicios;
// exercicio 7
 public class forAninhado {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];  // cria matriz 5x5


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = i + j;
            }
        }

        int somaTotal = 0;
        // Imprime a matriz formatada
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%3d ", matriz[i][j]);
                somaTotal += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("\nSoma total dos elementos da matriz: " + somaTotal);
    }
}



