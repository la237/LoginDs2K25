package logica;

public class forAninhado {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                System.out.printf("%d x %d = %d ", i, j, i*j);
            }
            System.out.println();
        }
    }
}
