public class Soma {

    public static void main(String [] args){
        Soma calc = new Soma();

        int soma = calc.somar(3,7);
        System.out.println(soma);

    }
    public int somar(int a, int b) {
        return a + b;
    }
}
