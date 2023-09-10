package com.lql.facade;

public class Client {
    public static void main(String[] args) {
        ReportFacade reportFacade = new ReportFacade();
        reportFacade.generateReport();
    }
}
