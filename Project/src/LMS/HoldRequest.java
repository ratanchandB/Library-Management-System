/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LMS;

import java.util.Date;
/**
 *
 * @author chand
 */
public class HoldRequest {
    
    Borrower borrower;
    Book book;
    Date requestDate;
    
    public HoldRequest(Borrower bor, Book b, Date reqDate)  // para cons.
    {
        borrower = bor;
        book = b;
        requestDate = reqDate;
    }
    
    /*----- Getter FUNCs.--------*/
    public Borrower getBorrower()
    {
        return borrower;
    }
    
    public Book getBook()
    {
        return book;
    }
    
    public Date getRequestDate()
    {
        return requestDate;
    }
    /*--------------------------*/
    
    // Print Hold Request Info 
    public void print()
    {
        System.out.print(book.getTitle() + "\t\t\t\t" + borrower.getName() + "\t\t\t\t"  + requestDate + "\n");
    }
}// HoldRequest Class Closed
