import java.util.*;
/**
 * Write a description of class Battleship here.
 *
 * @author (Ryan)
 * @version (1.2)
 */
public class Battleship
{
    int[][] p1Board = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},

        };
    int[][] p2Board = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},

        };
    int[][] p1HitBoard = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},

        };
    int[][] p2HitBoard = {
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0,0},

        };
    //Patrol boat
    private int p1Aax, p1Aay, p1Abx, p1Aby;
    //destroyer    
    private int p1Dax, p1Day, p1Dbx, p1Dby, p1Dcx, p1Dcy;
    //sub
    private int p1Sax, p1Say, p1Sbx, p1Sby, p1Scx, p1Scy;
    //battle ship
    private int p1Bax, p1Bay, p1Bbx, p1Bby, p1Bcx, p1Bcy , p1Bdx, p1Bdy;  
    //Patrol boat
    private int p2Aax, p2Aay, p2Abx, p2Aby;
    //destroyer    
    private int p2Dax, p2Day, p2Dbx, p2Dby, p2Dcx, p2Dcy;
    //sub
    private int p2Sax, p2Say, p2Sbx, p2Sby, p2Scx, p2Scy;
    //battle ship
    private int p2Bax, p2Bay, p2Bbx, p2Bby, p2Bcx, p2Bcy , p2Bdx, p2Bdy;

    public Battleship()
    {
        System.out.println("Player 1 place your destroyer.");
        placeDestroyerP1();
        printP1Board();
        waitTime(2000);
        System.out.print('\u000C');
        System.out.println("Player 2 place your destroyer.");
        placeDestroyerP2();
        printP2Board();
        waitTime(2000);
        System.out.print('\u000C');
        System.out.println("Player 1 place your submarine.");
        placeSubP1();
        printP1Board();
        waitTime(2000);
        System.out.print('\u000C');
        System.out.println("Player 2 place your submarine.");
        placeSubP2();
        printP2Board();
        waitTime(2000);
        System.out.print('\u000C');
        System.out.println("Player 1 place your battleship.");
        placeBatP1();
        printP1Board();
        waitTime(2000);
        System.out.print('\u000C');
        System.out.println("Player 2 place your battleship.");
        placeBatP2();
        printP2Board();
        waitTime(2000);
        System.out.print('\u000C');
    }
    //acessors
    public void waitTime(int time){
        long start = System.currentTimeMillis();
        while(start >= System.currentTimeMillis() - time);
    }

    public void p1DSunk()
    {
        if(p1Board[p1Dax][p1Day] == 2 && p1Board[(p1Dbx)][(p1Dby)] == 2 && p1Board[p1Dcx][p1Dcy] == 2)
        {
            System.out.print("You sunk Player 1's Destroyer!");
        }
        else
        {
            System.out.print("");
        }
    }

    public void p1SSunk()
    {
        if(p1Board[p1Sax][p1Say] == 2 && p1Board[(p1Sbx)][(p1Sby)] == 2 && p1Board[p1Scx][p1Scy] == 2)
        {
            System.out.print("You sunk Player 1's Destroyer!");
        }
        else
        {
            System.out.print("");
        }
    }

    public void p2DSunk()
    {
        if(p2Board[p2Dax][p2Day] == 2 && p2Board[(p2Dbx)][(p2Dby)] == 2 && p2Board[p2Dcx][p2Dcy] == 2)
        {
            System.out.print("You sunk Player 2's Submarine!");

        }
        else
        {
            System.out.print("");
        }
    }

    public void p2SSunk()
    {
        if(p2Board[p2Sax][p2Say] == 2 && p2Board[(p2Sbx)][(p2Sby)] == 2 && p2Board[p2Scx][p2Scy] == 2)
        {
            System.out.print("You sunk Player 2's Submarine!");

        }
        else
        {
            System.out.print("");
        }
    }

    public void printP1Board()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("  "+p1Board[i][j]);
            }
            System.out.println();
        }
    }

    public void printP2Board()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("  "+p2Board[i][j]);
            }
            System.out.println();
        }
    }

    public void printP1HitBoard()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("  "+p1HitBoard[i][j]);
            }
            System.out.println();
        }
    }

    public void printP2HitBoard()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print("  "+p2HitBoard[i][j]);
            }
            System.out.println();
        }
    }

    public boolean checkSunkP1()
    {
        int ones = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(p1Board[i][j] == 1){
                    ones++;
                }
            }
        }
        if(ones < 1){
            System.out.println("Player 1 loses."); return true;
        }
        else return false;
    }

    public boolean checkSunkP2()
    {
        int ones = 0;
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                if(p2Board[i][j] == 1){
                    ones++;
                }
            }
        }
        if(ones < 1){
            System.out.println("Player 2 loses."); return true;
        }
        else return false;
    }
    //mutators
    public void p1Fire()
    {
        //get the info
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to fire?");
        String col = scan.next();
        int row = scan.nextInt() -1;
        int col1 = 0;
        if(col.equals("a"))col1 = 0;
        else if(col.equals("b"))col1 = 1;
        else if(col.equals("c"))col1 = 2;
        else if(col.equals("d"))col1 = 3;
        else if(col.equals("e"))col1 = 4;
        else if(col.equals("f"))col1 = 5;
        else if(col.equals("g"))col1 = 6;
        else if(col.equals("h"))col1 = 7;
        else if(col.equals("i"))col1 = 8;
        else if(col.equals("j"))col1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            p1Fire();
        }
        //place the spot on the board where the mans can see it
        if(p2Board[row][col1] == 0 && p1HitBoard[row][col1] == 0){
            p1HitBoard[row][col1] = -1;
            p2Board[row][col1] = -1;
            System.out.println("You missed...");
            scan.close();
        }
        else if(p2Board[row][col1] == 1 && p1HitBoard[row][col1] == 0){
            p1HitBoard[row][col1] = 2;
            p2Board[row][col1] = 2;
            System.out.println("You hit a ship!");
            //check if a certain ship is sunk, if so tell which ship.
            p2DSunk();
            p2SSunk();
            //
            scan.close();
        }
        else {
            System.out.println("You already shot here, guess again."); 
            scan.close();
            p1Fire();
        }
        scan.close();
    }

    public void p2Fire()
    {
        //get the info
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to fire?");
        String col = scan.next();
        int row = scan.nextInt() -1;
        int col1 = 0;
        if(col.equals("a"))col1 = 0;
        else if(col.equals("b"))col1 = 1;
        else if(col.equals("c"))col1 = 2;
        else if(col.equals("d"))col1 = 3;
        else if(col.equals("e"))col1 = 4;
        else if(col.equals("f"))col1 = 5;
        else if(col.equals("g"))col1 = 6;
        else if(col.equals("h"))col1 = 7;
        else if(col.equals("i"))col1 = 8;
        else if(col.equals("j"))col1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            scan.close();
            p2Fire();
        }
        //place the spot on the board where the mans can see it
        if(p1Board[row][col1] == 0 && p2HitBoard[row][col1] == 0){
            p2HitBoard[row][col1] = -1;
            p1Board[row][col1] = -1;
            System.out.println("You missed...");
            scan.close();
        }
        else if(p1Board[row][col1] == 1 && p2HitBoard[row][col1] == 0){
            p2HitBoard[row][col1] = 2;
            p1Board[row][col1] = 2;
            System.out.println("You hit a ship!");
            //check if a certain ship is sunk, if so tell which ship.
            p1DSunk();
            p1SSunk();
            //
            scan.close();
        }
        else {
            System.out.println("You already shot here, guess again."); 
            scan.close();
            p2Fire();
        }
        scan.close();
    }
    //destoryers
    public void placeDestroyerP2()
    {
        //get the values for placement
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to place your destoyer(3)?");
        String thing = scan.next().toLowerCase();
        int thang = scan.nextInt() - 1;
        int thang1=0;
        String direction;
        if(thing.equals("a"))thang1 = 0;
        else if(thing.equals("b"))thang1 = 1;
        else if(thing.equals("c"))thang1 = 2;
        else if(thing.equals("d"))thang1 = 3;
        else if(thing.equals("e"))thang1 = 4;
        else if(thing.equals("f"))thang1 = 5;
        else if(thing.equals("g"))thang1 = 6;
        else if(thing.equals("h"))thang1 = 7;
        else if(thing.equals("i"))thang1 = 8;
        else if(thing.equals("j"))thang1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            placeDestroyerP2();
        }
        //edit the array(place destroyer)
        while(true)
        {
            System.out.println("Choose a direction (up,down,left,right)");
            direction = scan.next().toLowerCase();
            if(direction.equals("up"))
            {
                if(thang - 2 >= 0)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang-1)][(thang1)] == 0 && p2Board[(thang-2)][(thang1)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Dax = thang;
                        p2Day = thang1;
                        p2Board[(thang-1)][(thang1)] = 1;
                        p2Dbx = thang-1 ;
                        p2Dby = thang1;
                        p2Board[(thang-2)][(thang1)] = 1;
                        p2Dcx = thang-2;
                        p2Dcy = thang1;
                        break;
                    }
                    else{
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP2();
                        break;
                    }
                } 
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("left"))
            {
                if(thang1 - 2 >= 0)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang)][(thang1-1)] == 0 && p2Board[(thang)][(thang1-2)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Dax = thang;
                        p2Day = thang1;
                        p2Board[(thang)][(thang1-1)] = 1;
                        p2Dbx = thang;
                        p2Dby = thang1-1;
                        p2Board[(thang)][(thang1-2)] = 1;
                        p2Dcx = thang;
                        p2Dcy = thang1-2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("right"))
            {
                if(thang1 + 2 < 10)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang)][(thang1+1)] == 0 && p2Board[(thang)][(thang1+2)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Dax = thang;
                        p2Day = thang1;
                        p2Board[(thang)][(thang1+1)] = 1;
                        p2Dbx = thang;
                        p2Dby = thang1+1;
                        p2Board[(thang)][(thang1+2)] = 1;
                        p2Dcx = thang;
                        p2Dcy = thang1+2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("down"))
            {
                if(thang + 2 < 10)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang+1)][(thang1)] == 0 && p2Board[(thang+2)][(thang1)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Dax = thang;
                        p2Day = thang1;
                        p2Board[(thang+1)][(thang1)] = 1;
                        p2Dbx = thang+1;
                        p2Dby = thang1;
                        p2Board[(thang+2)][(thang1)] = 1;
                        p2Dcx = thang+2;
                        p2Dcy = thang1;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else System.out.println("You didn't enter a valid direction name, try again.");
        }   
    }

    public void placeDestroyerP1()
    {
        //get the values for placement
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to place your destoyer(3)?");
        String thing = scan.next().toLowerCase();
        int thang = scan.nextInt() - 1;
        int thang1=0;
        String direction;
        if(thing.equals("a"))thang1 = 0;
        else if(thing.equals("b"))thang1 = 1;
        else if(thing.equals("c"))thang1 = 2;
        else if(thing.equals("d"))thang1 = 3;
        else if(thing.equals("e"))thang1 = 4;
        else if(thing.equals("f"))thang1 = 5;
        else if(thing.equals("g"))thang1 = 6;
        else if(thing.equals("h"))thang1 = 7;
        else if(thing.equals("i"))thang1 = 8;
        else if(thing.equals("j"))thang1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            placeDestroyerP1();
        }
        //edit the array(place destroyer)
        while(true)
        {
            System.out.println("Choose a direction (up,down,left,right)");
            direction = scan.next().toLowerCase();
            if(direction.equals("up"))
            {
                if(thang - 2 >= 0)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang-1)][(thang1)] == 0 && p1Board[(thang-2)][(thang1)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Dax = thang;
                        p1Day = thang1;
                        p1Board[(thang-1)][(thang1)] = 1;
                        p1Dbx = thang-1 ;
                        p1Dby = thang1;
                        p1Board[(thang-2)][(thang1)] = 1;
                        p1Dcx = thang-2;
                        p1Dcy = thang1;
                        break;
                    }
                    else{
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP1();
                        break;
                    }
                } 
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("left"))
            {
                if(thang1 - 2 >= 0)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang)][(thang1-1)] == 0 && p1Board[(thang)][(thang1-2)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Dax = thang;
                        p1Day = thang1;
                        p1Board[(thang)][(thang1-1)] = 1;
                        p1Dbx = thang;
                        p1Dby = thang1-1;
                        p1Board[(thang)][(thang1-2)] = 1;
                        p1Dcx = thang;
                        p1Dcy = thang1-2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("right"))
            {
                if(thang1 + 2 < 10)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang)][(thang1+1)] == 0 && p1Board[(thang)][(thang1+2)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Dax = thang;
                        p1Day = thang1;
                        p1Board[(thang)][(thang1+1)] = 1;
                        p1Dbx = thang;
                        p1Dby = thang1+1;
                        p1Board[(thang)][(thang1+2)] = 1;
                        p1Dcx = thang;
                        p1Dcy = thang1+2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("down"))
            {
                if(thang + 2 < 10)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang+1)][(thang1)] == 0 && p1Board[(thang+2)][(thang1)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Dax = thang;
                        p1Day = thang1;
                        p1Board[(thang+1)][(thang1)] = 1;
                        p1Dbx = thang+1;
                        p1Dby = thang1;
                        p1Board[(thang+2)][(thang1)] = 1;
                        p1Dcx = thang+2;
                        p1Dcy = thang1;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeDestroyerP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else System.out.println("You didn't enter a valid direction name, try again.");
        }
    }
    //subs
    public void placeSubP1()
    {
        //get the values for placement
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to place your destoyer(3)?");
        String thing = scan.next().toLowerCase();
        int thang = scan.nextInt() - 1;
        int thang1=0;
        String direction;
        if(thing.equals("a"))thang1 = 0;
        else if(thing.equals("b"))thang1 = 1;
        else if(thing.equals("c"))thang1 = 2;
        else if(thing.equals("d"))thang1 = 3;
        else if(thing.equals("e"))thang1 = 4;
        else if(thing.equals("f"))thang1 = 5;
        else if(thing.equals("g"))thang1 = 6;
        else if(thing.equals("h"))thang1 = 7;
        else if(thing.equals("i"))thang1 = 8;
        else if(thing.equals("j"))thang1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            placeSubP1();
        }
        //edit the array(place destroyer)
        while(true)
        {
            System.out.println("Choose a direction (up,down,left,right)");
            direction = scan.next().toLowerCase();
            if(direction.equals("up"))
            {
                if(thang - 2 >= 0)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang-1)][(thang1)] == 0 && p1Board[(thang-2)][(thang1)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Sax = thang;
                        p1Say = thang1;
                        p1Board[(thang-1)][(thang1)] = 1;
                        p1Sbx = thang-1 ;
                        p1Sby = thang1;
                        p1Board[(thang-2)][(thang1)] = 1;
                        p1Scx = thang-2;
                        p1Scy = thang1;
                        break;
                    }
                    else{
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP1();
                        break;
                    }
                } 
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("left"))
            {
                if(thang1 - 2 >= 0)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang)][(thang1-1)] == 0 && p1Board[(thang)][(thang1-2)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Sax = thang;
                        p1Say = thang1;
                        p1Board[(thang)][(thang1-1)] = 1;
                        p1Sbx = thang;
                        p1Sby = thang1-1;
                        p1Board[(thang)][(thang1-2)] = 1;
                        p1Scx = thang;
                        p1Scy = thang1-2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("right"))
            {
                if(thang1 + 2 < 10)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang)][(thang1+1)] == 0 && p1Board[(thang)][(thang1+2)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Sax = thang;
                        p1Say = thang1;
                        p1Board[(thang)][(thang1+1)] = 1;
                        p1Sbx = thang;
                        p1Sby = thang1+1;
                        p1Board[(thang)][(thang1+2)] = 1;
                        p1Scx = thang;
                        p1Scy = thang1+2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("down"))
            {
                if(thang + 2 < 10)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang+1)][(thang1)] == 0 && p1Board[(thang+2)][(thang1)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Sax = thang;
                        p1Say = thang1;
                        p1Board[(thang+1)][(thang1)] = 1;
                        p1Sbx = thang+1;
                        p1Sby = thang1;
                        p1Board[(thang+2)][(thang1)] = 1;
                        p1Scx = thang+2;
                        p1Scy = thang1;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else System.out.println("You didn't enter a valid direction name, try again.");
        }
    }

    public void placeSubP2()
    {
        //get the values for placement
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to place your destoyer(3)?");
        String thing = scan.next().toLowerCase();
        int thang = scan.nextInt() - 1;
        int thang1=0;
        String direction;
        if(thing.equals("a"))thang1 = 0;
        else if(thing.equals("b"))thang1 = 1;
        else if(thing.equals("c"))thang1 = 2;
        else if(thing.equals("d"))thang1 = 3;
        else if(thing.equals("e"))thang1 = 4;
        else if(thing.equals("f"))thang1 = 5;
        else if(thing.equals("g"))thang1 = 6;
        else if(thing.equals("h"))thang1 = 7;
        else if(thing.equals("i"))thang1 = 8;
        else if(thing.equals("j"))thang1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            placeSubP2();
        }
        //edit the array(place destroyer)
        while(true)
        {
            System.out.println("Choose a direction (up,down,left,right)");
            direction = scan.next().toLowerCase();
            if(direction.equals("up"))
            {
                if(thang - 2 >= 0)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang-1)][(thang1)] == 0 && p2Board[(thang-2)][(thang1)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Sax = thang;
                        p2Say = thang1;
                        p2Board[(thang-1)][(thang1)] = 1;
                        p2Sbx = thang-1 ;
                        p2Sby = thang1;
                        p2Board[(thang-2)][(thang1)] = 1;
                        p2Scx = thang-2;
                        p2Scy = thang1;
                        break;
                    }
                    else{
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP2();
                        break;
                    }
                } 
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("left"))
            {
                if(thang1 - 2 >= 0)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang)][(thang1-1)] == 0 && p2Board[(thang)][(thang1-2)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Sax = thang;
                        p2Say = thang1;
                        p2Board[(thang)][(thang1-1)] = 1;
                        p2Sbx = thang;
                        p2Sby = thang1-1;
                        p2Board[(thang)][(thang1-2)] = 1;
                        p2Scx = thang;
                        p2Scy = thang1-2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("right"))
            {
                if(thang1 + 2 < 10)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang)][(thang1+1)] == 0 && p2Board[(thang)][(thang1+2)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Sax = thang;
                        p2Say = thang1;
                        p2Board[(thang)][(thang1+1)] = 1;
                        p2Sbx = thang;
                        p2Sby = thang1+1;
                        p2Board[(thang)][(thang1+2)] = 1;
                        p2Scx = thang;
                        p2Scy = thang1+2;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("down"))
            {
                if(thang + 2 < 10)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang+1)][(thang1)] == 0 && p2Board[(thang+2)][(thang1)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Sax = thang;
                        p2Say = thang1;
                        p2Board[(thang+1)][(thang1)] = 1;
                        p2Sbx = thang+1;
                        p2Sby = thang1;
                        p2Board[(thang+2)][(thang1)] = 1;
                        p2Scx = thang+2;
                        p2Scy = thang1;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeSubP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else System.out.println("You didn't enter a valid direction name, try again.");
        }
    }
    //battleships
    public void placeBatP2()
    {
        //get the values for placement
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to place your battleship(4)?");
        String thing = scan.next().toLowerCase();
        int thang = scan.nextInt() - 1;
        int thang1=0;
        String direction;
        if(thing.equals("a"))thang1 = 0;
        else if(thing.equals("b"))thang1 = 1;
        else if(thing.equals("c"))thang1 = 2;
        else if(thing.equals("d"))thang1 = 3;
        else if(thing.equals("e"))thang1 = 4;
        else if(thing.equals("f"))thang1 = 5;
        else if(thing.equals("g"))thang1 = 6;
        else if(thing.equals("h"))thang1 = 7;
        else if(thing.equals("i"))thang1 = 8;
        else if(thing.equals("j"))thang1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            placeBatP2();
        }
        //edit the array(place destroyer)
        while(true)
        {
            System.out.println("Choose a direction (up,down,left,right)");
            direction = scan.next().toLowerCase();
            if(direction.equals("up"))
            {
                if(thang - 3 >= 0)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang-1)][(thang1)] == 0 && p2Board[(thang-2)][(thang1)] == 0 && p2Board[(thang-3)][thang1] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Bax = thang;
                        p2Bay = thang1;
                        p2Board[(thang-1)][(thang1)] = 1;
                        p2Bbx = thang-1 ;
                        p2Bby = thang1;
                        p2Board[(thang-2)][(thang1)] = 1;
                        p2Bcx = thang-2;
                        p2Bcy = thang1;
                        p2Board[(thang-3)][thang1] = 1;
                        p2Bdx = thang-3;
                        p2Bdy = thang1;
                        break;
                    }
                    else{
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP2();
                        break;
                    }
                } 
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("left"))
            {
                if(thang1 - 3 >= 0)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang)][(thang1-1)] == 0 && p2Board[(thang)][(thang1-2)] == 0 && p2Board[(thang)][(thang1-3)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Bax = thang;
                        p2Bay = thang1;
                        p2Board[(thang)][(thang1-1)] = 1;
                        p2Bbx = thang;
                        p2Bby = thang1-1;
                        p2Board[(thang)][(thang1-2)] = 1;
                        p2Bcx = thang;
                        p2Bcy = thang1-2;
                        p2Board[(thang)][(thang1-3)] = 1;
                        p2Bdx = thang;
                        p2Bdy = thang1-3;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("right"))
            {
                if(thang1 + 3 < 10)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang)][(thang1+1)] == 0 && p2Board[(thang)][(thang1+2)] == 0 && p2Board[(thang)][(thang1+3)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Bax = thang;
                        p2Bay = thang1;
                        p2Board[(thang)][(thang1+1)] = 1;
                        p2Bbx = thang;
                        p2Bby = thang1+1;
                        p2Board[(thang)][(thang1+2)] = 1;
                        p2Bcx = thang;
                        p2Bcy = thang1+2;
                        p2Board[(thang)][(thang1+3)] = 1;
                        p2Bdx = thang;
                        p2Bdy = thang1+3;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("down"))
            {
                if(thang + 3 < 10)
                {
                    if(p2Board[thang][thang1] == 0 && p2Board[(thang+1)][(thang1)] == 0 && p2Board[(thang+2)][(thang1)] == 0 && p2Board[(thang+3)][(thang1)] == 0)
                    {
                        p2Board[thang][thang1] = 1;
                        p2Bax = thang;
                        p2Bay = thang1;
                        p2Board[(thang+1)][(thang1)] = 1;
                        p2Bbx = thang+1;
                        p2Bby = thang1;
                        p2Board[(thang+2)][(thang1)] = 1;
                        p2Bcx = thang+2;
                        p2Bcy = thang1;
                        p2Board[(thang+3)][thang1] = 1;
                        p2Bdx = thang+3;
                        p2Bdy = thang1;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP2();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else System.out.println("You didn't enter a valid direction name, try again.");
        }
    }
    
    public void placeBatP1()
    {
        //get the values for placement
        Scanner scan = new Scanner(System.in);
        System.out.println("Where would you like to place your battleship(4)?");
        String thing = scan.next().toLowerCase();
        int thang = scan.nextInt() - 1;
        int thang1=0;
        String direction;
        if(thing.equals("a"))thang1 = 0;
        else if(thing.equals("b"))thang1 = 1;
        else if(thing.equals("c"))thang1 = 2;
        else if(thing.equals("d"))thang1 = 3;
        else if(thing.equals("e"))thang1 = 4;
        else if(thing.equals("f"))thang1 = 5;
        else if(thing.equals("g"))thang1 = 6;
        else if(thing.equals("h"))thang1 = 7;
        else if(thing.equals("i"))thang1 = 8;
        else if(thing.equals("j"))thang1 = 9;
        else 
        {
            System.out.println("Invalid Letter");
            placeBatP1();
        }
        //edit the array(place destroyer)
        while(true)
        {
            System.out.println("Choose a direction (up,down,left,right)");
            direction = scan.next().toLowerCase();
            if(direction.equals("up"))
            {
                if(thang - 3 >= 0)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang-1)][(thang1)] == 0 && p1Board[(thang-2)][(thang1)] == 0 && p1Board[(thang-3)][thang1] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Bax = thang;
                        p1Bay = thang1;
                        p1Board[(thang-1)][(thang1)] = 1;
                        p1Bbx = thang-1 ;
                        p1Bby = thang1;
                        p1Board[(thang-2)][(thang1)] = 1;
                        p1Bcx = thang-2;
                        p1Bcy = thang1;
                        p1Board[(thang-3)][thang1] = 1;
                        p1Bdx = thang-3;
                        p1Bdy = thang1;
                        break;
                    }
                    else{
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP1();
                        break;
                    }
                } 
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("left"))
            {
                if(thang1 - 3 >= 0)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang)][(thang1-1)] == 0 && p1Board[(thang)][(thang1-2)] == 0 && p1Board[(thang)][(thang1-3)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Bax = thang;
                        p1Bay = thang1;
                        p1Board[(thang)][(thang1-1)] = 1;
                        p1Bbx = thang;
                        p1Bby = thang1-1;
                        p1Board[(thang)][(thang1-2)] = 1;
                        p1Bcx = thang;
                        p1Bcy = thang1-2;
                        p1Board[(thang)][(thang1-3)] = 1;
                        p1Bdx = thang;
                        p1Bdy = thang1-3;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("right"))
            {
                if(thang1 + 3 < 10)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang)][(thang1+1)] == 0 && p1Board[(thang)][(thang1+2)] == 0 && p1Board[(thang)][(thang1+3)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Bax = thang;
                        p1Bay = thang1;
                        p1Board[(thang)][(thang1+1)] = 1;
                        p1Bbx = thang;
                        p1Bby = thang1+1;
                        p1Board[(thang)][(thang1+2)] = 1;
                        p1Bcx = thang;
                        p1Bcy = thang1+2;
                        p1Board[(thang)][(thang1+3)] = 1;
                        p1Bdx = thang;
                        p1Bdy = thang1+3;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else if(direction.equals("down"))
            {
                if(thang + 3 < 10)
                {
                    if(p1Board[thang][thang1] == 0 && p1Board[(thang+1)][(thang1)] == 0 && p1Board[(thang+2)][(thang1)] == 0 && p1Board[(thang+3)][(thang1)] == 0)
                    {
                        p1Board[thang][thang1] = 1;
                        p1Bax = thang;
                        p1Bay = thang1;
                        p1Board[(thang+1)][(thang1)] = 1;
                        p1Bbx = thang+1;
                        p1Bby = thang1;
                        p1Board[(thang+2)][(thang1)] = 1;
                        p1Bcx = thang+2;
                        p1Bcy = thang1;
                        p1Board[(thang+3)][thang1] = 1;
                        p1Bdx = thang+3;
                        p1Bdy = thang1;
                        break;
                    }
                    else
                    {
                        System.out.println("There is already a ship in one of these spots, chose another spot.");
                        placeBatP1();
                        break;
                    }
                }
                else System.out.println("Invalid direction, chose another.");
            }
            else System.out.println("You didn't enter a valid direction name, try again.");
        }
    }
}