import java.util.Scanner;

public class DesafioCalcImc2 {

  public static void main(String[] args) {

    String executa = "X";

    while (!executa.equalsIgnoreCase("n")) {
      System.out.println("---");
      System.out.println("Deseja calcular o IMC ? (\"S\"-sim, \"N\"-nao)");
      System.out.println("---");

      executa = inputString();

      if (executa.equalsIgnoreCase("s")) {

        run();

      }

    }

  }

  public static String inputString() {

    Scanner input = new Scanner(System.in);
    return input.nextLine();

  }

  public static double inputDouble() {

    Scanner input = new Scanner(System.in);
    return input.nextDouble();

  }

  public static void run() {

    double peso = getPeso();
    double altura = getAltura();

    double imc = getImc(peso, altura);

    System.out.println("Calculo do IMC: " + imc + " (Peso: " + peso + " kg / Altura: " + (altura / 100) + " m)");
    System.out.println("Classificacao: " + getClassificacao(imc));

  }

  public static double getAltura() {

    System.out.println("Informe a Altura em CM: ");
    return inputDouble();

  }

  public static double getPeso() {

    System.out.println("Informe o Peso em KG: ");
    return inputDouble();

  }

  public static double getImc(double peso, double altura) {

    // Altura em cm, devera ser convertida para M antes de ^2
    return peso / Math.pow((altura / 100), 2);

  }

  public static String getClassificacao(double imc) {

    final double pesoImc[] = {18.5, 24.9, 29.9, 34.9, 39.9};
    final String classeImc[] = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade severa", "Obesidade morbida"};

    int i = 0;
    for(double lim: pesoImc) {
      if(lim <= imc) {
        i++;
      }
    }

    return classeImc[i];

  }

}