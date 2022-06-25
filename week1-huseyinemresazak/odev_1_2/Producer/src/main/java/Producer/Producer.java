package Producer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Producer { //Dosyaya yazma işlemi yapan sınıf
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //CD Santamarina 0-4 Instituto   veya  Fenerbahce 4-0 Galatasaray gibi bir input

        for(int i = 0; i < str.length(); i++){
            if( ( (int)str.charAt(i) == '-' && (int)str.charAt(i-1) <= 57 && (int)str.charAt(i-1) >= 48 ) ){

                System.out.println("deneme");
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
