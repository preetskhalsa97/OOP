// defining thread class by extending Thread
public class MyThread extends Thread{
    public void run() // has empty implementation in the Thread class by default
    {
        //logic ⇒ called job of the thread
    		for (int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }

}