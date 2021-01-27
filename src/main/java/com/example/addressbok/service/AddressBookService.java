package com.example.addressbok.service;

import com.example.addressbok.dto.AddressBookDTO;
import com.example.addressbok.exception.AddressBookException;
import com.example.addressbok.model.AddressBookData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
@Slf4j
public class AddressBookService implements IAddressBookService {

    private   List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int addId) {
        return addressBookDataList.stream()
                .filter(empData -> empData.getAddreessId() == addId)
                .findFirst()
                .orElseThrow(() ->new AddressBookException("Address Not Found"));
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addData = null;
        addData = new AddressBookData(addressBookDataList.size()+1,addressBookDTO);
        addressBookDataList.add(addData);
        log.debug("employee Creted" + addData.toString());
        return addData;
    }

    @Override
    public AddressBookData updateAddressBookData(int addId, AddressBookDTO addressBookDTO) {
        AddressBookData addData = this.getAddressBookDataById(addId);  /// original object used
        addData.updateAddressBookData(addressBookDTO);
        addressBookDataList.set(addId-1,addData);
        return addData;
    }

    @Override
    public void deleteAddressBookData(int addId) {
        addressBookDataList.remove(addId-1);
    }

}
