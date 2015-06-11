package staffstutorial7;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexandre Ravaux
 */
public class StaffsTutorial7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Part 1 Writing a Generic class */
        System.out.println("Integer stack");
        GenericStack<Integer> integerStack = new GenericStack<Integer>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        System.out.println(integerStack);
        System.out.println("Seek: "+integerStack.peek());
        System.out.println("Remove first element (pop() method called)");
        integerStack.pop();
        System.out.println(integerStack);
        System.out.println("Seek: "+integerStack.peek());
        System.out.println("String stack");
        GenericStack<String> strStack = new GenericStack<String>();
        strStack.push("Ever");
        strStack.push("Tutorial");
        strStack.push("Best");
        System.out.println(strStack);
        System.out.println("Seek: "+strStack.peek());
        System.out.println("Remove first element (pop() method called)");
        strStack.pop();
        System.out.println(strStack);
        System.out.println("Seek: "+strStack.peek());
        
        /* Part 2 Using Wrapper classes */
        aMethod();
        Double answer1 = add(2, 7);
        Number answer2 = add(new Integer(4), new Double(5.2));
        double answer3 = add(8, 1.3);
        System.out.println(answer1 + " " + answer2 + " " + answer3);
        
        /* Part 3 */
        System.out.println("-- TREEMAP --");
        TreeMap<Date,String> tm = new TreeMap<Date,String>();
       
        tm.put(new Date(2012-1900, 1, 20),"appointment1");
        tm.put(new Date(2012-1900, 1, 28), "appointment2");
        tm.put(new Date(2012-1900, 2, 15), "appointment3");
        tm.put(new Date(2012-1900, 2, 26), "appointment4");

        // Displaying the treemap
        System.out.println("-- Display tree map --");
        displayTreeMap(tm);
        
        // Navigable 1
        System.out.println("-- Navigable --");
        Navigable(tm, "January 20, 2012");
    }
    private static void aMethod() {
        ArrayList<Double>list=new ArrayList<Double>();
        Double temp=0.0;
        Scanner input=new Scanner(System.in);
        System.out.println("You'll have to enter 5 numbers (double)");
        for(int i=0;i<5;i++){
            try{
                System.out.print("Enter a double : ");
                temp=input.nextDouble();
                list.add(temp);
            }catch(Exception e){
                System.out.println("Error input");
                temp=0.0;
            }
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
    
    private static Double add(int i, int d) {
        return (double)i+d;
    }
    private static Double add(int i, double d) {
        return (double)i+d;
    }
    
    private static void displayTreeMap(TreeMap tm){
        Set set = tm.entrySet();
        Iterator i = set.iterator();
        Date tmp=new Date();
        while(i.hasNext()) {
           Map.Entry me = (Map.Entry)i.next();
           tmp=(Date) me.getKey();
           System.out.print(tmp.getDate()+"/"+tmp.getMonth()+"/"+(tmp.getYear()+1900) +": ");
           System.out.println(me.getValue());
        }
    }
    
    private static void Navigable(TreeMap tm, String date){
        DateFormat dateformat = DateFormat.getDateInstance(DateFormat.LONG, new Locale("EN","en"));
        
        try {
            Date mydate=dateformat.parse(date);
            Set set = tm.entrySet();
            Iterator i = set.iterator();
            Date tmp=new Date();
            while(i.hasNext()) {
                Map.Entry me = (Map.Entry)i.next();
                tmp=(Date) me.getKey();
                if(tmp.getDate()==mydate.getDate() && tmp.getMonth()== (mydate.getMonth()+1) && tmp.getYear()== mydate.getYear()){
                     System.out.print(tmp.getDate()+"/"+tmp.getMonth()+"/"+(tmp.getYear()+1900) +": ");
                     System.out.println(me.getValue());
                } 
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(StaffsTutorial7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
}