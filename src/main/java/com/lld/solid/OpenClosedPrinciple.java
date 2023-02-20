package com.lld.solid;
// Open for extension but closed for Modification

//class InvoiceDao1{
//    private Invoice invoice;
//
//    public InvoiceDao1(Invoice invoice) {
//        this.invoice = invoice;
//    }
//    public void SaveToDb(){
//        //save to DB
//    }
//}

class InvoiceDao1{
    private Invoice invoice;

    public InvoiceDao1(Invoice invoice) {
        this.invoice = invoice;
    }
    public void SaveToDb(){
        //save to DB
    }
  // Here we are modifying the already tested Class
    public void SaveToFile(){
        //save to File
    }
}

// Solution:
interface InvoiceDaoI{
    public void save(Invoice invoice);
}

class DatabaseInvoiceDao implements InvoiceDaoI{
    @Override
    public void save(Invoice invoice) {
        // saves to DB
    }
}

class FileInvoiceDao implements InvoiceDaoI{
    @Override
    public void save(Invoice invoice) {
        // saves to File
    }
}

// Say I have to add save to MongoDb in the future, I can simply implement the interface

class MongoDbInvoiceDao implements InvoiceDaoI{
    @Override
    public void save(Invoice invoice) {

    }
}



public class OpenClosedPrinciple {

}
