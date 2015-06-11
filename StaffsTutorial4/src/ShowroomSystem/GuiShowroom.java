package ShowroomSystem;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Alexandre Ravaux
 */
public class GuiShowroom extends JFrame{
    private Showroom showroom;
    private Vehicle v;
    private JButton prevButton;
    private JButton nextButton, sellButton;
    private JTextField tf;
    private JFrame parent;
    private JTextField ManufacturerField, ModelField, VinField, TaxCo2,SoldField, CustomerField;  
    private JLabel ManufacturerLabel, ModelLabel, VinLabel, TaxCo2Label, SoldLabel, CustomerLabel, NbCars;
    private JPanel[] p = new JPanel[17];
    private String nameCustomer;
    public GuiShowroom(Showroom sh) {
        super("Showroom");
        parent = this;
        
        this.showroom=sh;
                
        prevButton = new JButton("Previous vehicle");
        nextButton = new JButton("Next vehicle");
        sellButton = new JButton("Sell");
        for (int i = 0; i < 17; i++) {
            p[i] = new JPanel();
        }
        
        prevButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                v=showroom.previous();
                if(v!=null){
                    setFields();
                }else{
                    JOptionPane.showMessageDialog(parent,
                        "No more records!");
                }       
            }

        });
        
        nextButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                v=showroom.next();
                if(v!=null){
                    setFields();
                }else{
                    JOptionPane.showMessageDialog(parent,
                        "No more records!");
                }       
            }
        });
        
        sellButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //to do
                if(v!=null){
                    if(v.isIsSold()){
                        JOptionPane.showMessageDialog(parent,
                        "Car already sold");
                    }else{
                        JTextField nameField = new JTextField("Enter name");
                        JTextField emailField = new JTextField("Enter e-mail");
                        JTextField phoneField = new JTextField("Enter number phone");
                        
                        JPanel panel = new JPanel(new GridLayout(0, 1));
                        panel.add(new JLabel("Name:"));
                        panel.add(nameField);
                        panel.add(new JLabel("E-mail:"));
                        panel.add(emailField);
                        panel.add(new JLabel("Phone number:"));
                        panel.add(phoneField);
                        
                        int result = JOptionPane.showConfirmDialog(null, panel, "Test", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                        if (result == JOptionPane.OK_OPTION) {
                            System.out.println(nameField.getText() + " " + emailField.getText()+ " " + phoneField.getText());
                            sell(nameField.getText(), emailField.getText(), phoneField.getText());
                            setFields();
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(parent,
                        "Impossible to sell");
                }
                
            }
        });
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        JPanel formPanel = new JPanel(new GridLayout(6, 2));
        ManufacturerField = new JTextField(10);
        ModelField = new JTextField(10);
        VinField = new JTextField(10);
        TaxCo2 = new JTextField(10);
        SoldField = new JTextField(10);
        CustomerField = new JTextField(10);

        ManufacturerLabel = new JLabel("Manufacturer");
        ModelLabel = new JLabel("Model");
        VinLabel = new JLabel("VIN");
        TaxCo2Label = new JLabel("Taxband & CO2");
        SoldLabel = new JLabel("Sold");
        NbCars=new JLabel("1/"+showroom.getShowroom().size());
        CustomerLabel=new JLabel("Owner");
                
        p[0].add(ManufacturerLabel);
        p[1].add(ManufacturerField);
        p[2].add(ModelLabel);
        p[3].add(ModelField);
        p[4].add(VinLabel);
        p[5].add(VinField);
        p[6].add(TaxCo2Label);
        p[7].add(TaxCo2);
        p[8].add(SoldLabel);
        p[9].add(SoldField);
        p[10].add(CustomerLabel);
        p[11].add(CustomerField);
       
        for (int i = 0; i <12; i++) {
            formPanel.add(p[i]);
        }
        
        p[12].setLayout(new FlowLayout());
        
        p[13].add(prevButton);
        p[14].add(nextButton);
        p[15].add(sellButton);
        p[16].add(NbCars);
        
        p[12].add(p[13]);
        p[12].add(p[14]);
        p[12].add(p[15]);
        p[12].add(p[16]);
        
        contentPane.add(p[12], BorderLayout.NORTH);
        contentPane.add(formPanel, BorderLayout.CENTER);
        setFields();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 350);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public Showroom getShowroom() {
        return showroom;
    }

    public void setShowroom(Showroom showroom) {
        this.showroom = showroom;
    }
    
    /* Default filling of fields */
    public void setFields() {
        ManufacturerField.setText(""+showroom.getShowroom().get(showroom.getCurrentIndex()).getManufacturer());
        ModelField.setText(""+showroom.getShowroom().get(showroom.getCurrentIndex()).getModel());
        VinField.setText(""+showroom.getShowroom().get(showroom.getCurrentIndex()).getVin());
        TaxCo2.setText(""+showroom.getShowroom().get(showroom.getCurrentIndex()).getTaxBand()+" ("+showroom.getShowroom().get(showroom.getCurrentIndex()).co2()+")");
        SoldField.setText((showroom.getShowroom().get(showroom.getCurrentIndex()).isIsSold() ? "Yes " : "No ")+
	showroom.getShowroom().get(showroom.getCurrentIndex()).getDateOfSale());
        NbCars.setText(showroom.getCurrentIndex()+1+"/"+showroom.getShowroom().size());        
        if(showroom.getShowroom().get(showroom.getCurrentIndex()).getCustomer()!=null){
            CustomerField.setText(""+showroom.getShowroom().get(showroom.getCurrentIndex()).getCustomer().getName());
        }else{
            CustomerField.setText("No customer");
        }    
    }
    
    public JTextField getTf() {
        return tf;
    }   
    
    public void sell(String name, String email, String telephone){
        Customer customer = new Customer(name, email, telephone);
        v.buy(customer);
    }
}
