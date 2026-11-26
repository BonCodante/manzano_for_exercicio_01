public class L05D {
    public static void main(String[] args) {
        int somatorioPares = 0;

        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0) {
                somatorioPares += i;
            }
        }

        System.out.println("O somatório dos números pares de 1 até 500 é: " + somatorioPares);
    }
}
