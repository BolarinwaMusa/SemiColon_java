import java.util.Scanner;
public class Phone {
 public static void main (String [] args) {
 Scanner input = new Scanner (System.in);

 System.out.println(" 1. phonebook.");
 System.out.println(" 2. Messages.");
 System.out.println(" 3 chat ");
 System.out.println(" 4 call register");
 System.out.println(" 5 Tones");
 System.out.println(" 6 Settings");
 System.out.println(" 7 Call Divert");
 System.out.println(" 8 Games");
 System.out.println(" 9 Calculator");
 System.out.println(" 10 Reminders");
 System.out.println(" 11 Clock");
 System.out.println(" 12 Profiles");
 System.out.println(" 13 SIM Services");
 System.out.println("press a number to navigate bar ");
   int number = input.nextInt();
   

 	if (number == 1){
   System.out.println(" 1. Search");
   System.out.println(" 2.Service Nos");
   System.out.println(" 3.Add Name");
   System.out.println(" 4. Erase");
   System.out.println(" 5. Edit ");
   System.out.println(" 6. Assign tone");
   System.out.println(" 7.Send B'card ");
   System.out.println(" 8.Options " );
   System.out.println(" 9.Speed Dials");
   System.out.println(" 10.Voice tags" );
   System.out.println("press a number to navigate bar");
     int phonebook = input.nextInt();    
   } 
    
   	if(number == 2) { 
   System.out.println(" 1. Write messages");
   System.out.println(" 2.Inbox ");
   System.out.println(" 3.Outbox ");
   System.out.println(" 4. Picture messages");
   System.out.println(" 5. Templates");
   System.out.println(" 6. Smileys");
   System.out.println(" 7.Message settings");
   System.out.println("press a number to navigate bar");
   int Messages = input.nextInt();
       if(number == 7);
   System.out.println(" 1. Set 1");
   System.out.println(" 2. Message sent as");
   System.out.println(" 3. Message validity");
   System.out.println(" 2.Common ");
   System.out.println(" 1.Delivery reports");
   System.out.println(" 2. Reply via same centre");
   System.out.println(" 3. Character support ");
   System.out.println("press a number to navigate bar ");
    int MessageSettings = input.nextInt();
}
        if (number ==3){
  System.out.println("chat");
}

 	if (number ==4){

  System.out.println (" 1.Missed calls");
  System.out.println (" 2. Received calls");
  System.out.println (" 3.Dialled numbers");
  System.out.println (" 4. Erase recent call lists");
  System.out.println (" 5. Show call duration ");
   int CallRegister = input.nextInt();

          if (number==5);
   System.out.println("1. Last call duration");
   System.out.println(" 2. All calls' duration");
   System.out.println(" 3. Received calls' duration");
   System.out.println(" 4. Dialled calls' duration");
   System.out.println(" 5. Clear timers ");
     int ShowCallDuration = input.nextInt();
}

	if(number ==5){
   System.out.println(" 1. Ringing tone");
   System.out.println(" 2.Ringing volume");
   System.out.println(" 3. Incoming call alert");
   System.out.println(" 4. Composer");
   System.out.println(" 5. Message alert tone");
   System.out.println(" 6. Keypad tones");
   System.out.println(" 7. Warning and game tones");
   System.out.println(" 8.Vibrating alert");
   System.out.println(" 9. Screen saver ");
     int Tones = input.nextInt();
}

     
	if(number == 6){
    System.out.println(" 1. Call Settings");
    System.out.println(" 2. Phone settings");
    System.out.println(" 3. Security settings");
    System.out.println(" 4. Restore factory settings ");
      int Settings = input.nextInt();  
}

	if (number == 7){
     System.out.println(" Call divert ");
      int CallDivert = input.nextInt();
}

	if (number ==8){
      System.out.println (" Games ");
      int Games = input.nextInt();
}

    if(number ==9){

      System.out.println (" Calculator ");
      int Calculator = input.nextInt();
}
        if(number ==10){
      System.out.println (" Reminders");
      int Reminders = input.nextInt();
}
   if (number == 11) {
     System.out.println ("clock");
      int Clock = input.nextInt();
}
   if (number == 12 ){
     System.out.println(" Profiles ");
    int Profiles = input.nextInt();
}
  	if (number == 13){
     System.out.println("SIM Services");
    int SimServices = input.nextInt();
}
        }
     }  
   
