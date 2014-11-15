package biz.verenti.spring.test;

/**
 * Created by Steve Bart on 03/11/14.
 */
public class Address {

    private String street;
    private String postcode;

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode='" + postcode + '\'' +
                '}';
    }
}
