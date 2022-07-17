package com.solid.isp.example.problem;

/*
 * HPLaserJetPrinter can perform all features mentioned in  big PrinterTasks interface. No rule break.
 */
public class HPLaserJetPrinter implements PrinterTasks{   
    public void print(String printContent) {}
    public void scan(String scanContent) {}
    public void fax(String faxContent) {}
    public void printDuplex(String printDuplexContent) {}
}
    

