package com.example.addressbok.service;

import com.example.addressbok.dto.AddressBookDTO;
import com.example.addressbok.model.AddressBookData;

import java.util.List;

public interface IAddressBookService {
    List<AddressBookData> getAddressBookData();

    AddressBookData getAddressBookDataById(int addId);

    AddressBookData createAddressBookData(AddressBookDTO addressBookDTO);

    AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO);

    void deleteAddressBookData(int addId);


}
