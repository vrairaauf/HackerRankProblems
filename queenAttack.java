import java.util.*;
class Result {

    /*
     * Complete the 'queensAttack' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER k
     *  3. INTEGER r_q
     *  4. INTEGER c_q
     *  5. 2D_INTEGER_ARRAY obstacles
     */

    public static int queensAttack(int n, int k, int r_q, int c_q, ArrayList<ArrayList<Integer>> obstacles) {
    // Write your code here
        int possibleAttacks=0;
        /*
        int rightD=n-c_q;
        int leftD=c_q-1;
        
        int topD=n-r_q;
        int bottomD=r_q-1;
        
        
        if(rightD>0){
            possibleAttacks+=rightD;
        }if(leftD>0){
            possibleAttacks+=leftD;
        }
        if(topD>0){
            possibleAttacks+=topD;
        }
        if(bottomD>0){
            possibleAttacks+=bottomD;
        }
        */
        possibleAttacks+=numberOfColDiagonalTop(n, r_q, c_q, obstacles);
        possibleAttacks+=numberOfColDiagonalBottom(n, r_q, c_q, obstacles);
        possibleAttacks+=numberOfColDiagonalLeft(n, r_q, c_q, obstacles);
        possibleAttacks+=numberOfColDiagonalRight(n, r_q, c_q, obstacles);
        
        possibleAttacks+=numberOfColDiagonalLeftTop(n, r_q, c_q, obstacles);
        possibleAttacks+=numberOfColDiagonalRightTop(n, r_q, c_q, obstacles);
        possibleAttacks+=numberOfColDiagonalLeftBottom(n, r_q, c_q, obstacles);
        possibleAttacks+=numberOfColDiagonalRightBottom(n, r_q, c_q, obstacles);
        return possibleAttacks;
    }
    /*---------------------------------------*/
    public static boolean searchInTwoDArray(ArrayList<ArrayList<Integer>> arr, int n1, int n2){
        for(ArrayList<Integer> sousArr:arr){
            if(sousArr.get(0)==n1 && sousArr.get(1)==n2)
                return true;
        }
        return false;
    }
    /*---------------------------------------*/
    public static int numberOfColDiagonalLeftTop(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q+1;
        int startCol=c_q-1;
        int res=0;
        while(startRow<=dimensions && startCol>0){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startRow++;
            startCol--;
        }
        
        return res;
    }
     public static int numberOfColDiagonalRightTop(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q+1;
        int startCol=c_q+1;
        int res=0;
        while(startRow<=dimensions && startCol<=dimensions){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startRow++;
            startCol++;
        }
        
        return res;
    }
    
    /*-------------------------*/
     public static int numberOfColDiagonalLeftBottom(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q-1;
        int startCol=c_q-1;
        int res=0;
        while(startRow>0 && startCol>0){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startRow--;
            startCol--;
        }
        
        return res;
    }
    /*--------------------------*/
     public static int numberOfColDiagonalRightBottom(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q-1;
        int startCol=c_q+1;
        int res=0;
        while(startRow>0 && startCol<=dimensions){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startRow--;
            startCol++;
        }
        
        return res;
    }
    /*search in top*/
    
    public static int numberOfColDiagonalTop(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q+1;
        int startCol=c_q;
        int res=0;
        while(startRow<=dimensions){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startRow++;
        }
        
        return res;
    }
    
    /*------------search in bottom--------*/
   public static int numberOfColDiagonalBottom(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q-1;
        int startCol=c_q;
        int res=0;
        while(startRow>0){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startRow--;
        }
        
        return res;
    }
    /*----------------------search in lef --------------*/
       public static int numberOfColDiagonalLeft(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q;
        int startCol=c_q-1;
        int res=0;
        while(startCol>0){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startCol--;
        }
        
        return res;
    }
    /*--------------------search in right---------------*/
       public static int numberOfColDiagonalRight(int dimensions, int r_q, int c_q, ArrayList<ArrayList<Integer>> arr){
        int startRow=r_q;
        int startCol=c_q+1;
        int res=0;
        while(startCol<=dimensions){
            if(searchInTwoDArray(arr, startRow,  startCol)){
                break;
            }
            res++;
            startCol++;
        }
        
        return res;
    }
    
    
    
}

class Entry{
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
        System.out.println("write the dimnesion of the chess square games");
        int dimensions=scanner.nextInt();
        int obsNumber=0;
        int q_r=0;
        int q_c=0;
        while(true){
            System.out.println("write the number of obstacles ");
            int x=scanner.nextInt();
            if(x<=dimensions*dimensions && x>=0){
                obsNumber=x;
                break;
            }
            System.out.println("invalid option try again");
             
        }
        
        while(true){
            System.out.println("write the position of the queen (row ) ");
            int x=scanner.nextInt();
            if(x>0 && x<=dimensions){
                q_r=x;
                break;   
            }
            System.out.println("invalid option try again");
        }
        while(true){
            System.out.println("write the position of the queen (column)");
            int x=scanner.nextInt();
            if(x>0 && x<=dimensions){
                q_c=x;
                break;  
            }
            System.out.println("invalid option try again");
        }
        

        ArrayList<ArrayList<Integer>> obstacles=new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<obsNumber; i++){
            boolean again=true;
            int x=0;
            while(again){
                System.out.println("row to obs"+(i+1));
                x=scanner.nextInt();
                if(x<=dimensions && x>0){
                    //coords.set(0, x);
                    again=false;  
                }else
                    System.out.println("invalid option try again");
            }
            again=true;
            int y=0;
            while(again){
               System.out.println("col to obs"+(i+1));
               y=scanner.nextInt();
               if(y<=dimensions && y>0){
                    //coords.set(1, y);

                    again=false;  
                }else
                    System.out.println("invalid option try again");
            }
            ArrayList<Integer> coords=new ArrayList<Integer>();
            coords.add(x);
            coords.add(y);
            obstacles.add(coords);
            System.out.println(obstacles);

        }
        scanner.close();

        System.out.println("selection finiched");
        System.out.println(dimensions);
        System.out.println(obsNumber);
        System.out.println(q_r);
        System.out.println(q_c);
        System.out.println(obstacles);

        int result=Result.queensAttack(dimensions, obsNumber, q_r, q_c, obstacles);
        System.out.println("the queen can attack "+result+" squares");
        
    }catch (Exception e) {
        System.out.println("problems run program again and choose right option");
    }
        
    }
}