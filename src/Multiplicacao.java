public class Multiplicacao {
    public static void main(String [] args) {
        Multiplicacao calc = new Multiplicacao();

        int multiplicacao = calc.multiplicar(3,3);
        System.out.println(multiplicacao);
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }
}
