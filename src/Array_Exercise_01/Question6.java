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
public class Question6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int arr_size = 0;
        if (sc.hasNextInt()) {
            arr_size = sc.nextInt() + 1;
        }
        int[] arr = new int[arr_size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size - 1; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            }
        }

        int position = 0;
        System.out.print("Which position you want to delete in the array: ");
        if (sc.hasNextInt()) {
            position = sc.nextInt();
        }

        if (position >= 0 && position < arr_size - 1) {
            for (int j = position; j < arr_size - 1; j++) {
                arr[j] = arr[j + 1];
            }

            System.out.print("Modified Array: ["+ arr[0]);
            for (int a = 1; a < arr_size - 1; a++) {
                System.out.print(", "+arr[a]);
                
            }
            System.out.print("]");
        } else {
            System.out.println("Invalid position. Please enter a valid position.");
        }

        sc.close();
    }
}
