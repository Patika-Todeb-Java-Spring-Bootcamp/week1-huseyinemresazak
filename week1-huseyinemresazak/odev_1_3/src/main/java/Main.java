import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Thread t1 = new Thread(new ProducerThread());
        Thread t2 = new Thread(new ConsumerThread());

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();

        System.out.println("Programın sonu");
    }
}

class ProducerThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Producer Thread basladi. Input girin : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //CD Santamarina 0-4 Instituto   veya  Fenerbahce 4-0 Galatasaray gibi bir input

        for(int i = 0; i < str.length(); i++){
            if( ( (int)str.charAt(i) == '-' && (int)str.charAt(i-1) <= 57 && (int)str.charAt(i-1) >= 48 ) ){
                if( ( (int)str.charAt(i+1) <= 57 && (int)str.charAt(i+1) >= 48) ){
                    try {
                        File f = new File("./score.txt"); //dosyayı ac
                        FileWriter fw = new FileWriter(f, true);
                        fw.write("\n" + str);
                        fw.close();
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
            }
        }
    }
}

class ConsumerThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Consumer Thread basladi, dosya okunacak : ");

        try {
            File f = new File("./score.txt"); //dosyayı ac
            Scanner myReader = new Scanner(f);
            while (myReader.hasNextLine()){
                System.out.println(myReader.nextLine());
            }
            myReader.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
