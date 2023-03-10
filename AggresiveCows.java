public class AggresiveCows {
  public static void main(String[] args) {
    int[] arr={1,2,4,8,9};
    int c=3;
   int ans= minimumDist(arr,c);
   System.out.println(ans);
  }
  static int minimumDist(int[] arr,int c){
int start=1;
int res=-1;
int end=arr[arr.length-1]-arr[0];
while (end>=start) {
  int mid=start+(end-start)/2;
  if (canPlace(mid,arr,start,end,c)) {
     res=mid;
    start=mid+1;
  }
  else end=mid-1;




}
return res;


  }
  static boolean canPlace(int dist,int[] arr,int start,int end,int c ){
int count=1; //placed a cow that's why 
int cord=arr[0];
for (int index = 1; index < arr.length; index++) {
  if (arr[index]-cord>=dist) {
    count++;
    cord=arr[index];
  }
  if (count==c) {
    return true;
  }



}



return  false;



  }
}
