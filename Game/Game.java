public abstract class Game implements UserInterface {

  protected CyberPet pet = null;
  protected boolean quit = false;
  protected CyberPetFactory factory;
  
  public void play() {
      factory = new CyberPetFactory();
      
      while (!quit) {
	displayGameState();
	requestAction();
      }
  }
  
  public abstract void requestAction();
  public abstract void displayGameState();

}