package diamond;

public class Diamond {
    public static void main(String[] args) {
        int size = 5; // Nunca em hipótese nenhuma nesse mundo coloque Integer.MAX_VALUE
        int alpha = 65;

        // Pirâmide superior
        for (int i = 1; i < size; i++) {
            //Printa os espaços
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            //Printa os caracteres
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
        // Pirâmide inferior
        for (int i = 1; i <= size - 1; i++) {
            //Printa os espaços
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printa os caracteres
            for (int k = 0; k < (size - i) * 2 - 1; k++) {
                System.out.print((char) (alpha + k));
            }
            System.out.println();
        }
    }
}
