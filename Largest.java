package practicejava;

public class Largest {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,4};
        int firstLargest = Math.max(arr[0],arr[1]);
        int secondLargest = Math.min(arr[0],arr[1]);
        for(int i=2;i<arr.length;i++){
            if(firstLargest<arr[i]){
                firstLargest=arr[i];
            }
            else if(secondLargest<arr[i]){
                secondLargest=arr[i];
            }

        }
        System.out.println(firstLargest);
        System.out.println(secondLargest);


    }
}
