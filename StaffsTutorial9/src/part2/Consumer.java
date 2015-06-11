package part2;

/**
 *
 * @author Alexandre Ravaux
 */
public class Consumer extends Thread{
    private Buffer buf;
    private int numBuf;

    public void run()
    {
            for (int i = 0; i < 5; ++i) 
            {
                    try {
                            buf.getNext(i);
                            this.sleep(4000);
                    } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                    }
            }
    }

    public Consumer(Buffer buf, int numBuf) {
            super();
            this.buf = buf;
            this.numBuf = numBuf;
    }
    
}
