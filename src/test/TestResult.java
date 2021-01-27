package test;

import domain.Exercise;

public class TestResult {

     public static void main(String[] args) {
       try {
           int input = 401211;
           System.out.printf("�ividers of %d : %s.",input, Exercise.Calculate(input));
       }
       catch(Exception e) {
           System.out.println(e.getMessage());
       }
   }
   
}
