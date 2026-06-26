package Arrays;

public class binarysearch {

    public static int binary(int list[],int key){
        int start=0; int end= list.length-1;

        while(start<=end){
            int mid = (start+end)/2;

            if(list[mid]==key){
                return mid;
            }
            if(list[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int list[]= {1,2,4,6,8,10,20,30};
        int key=10;

        System.out.println("find the key in index no ="+binary(list, key));

    }
    
}
