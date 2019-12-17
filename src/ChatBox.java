//Simple chatbot to help with some of the questions regarding 2020 Hackhouston!
import java.util.Scanner;
public class ChatBox {
    public static void main (String[] args){
       System.out.println("\f");
      // Scanner sc = new Scanner(System.in);
    System.out.println("Hi! How can I Help?");
       //System.out.println(">>>");
       //String n = sc.nextLine();
       //System.out.println("Ok"   );
        //Scanner sc = new Scanner(System.in);
       while(true)
       {

           Scanner sc = new Scanner(System.in);
           System.out.println(">>>");
           String s = sc.nextLine();
           s = s.toUpperCase();

           if(s.contains("DATE")){
               System.out.println("APRIL 18-19");
           }
       else if(s.indexOf("COST") >= 0){
           System.out.println("Our hackathon is completely free!");
           }
       else if(s.indexOf("BRING") >=0){
           System.out.println("On our site there are a list of items to bring as well as on MLH");
           }
       else if(s.indexOf("FOOD") >=0){
           System.out.println("We will have surveys sent out in advance to get recommendations, but we will have a variety of dishes. There will be vegan, vegetarian, and other dishes");
           }
       else if ( s.indexOf("SLEEP") >= 0){
           System.out.println("Our hackathon is 24 hours, but you are allowed to go home. If you wish to stay overnight bring pillow, blankets, etc");
           }
       else if(s.indexOf("WINNER") >=0){
           System.out.println("The judges will announce winners of the final day. Three groups will be chosen!");
           }
       else if(s.indexOf("SAFE") >= 0){
           System.out.println("There will be security provided throughout the entire event.");
           }
       else if(s.indexOf("AGE") >= 0){
           System.out.println(" As per MLH guidelines everyone must at least be 18 ");
           }
      else
          {
          final int num = 3;
          double r = Math.random();
          int whichResponse = (int)(r * num);
          String response = "";

          if(whichResponse ==0){
              response = "Hmmm.";
          }
      else if (whichResponse == 1){
          response = "Ok....";
               }
      else if (whichResponse == 2){
          response = "For further help contact HackHouston@gmail.com or call (713)471-6176 ";
          }
      else if (whichResponse == 3){
          response = "Not sure, can you give us a call (713)471-6176  ";
          }
      System.out.println(response);
      }
       }
    }
}
