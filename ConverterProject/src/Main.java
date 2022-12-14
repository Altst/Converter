import java.util.Scanner;

public class Main {
    public void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Число");
        double num = in.nextDouble();
        metersIntoCentimeters(num);
        metersToKilometers(num);
        gramsToLiters(num);
        litersToGallons(num);
        celsiusToFahrenheit(num);
    }
    public void metersIntoCentimeters(double num){
        num = num * 1000;
        System.out.println("Метры в сантиметры: " + num + "\n");
    }
    public void metersToKilometers(double num){
        num = num / 1000;
        System.out.println("Метры в километры: " + num + "\n");
    }
    public void gramsToLiters(double num){
        num = num / 1000;
        System.out.println("Граммы в литры: " + num + "\n");
    }
    public void litersToGallons(double num){
        num = num / 3.785;
        System.out.println("Литры в галлоны: " + num + "\n");
    }
    public void celsiusToFahrenheit(double num){
        num = ((num * 1.8)+32);
        System.out.println("Цельсия в фаренгейты: " + num);
    }
}