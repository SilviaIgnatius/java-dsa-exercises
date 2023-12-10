/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_Exercise_01;

import java.util.Scanner;

/**
 *
 * @author Silvia_Ignatius
 */
public class Question2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt();
        }

        int[] arr = new int[arr_size];

        System.out.println(
                "Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        int sum = 0;
        System.out.print(
                "The average value of array elements:    ");
        for (int i = 0; i < arr_size; i++) {
            sum = sum + arr[i];
        }
        float average = (float) sum / arr_size;
        System.out.println(average);
        sc.close();
    }
}
