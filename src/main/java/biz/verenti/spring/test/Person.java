package biz.verenti.spring.test;

public class Person {


    private int id;

    private String name;


    public void setAddress(Address address) {
        this.address = address;
    }

    private  Address address;

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", taxId=" + taxId +
                '}';
    }

    private int taxId;

    public void setTaxId(int taxId) {
        this.taxId = taxId;
    }

    public Person(){

    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(String s) {
    }

    public void speak(){
        System.out.println("hello im a person");
    }

}
