import java.util.*;
/**
 * Write a description of class BattleshipTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BattleshipTester
{
    public static void main(String[] args){
        Battleship b = new Battleship();
        while(true){
            System.out.println("Player 1's turn.-----------------------------");
            System.out.println("Your hits / misses.");
            b.printP1HitBoard();
            System.out.println("Enemy hits / misses & your ships.");
            b.printP1Board();
            b.p1Fire();
            b.waitTime(2000);
            System.out.print('\u000C');
            //check if some1 lost
            if(b.checkSunkP1() == true) break;
            if(b.checkSunkP2() == true) break;
            //------------------------------
            System.out.println("Player 2's turn.-----------------------------");
            System.out.println("Your hits / misses.");
            b.printP2HitBoard();
            System.out.println("Enemy hits / misses & your ships.");
            b.printP2Board();
            b.p2Fire();
            b.waitTime(2000);
            System.out.print('\u000c'); // clear the terminal
            //check if some1 lost
            if(b.checkSunkP1() == true) break;
            if(b.checkSunkP2() == true) break;
        }
    }
}