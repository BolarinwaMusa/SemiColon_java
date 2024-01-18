import java.util.Scanner;
public class NokiaSwitch {
public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Welcome to Nokia press key to navigate bar,\n 1.Phonebook\n 2.Messages\n 3.Chat\n 4.Call register\n 5.Tones\n 6.Settings\n 7.Call Divert\n 8.Games\n 9.Calculator\n 10.Reminders\n 11.Clock\n 12.Profiles\n 13.SIM Services\n ");
  int navigation = input.nextInt();
 switch (navigation) {
        case 1: 
	  System.out.println( "1.Search\n 2.Service Nos\n 3.Add Name\n 4.Erase\n 5.Edit\n 6.Assign Tone\n 7.Send B'Card\n 8.Options\n 9.Speed dials\n 10.Voice tags\n ");
	  int phonebook = input.nextInt();
	switch (phonebook) {
           case 1:
	    	  System.out.println( "1.Search\n 2.Service Nos\n 3.Add Name\n 4.Erase\n 5.Edit\n 6.Assign Tone\n 7.Send B'Card\n 8.Options\n 9.Speed dials\n 10.Voice tags\n ");
           
     break;
   
	 case 2:
          System.out.print("1.Write Messages \n 2.Inbox \n 3.Outbox \n 4.Picture Messages\n 5.Templates\n 6.Smileys \n 7.Message Settings\n ");
	   int Messages = input.nextInt();
	  switch(Messages) {
	    case 1:
           System.out.print("1.Write Messages \n 2.Inbox \n 3.Outbox \n 4.Picture Messages\n 5.Templates\n 6.Smileys \n 7.Message Settings\n ");
      break;
     
          case 3:
           System.out.print("1.Set1\n 2.Message sent as \n 3.Message validity \n 4.Delivery reports\n 5.Reply via same centre \n 6.Character support\n "); 
          int messageSettings = input.nextInt();
           
     break;

         case 4:
	  System.out.print("Missed calls\n Received calls\n Dialled numbers\n Erase recent call lists\n Show call duration\n ");
   	   int callRegister = input.nextInt();
       
      break;
     
 	case 5:
	  System.out.print("1.Last call duration\n 2. All calls' duration\n 3.Received calls' duration\n 4.Dialled calls duration\n 5.Clear timers\n ");
            int showCallDuration = input.nextInt();
	break;
	
	case 6:
	 System.out.print("1.Ringing tone\n 2.Ringing volume\n 3.Incoming call alert\n 4.Composer\n 5.Message alert tone\n 6.Keypad tones\n 7.Warning and game tones\n 8.Vibrating alert\n 9.Screensaver\n ");
	   int tones = input.nextInt();
	 break;

	case 7:
	System.out.print("1.Call Settings\n 2.Phone Settings\n 3.Security Settings\n 4.Restore factory Settings\n ");
	  int settings = input.nextInt();
	 break;

	case 8:
	System.out.println("Call divert");
	 int CallDivert = input.nextInt();
	 break;

	case 9:
	System.out.println("Games");
	 int Games = input.nextInt();
	 break;

	case 10:
	 System.out.println("Calculator");
	 int Calculator = input.nextInt();
	 break;

	 case 11:
	 System.out.println("Reminders");
	 int Reminders = input.nextInt();
	 break;
	
 	 case 12:
	 System.out.println("Clock");
	 int Clock = input.nextInt();
	 break;
	 case 13:
	 System.out.println("Profiles");
	 int Profiles = input.nextInt();
	 break;
	 case 14:
	 System.out.println("SIM Services");
	 break;


         }
      } 
    }

   }
  }