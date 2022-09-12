package control;

//package control;
import adt.LinkedList;
import entity.paymentDetail;
import java.util.Scanner;

public class payment 
{
    //create a new LinkedList from the beginning
    LinkedList<paymentDetail> paymentList = new LinkedList<paymentDetail>(); 
    paymentDetail payment;

    // if kitchen is ok
    // payment added
    //payment displayed latest.
    public payment()
    {
        //create old data
         paymentList.add(payment = new paymentDetail("Heheboii","Burger Speacial",999));
         paymentList.add(payment = new paymentDetail("CXN","Pizza",666));
         paymentList.add(payment = new paymentDetail("Xinnan","KFC drug",333));
         
         //These data is being get from order, when inventory has stock;
         //result = false when inventory is out of stock
         //And it will display payment is being denied
         boolean staff = false;
         //Latest Customer's payment data, if the user is customer.
         boolean result = true;
         String customerName = "Customer1";
         String orderStuff = "jickenRice";
         float total = 404;
          
         Scanner input = new Scanner(System.in);
         //identify user identity
         System.out.print("Hi, are u staff or Customer?(S/C) :");
         String identity = input.nextLine();
         
         if(identity.equals("S")||identity.equals("s"))
         {
             staff = true;
         }
         
         else if(identity.equals("C")||identity.equals("c"))
         {
             staff = false;
         }
         
        //When user is staff
        if(staff == true)
        {
            boolean exit = false;
            //A while loop that will keep running until user input Y/y at the end.
            while (exit == false)
            {
                System.out.println("//////////////////////////////////////");
                System.out.println("//////////-STAFF_PROGRAM-/////////////");
                System.out.println("//////////////////////////////////////");
                
                Scanner sc = new Scanner(System.in);
                
                //what staff can do?
                //add payment
                //delete payment
                //modify payment
                //print all order!!!!!!!!
                //Count all payment's total!!!
                
                //Display what staff can do in this program.
                System.out.println("Action Lists:");
                System.out.println("[1] delete payment");
                System.out.println("[2] modify payment");
                System.out.println("[3] list out all order ");
                System.out.println("[4] Display sums of all payment");
                System.out.println("[5] Add payment");
                System.out.print("Please select action: ");
                
                //get input from the user
                int Input = sc.nextInt();
                sc.nextLine();
                
                //if staff want to delete payment
                if (Input == 1)
                {
                    System.out.println("Which payment u want to delete");
                    //display total how many payment / the lastest payment's position
                    System.out.println("Current Payment :" + paymentList.getNumberOfEntries());
                    System.out.println("Enter the payment (Ex:" + paymentList.getNumberOfEntries() + ") " + " to delete the current one:");
                    //after input the position of the payment, the payment is being deleted.
                    int delete = sc.nextInt();
                    
                    paymentList.remove(delete);
                    
                    sc.nextLine();
                    
                }
                
                //modify payment
                else if (Input == 2)
                {
                    // Display total payment 
                    System.out.println("Total payment :" + paymentList.getNumberOfEntries());
                    //let staff choice which payment they want to modify
                    System.out.print("Which payment u want to modify? :");
                    int payment = sc.nextInt();
                    sc.nextLine();
                    boolean ModifyExit = false;
                    
                    // a loop that will ask user want to exit or not at the end of payment modification.
                    while(ModifyExit == false)
                        {
                            //display the selected payment's detail
                            //customerName , Order Stuff , Total
                            System.out.println();
                            System.out.println("Customer name   : "+ (paymentList.contains(payment)).getCustomerName());
                            System.out.println("Order stuff     : "+ (paymentList.contains(payment)).getOrderStuff());
                            System.out.println("Total           : Rm"+ (paymentList.contains(payment)).getTotal());        
                            System.out.println();
                            
                            // Display which part of payment's detail staff want to modify
                            
                            System.out.println();
                            System.out.println("[1] Modify CustomerName:");
                            System.out.println("[2] Modify OrderStuff:");
                            System.out.println("[3] Modify Total:");
                            System.out.println();
                            System.out.print("Which one u want to modify? :");
                            int item = sc.nextInt();
                            sc.nextLine();
                            
                            //when staff want to modify customerName
                            if( item == 1 )
                                {
                                    System.out.print("Enter here :");
                                    String ModifyCustomer = sc.nextLine();
                                    (paymentList.contains(payment)).setCustomerName(ModifyCustomer);
                                }

                            //when staff want to modify OrderStuff
                            else if( item == 2 )
                                {
                                    System.out.print("Enter here :");
                                    String ModifyOrderStuff = sc.nextLine();

                                    (paymentList.contains(payment)).setOrderStuff(ModifyOrderStuff);
                                }

                             //when staff want to modify the total of the payment
                            else if( item == 3 )
                                {
                                    System.out.print("Enter here :");
                                    float ModifyTotal = sc.nextFloat();
                                    sc.nextLine();

                                    (paymentList.contains(payment)).setTotal(ModifyTotal);
                                }
                           
                            //list out the updatedData 
                            System.out.println("UpdatedDATA!!!!");
                            System.out.println();
                            System.out.println();
                            System.out.println("Customer name   : "+ (paymentList.contains(payment)).getCustomerName());
                            System.out.println("Order stuff     : "+ (paymentList.contains(payment)).getOrderStuff());
                            System.out.println("Total           : Rm"+ (paymentList.contains(payment)).getTotal());        
                            System.out.println();
                            
                             //ask the user want to leave the modify section 
                            System.out.print("Do you want to leave for this modify section[Y/N] :");
                            String modifyExit = sc.nextLine();
                            if (modifyExit.equals("Y")||modifyExit.equals("y"))
                            {
                                ModifyExit = true;
                            }
          
                        }
                   
                    
                }
                
                //when the staff want to list out all payment with its details.
                else if (Input == 3)
                {
                    System.out.println("3");
                    
                    //display all the payment by this for loop
                    for(int i = 1;i < paymentList.getNumberOfEntries() + 1; i++)
                    {
                        System.out.println("payment: " + i);
                        System.out.println();
                        System.out.println("Customer name   : "+ (paymentList.contains(i)).getCustomerName());
                        System.out.println("Order stuff     : "+ (paymentList.contains(i)).getOrderStuff());
                        System.out.println("Total           : Rm"+ (paymentList.contains(i)).getTotal());        
                        System.out.println();
                    }
                    
                }
                
                 //when the user want to get the total sum of all payment's total
                else if (Input == 4)
                {
                    float countTotal = 0;
                    System.out.println("4");
                    
                    //print out the total from 
                    for(int i = 1;i < paymentList.getNumberOfEntries() + 1; i++)
                    {
                        System.out.println("The total payment of " + i + ": " + (paymentList.contains(i)).getTotal());
                        countTotal += (paymentList.contains(i)).getTotal();
                        
                        
                    }
                    
                    //print out the total
                    System.out.println();
                    System.out.println("Total Sum: " + countTotal);
                        
                }
                
                //when the staff want to add new payment
                else if (Input == 5)
                {
                    
                    System.out.println("Total payment :" + paymentList.getNumberOfEntries());
                              
                    System.out.print("Enter the position of the payment :");
                    int AddPosition = sc.nextInt();
                    sc.nextLine();
                    System.out.println();
                    
                    //Enter the detail of the payment
                    System.out.println("Enter the detail!");
                    System.out.println();
                     
                    System.out.print("CustomerName :");
                    String AddCustomerName = sc.nextLine();
                    
                    System.out.print("OrderStuff :");
                    String AddOrderStuff = sc.nextLine();
                    
                    
                    System.out.print("Total :");
                    float AddTotal = sc.nextFloat();
                    sc.nextLine();
                    
                    
                    //create the payment inside the linkedlist
                    paymentList.add(AddPosition,payment = new paymentDetail(AddCustomerName, AddOrderStuff, AddTotal));
                     System.out.println();
                     System.out.println("AddedData!");
                     System.out.println();
                    
                     //Display the position and the detail of the paymentList
                    System.out.println("Location of payment: " + AddPosition);
                    System.out.println();
                    System.out.println("Customer name   : "+ (paymentList.contains(AddPosition)).getCustomerName());
                    System.out.println("Order stuff     : "+ (paymentList.contains(AddPosition)).getOrderStuff());
                    System.out.println("Total           : Rm"+ (paymentList.contains(AddPosition)).getTotal());        
                    System.out.println();
                    
                }
                
                //Ask they want leave this prgram or not
                System.out.print("Do you want to leave for this Program[Y/N] :");
                String str = sc.nextLine();
                 
                 if (str.equals("Y")||str.equals("y"))
                 {
                     exit = true;
                 }
                 
                 
            }
            
            
            
        }
        
        //if the user is customer
        else if (staff == false)
        {
            //create the payment based on the customerName,orderStuff,total
            paymentList.add(payment = new paymentDetail(customerName,orderStuff,total));
            if (result == false)
            {
            //if the ingredient is out of stock, then show the process is  being denied.
            System.out.println("The process is being denied");

            }
            
            else
            {
                
            //do something
            // Aspect user is customer
            paymentList.add(payment = new paymentDetail(customerName,orderStuff,total));
            //current one
            //paymentList.add(payment = new paymentDetail(customerName,orderStuff,total));

            //print out custmer's payment
            System.out.println("Payment Detail  : ");
            System.out.println("Customer name   : "+ (paymentList.contains(paymentList.getNumberOfEntries())).getCustomerName());
            System.out.println("Order stuff     : "+ (paymentList.contains(paymentList.getNumberOfEntries())).getOrderStuff());
            System.out.println("Total           : Rm"+ (paymentList.contains(paymentList.getNumberOfEntries())).getTotal());
                       
            }
        }
    }
    
}

    

    

    
    
   
    





