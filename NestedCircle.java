public class NestedCircle{

    public static void main (String[] args) {
        int num= Integer.parseInt(args[0]);
    
    double r = 0.5*num;
    StdDraw.setScale(0,num);
    for (int i = 0; i <= num; i++){
        if(i%2 ==1){
            StdDraw.setPenColor(StdDraw.BLACK);
        }else{
            StdDraw.setPenColor(StdDraw.GRAY);
        }
        StdDraw.filledCircle(0.5,0.5,r);
        r -= 0.5;

            }
        
        }
    }


