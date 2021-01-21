package com.example.addressbok.model;

import com.example.addressbok.dto.AddressBookDTO;

public class AddressBookData {
    private  int id;
    private String name;
    private String profilePic;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phone;

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.id = id;
        this.name = addressBookDTO.name;
        this.profilePic = addressBookDTO.profilePic;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zip = addressBookDTO.zip;
        this.phone = addressBookDTO.phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Id = " + id +   "name = " + name + "address = " + address + "city = " + city
                + "state = " + state + "zip = " + zip + "phone = " + phone  + "Profile Pic = " + profilePic;
    }
}
