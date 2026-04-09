public class StatsCalculator {

    public static void main(String[] args) {
        // 1. Initialize the 2D array with the sample data (you may copy and paste it from sample_data.txt)
        double[][] scores = {{85.5, 90.0, 78.5, 92.0},
                             {76.0, 88.5, 90.0, 85.0},
                             {95.0, 92.0, 94.5, 98.0},
                             {60.0, 70.5, 65.0, 72.0},
                             {82.0, 84.0, 80.0, 88.0}};

        // 2. Call methods
        System.out.println("--- GradeBook Statistics ---\n");
        calculateStudentAverages(scores);
        System.out.println();
        calculateAssignmentAverages(scores);
        System.out.println();
        findHighestScore(scores);
    }

    // TODO: Implement this method
    public static void calculateStudentAverages(double[][] data) {
        System.out.println("Student Averages:");
        // Your logic here (Row-major traversal)
        for (int i = 0; i < data.length; i++) {
            double sum = 0;
            for (int j = 0; j < data[i].length; j++){
                sum += data[i][j];
            }

            double average = sum / data[i].length;
            // System.out.println("Student " + data[i].length + " Average: " + average);\
            System.out.printf("Student %d: %.2f%n", (i + 1), average);
        }
    }

    // TODO: Implement this method
    public static void calculateAssignmentAverages(double[][] data) {
        System.out.println("Assignment Averages:");
        // Your logic here (Column-major traversal)
        for (int i = 0; i < data[0].length; i++){
            double sum = 0;
            for (int j = 0; j < data.length; j++){
                sum += data[j][i];
            }

            double average = sum / data.length;
            System.out.printf("Assignment %d: %.2f%n", (i + 1), average);
        }
    }

    // TODO: Implement this method
    public static void findHighestScore(double[][] data) {
         double high_score = data[0][0];
         int student_index = 0;
         int assignment_index = 0;

         // Your logic here
         for (int i = 0; i < data.length; i++) {
             for (int j = 0; j < data[i].length; j++) {
                 if (data[i][j] > high_score){
                    high_score = data[i][j];
                    student_index = i;
                    assignment_index = j;
                 }
             }
         }
         System.out.printf("Highest Score in Class: %.2f (Student %d, Assignment %d)%n", high_score, student_index + 1, assignment_index + 1);
         
    }
  
    
}