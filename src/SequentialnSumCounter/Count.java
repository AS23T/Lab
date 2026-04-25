
package SequentialnSumCounter;

public class Count {
    
    private int QuantityPairs;
    private int DoubleJumps;
    
    
    public Count() {
        this.QuantityPairs = 0;
        this.DoubleJumps = 0;
    }
    
    //M1
    public void CountPairsStepByStep(int limit) {
        System.out.println("Method 1: Evaluating one by one");
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                QuantityPairs++;
                System.out.println("Number " + i + " detected -> sum 1");
            } else{
                System.out.println("Number " + i + " it's odd -> no sum");
            }
            
            try {
                Thread.sleep(1000); //?????????????????????????????????????????????????
            } catch (InterruptedException e) {
                System.out.println("Error in the stop: " + e.getMessage());
            }
            
        }
        
        System.out.println("-> Total pairs found: " + QuantityPairs + "\n");
    }
    
    //M2
    
    public void CountByTwos(int limit){
        System.out.println("Method 2: Jumping two by two");
        for (int i = 2; i <= limit; i += 2) {
            DoubleJumps++;
            System.out.println("Number " + i + " reaching -> another sum 1");
            
            try {
                Thread.sleep(1000); //?????????????????????????????????????????????????
            } catch (InterruptedException e) {
                System.out.println("Error in the stop: " + e.getMessage());
            }
            
        }
        
        System.out.println("-> Total of jumps made: " + DoubleJumps + "\n");
    }
}
