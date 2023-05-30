package gr.aueb.cf.testbed.ch9;

import java.io.*;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Reads from file student's firstname,lastname and 2 grades
 * and makes a new file with the average of grades and
 * firstname lastname. It also makes a file.log for wrong grades.
 */
public class StudentsGradesApp {

    public static void main(String[] args) {

        String line;
        String[] students;
        String firstname, lastname;
        int grade1, grade2;
        boolean gradeValid1 = false;
        boolean gradeValid2 = false;
        double avg;
        File dir = new File("/Users/nikospolizopoulos/Desktop/Coding Factory/Java");

        if (!dir.exists()) {
            if (!dir.mkdir()) {
                System.err.println("Error in make dir");
                System.exit(1);
            }
        }

        try (BufferedReader bf = new BufferedReader(new FileReader("/Users/nikospolizopoulos/Desktop/students.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter(dir + "/primOut.txt"))) {
            while ((line = bf.readLine()) != null) {
                students = line.split(" +");
                firstname = students[0];
                lastname = students[1];
                grade1 = Integer.parseInt(students[2]);
                grade2 = Integer.parseInt(students[3]);

                gradeValid1 = isGradeValid(grade1);
                gradeValid2 = isGradeValid(grade2);

                if (gradeValid1 && gradeValid2) {
                    avg = (grade1 + grade2) / 2.0;
                    bw.write(firstname + " " + lastname + " " + avg + "\n");
                } else {
                    Logger logger = getLogger();
                    logger.severe("Error: Invalid Grades");
                }
            }
        } catch (IOException e) {
            System.out.println("Error in files");
        }
    }

    public static boolean isGradeValid(int grade) {
        return grade > 0 && grade <= 10;
    }

    public static Logger getLogger() {
        Logger logger = Logger.getLogger(StudentsGradesApp.class.getName());
        Handler fileHandler;

        try {
            fileHandler = new FileHandler("grades.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException e) {
            throw  new RuntimeException(e);
        }

        logger.addHandler(fileHandler);
        return logger;
    }
}
