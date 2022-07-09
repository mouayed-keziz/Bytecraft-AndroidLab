import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;


public class App {
    public static void main(String[] args) throws Exception {

        File file1 = new File("data.txt");//absolute path
        //File file2 = new File("MouayedDDD.txt");//in the project folder
    
        if (file1.exists()) {
            System.out.println("file "+file1.getName()+" exists");;
            System.out.println("absolute path : "+file1.getAbsolutePath());
        }      
        else {
            System.out.println("file "+file1.getName()+" does not exist");
            file1.createNewFile();
            System.out.println("absolute path : "+file1.getAbsolutePath());
        }
        
        
        FileWriter writer = new FileWriter("data.txt");
        writer.write("roses are red\nviolets are blue\nbooty booty");
        writer.append("\n\nhello bro this is writer.append(..)");
        writer.close();
            
        

        FileReader reader = new FileReader("data.txt");
        int data = reader.read(); //-1is the end of the file
        
        while (data != -1) {
            System.out.print((char)data);
            data = reader.read();
        }
        reader.close();
        
        //file1.delete();
    }
}
