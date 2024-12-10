public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) { // corrected loop condition
            array[i] = i * 2;
        }
        // Accessing a valid index
        System.out.println(array[0]); 
        System.out.println(array[4]);
    }
}