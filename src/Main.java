import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    //1

        int[] arr1 = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,45,16}; //удлинен для проверки задачи №4
        float[] arr2 = {1.57F, 7.654F, 9.986F};
        int[] arr3 = new int[31];

    //2

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]);
            if(i != arr1.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]);
            if(i != arr2.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]);
            if(i != arr3.length-1){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println(" ");

    //3

        for (int i = arr1.length-1; i >= 0; i--) {
            System.out.print(arr1[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = arr2.length-1; i >= 0; i--) {
            System.out.print(arr2[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        for (int i = arr3.length-1; i >= 0; i--) {
            System.out.print(arr3[i]);
            if(i != 0){
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        System.out.println(" ");

    //4

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i]%2 != 0){
                arr1[i]++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }
}