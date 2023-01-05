
package oop.finals.pkg1.final_exam;


public class Main {
    public static void main(String[] args){
        Customer customer;
        RegularCustomer regularCustomer = new RegularCustomer("Luffy", 1000);
        SeniorCustomer  seniorCustomer = new SeniorCustomer("Sabo", 1000);
        
        customer = regularCustomer;
        
        System.out.println(customer.getName() +"" + customer.calculateBill());
    }
    }

