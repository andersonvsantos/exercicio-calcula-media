public class Main {
    public static void main(String[] args) {
        System.out.println("O resultado da média das notas é: " + calcularMedia());
    }

    public static double calcularMedia() {

        double nota1 = 10;

        double nota2 = 6.5;

        double nota3 = 8;

        double nota4 = 9;

        return (nota1 + nota2 + nota3 + nota4) / 4;
    }
}