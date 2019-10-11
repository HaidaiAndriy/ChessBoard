package com.company;
import sun.text.normalizer.UCharacter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int width, height;
	    System.out.println("Введите ширину: ");
	     width=getInfo();
        System.out.println("Введите длинну: ");
        height=getInfo();
        ChessBoard.chessBoard(width,height);
        System.out.println("Введите длинну: delete this ");
        }

        public static int getInfo() {
        int num;
            Scanner in = new Scanner(System.in);
            String info ;
            while (true){
                 info = in.nextLine();
            if (info.length() == 0){
                showInfo();}
                            else {
                while (true){
            for (int i = 0; i < info.length(); i ++){
                if (Character.isDigit(info.charAt(i))==true){}
                else {
                    System.out.print("Error");
                }
            }
                return num=Integer.parseInt(info);}
        }
    }}

    static void showInfo()
    {
        System.out.println("Для корректной роботы программы введите целое число (например 5)");
    }

}
