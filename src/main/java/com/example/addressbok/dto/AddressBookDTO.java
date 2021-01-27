package com.example.addressbok.dto;

import lombok.ToString;

import javax.validation.constraints.Pattern;

public @ToString class AddressBookDTO {
    @Pattern(regexp = "[A-Z]{1}[a-zA-Z\\s]{2,}$",message = "AddressBook name Invalid")
    public String name;
    public String profilePic;

    @Pattern(regexp = "[a-zA-Z\\s]{10,}$",message = "Address should be minimum 10 letters")
    public String address;

    @Pattern(regexp = "[a-zA-Z\\s]{3,}$",message = "City name should be minimum 3 letter")
    public String city;
    @Pattern(regexp = "[a-zA-Z\\s]{3,}$",message = "State name should be minimum 3 letter")
    public String state;
    //@Pattern(regexp = "[0-9]{6}$",message = "Zip should be exact 6 number")
    public int zip;
    //@Pattern(regexp = "^[0-9]{10}$",message = "Phone number should be exact 10 number")
    public long phone;


}
