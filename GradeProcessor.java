
import java.io.*;
import java.util.Scanner;

public class GradeProcessor {

    public static void main(String[] args) {
        
        // Input and Output file names
        String inputFileName = "student_data.txt";
        String outputFileName = "grade_report.txt";

        // TODO 1: Wrap your code in a try-catch block.
        // The catch block should handle 'FileNotFoundException'.

            // TODO 2: Create a File object and a Scanner to read the input file.
            
            // TODO 3: Create a PrintWriter object to write to the output file.
        try {

            File myFile = new File(inputFileName);
            Scanner scanner = new Scanner(myFile);
            PrintWriter output = new PrintWriter(outputFileName);
            
            
            System.out.println("Processing file...");
            
            // Write the header to the output file separated by tab characters (\t);
            // Print a dashed line ("--------------------");

            output.println("\tGrade Report\t");
            output.println("------------------------");

            // TODO 4: Create a while loop to process the file line by line.
            //   - Read the name (String)
            //   - Read the three scores (int or double)
            //   - Calculate the average
            //   - Determine "Pass" or "Fail" (Pass is >= 70.0)
            //   - Write the formatted line to the output file


            while (scanner.hasNext()) { 
                String name = scanner.next();
                int score1 = scanner.nextInt();
                int score2 = scanner.nextInt();
                int score3 = scanner.nextInt();

                double average = ((score1 + score2 + score3) / 3.0);

                String final_score;
                if (average >= 70.0){
                    final_score = "Pass";
                } else {
                    final_score = "Fail";
                }

                output.printf("%s\t%.1f\t%s%n", name, average, final_score);


            }

            // TODO 5: Close both the Scanner and the PrintWriter.
            scanner.close();
            output.close();

            System.out.println("Done! Check " + outputFileName + " for results.");

        // TODO 6: catch block:
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file 'student_data.txt' was not found");
        }
    }
}