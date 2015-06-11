package staffstutorial9;

/**
 *
 * @author Alexandre Ravaux
 */
public class Message extends Thread{
    private int num;
    private String msg;
    
    public Message(int num, String msg){
        super();
        this.num=num;
        this.msg=msg;
    }
    
    /* Simple run method */
//    public void run() {
//        for (int i = 0; i < num; ++i)  {
//              System.out.println(msg + " " + i) ;
//        }
//    }
    
    /* Sleep time */
    public void run() {
        for (int i = 0; i < num; ++i) {
            try{
                this.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
           System.out.println(msg + " " + i) ;
        }
    }
    
    /* Random sleep time */
//    public void run() {
//        for (int i = 0; i < num; ++i){
//            try{
//                int random = (int) (Math.random() * 1000);
//                this.sleep((long)random);
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println(msg + " " + i) ;
//        }
//    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Message ms1=new Message(5,"Thread 1 ");
        Message ms2=new Message(5,"Thread 2 ");
        ms1.start();
        ms2.start();
    }
}
