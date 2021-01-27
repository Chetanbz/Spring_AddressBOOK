package com.example.addressbok.service;

import com.example.addressbok.dto.AddressBookDTO;
import com.example.addressbok.exception.AddressBookException;
import com.example.addressbok.model.AddressBookData;
import com.example.addressbok.repository.AddressBookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    @Autowired
    private AddressBookRepository addressBookRepository;

    private   List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookRepository.findAll();
    }

    @Override
    public AddressBookData getAddressBookDataById(int addId) {
        return addressBookRepository
                .findById(addId)
                .orElseThrow(() ->new AddressBookException("Address Not Found"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addData = null;
        addData = new AddressBookData(addressBookDTO);
        log.debug("employee Creted" + addData.toString());
        return addressBookRepository.save(addData);
    }

    @Override
    public AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO) {
        AddressBookData addData = this.getAddressBookDataById(addId);  /// original object used
        addData.updateAddressBookData(addressBookDTO);
        return addressBookRepository.save(addData);
    }

    @Override
    public void deleteAddressBookData(int addId) {
        AddressBookData addressBookData =this.getAddressBookDataById(addId);
        addressBookRepository.delete(addressBookData);
    }

}
