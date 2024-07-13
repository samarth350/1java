public class Lisearch {
    public static void main(String[] args) throws Exception {
      
        int[] a={10,20,30,40,50};
        int no=60;
        int temp=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==no){
                System.out.println("number found at index "+i);
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("element not found");
        }

      }
  }
    

