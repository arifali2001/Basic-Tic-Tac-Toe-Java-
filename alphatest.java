import java.util.Scanner;

public class alphatest {
    static void display(char[][]b){
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

    }
    static int wincheck(char[][]b,char m){
        if((b[0][0]==m && b[2][0]==m && b[4][0]==m || b[0][0]==m && b[2][2]==m && b[4][4]==m || b[0][0]==m && b[0][2]==m && b[0][4]==m || 
          b[0][2]==m && b[2][2]==m && b[4][2]==m || b[4][0]==m && b[2][2]==m && b[0][4]==m || b[0][4]==m && b[2][4]==m && b[4][4]==m ||
          b[4][4]==m && b[4][2]==m && b[4][0]==m || b[2][4]==m && b[2][2]==m && b[2][0]==m) && m=='X'){
            System.out.println("- - - - - - - - Player1 Won! - - - - - - - -");
            return 1;
       }
       else if((b[0][0]==m && b[2][0]==m && b[4][0]==m || b[0][0]==m && b[2][2]==m && b[4][4]==m || b[0][0]==m && b[0][2]==m && b[0][4]==m || 
          b[0][2]==m && b[2][2]==m && b[4][2]==m || b[4][0]==m && b[2][2]==m && b[0][4]==m || b[0][4]==m && b[2][4]==m && b[4][4]==m ||
          b[4][4]==m && b[4][2]==m && b[4][0]==m || b[2][4]==m && b[2][2]==m && b[2][0]==m) && m=='O'){
            System.out.println("- - - - - - - - Player2 Won! - - - - - - - -");
            return 2;
       }
       else{
        return 0;
        // System.out.println("Opponent Won");
       }
    }
    // static String playerchoose(String a){
    //     if(a.equals("X") || a.equals("x") ){
    //         return "X";
    //     }
    //     else if(a.equals("O")|| a.equals("o")){
    //         return "O";
    //     }
    //     else{
    //         System.out.println("Please Enter a 'X' or 'O'..... By Default 'X' has been choosen");
    //         return "X";
    //     }

    // }
    public static void placingxno(char b[][], int pos, char m){
        switch (pos) {
            case 7:
                b[0][0] = m;
                break;
            case 8:
                b[0][2] = m;
                break;
            case 9:
                b[0][4]=m;
                break;
            case 4:
                b[2][0]=m;
                break;
            case 5:
                b[2][2]=m;
                break;
            case 6:
                b[2][4]=m;
                break;
            case 1:
                b[4][0]=m;
                break;
            case 2:
                b[4][2]=m;
                break;
            case 3:
                b[4][4]=m;
                break;
        
            default:
                System.out.println("Enter A Valid Input");
                placingxno(b, pos, m);
                break;
        }
    }
    public static void posinit(char b[][], char m){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Position According to the NUM pad");
        int pos=sc.nextInt();
        placingxno(b, pos, m);
    }
    public static void main(String[] args) {
        char [][] b = {{' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},
        {'-', '+', '-', '+', '-'},
        {' ', '|', ' ', '|', ' '},};
        display(b);
        System.out.println("---------------Game Started-----------");
        
        // Scanner sc= new Scanner(System.in);
        // String a= sc.nextLine();
        // //String ac=playerchoose(a);
        // char m=a.charAt(0);
        while (true) {
            System.out.println(" Player1 Turn -'X'- ");
            Scanner sc= new Scanner(System.in);
            //String a= sc.nextLine();
            //String ac=playerchoose(a);
            char m='X';
            posinit(b, m);
            display(b);
            int w=wincheck(b, m);
            if(w==1){
                break;
            }

            //player2\
            System.out.println(" Player2 Turn -'O'-");
            // Scanner sc= new Scanner(System.in);
            //String a2= sc.nextLine();
            //String ac=playerchoose(a);
            char m2='O';
            posinit(b, m2);
            display(b);
            int w2=wincheck(b, m2);
            if(w2==1){
                break;
            }


            
        }
    }
}
