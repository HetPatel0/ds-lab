class Q31{
    public static void main(String[] args) {
        //int [][] a = new int[3][2];
       // int [][] b = new int[2][3];
        int [][] c = new int[3][3];
       int [][] a={
            {1,2},
            {1,2},
            {1,2}
        };
        int [][] b={
            {1,2,3},
            {1,2,3},
            
        };

        for (int i=0; i<3;i++) {
            for(int j=0;j<3;j++) {
                for(int k=0;k<2;k++){
                c[i][j]= c[i][j] + a[i][k]*b[k][j];

            }
        }
       
    }
    for (int i=0; i<3;i++) {
        for(int j=0;j<3;j++) {
          System.out.print(c[i][j] + " ");
         } 
      System.out.println();
    } 
}
    
}
