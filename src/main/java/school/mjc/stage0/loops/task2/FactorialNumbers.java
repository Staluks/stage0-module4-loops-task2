package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int x = 0;
        int y = 1;
        while(x<=printToInclusive){
            if(x==0){
                System.out.println(1);
                x++;
            }else {
                y = y * x;
                x++;
                System.out.println(y);
            }
        }
    }
}
