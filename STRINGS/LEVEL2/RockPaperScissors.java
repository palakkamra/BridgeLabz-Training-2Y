package LEVEL2;

import java.util.*;

public class RockPaperScissors {
    public static String compChoice() {
        int c=(int)(Math.random()*3);
        return (c==0)?"rock":(c==1)?"paper":"scissors";
    }
    public static String winner(String u,String c){
        if(u.equals(c)) return "Draw";
        if(u.equals("rock")&&c.equals("scissors")||u.equals("scissors")&&c.equals("paper")||u.equals("paper")&&c.equals("rock")) return "User";
        return "Computer";
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int games=sc.nextInt();
        int uw=0,cw=0;
        for(int i=0;i<games;i++){
            String user=sc.next();
            String comp=compChoice();
            String win=winner(user,comp);
            if(win.equals("User")) uw++; else if(win.equals("Computer")) cw++;
            System.out.println("User:"+user+" Comp:"+comp+" -> "+win);
        }
        System.out.println("User Wins: "+uw+" Computer Wins: "+cw);
        double up=uw*100.0/games, cp=cw*100.0/games;
        System.out.println("User %: "+up+" Computer %: "+cp);
    }
}
 
