import org.w3c.dom.CDATASection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner inp = new Scanner(System.in);
        //Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2
//        int[] num = {50, -20, 0, 30, 40, 60, 10 };
//        if(num[0]==num[num.length-1]){
//            System.out.println("true");
//        }else System.out.println("false");

        //Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.
//        int[] num = {1, 4, 17, 7, 25, 3, 100 };
//        Arrays.sort(num);
//        for(int i = num.length-1; i>3; i--){
//            System.out.println(num[i]);
//        }
        //Write a Java program to find the numbers greater than the average of the numbers of a given array.
//        int[] num = {1, 4, 17, 7, 25, 3, 100};
//        ArrayList <Integer> date = new <Integer> ArrayList();
//        int sum=0;
//        int size=num.length;
//        int avg=0;
//
//       for (int i=0;i < num.length;i++){
//            sum += num[i];
//       }
//       avg = sum / size;
//        for (int i=0;i < num.length;i++){
//            if(num[i]>avg){
//                date.add(num[i]);
//            }
//        }
//        System.out.println("The average of the said array is: "+ avg+ " The numbers in the said array that are greater than the average are: " + date);

//Write a Java program to get the larger value between first and last element of an array of integers.

//
//        int[] num = {20, 30, 40};
//        int large =0;
//        if(num[0]>num[num.length-1]){
//            large=num[0];
//            System.out.println("the largest value is the first :"+large);
//        }else {
//            large=num[num.length-1];
//            System.out.println("the largest value is the last :"+large);
//        }

//        Write a Java program to swap the first and last elements of an array and create a new array.
//
//        int[] num = {20, 30, 40};
//        ArrayList <Integer> date = new <Integer> ArrayList();
//        for(int i = num.length-1; i>=0; i--){
//           date.add(num[i]);
//        }
//        System.out.println(date);

//        Write a Java program to find all of the longest word in a given dictionary.

//        String [] texts = { "cat", "dog", "123456","red", "is", "am","saleh","g","1234567" ,"1234567" };
//        ArrayList <String> date = new <String> ArrayList();
//        int temp =texts[0].length();;
//        for(int i =0; i < texts.length; i++){
//            if(temp < texts[i].length()){
//                temp =texts[i].length();
//            }
//        }
//        for (int i =0; i<texts.length;i++){
//            if(temp ==texts[i].length()){
//                date.add(texts[i]);
//            }
//        }
//        System.out.println(date);

        //Write a program thats displays the number of occurrences of an element in the array.
//        int[] num = {1,1,1,3,3,5,1};
//        System.out.println("enter the number :");
//        int num1 = inp.nextInt();
//        int counter=0;
//        for (int i=0;i <num.length;i++){
//            if(num1==num[i]){
//                counter++;
//            }
//        }
//      if(counter >0){
//          System.out.println(num1+" occurs " +counter+" counter ");
//      }else System.out.println(num1+" occurs "+counter+ " times ");


        // Write a program that places the odd elements of an array before the even elements.
//        int[] num = {2,3,40,1,5,9,4,10,7};
//        ArrayList <Integer> odd = new <Integer> ArrayList();
//        ArrayList <Integer> even = new <Integer> ArrayList();
//        for (int i =0; i<num.length;i++){
//            if(num[i]%2==1){
//                odd.add(num[i]);
//            }
//            else even.add(num[i]);
//        }
//
//        odd.addAll(even);
//        System.out.println(odd);


        //Write a program that test the equality of two arrays.
//        int[] num1 = {2,3,6,6,4};
//        int[] num2 = {2,3,6,6,4};
//        System.out.println(Arrays.equals(num1,num2));


        //Write a menu driven Java program with following option.
        System.out.println("enter the size of the array !");
        int num1 = inp.nextInt();
        int arr [] = new int [num1];
        int counter =0;
        System.out.println("1 Accept elements of an array\n" +
                "2 Display elements of an array\n" +
                "3 Search the element within array\n" +
                "4 Sort the array\n" +
                "5 To Stop");
        int num2 = inp.nextInt();
        while (num2!=5) {
            if (num2 == 1) {
                if(counter==arr.length){
                    System.out.println("the array is fill !");
                    break;
                }else {
                System.out.println("enter the number that you want to add !");
                int num3 = inp.nextInt();
                arr[counter]= num3;
                counter++;
                System.out.println("1 Accept elements of an array\n" +
                        "2 Display elements of an array\n" +
                        "3 Search the element within array\n" +
                        "4 Sort the array\n" +
                        "5 To Stop");
                num2 = inp.nextInt();
                }
            }
            if (num2==2){
                System.out.println(Arrays.toString(arr));
                System.out.println("1 Accept elements of an array\n" +
                        "2 Display elements of an array\n" +
                        "3 Search the element within array\n" +
                        "4 Sort the array\n" +
                        "5 To Stop");
                num2 = inp.nextInt();
            }
            if(num2==3){
                System.out.println("enter the number you want search");
                int num4 = inp.nextInt();
                for (int i=0;i < arr.length;i++){
                    if(num4==arr[i]){
                        System.out.println("the number in the array !");
                    }
                    else System.out.println("the number is not in the array !");
                    System.out.println("1 Accept elements of an array\n" +
                            "2 Display elements of an array\n" +
                            "3 Search the element within array\n" +
                            "4 Sort the array\n" +
                            "5 To Stop");
                    num2 = inp.nextInt();
                }
            }
            if(num2==4){
                Arrays.sort(arr);
                System.out.println("1 Accept elements of an array\n" +
                        "2 Display elements of an array\n" +
                        "3 Search the element within array\n" +
                        "4 Sort the array\n" +
                        "5 To Stop");
                num2 = inp.nextInt();

            }

            if(num2>5 || num2<1){
                System.out.println("you enter wrong number select from this list");
                System.out.println("1 Accept elements of an array\n" +
                        "2 Display elements of an array\n" +
                        "3 Search the element within array\n" +
                        "4 Sort the array\n" +
                        "5 To Stop");
                num2 = inp.nextInt();
            }
        }

        System.out.println("the code stop !");
    }
}