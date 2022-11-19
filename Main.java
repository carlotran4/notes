import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //create file
        File myFile = new File("C:\\Users\\Public\\Documents\\notes.txt");
        try {
            myFile.createNewFile();
        }
        catch(IOException e) {
            System.out.println("error");
        }

        //ask user for input
        Scanner keyboard = new Scanner(System.in);
        while(true) {
            FileWriter file = new FileWriter("C:\\Users\\Public\\Documents\\notes.txt",true);
            System.out.println("what would you like to do? 1 for adding a new note, 2 for displaying your notes, 3 for quit");
            int whatDo = keyboard.nextInt();
            if (whatDo == 1) {
                System.out.println("input your note");
                String throwaway = keyboard.nextLine();
                String note = keyboard.nextLine();
                file.write(note + "\n");
                file.close();
            }


            if (whatDo == 2) {
                Scanner fileReader = new Scanner(myFile);
                System.out.println("\n\n\n\nCONTENTS");
                while (fileReader.hasNextLine()) {
                    System.out.println(fileReader.nextLine());
                }
            }

            if(whatDo == 3){
                break;
            }
        }
    }
}


