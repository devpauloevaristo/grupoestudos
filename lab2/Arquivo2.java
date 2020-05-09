package lab2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Arquivo2{
    public static void main(String[] args){
        DateFOrmat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        //Imprime a data formatada
        System.out.println("Hoje é " + dateFormat.formate(date));
        int a = 500; //Alterado aqui
        int b = 1000; //Alterado aqui
        System.out.println("a+b=" + (a+b));
    }
}
