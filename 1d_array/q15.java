//adding element at diff pos of an array

public class q15 {

    // Method to insert element at beginning
    static void insertAtBeginning(int[] arr, int element) {

        // Write your code here
        int n = arr.length;
        int[] newarr= new int[n+1];
        newarr[0]=element;
        for (int i = 0; i < arr.length; i++) {
            newarr[i+1]=arr[i];
        }
        System.out.println();
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
        
    }

    // Method to insert element at end
    static void insertAtEnd(int[] arr, int element) {

        // Write your code here
        int n =arr.length;
        int[] newarr= new int[n+1];
        for (int i = 0; i < arr.length; i++) {
            newarr[i]=arr[i];
        }
        newarr[n]=element;
        System.out.println();
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }

    // Method to insert element at any position
    static void insertAtPosition(int[] arr, int element, int position) {

        // Write your code here
        int n =arr.length;
        int[] newarr= new int[n+1];
        for (int i = 0; i < position; i++) {
            newarr[i]=arr[i];
        }
        newarr[position]=element;
        for (int i = position; i < arr.length; i++) {
            newarr[i+1]=arr[i];
        }
        System.out.println();
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]+" ");
        }
    }

    // Method to display array
    static void display(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Array with extra space
        int[] arr1 = new int[5];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        arr1[3] = 40;
        arr1[4] = 50;

        int[] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;

        int[] arr3 = new int[5];
        arr3[0] = 10;
        arr3[1] = 20;
        arr3[2] = 30;
        arr3[3] = 40;
        arr3[4] = 50;

        System.out.println("Original Array:");
        display(arr1);

        // Practice inserting at beginning
        insertAtBeginning(arr1, 5);

        // Practice inserting at end
        insertAtEnd(arr2, 60);

        // Practice inserting at any position
        insertAtPosition(arr3, 25, 2);
    }
}