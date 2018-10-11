package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class Main {
    //8. Print 5 random numbers given a bound

//    public static void main(String[] args) {
//
//        input();
//
//    }
//    public static void input() {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter any number");
//        int num = input.nextInt();
//        getRandom(num);
//    }
//
//    public static int getRandom (int num){
//        Random rand = new Random();
//            int index =0;
//        for (int i =1; i<=5; i++){ //loop goes 5 times; need 5 random numbers; some way to store index and data value
//             index = rand.nextInt(num); //numbers from 1 -10
//            System.out.println(index);
//
//        }return index;
//
//    }
//}

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter any number");
//        int num = input.nextInt();
////        int index = getRandom(num); //will print double the value; same as A4
//        getRandom(num);
//    }
//    public static int getRandom (int num){
//        Random rand = new Random();
////        int number = rand.nextInt(10); //same as A4;
//            int index =0;
//        for (int i =1; i<=5; i++){ //loop goes 5 times; need 5 random numbers; some way to store index and data value
//             index = rand.nextInt(num); //how to get a number based on w.e range the user types= num
//            System.out.println(index);
//
//        }return index;
//
//    }
//}

    //9. Given the array list, print random word from list(module, class, implement)
//    static Random rand = new Random();
//    public static void main(String[] args) {
//        System.out.println(randomWord());
//
//    }
//    public static String randomWord(){ //only printing one word not a list so no arraylist
//        ArrayList<String> word = new ArrayList<>();
//        word.add("module");     //add is a method so it only takes 1 value
//        word.add("class");
//        word.add("implement");
//
//        int wordIndex = rand.nextInt(word.size()-1); //only printing it once not 3 times so no need for loop
//        //minus 1 to know index at which location the word is located at--> index starts at 0; last index = index-1 since an index of 3 doesn't exist. So word.size equals 3 right now, but array list is from 0-2 indeces
//        //size of word array; starts at 0 and go to index 2
//        //stores random index from 0-2;
//        String oneWord = word.get(wordIndex);
//        return oneWord;
//    }
//}

    //10. Take integer input from user, output whether it's odd or even
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer");
//        int num = input.nextInt();
//        String numbers = getOddEven(num);
//        System.out.println(numbers);
//    }
//
//    public static String getOddEven(int num) {
//        String numbers = "";
//
//        if (num % 2 == 0) {
//            System.out.println("It is an even number");
//        } else {
//            System.out.println("It is an odd number");
//        }return numbers;
//
//    }
//}




    //11. Grades
//        public static void main(String[] args){
//        /*
//            The letter grade is determined as follows:
//            A = 90–100%
//            B = 80–89%
//            C = 70–79%
//            D = 60–69%
//            F = 0–59%
//            Write a program that will print the
//            letter grade based on the percentage entered.
//        */
//
//            Scanner in = new Scanner(System.in);
//            System.out.print("Enter percentage: ");
//            int percentage = in.nextInt();
//            String letterGrade = getLetterGrade(percentage);
//            System.out.println(letterGrade);
//
//        }
//
//        public static String getLetterGrade(int percentage){
//            String letterGrade = "";
//
//            if(percentage >= 90){
//                letterGrade = "A";
//            }
//
//            else if(percentage >= 80){
//                letterGrade = "B";
//            }
//
//            else if(percentage >= 70){
//                letterGrade = "C";
//            }
//
//            else if(percentage >= 60){
//                letterGrade = "D";
//            }
//
//            else {
//                letterGrade = "F";
//            }
//
//            return letterGrade;
//        }
//    }



    //1. cm to inches;
//    public static void main(String[] args) {
//        Scanner kbd = new Scanner (System.in);
//
//        System.out.println("Enter a number in inches: ");
//        int numInInches = kbd.nextInt();
//        double Cm= (convertToCm(numInInches));
//        System.out.printf("%.2f", convertToCm(numInInches)); //print 2 decimal places
//
//    }
//    public static double convertToCm(int numInInches){
//    double cm = numInInches *2.54;
//    return cm;
//
//    }
//}

//    //2. in to ft;
//    public static void main(String[] args) {
//        Scanner input = new Scanner (System.in);
//
//        System.out.println("Enter a number in inches: ");
//        int numInInches = input.nextInt();
//        double Ft = (convertToFt(numInInches));
//        System.out.printf("%.2f", convertToFt(numInInches));
//    }
//    public static double convertToFt (int numInInches) {
//    double Ft = (numInInches * 0.0833333) ;
//    return Ft;
//    }
//}

    //3. Miles to km (1 mile = 1.6km)

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a number in Miles");
        int numInMiles = input.nextInt();
        double Km = convertToKm(numInMiles);
        System.out.printf("%.2f", convertToKm(numInMiles));
    }

    public static double convertToKm (int numInMiles){
        double Km = numInMiles * 1.6;
        return Km;
    }
    }
