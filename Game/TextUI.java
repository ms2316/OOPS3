public class TextUI extends Game{
  
  @Override
  public void requestAction() {
    System.out.println("To create a new pet type 0, press enter, then type pets type and press enter, then name and press enter");
    
    if (pet != null) {
      System.out.println("To make your pet sleep type 1 and press enter");
      System.out.println("To make your pet eat some food type 2 and press enter");
      System.out.println("To play with your pet type 3 and press enter");
      System.out.println("To make your pet fight your enemies type 4 and press enter");
    }
    
    System.out.println("To exit type q and press enter");
    
    String usrInput = ((System.console()).readLine()).trim();
    
    //parsing
    
    if (usrInput.equals("q")) {
    
      quit = true;
      return;
      
    } else if (usrInput.equals("0")) {
    
      String type = ((System.console()).readLine()).trim();
      String name = ((System.console()).readLine()).trim();
      pet = factory.makeCyberPet(type, name);
      return;
      
    } else if (usrInput.equals("1") && (pet != null) ) {
    
      pet.sleep();
      return;
      
    } else if (usrInput.equals("2") && (pet != null) ) {
    
      pet.eat();
      return;
      
    } else if (usrInput.equals("3") && (pet != null) ) {
    
      pet.play();
      return;
      
    } else if (usrInput.equals("4") && (pet != null) ) {
    
      pet.fightEnemies();
      return;
      
    }
    
    System.out.println("Incorrect input");
    
    
  }
  
  @Override
  public void displayGameState() {
    if (pet != null) {
      System.out.println("Pet " + pet.getName() + " is " + (pet.isHappy() ? "happy))" : "saaad((((") );
    } else {
      System.out.println("No pets created");
    }
    System.out.println("");
  }
  

}