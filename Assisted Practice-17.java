package oops;
import java.io.*;
public class Simple7 
{
	public static void main(String[] args)
	{
		try
		{
			
            File file = new File("sample.txt"); //creating a file
            file.createNewFile();
            System.out.println("File created successfully");
            
            FileWriter writer = new FileWriter(file);// Writing to the file
            writer.write("Hello, this is some content in the file.");
            writer.close();
            System.out.println("Content written to the file.");
            
            FileReader reader = new FileReader(file);// Reading from the file
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Reading from the file:");
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            reader.close();

           
            FileWriter updater = new FileWriter(file, true); // Updating the file
            updater.write("\nAppending more content to the file.");
            updater.close();
            System.out.println("Content updated in the file.");

            
            FileReader reader2 = new FileReader(file);// Reading again after update
            BufferedReader bufferedReader2 = new BufferedReader(reader2);
            String line2;
            System.out.println("Reading from the file after update:");
            
            while ((line2 = bufferedReader2.readLine()) != null) 
            {
                System.out.println(line2);
            }
            reader2.close();

            
            if (file.delete())// Deleting the file
            {
                System.out.println("File deleted successfully.");
            } 
            else 
            {
                System.out.println("Failed to delete the file.");
            }
        } 
		catch (IOException e) 
		{
            e.printStackTrace();
        }
		
	}
	

}
