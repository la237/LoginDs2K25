package logicaExercicios;

public class breAk {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 10){

            if (i >= 6){
                break; // vai parar o loop no 5
            }

            System.out.println(i);
            i++;
        }
    }

}
