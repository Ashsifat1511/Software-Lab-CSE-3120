package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class gradeCalculatorTest {
    @Test
    public void testGradeCalculation() {
        gradeCalculator calculator = new gradeCalculator();
        
        int marks1 = 80;
        String expectedGrade1 = "A+";
        String actualGrade1 = calculator.grade(marks1);
        assertEquals(expectedGrade1, actualGrade1);

        int marks2 = 70;
        String expectedGrade2 = "A";
        String actualGrade2 = calculator.grade(marks2);
        assertEquals(expectedGrade2, actualGrade2);
        
        int marks3 = 60;
        String expectedGrade3 = "A-";
        String actualGrade3 = calculator.grade(marks3);
        assertEquals(expectedGrade3, actualGrade3);

        int marks4 = 50;
        String expectedGrade4 = "B";
        String actualGrade4 = calculator.grade(marks4);
        assertEquals(expectedGrade4, actualGrade4);
        
        int marks5 = 40;
        String expectedGrade5 = "C";
        String actualGrade5 = calculator.grade(marks5);
        assertEquals(expectedGrade5, actualGrade5);

        int marks6 = 30;
        String expectedGrade6 = "F";
        String actualGrade6 = calculator.grade(marks6);
        assertEquals(expectedGrade6, actualGrade6);

    }
    
}   