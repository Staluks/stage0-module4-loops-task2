package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int x = 0;
        int y = 2;
        if(power<0){
            System.out.println("too much power");
        }else{
            while(x<=power){
                if(x<2){
                    System.out.println(x+1);
                    x++;
                }else {
                    y = y * 2;
                    System.out.println(y);
                    x++;
                }
            }
        }
    }
}
