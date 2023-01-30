// import java.text.DecimalFormat;
// import java.util.ArrayList;
// // import java.util.Arrays;
// import java.util.Collections;
//
// ДЗ 3
// 1) Реализовать алгоритм сортировки слиянием
//
// Решение
//
// public class seminar3 {
//     public static void main(String[] args) {
//         int arrLength = 10;
//         int[] myArrOne = ArrayGenerator(arrLength);
//         int[] myArrTwo = ArrayGenerator(arrLength);
//         PrintArraysInLine(myArrOne);
//         PrintArraysInLine(myArrTwo);
//         System.out.println(MergeSort(myArrOne, myArrTwo));
//     }

//     static ArrayList MergeSort(int[] inputArrayOne, int[] inputArrayTwo) {
//         ArrayList result = new ArrayList();
//         for (int arOne = 0; arOne < inputArrayOne.length; arOne++) {
//             result.add(arOne, inputArrayOne[arOne]);
//         }
//         for (int arTwo = inputArrayOne.length; arTwo < inputArrayOne.length + inputArrayTwo.length; arTwo++) {
//             result.add(arTwo, inputArrayTwo[arTwo - inputArrayOne.length]);
//         }
//         Collections.sort(result);
//         return result;
//     }

//     static int[] ArrayGenerator(int length) {
//         int[] result = new int[length];
//         for (int i = 0; i < length; i++) {
//             result[i] = (int) (Math.random() * 11);
//         }
//         return result;
//     }
//     static void PrintArraysInLine(int[] inputArr){
//         System.out.println(Arrays.toString(inputArr));
//     }
// }
//
// 2) Пусть дан произвольный список целых чисел: удалить из него четные числа
//
// Решение
//
// public class seminar3 {
//     public static void main(String[] args) {
//         int length = 10;
//         ArrayList<Integer> myArr = ArrayGenerator(length);
//         System.out.println(myArr);
//         System.out.println(ArrayUnevener(myArr));
//     }

//     static ArrayList<Integer> ArrayGenerator(int length) {
//         ArrayList<Integer> result = new ArrayList<Integer>();
//         for (int i = 0; i < length; i++) {
//             result.add((int) (Math.random() * 11));
//         }
//         return result;
//     }

//     static ArrayList<Integer> ArrayUnevener(ArrayList<Integer> inputArray) {
//         ArrayList<Integer> aList = new ArrayList<>();
//         for (int i = 0; i < inputArray.size(); i++) {
//             if (inputArray.get(i) % 2 != 0)
//                 {
//                     aList.add(inputArray.get(i));
//                 }
//         }
//         return aList;
//     }

// }
//
// 3) Задан целочисленный список ArrayList. Найти минимальное, максимальное, среднее значение
//
// Решение
// public class seminar3 {
//     public static void main(String[] args) {
//         int length = 10;
//         ArrayList<Integer> aList = ArrayGenerator(length);
//         System.out.println(aList);
//         int maximum = Collections.max(aList);
//         int minimum = Collections.min(aList);
//         Double average = aList.stream().mapToInt(val ->val).average().orElse(0.0);
//         System.out.printf("max:\t\t%d\nmin:\t\t%d\naverage:\t%.2f", maximum, minimum, average);
//     }

//     static ArrayList<Integer> ArrayGenerator(int length) {
//         ArrayList<Integer> result = new ArrayList<Integer>();
//         for (int i = 0; i < length; i++) {
//             result.add((int) (Math.random() * 11));
//         }
//         return result;
//     }

//     static int SumOfArrayList(ArrayList<Integer> inputAList){
//         int sum=0;
//         for (int i = 0; i < inputAList.size(); i++) {
//             sum=sum+inputAList.get(i);
//         }
//         return sum;
//     }
// }