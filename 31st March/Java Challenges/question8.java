import java.io.File;
import java.io.IOException;

// Write a java program to create a file in java.
public class question8 {
    public static void main(String[] args) {
        try{
            File file = new File("C://Users//HP//Desktop//file//abc.txt");
            if (file.createNewFile()){
                System.out.println("File: " + file.getName() + " created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch (IOException e){
            System.out.println("An error occurred: "+ e);
        }
    }
}
