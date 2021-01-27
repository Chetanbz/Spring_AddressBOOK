package com.example.addressbok.model;

import com.example.addressbok.dto.AddressBookDTO;
import lombok.Data;

public @Data class AddressBookData {
    private  int addreessId;
    private String name;
    private String profilePic;
    private String address;
    private String city;
    private String state;
    private int zip;
    private long phone;

    public AddressBookData(int id, AddressBookDTO addressBookDTO) {
        this.addreessId = id;
        updateAddressBookData(addressBookDTO);
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO){
        this.name = addressBookDTO.name;
        this.profilePic = addressBookDTO.profilePic;
        this.address = addressBookDTO.address;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zip = addressBookDTO.zip;
        this.phone = addressBookDTO.phone;
    }



    @Override
    public String toString() {
        return "Id = " + addreessId +   "name = " + name + "address = " + address + "city = " + city
                + "state = " + state + "zip = " + zip + "phone = " + phone  + "Profile Pic = " + profilePic;
    }

}
