package org.example.ttask;

public class Main {
    public static void main(String[] args) {
        CompanyInfoFacade facade = new CompanyInfoFacade();
        Company company = facade.getCompanyProfile("nestle.com");

        if (company != null) {
            System.out.println(company);
        } else {
            System.out.println("Failed to fetch company information.");
        }
    }
}
