public class Paytm {
static float balance=100;

public synchronized void admoney(float amount) {
balance+=amount; 
System.out.println("Amount added - balance = "+balance);
notify();
}
public synchronized  void recharge(float amount) {
if(amount>balance) {
try {
System.out.println("Insufficient balance");
wait();
}
catch(InterruptedException e) {
e.printStackTrace();
}
}
System.out.println("recharge Done");
}
public static void main(String[] args)throws Exception{
Paytm app=new Paytm();
Runnable r1=()->app.recharge(500);
Runnable r2=()->app.addmoney(1000);
Thread t1=new Thread(r1);
Thread t2=new Thread(r2);
t1.setPriority(Thread.MAX_PRIORITY);
t2.setPriority(Thread.MIN_PRIORITY);
t1.start();
t2.start();
}
}