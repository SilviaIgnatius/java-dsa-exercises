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
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
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

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr_size; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }else{
                min=arr[i];
            }
        }
        System.out.println("The maximum value of array :    " + max);
        System.out.println("The minimum value of array :    " + min);
        sc.close();
    }
}
