package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;
        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }
        public String getCompany() {
            return customer.getCompanyName();
        }

        public String getCountryCode() {
            String value = null;
            Set<Map.Entry<String, String>> entrySet = countries.entrySet();
            for (Map.Entry<String, String> pair : entrySet) {
                if (pair.getValue().equals(customer.getCountryName())) {
                    value = pair.getKey();
                }
            }
            return value;
        }

        public String getContactFirstName() {
            return contact.getName().split(", ")[1];
        }

        public String getContactLastName() {
            return contact.getName().split(", ")[0];
        }

        public String getDialString() {
            String source = contact.getPhoneNumber();
            String format = source.replace("(", "");
            format = format.replace(")", "");
            format = format.replace(" ", "");
            format = format.replace("-", "");
            return "callto://" + format;
        }

    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}