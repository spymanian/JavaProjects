public class Triangle{
    public static void main(String[] args){
        StdDraw.line(0.0, 0.0, 1.0, 0.0);//a
        double v = Math.sqrt(3.0) / 2.0;
        StdDraw.line(1.0, 0.0, 0.5, v);//b
        StdDraw.line(0.5, v, 0.0, 0.0);//c
        
        }
    }