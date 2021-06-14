/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Colin Mitchell
 */

package ex38;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String nums = input.nextLine();

        String[] strArr = nums.split(" ");
        int[] intArr = new int[strArr.length];

        for (int i = 0; i < strArr.length; i++) {
            String num = strArr[i];
            intArr[i] = Integer.parseInt(num);
        }

        int[] filtered = filterEvenNumbers(intArr);
        printFilteredArray(filtered);
    }

    public static int[] filterEvenNumbers(int[] nums) {
        int[] copy = new int[nums.length / 2];

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                copy[j++] = nums[i];
            }
        }

        return copy;
    }

    public static void printFilteredArray(int[] nums) {
        System.out.print("The even numbers are ");

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}