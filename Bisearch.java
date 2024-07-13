public class Bisearch {
    public static void main(String[] args) throws Exception {
        int[] a={10,20,30,40,50,60};
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        int search=50;
        while(li<=hi){
            if(a[mi]==search){
                System.out.println("element found at "+mi);
                break;
            }
            else if(a[mi]<search){
                li=mi+1;
            }
            else{
                hi=mi-1;
            }
            mi=(li+hi)/2;
            if(li>hi){
                System.out.println("element not found");
            }
        }
    
}
}
