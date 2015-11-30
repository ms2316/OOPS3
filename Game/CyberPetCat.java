public class CyberPetCat extends CyberPet {
  
  public CyberPetCat(String name) {
    this.setName(name);
    this.setHappiness(0);
  }
  
  @Override
  public void sleep() {
    this.adjustHappiness(20);
    System.out.println("Kitty sleep");
  }
  
  @Override
  public void eat() {
    this.adjustHappiness(20);
    System.out.println("Kitty eat");
  }
  
  @Override
  public void play() {
    this.adjustHappiness(-100);
    System.out.println("Kitty play");
  }
  
  @Override
  public void fightEnemies() {
    this.adjustHappiness(20);
    System.out.println("Kitty fight");
  }

}