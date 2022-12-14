package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 1;
        int isPrime;
        int divPrime;
        while(x<=printToInclusive){
            isPrime = 0;
            divPrime = 2;
            while(divPrime<=x/2){
                if(x%divPrime==0){
                    isPrime++;
                    break;
                }
                divPrime++;
            }
            if(isPrime==0 && x != 1 ){
                System.out.println(x);
            }
            x++;
        }
    }
}
