public class Insertionsort {
    public static void main(String[] args) throws Exception {
        int[] a={5,1,2,6,4,3};
        int temp,j;
        for(int i=1;i<a.length;i++){
            temp=a[i];
            j=i;
            while(j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j--;
            }
            a[j]=temp;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

}
}
