import java.util.Scanner;

public class daonguocphantu {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.print("enter size: ");
            size = scanner.nextInt();
            if (size > 20)
                System.out.println("size do not exceed 20");
        }while (size > 20);
        array= new int[size];
        int i = 0;
        while (i < array.length){
            System.out.print("enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int j = 0; j < array.length;j++){
            System.out.print(array[i] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++){
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j]= temp;
        }
        System.out.printf("%-20s%s", "Reverse array: ", "");
        for (int k = 0 ; k < array.length; k++){
            System.out.print(array[k] + "\t");
        }
    }
}
