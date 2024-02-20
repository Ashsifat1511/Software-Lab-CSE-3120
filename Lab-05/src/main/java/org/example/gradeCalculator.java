package org.example;
/**
 * gradeCalculator class to calculate the grade based on the marks
 */
public class gradeCalculator {
    /**
     * Method to calculate the grade based on the marks
     * 80-100 A+
     *  70-79 A
     *  60-69 A-
     *  50-59 B
     *  40-49 C
     *  0-39 F
     * @param marks
     * @return grade
     */
    public String grade(int marks){
       if(marks>=80) {
           return "A+";
       } else if (marks>=70&&marks<80) {
           return "A";
       } else if (marks>=60&&marks<70) {
           return "A-";
       } else if (marks>=50&&marks<60) {
           return "B";
       } else if (marks>=40&&marks<50) {
           return "C";
       }
       else {
           return "F";
       }
    }
}
