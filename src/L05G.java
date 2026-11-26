public class L05G {
    public static void main(String[] args) {
        int base = 3;
        long resultado = 1;

        for (int expoente = 0; expoente <= 15; expoente++) {
            if (expoente == 0) {
                resultado = 1;
            } else {
                resultado *= base;
            }
            System.out.println(base + " ^ " + expoente + " = " + resultado);
        }
    }
}
