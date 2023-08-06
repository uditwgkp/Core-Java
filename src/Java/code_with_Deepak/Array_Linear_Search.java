package Java.code_with_Deepak;
public class Array_Linear_Search
{
    public static void main(String[] args) {
        int arr[] = {10, 20, 80, 30, 60, 50,
                110, 100, 130, 170};
        int x=110;
        int res=linearSearch(arr,x);
        System.out.println(res);
    }
    static int linearSearch(int arr[],int a){
        for (int i=0; i<arr.length;i++){
            if(arr[i]==a){
                return i;
            }
        }return -1;
    }
}
