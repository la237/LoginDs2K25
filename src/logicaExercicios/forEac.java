package logicaExercicios;
//EXERCICIO 8


public class forEac {
    public static void main(String[] args) {
        double[] notas = {7.5, 8,10, 5.5};  // vetor de notas

        double soma = 0;

        // Percorre todas as notas usando for-each
        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;

        System.out.println("Média das notas: " + media);
    }
}
