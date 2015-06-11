/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author Alexandre Ravaux
 */
public class Producer extends Thread{
    private Buffer buf;
    private int numBuf;
	public void run(){
            for (int i = 0; i < 5; ++i){
                try {
                    buf.add(i+1, numBuf);
                    this.sleep(7000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
			 
            }
	}

	public Producer(Buffer buf, int numBuf) {
		super();
		this.buf = buf;
		this.numBuf = numBuf;
	}
    
}
