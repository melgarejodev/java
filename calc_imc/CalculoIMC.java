import java.util.Scanner;

public class CalculoIMC {

  public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);

    System.out.println("Informe o peso em quilos: ");
    float peso = entrada.nextFloat();
    
    System.out.println("Informe a altura em metros: ");
    float altura = entrada.nextFloat();
    
    float imc = (float) (peso / Math.pow(altura, 2));
    
    System.out.println("Seu IMC eh igual a: " + imc);

    // Classificacao do IMC
    String classificacao = "";

    if (imc < 18.5) classificacao = "Magreza";
    else if (imc <= 24.9) classificacao = "Normal";
    else if (imc <= 29.9) classificacao = "Sobrepeso";
    else if (imc <= 39.9) classificacao = "Obesidade";
    else classificacao = "Obesidade grave";

    System.out.println("Sua classificacao eh: " + classificacao);
    
  }

}