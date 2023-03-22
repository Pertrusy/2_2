import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

    System.out.print("Podaj pierwszą cyfre:");
    double num1 = scanner.nextDouble();
    System.out.print("Podaj drugą cyfre:");
    double num2 = scanner.nextDouble();

    double sum = num1 + num2;
    double difference = num1 - num2;
    double multi = num1 * num2; 
    double divide = num1 / num2; 
    

    System.out.println("Suma: " +sum);
    System.out.println("Różnica: " +difference);
    System.out.println("Mnożenie: " +multi);
    System.out.println("Dzielenie: " +divide);
    
    
  }
}