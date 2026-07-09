import java.util.ArrayList;

public class mergesort {
    void mergeSort(int arr[],int st,int end){
        if(st>=end){
            return;
        }
        int mid=(st+end)/2;
        mergeSort(arr,st,mid);
        mergeSort(arr,mid+1,end);

        merge(arr,st,mid,end);
    }
    void merge(int arr[],int st,int mid,int end){
        ArrayList<Integer>temp=new ArrayList<>();
        int i=st;
        int j=mid+1;
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
                i++;
            }
            else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }
        while(j<=end){
            temp.add(arr[j]);
            j++;
        }
        for(int idx=0;idx<temp.size();idx++){
            arr[idx+st]=temp.get(idx);
        }
    }

    public static void main(String[] args) {
        int arr[]={12,31,35,8,32,17};
        mergesort obj=new mergesort();

        obj.mergeSort(arr,0,arr.length-1);

        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.printf("Sorted");
    }
}
