package com.example.addressbok.Controller;

import com.example.addressbok.dto.AddressBookDTO;
import com.example.addressbok.dto.ResponseDTO;
import com.example.addressbok.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {
    private AddressBookData addData;

    @RequestMapping(value = {"","/","/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData(){
        AddressBookData addData =null;
        addData = new AddressBookData(1,new AddressBookDTO("Pankaj","30000"));
        ResponseDTO respDTO = new ResponseDTO("Get Call SuccessFull", addData);
        System.out.println("get normal");
        return new ResponseEntity<ResponseDTO>(respDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{addId}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("addId") int addId){
        AddressBookData addData =null;
        addData = new AddressBookData(1,new AddressBookDTO("Pankaj","30000)"));
        ResponseDTO respDTO = new ResponseDTO("Get call Sucess for Id:", addData);
        System.out.println("get Id");
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData( @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addData =null;
        addData = new AddressBookData(1,addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Created Address for:", addData);
        System.out.println("create ");
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData( @RequestBody AddressBookDTO addressBookDTO){
        AddressBookData addData =null;
        addData = new AddressBookData(1,addressBookDTO);
        ResponseDTO respDTO = new ResponseDTO("Update Address for :", addData);
        System.out.println("update");
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }

    @DeleteMapping("/delete/{addId}")
    public ResponseEntity<ResponseDTO> deleteEmployeePayrollData(@PathVariable("addId") int addId){
        ResponseDTO respDTO = new ResponseDTO("Delete  Sucessfully :","Deleted Id: " + addId);
        return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
    }
}
    

