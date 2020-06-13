public class DuplicateNumbers {
    // Function to print duplicates
    void printRepeating(int arr[], int size)
    {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++)
        {
            if (arr[ Math.abs(arr[i])] >= 0){
                System.out.printf(" a = "+ Math.abs(arr[i]));
                System.out.printf(" b = "+ -arr[ Math.abs(arr[i])]);
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])];
            }else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }

    // Driver program
    public static void main(String[] args)
    {
        DuplicateNumbers duplicate = new DuplicateNumbers();
        int arr[] = {1, 2, 3, 1, 3, 6, 6};
        int arr_size = arr.length;

        duplicate.printRepeating(arr, arr_size);
    }
}
