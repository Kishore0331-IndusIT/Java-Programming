import java.io.*;
import java.util.*;
public class FileCopy
{
	
		public static void copyData(File source, File destination) throws IOException
		{
        // Create input and output streams
        try (BufferedReader reader = new BufferedReader(new FileReader(source));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destination)))
		{
            String line;
            // Read each line from the source file and write it to the destination file
            while ((line = reader.readLine()) != null)
			{
                writer.write(line);
                writer.newLine(); // Add a newline after each line
            }
			System.out.println("Successfully copied contents are:");
        }
    }
	
	
	
	public static void main(String[] args) throws Exception
	{	Scanner sc = new Scanner(System.in);
		System.out.print("Name of source file: ");
		String file1 = sc.nextLine();
		File s = new File(file1);
		System.out.print("Name of destination file: ");
		String file2 = sc.nextLine();
		File d = new File(file2);
		sc.close();
		copyData(s, d);
		Scanner outFile = new Scanner(new File(file2));
		while (outFile.hasNextLine())
		{
		   System.out.println(outFile.nextLine());
		}
		sc.close();
	}
}