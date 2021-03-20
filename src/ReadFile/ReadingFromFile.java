package ReadFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {

    public static void main(String[] args) throws FileNotFoundException{

            String separator = File.separator;
            String path = separator + "Users" + separator + "nmelnyk" + separator + "Desktop" + separator + "Test.txt";

            File file = new File(path);
            Scanner sc = new Scanner(file);

           String line = sc.nextLine();



           String[] numbersString = line.split(" ");

           int[] numbers =new int[3];

           int counter =0;
           for(String number : numbersString) {
               numbers[counter++] = Integer.parseInt(number);
           }
        System.out.println(Arrays.toString(numbers));
    sc.close();

        }
    }

