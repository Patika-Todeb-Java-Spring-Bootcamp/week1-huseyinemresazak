import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Consumer {
    public static void main(String[] args) {
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
