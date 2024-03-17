public class reverseArray {
    public static void rev(int arr[]){
        int last = arr.length-1,first = 0;
            while(first<last){
                int temp = arr[last];
                arr[last] = arr[first];
                arr[first] = temp;
                first++;
                last--;
            }
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        rev(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        
    }
}
