package com.example.addressbok.dto;

public class AddressBookDTO {
    public String name;
    public String profilePic;
    public String address;
    public String city;
    public String state;
    public int zip;
    public long phone;



    public AddressBookDTO(String name, String profilePic, String address, String city, String state, int zip, long phone) {
        this.name = name;
        this.profilePic = profilePic;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
    }

    public AddressBookDTO(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name = " + name + "address = " + address + "city = " + city
                + "state = " + state + "zip = " + zip + "phone = " + phone  + "Profile Pic = " + profilePic;
    }
}
