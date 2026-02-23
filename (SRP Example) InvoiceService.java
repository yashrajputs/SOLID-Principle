//SRP(single responsiblity priciple)
// this will be the wrong approach to write these methods 
@service
public class InvoiceService{

  //this method is very important for calculating the total amount of the innoivce
  void calculateTotal(){}

  //this method is responsible for saving the invoice data to the database
  void saveToDatabase(){}
  
  //this method is used to send email notifications to the customers about their invoices
  void sendEmialNotification(){}
}



//*****************************************Create All Separates Files**************************************************

// In invoiceService method only put one method
@service
public class InvoiceService{

  //this method is very important for calculating the total amount of the innoivce
  void calculateTotal(){}

}

//**********************************InvoiceRepository***************************************
// now you have to make invoiceRepository related to database
public class InvoiceRepository{
  void class(){
    
  }
} 

//************************************EmialService*************************************
// next you have to make EmialService 
public class EmailService{
  void sendInvoiceEmail(){
    
  }
}

//SPR --------> Reduce production bugs and team conflicts
