public class schooldata {
    public static void main(String[] args) {
        int[][] students = {
            {60, 70},             // class 1
            {30, 30, 30},         // class 2
            {25, 25, 25, 25},     // class 3
            {50},                 // class 4
            {40}                  // class 5
        };
        
        int totalStudents = 0;
        int totalSections = 0;
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length; j++) {
                totalStudents += students[i][j];
                totalSections++;
               // System.out.println(students[i][j]);
            }
           //System.out.println(" ");
        }
        double avPCls = (double) totalStudents / students.length;
        double avPSctn = (double) totalStudents / totalSections;
        System.out.println("Average students per class: " + avPCls);
        System.out.println("Average students per section: " + avPSctn);
    }
}