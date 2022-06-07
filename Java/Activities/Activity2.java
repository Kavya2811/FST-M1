package activities;

public class Activity2 {
    public static void main(String[] args){
        int arr[]={10,77,10,54,-11,10 };
        int output=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]==10){
             output=output+arr[i];
            }
        }
        System.out.println("Sum of all 10's="+output);
    }
}
