// Mohammed Hamed
// cs-200-3, Summer 2016.
// Assignment 2a:  Grades

// This program has the user enter their assignment average,
// quiz average, midterm exam score, first practice final exam score,
// second practice final exam score, and final exam score.  
// It then computes out outputs the letter grade for the course 
// according to the rules of the syllabus.

// Note:  The higher of two practice exams will be used for the Practice Final
// Exam score in the syllabus.  

import java.util.Scanner;

public class Grade { 

   public static void main(String [] args)  {
   
      Scanner kbd = new Scanner(System.in);
      
      double asstAvg, quizAvg, midterm, practice1, practice2, finalExam;
      double betterPractice, weightedAvg = 0, testAvg = 0;
      char grade;
      
      grade = 'G';
      
		System.out.println("\n");
      System.out.println("Mohammed Hamed, cs-200-3, Summer 2016.");
		System.out.println("Assignment 2a:  Grade Program");
      System.out.println();
	      
      System.out.print("Enter your assignment average:  ");
      asstAvg = kbd.nextDouble();
      
      System.out.print("Enter your quiz average:  ");
      quizAvg= kbd.nextDouble();
      
      System.out.print("Enter your midterm score:  ");
      midterm= kbd.nextDouble();
      
      System.out.print("Enter your first practice final average:  ");
      practice1= kbd.nextDouble();
      
      System.out.print("Enter your second practice final average:  ");
      practice2= kbd.nextDouble();
      
      System.out.print("Enter your final exam score:  ");
      finalExam= kbd.nextDouble();
      
      if(practice1<= practice2)
         betterPractice= practice2;
      else
         betterPractice= practice1;
         
      weightedAvg = 0.3 * asstAvg + 0.25*quizAvg + 0.1*midterm + 0.1*betterPractice + 0.25*finalExam;
      
      testAvg = (weightedAvg - 0.3*asstAvg)/0.7;
      if (testAvg<60 && weightedAvg<45)
         grade = 'F';
      else if (testAvg<60 && weightedAvg>44)
         grade = 'D';  
      else if(finalExam<60 && weightedAvg<45)
         grade= 'F';
      else if(finalExam<60 && weightedAvg>44)
         grade= 'D';
      else if(weightedAvg >90)
         grade = 'A';
      else if(weightedAvg > 75 && weightedAvg <=90)
         grade = 'B';
      else if(weightedAvg > 60 && weightedAvg <= 75)
         grade = 'C';
      else if(weightedAvg > 44 && weightedAvg <=60)
         grade = 'D';
      else if(weightedAvg < 45)     
         grade = 'F';
     
      System.out.println("\nYour test average is:  " + testAvg);
      System.out.println("Your weighted average is:  " + weightedAvg);
      System.out.println("Your letter grade is:  " + grade + ".\n");
                                 
      System.out.println("\nBye!\n");

   } // main
} // class

