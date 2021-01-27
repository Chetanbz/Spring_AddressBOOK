package com.example.addressbok.Controller;

import com.example.addressbok.dto.AddressBookDTO;
import com.example.addressbok.dto.ResponseDTO;
import com.example.addressbok.model.AddressBookData;
import com.example.addressbok.service.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/addressbook")

public class AddressBookController {
    private AddressBookData addData;

    @Autowired
    private IAddressBookService iAddressBookService;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        List<AddressBookData> addressBookDataList = iAddressBookService.getAddressBookData();
        ResponseDTO respDTO = new ResponseDTO("Get Call SuccessFull", addressBookDataList);
        System.out.println("get normal");
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{addId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId){
        AddressBookData addData =null;
        addData = iAddressBookService.getAddressBookDataById(addId);
        ResponseDTO respDTO = new ResponseDTO("Get call Sucess for Id:", addData);
        System.out.println("get Id");
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData( @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addData =null;
        addData = iAddressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Address for: ", addData);
        System.out.println("create ");
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @PutMapping("/update/{addId}")
    public ResponseEntity<ResponseDTO> updateAddressBookData( @PathVariable("addId") int addId,
                                                              @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addData =null;
        addData = iAddressBookService.updateAddressBookData(addId,addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Update Address for :", addData);
        System.out.println("update");
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("addId") int addId){
        iAddressBookService.deleteAddressBookData(addId);
        ResponseDTO respDTO = new ResponseDTO("Delete  Sucessfully :","Deleted Id: " + addId);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
}
    

