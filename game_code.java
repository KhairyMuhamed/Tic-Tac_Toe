package x.o.project;
import java.util.Scanner;
public class XOProject {
   static char board[][]=new char[3][3];
   static boolean end=false;
   static int counter=0;
    static boolean noWinner=true;
   public static void main(String[] args) {
        System.out.println("Starting Tic-toc-Toy Game........");
   intializeBoard();
        printBoard();
        lbl:do{
        printouput1();
       cases1(takeInput());
          testWinner(board);
          printBoard();
          counter++;
          if(counter==9&&testWinner(board)!=true)
   
          {   System.out.println("Oh Sorry It's Draw !");
          System.out.println("Try again");
              end=true;
              break lbl;}
                  if(testWinner(board)==true){
              System.out.println("Congratulations 'X' ^_^ , You win the game !");
          break lbl;}
                  printouput2();
        cases2(takeInput());
        testWinner(board);
      printBoard();
      counter++;
      if(counter==9&&testWinner(board)!=true){
          System.out.println("Oh Sorry It's Draw !");
          System.out.println("Try again");
          end=true;
      break lbl;}
      if(testWinner(board)==true){
              System.out.println("Congratulations 'O' ^_^ , You win the game!");
          break lbl;}
          }while(end=true);
      }
  public static void printBoard(){
   System.out.println("------------------------------------------------");
   for(int i=0;i<3;i++){
    System.out.print("|");
  for(int j=0;j<3;j++)
    System.out.print("\t"+board[i][j]+"\t"+"|");
   System.out.println();
   System.out.println("------------------------------------------------");
    }}
    public static void intializeBoard(){
    board[0][0]='1';
    board[0][1]='2';
    board[0][2]='3';
    board[1][0]='4'; 
    board[1][1]='5';
    board[1][2]='6';
    board[2][0]='7';
    board[2][1]='8';
    board[2][2]='9';}
    public static void cases1(int chois){
    switch(chois){
       case 1 :
           board[0][0]='X';
           break;
       case 2 :
           board[0][1]='X';
           break;
   case 3 :
           board[0][2]='X';
           break;
       case 4 :
           board[1][0]='X';
           break;
   case 5 :
           board[1][1]='X';
           break;
       case 6 :
           board[1][2]='X';
           break;
   case 7 :
           board[2][0]='X';
           break;
       case 8 :
           board[2][1]='X';
           break;
   case 9 :
           board[2][2]='X';
           break;
           default :
           System.out.println("Are you kidding me!?");
    System.out.println("You lose your turn *__* ");} }
  public static void printouput1() {
  System.out.println("Hey 'X' player");
   System.out.println("Where do you want to put \"X\"");}
   public static int takeInput(){
      Scanner input = new Scanner(System.in);
   int chois=input.nextInt();
  return chois;  }
   public static void printouput2() {
  System.out.println("Hey 'O' player" );
   System.out.println("Where do you want to put \"O\"");}
    public static void cases2(int chois){
    switch(chois){
       case 1 :
           board[0][0]='O';
           break;
       case 2 :
           board[0][1]='O';
           break;
   case 3 :
           board[0][2]='O';
           break;
       case 4 :
           board[1][0]='O';
           break;
   case 5 :
           board[1][1]='O';
           break;
       case 6 :
           board[1][2]='O';
           break;
   case 7 :
           board[2][0]='O';
           break;
       case 8 :
           board[2][1]='O';
           break;
   case 9 :
           board[2][2]='O';
           break;
    default :
           System.out.println("Are you kidding me!?");
    System.out.println("you lose your turn *__*");} }
public static boolean testWinner(char board[][])
{
for (int i=0;i<3;i++){
if(board[0][i]==board[1][i]&&board[1][i]==board[2][i])
    return true;}
for(int i=0;i<=2;i++){
    if(board[i][0]==board[i][1]&&board[i][1]==board[i][2])
        return true;
}
 if (board[0][0]==board[1][1]&&board[1][1]==board[2][2])    
return true;
  else if
            (board[0][2]==board[1][1]&&board[1][1]==board[2][0])
        return true;
 else
     return false;
}
}  
