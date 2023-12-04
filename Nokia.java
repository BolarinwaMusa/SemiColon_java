import java.util.Scanner;
public class Nokia {
 public static void main (String [] args) {

 Scanner input = new Scanner (System.in);
 System.out.println("Welcome to nokia, press: 1. phonebook, 2. Messages, 3. chat, 4 call register, 5 Tones, 6 Settings, 7 Call Divert, 8 Games, 9 Calculator, 10 Reminders, 11 Clock, 12 Profiles, 13 SIM Services " );
   int number = input.nextInt();
 	if (number == 1);
   System.out.println(" 1. Search, 2.Service Nos, 3.Add Name, 4. Erase, 5. Edit, 6. Assign tone 7.Send B'card 8.Options, 9.Speed Dials, 10.Voice tags" );
   int number = input.nextInt();
   	if(number == 2) { 
   System.out.println(" 1. Write messages, 2.Inbox, 3.Outbox 4. Picture messages, 5. Templates, 6. Smileys, 7.Message settings");
   else
 	if(number == 7)
 System.out.println(" 1. Set 1, 2. Message sent as 3. Message validity 2.Common 1.Delivery reports, 2. Reply via same centre, 3. Character support ");
}
    int number = input.nextInt();
 	if (number ==3);
  System.out.println("chat");
    int number = input.nextInt();
 	if (number ==4){
  System.out.println (" 1.Missed calls, 2. Received calls, 3.Dialled numbers, 4. Erase recent call lists, 5. Show call duration ");
 else
     if(number ==5);
   System.out.println(" 1. Last call duration, 2. All calls' duration, 3. Received calls' duration, 4. Dialled calls' duration, 5. Clear timers ");
}
    int number = input.nextInt();
	if(number ==5);
   System.out.println (" 1. Ringing tone, 2.Ringing volume, 3. Incoming call alert, 4. Composer, 5. Message alert tone, 6. Keypad tones, 7. Warning and game tones, 8.Vibrating alert, 9. Screen saver ");
    int number = input.nextInt();
	if(number == 6) {
  System.out.println(" 1. Call Settings, 2. Phone settings, 3. Security settings, 4. Restore factory settings ");
     else
          if(number == 1);
   System.out.println(" 1. Automatic redial, 2.Speed dialling, 3.Call waiting options, 4. Own number sending, 5. Phone line in use, 6. Automatic answer ");
          if(number ==2);
   System.out.println(" 1. Language, 2. Cell info display, 3.Welcome note, 4.Network selection, 5. Lights, 6. Change access codes ");
}
      int number = input.nextInt();
	if (number == 7);
  System.out.println(" Call divert ");
     int number = input.nextInt();
	if (number ==8);
   System.out.println ("Games");
     int number = input.nextInt();
    if(number ==9);
   System.out.println (" Calculator ");
   int number = input.nextInt();
    if(number ==10);
    System.out.println ("Reminders");
    int number = input.nextInt();
   if (number == 11);
  System.out.println ("clock");
  System.out.println("1. Alarm clock, 2. Clock settings, 3. Date settings, 4. Stopwatch, 5. Countdown timer, 6. Auto update of date and time ");
  int number = input.nextInt();
   if (number == 12 );
 System.out.println("Profiles ");
  int number = input.nextInt();
  if (number == 13);
  System.out.println(SIM Services);
     }
 }