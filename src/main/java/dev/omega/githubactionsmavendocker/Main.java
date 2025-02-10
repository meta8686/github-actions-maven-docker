package dev.omega.githubactionsmavendocker;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello world from maven docker!");
        Thread.sleep(5000);
        int sum = addNumbers(2,6);
        System.out.println("Sum is : "+sum);
    }

    public static int addNumbers(int a,int b){
        return a+b;
    }
}