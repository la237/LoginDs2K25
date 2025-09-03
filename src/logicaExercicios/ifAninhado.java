package logicaExercicios;
//EXERCICIO 2
public class ifAninhado {
    public static void main(String[] args) {
        int nota = 8;
        int freq = 80;
        if (nota >= 7){
            if (freq >= 75){
                System.out.println("Aprovado");
            }else {
                System.out.println("Reprovado por Frequência!");
            }

            }else{
            System.out.println("Reprovado por Nota!");
        }
    }
}
