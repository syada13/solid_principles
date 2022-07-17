package com.solid.isp.example.problem;
/*
 * Interface Segregation Principle: Interfaces should not force classes to implement what they can't do.
 * Large interfaces should be divided into small ones.
 * 
 * PrinterTasks interface supports below features/actions 
 *    1. print
 *    2. scan
 *    3. fax
 *    4. printDuplex
 * 
 * 
 * HPLaserJetPrinter class: This printer does provides all above features and it would be easier for it to implement above functionalities
 * Break law: LiquidInkjetPrinter class does have only print and scan functionalities. It doesn't provide fax and printerDuplex capabilities.
 * So it breaks the ISP law.
 */
public interface PrinterTasks {
    void print(String printContent);
    void scan(String scanContent);
    void fax(String faxContent);
    void printDuplex(String printDuplexContent);
    
}
