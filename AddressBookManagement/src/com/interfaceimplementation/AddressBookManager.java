package com.interfaceimplementation;

import java.util.ArrayList;

public interface AddressBookManager {
ArrayList<Object> createAddressBook(String filename);
void open(String filename);
void save(ArrayList<Object>list,String file);
void saceAs();
void quit();
}
