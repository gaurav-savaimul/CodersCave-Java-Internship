import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Input weight in kilogram: ");
                double weight = sc.nextDouble();
                System.out.print(" Input height in meters: ");
                double height = sc.nextDouble();
                double BMI = weight / (height * height);

                 if (BMI < 18.5) {
                     System.out.println("Underweight");
                 }
                else if (BMI < 25) {
                     System.out.println("Normal");
                }
                else if (BMI < 30) {
                     System.out.println("Overweight");
                }
                else {
                     System.out.println("Obese");
                }
                System.out.println(" The Body Mass Index (BMI) is " + BMI + " kg/m2");
            }

}
