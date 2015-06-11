package staffstutorial3;
/**
 *
 * @author alexandre
 */
public class Student{
    private String name;
    private Address homeAddress, uniAddress;
    public Student(String name, int houseNumber, String homeStreet){
        this.name = name;
        homeAddress = new Address(houseNumber, homeStreet);
    }
    public class Address{
        private int number;
        private String street;
        public Address(int no, String street) {
            number = no;
            this.street = street;
        }
        public String toString(){
            return name + "\n" + number + " " + street;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getUniAddress() {
        return uniAddress;
    }

    public void setUniAddress(Address uniAddress) {
        this.uniAddress = uniAddress;
    }
    public String toString(){
        String address1="", address2="";
        if(homeAddress==null){
            address1="No address";
        }else{
            address1=homeAddress.toString();
        }
        if(uniAddress==null){
            address2="No address";
        }else{
            address2=uniAddress.toString();
        }
        return name+"\nHome address : "+address1 + "\nUni address : "+ address2 + "\n";
    }
}   // more Student methods .. }