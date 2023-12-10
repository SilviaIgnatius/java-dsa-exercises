/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Exercise_01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Silvia_Ignatius
 */

public class Question4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        int[] arr = new int[arr_size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.print("Original Array: [");
        System.out.print(arr[0]);
        for (int i = 1; i < arr_size; i++) {
            System.out.print("," + arr[i]);
        }
        System.out.println("]");

        Arrays.sort(arr);
        System.out.print("Sorted Array: [");

        int mode = arr[0]; 
        int modeCount = 1;
        int currentNum = arr[0];
        int currentCount = 1;
                System.out.print(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            System.out.print(", "+arr[i]);

            if (arr[i] == currentNum) {
                currentCount++;
            } else {
                if (currentCount > modeCount) {
                    mode = currentNum;
                    modeCount = currentCount;
                }
                currentNum = arr[i];
                currentCount = 1;
            }
        }

        if (currentCount > modeCount) {
            mode = currentNum;
        }

        System.out.println("]");

        System.out.println("The mode of the array: " + mode);

        sc.close();
    }
}
