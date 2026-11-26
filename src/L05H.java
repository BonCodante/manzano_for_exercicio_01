import java.util.Scanner;

public class L05H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor da base (B): ");
        int base = sc.nextInt();

        System.out.print("Digite o valor do expoente (E): ");
        int expoente = sc.nextInt();

        long potencia = 1;

        for (int i = 1; i <= expoente; i++) {
            potencia *= base;
        }

        System.out.println(base + " elevado a " + expoente + " é: " + potencia);

        sc.close();
    }
}
