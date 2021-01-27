package com.example.addressbok.repository;

import com.example.addressbok.model.AddressBookData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookData,Integer> {

}
