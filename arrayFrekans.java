public class arrayFrekans {
    static boolean isFind(int array[], int val){
        for( int i  : array) {
            if( i==val){
                return true;
            }
        }
        return false;
    }

                public static void main(String[] args) {



        int[] arr= {10,2,4,5,6,10,2,3,10,4,4,10};
        int[] dubl=new int[arr.length];
        int k = 0 ;


        for(int i=0 ; i<arr.length; i++){

            for(int j = 0; j<arr.length;j++){

                if(i!=j&&arr[i]==arr[j]){
                    if(!isFind(dubl,arr[i])){

                        dubl[k++]=arr[i];
                    }
                }
            }
        }
        for(int i=0 ; i<dubl.length; i++){
            int l= 0;
            for(int j = 0; j<arr.length;j++) {
                if(dubl[i]==arr[j]){
                    l++;
                }


            }
            if(dubl[i]!=0) {
                System.out.println("'"+dubl[i]+"'"+ "  "+ " " + l+ " kere tekrar edildi..");
            }
        }




    }
}
