public class Circle{
    public static void main(String[] args){
        StdDraw.setScale(0,2);
        StdDraw.setPenColor(StdDraw.RED);
        
        double r = 0.9;
        for (int i = 0; i < 3; i++){
            if(i%2 ==1){
                StdDraw.setPenColor(StdDraw.RED);
            }else{
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(1,1,r);
            r -= 0.3;
        }
    }
}