public class Divisao {
    public static void main(String [] args) {
        Divisao calc = new Divisao();

        int divisao = calc.dividir(10, 2);
        System.out.println(divisao);

    }

    public int dividir(int a, int b) {
        return a / b;
    }


}
