package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int x = 0;
        int done;
        if(multiplyByAndToInclusive>0){
            while (x<=multiplyByAndToInclusive){
                done = x*multiplyByAndToInclusive;
                System.out.println(done);
                x++;
            }
        }
        if (multiplyByAndToInclusive<0)
            while ((x*-1)>=multiplyByAndToInclusive){
                done = x*multiplyByAndToInclusive;
                System.out.println(done);
                x++;
            }
    }
}
