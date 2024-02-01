public class Cellularplan {

    proteced double rate;
    abstract void getRate();

    public void processBill(int minutes){
        System.out.println(minutes*rate);
    }
    
}
