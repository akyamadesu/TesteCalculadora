public class Subtracao {

    public static void main(String[] args) {
        Subtracao calc = new Subtracao();

        int subtracao = calc.subtrair(7, 3);
        System.out.println(subtracao);
    }

    public int subtrair(int a, int b) {
        return a - b;
    }
}
