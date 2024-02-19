public class InterThreadCom{

private int totalBalance=10000;

synchronized void withdrawMoney(int withdrawMoney){
    String tname=Thread.currentThread().getName();
    System.out.println(tname+"withdrawing "+withdrawMoney);


    while (this.totalBalance<withdrawMoney) {

        System.out.println(tname+"balance insufficient");

        try {
            System.out.println(tname+"withdraw some money");
            wait();
        } catch (InterruptedException e) {
            
        }

    }
    totalBalance=withdrawMoney;
}


synchronized void depositMoney(int depositMoney){
    String tName=Thread.currentThread().getName();
    System.out.println(tName+"depositing "+depositMoney);
    totalBalance+=depositMoney;
    System.out.println(tName+"Deposit successfully.Total Balance");
System.out.println(tName+"you can now withraw");

notifyAll();

}}



