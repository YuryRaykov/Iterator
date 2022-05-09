package ru.netology;

public class Main {

    public static void main(String[] args) {
	 for(int r : new Randoms(90, 100)){
         System.out.println("Слуйчайное число" + r);
         if(r == 100) {
             System.out.println("Выпало число 100, давайте на этом закночим");
             break;
         }
     }
    }
}
