public class devg2 {
    public static void main(String[] args) {
        char [][] a = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},};
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
    
}
