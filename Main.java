import java.util.Scanner;
public class Main{

    public static void main(String []args){
        
      Scanner choice = new Scanner(System.in);
        
      System.out.println("\nHello, and welcome. Prompts are CASE SENSITIVE, and are to be inputted in lower case, spelled correctly.\nBegin? (y/n)");
            
        String title = choice.nextLine();
          if (title.equals("y")) {
            startGame();
              }
                
          if (title.equals("n")); {
            System.exit(0);
              }
      }


    //startgames start
    public static void startGame2(){
      
      Scanner choice = new Scanner(System.in);

      System.out.println("\nYou wake up on the ground facing an old and disfigured house, head throbbing.\n'Something's... off,' you think to yourself.\nAs if, you've been here before. \nWhat do you do? (enter)");
      
      String house = choice.nextLine();

        if (house.equals("enter")){
          foyerTwo();
        }
    }  
    
    
    
    public static void startGame(){

      Scanner choice = new Scanner(System.in);

      System.out.println("\nYou wake up on the ground facing an old and disfigured house, head throbbing.\n'What a night,' you think to yourself.\nWhat do you do? (enter)");
      
      String house = choice.nextLine();

        if (house.equals("enter")){
          houseFoyer();
        }
    }
    //startgames end

    //hell
    public static void hell(){
      System.out.println("\n A hellish portal opens up at your 'feet', and your spirit descends. \nYou spend eternity in suffering.");
      
      System.out.println("xxxx GAME OVER xxxx");
    }
    //hell

    //foyers start
    public static void houseFoyer(){

      Scanner choice = new Scanner(System.in);

      System.out.println("\nYou step through the ornate wooden door, and a musty odor hits your nostrils like a speeding truck.\nSeveral victorian-era paintings line the walls, and you can catch a whiff of Paris Green on the wallpapers.\nThere are three doors before you, which one do you choose? (left/middle/right)");

      String doors = choice.nextLine();
        if (doors.equals("left")){
          leftDoor();
        }

        if (doors.equals("middle")){
          middleDoor();
        }
    
        if (doors.equals("right")){
          rightDoor();
        }
    }



    public static void foyerTwo(){
      
      Scanner choice = new Scanner(System.in);

      System.out.println("\nYou return to the center of the foyer.\nThere are three doors before you, which one do you choose? (left/middle/right)");

      String doors = choice.nextLine();
        if (doors.equals("left")){
          leftDoor();
        }

        if (doors.equals("middle")){
          middleDoor();
        }
    
        if (doors.equals("right")){
          rightDoor();
        }
    }
    //foyers end

    //doors start
    public static void leftDoor(){

      Scanner choice = new Scanner(System.in);

      System.out.println("\nYou optimistically approach the door, but are disappointed to find that it is locked.\nWhat do you do? (rattle/go back)");

      String ld = choice.nextLine();
        if (ld.equals("rattle")){
          leftDoor2();
        }

        if (ld.equals("go back")){
          foyerTwo();
        }

    }


    
    public static void leftDoor2(){

      Scanner choice = new Scanner(System.in);

      System.out.println("\nTo no avail, you aggressively rattle the door handle, hoping for it to open.\nAlthough the door remains unaffected, you can hear a faint voice on the other side.\n'Stop it!' it cries out.\nWhat do you do? (rattle/go back)");

      String ld2 = choice.nextLine();
        if (ld2.equals("rattle")){
          leftDoor3();
        }

        if (ld2.equals("go back")){
          foyerTwo();
        }
    }



    public static void leftDoor3(){

      Scanner choice = new Scanner(System.in);

      System.out.println("\nYou rattle the handle again, harder this time.\nWhatever is on the other side of the door has started to sob uncontrollably.\nWhat do you do? (rattle/go back)");

      String ld3 = choice.nextLine();
        if (ld3.equals("rattle")){
          leftDoor4();
        }

        if (ld3.equals("go back")){
          foyerTwo();
        }
    }



    public static void leftDoor4(){

      Scanner choice = new Scanner(System.in);

      System.out.println("\nThe creature has gone from crying to unearthly screaming.\nWhat you've done must've angered it.\nWhat do you do? (rattle/go back)");

      String ld4 = choice.nextLine();
        if (ld4.equals("rattle")){
          leftDoor5();
        }

        if (ld4.equals("go back")){
          foyerTwo();
        }
    }



    public static void leftDoor5(){

      Scanner choice = new Scanner(System.in);
      
      System.out.println("\nThe creature goes silent.\nYou shake the doorknob so hard it feels like your arm might come off! And then, it does.\nSo does your other arm. Then your left leg, then your right. You fall to the floor. \n You feel a sharp pain around your solar plexus, and watch as your GI tract spills out from a newly-made hole.\nThe creature laughs maniacally from behind the door.");

      System.out.println("\nxxxxx YOU HAVE DIED xxxxx");

      System.out.println("\nSuddenly, you begin to feel weird. You can see yourself, slumped over on the ground. \n Its as if your soul has left your body, and is watching down on Earth.\nYou can hear a mysterious voice speaking to you.\n'Oh, dear. It seems your luck has ran out. However, it doesn't have to end here. Continue? (y/n)'");

      String respawn = choice.nextLine();
        if (respawn.equals("n")){
          hell();
        }

        if(respawn.equals("y")){
          startGame2();
        }
    }



    public static void middleDoor(){
      System.out.println("test lol");
    }



    public static void rightDoor(){
      System.out.println("trololololo");
    }

























































































































}