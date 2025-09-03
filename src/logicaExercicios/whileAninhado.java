package logicaExercicios;
//EXERCICIO 5

public class whileAninhado {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            int j = 1;
            while (j <= 10) {
                System.out.println(i + "x" + j + "=" + (i * j));
                j++;
            }
            System.out.println();  // linha em branco para separar as tabuadas
            i++;
        }
    }
}