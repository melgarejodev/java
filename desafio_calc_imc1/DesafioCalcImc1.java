import java.io.InputStream;
import java.util.Scanner;

public class DesafioCalcImc1 {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    int calcular = -1;

    while (calcular < 0 || calcular > 1) {

      System.out.println("---");
      System.out.println("Calcular novo IMC? (1=sim, 0=nao)");
      calcular = entrada.nextInt();
      
      if (calcular == 1) {
        executaCalculo();
        calcular = -1;
      }

    }

  }

  public static void executaCalculo() {

    float peso = getPeso();
    float altura = getAltura();
    float imc = calculaImc(altura, peso);

    System.out.println("IMC calculado: " + imc);
    System.out.println("Classificacao: " + classificaImc(imc));

  }

  public static float getAltura() {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe a altura em CM: ");
    return entrada.nextFloat();

  }

  public static float getPeso() {
    
    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o peso em KG: ");
    return entrada.nextFloat();

  }

  public static float calculaImc(float altura, float peso) {

    // altura em cm, converte pra metro e eleva ao quadrado
    return (float)(peso / Math.pow(altura / 100, 2));

  }

  public static String classificaImc(float imc) {
    
    final double limiteImc[] = {18.5, 24.9, 29.9, 34.9, 39.9, 40};
    final String classeImc[] = {"Magreza", "Normal", "Sobrepeso", "Obesidade", "Obesidade severa", "Obesidade morbida"};

    final int MAX_INDEX = limiteImc.length - 1;

    int i = 0;
    while (imc > limiteImc[i] && i <= MAX_INDEX) {
      i++;
    }
    i = Math.min(MAX_INDEX, i);

    return classeImc[i];

  }

}