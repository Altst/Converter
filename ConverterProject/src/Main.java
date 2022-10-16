import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Число");
        double num = in.nextDouble();
        metersIntoCentimeters(num);
        metersToKilometers(num);
    }
    public void metersIntoCentimeters(double num){
        num = num * 1000;
        System.out.println("Метры в сантиметры: " + num + "\n");
    }
    public void metersToKilometers(double num){
        num = num / 1000;
        System.out.println("Метры в километры: " + num + "\n");
    }
}