package logicaExercicios;

public class comContinue {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10){
            if (i == 5){
                i++;
                continue; //o continue serve para pelar tal numero, nesse caso o numero que foi pulado foi o 5
            }
            System.out.println(i);
            i++;

        }
    }
}
