import java.util.*;

public class Main{
    public static void main(String args[]){


        LinkedList<Contact> contactList = new LinkedList<Contact>();    // Linked list of contacts (the phone book)
        Scanner scn = new Scanner(System.in);


        while (true){               // A forever loop so that the program runs forever until it is told to stop
            System.out.println("");
            System.out.println("              PHONE BOOK               ");
            System.out.println("***************************************");
            System.out.println("(A)dd");
            System.out.println("(D)elete");
            System.out.println("(E)mail Search");
            System.out.println("(P)rint list");
            System.out.println("(S)earch");
            System.out.println("(Q)uit");
            System.out.println("***************************************");
        
            System.out.print("Please enter a command: ");

            String inpt = scn.nextLine();
            Iterator<Contact> iterator = contactList.iterator(); // initialized an iterator that will later be used
        
            switch (inpt) {
                case "A":
                    System.out.print("Name: ");
                    String name = scn.nextLine();
                    
        
                    System.out.print("Phone Number: ");
                    String num = scn.nextLine();
        
                    System.out.print("Email: ");
                    String email = scn.nextLine();
    
                    contactList.add(new Contact(name,num,email)); // Created an object with the contact class and added it to the contact linked list
                        
                break;

                case "D":
                    System.out.print("Enter the name of the contact you want to delete: ");
                    String selectDelete = scn.nextLine();
                    boolean contactFound = false; // a boolean to check whether the contact the user is looking for exists in the linked list

           
                    while (iterator.hasNext()){ //iterates through the linked list
                        Contact Selected = iterator.next(); //initializes a contact object called selected to represent the object the iterator is on
                        if(Selected.name.equals(selectDelete)){ 
                            contactList.remove(Selected); //  deletes the object from the linked list if its name attribute is equal to the user input
                            contactFound = true; // Sets the boolean as true as the contact is found, so that the message below is not printed
                        }
                    }
                    
                    

                    if(!contactFound){      // message is printed if the contact does not exist in the linked list 
                        System.out.println("-------------------------------------------------------");
                        System.out.println("The contact you are looking to delete does not exist...");
                        System.out.println("-------------------------------------------------------");
                    }
                
                break;

                case "E":
                    System.out.print("Enter the email of a contact you are looking for: ");
                    String selectEmail = scn.nextLine();
                
              
                    System.out.println("");
                    System.out.println("              PHONE BOOK               ");
                    contactFound = false;
                    
                    while (iterator.hasNext()) {
                        Contact Selected = iterator.next(); 
                        if (Selected.email.equals(selectEmail)) { //prints the following if the object the iterator is on is equal to the user input 
                            contactFound = true;
                            System.out.println("---------------------------------------");
                            System.out.println("");
                            System.out.println((contactList.indexOf(Selected)+1)+"."+" "+Selected.name); // index added by 1, so that the numbering starts from 1 and not 0
                            System.out.println("");
                            System.out.println("    Phone number: "+Selected.number);
                            System.out.println("    Email: "+Selected.email);
                            System.out.println("---------------------------------------");
                            System.out.println("");
                        
                        }
             
     
                    }

                    if(!contactFound){
                        System.out.println("-----------------------------------------------");
                        System.out.println("The email you are looking for does not exist...");
                        System.out.println("-----------------------------------------------");
                    }
                break;
    
                case "P":

                    System.out.println("");
                    System.out.println("              PHONE BOOK               ");
                  
                    for(int i = 0; i<contactList.size();i++){ //prints all of the contents of the linked list
                        System.out.println("---------------------------------------");
                        System.out.println("");
                        System.out.println((i+1) +". " + contactList.get(i).name);
                        System.out.println("");
                        System.out.println("    Phone number: "+contactList.get(i).number);
                        System.out.println("    Email: "+contactList.get(i).email);
                        System.out.println("");
                        System.out.println("---------------------------------------");
                        System.out.println("");



                    }
                break;
                
                case "S":
                    System.out.print("Enter the name of a contact you are looking for: ");
                    String selectName = scn.nextLine();
                    contactFound = false;
                    System.out.println("");
                    System.out.println("                    PHONE BOOK               ");
                    while (iterator.hasNext()) {
                        Contact Selected = iterator.next();
                        if (Selected.name.equals(selectName)) {
                            contactFound = true;
                            System.out.println("---------------------------------------");
                            System.out.println("");
                            System.out.println((contactList.indexOf(Selected)+1)+"."+" "+Selected.name);
                            System.out.println("");
                            System.out.println("    Phone number: "+Selected.number);
                            System.out.println("    Email: "+Selected.email);
                            System.out.println("---------------------------------------");
                            System.out.println("");
                    
                        }
                     
                    }
                    if(!contactFound){
                        System.out.println("-------------------------------------------------");
                        System.out.println("The contact you are looking for does not exist...");
                        System.out.println("-------------------------------------------------");
                    }
                break;


                case "Q":
                    System.out.println("Quiting....");
                    System.exit(0); //exits the forever loop
                break;
                
                default: //prints the following message if the user input is not one of the cases
                    System.out.println("Please enter a valid command");
                break;
    
                
                }
       
            }
                
            

        }
                
    
}
            
    


