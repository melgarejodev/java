import java.util.Scanner;

public class CalculoIMC2 {

  public static void calculoImc(float peso, float altura) {

    double[] pesosImc = {18.5, 24.9, 29.9, 39.9, 100};
    String[] classificacaoImc = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade grave"};

    final int MAX_INDEX = pesosImc.length - 1;

    float imc = (float) (peso / Math.pow(altura / 100, 2));
    // float imc = peso / (altura * altura);

    int i = 0;
    while (imc > pesosImc[i] && i < MAX_INDEX) {
      i++;
    }

    i = Math.min(MAX_INDEX, i);

    System.out.println("IMC calculado: " + imc);
    System.out.println("Classificacao; " + classificacaoImc[i]);

  }

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o peso em kg:");
    float peso = entrada.nextFloat();

    System.out.println("Informe a altura em cm:");
    float altura = entrada.nextFloat();

    calculoImc(peso, altura);

  }

}