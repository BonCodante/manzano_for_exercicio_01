public class L05I {
    public static void main(String[] args) {
        int anterior = 0;
        int atual = 1;

        System.out.println("Série de Fibonacci até o 15º termo:");

        for (int i = 1; i <= 15; i++) {
            System.out.print(atual + (i < 15 ? ", " : "\n"));
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }
}
