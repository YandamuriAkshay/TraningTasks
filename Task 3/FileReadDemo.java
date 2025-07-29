package task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;

        try {
            File file = new File("sample.txt");
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } finally {
            if (scanner != null) {
                scanner.close();
                System.out.println("Scanner closed.");
            }
        }
	}

}
