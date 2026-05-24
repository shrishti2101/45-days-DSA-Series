public class Patterns{
    public static void main(String args[]){
        int n=5;
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=n;j++){
        //         if(j==0||j==n||i==0||i==n)
        //        { System.out.print("*");}
        //     else{
        //         System.out.print(" ");
        //     }
        //     }
        //     System.out.println(" ");
        // }

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }
        
        // for(int i=n;i>=0;i--){
        //     for(int j=i;j>0;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println("");
        // }

        // for(int i=1;i<n;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print(i);
        //     }
        //     System.out.println(" ");
        // }

        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=n;j>=n-j+i;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

