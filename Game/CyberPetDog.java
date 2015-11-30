public class CyberPetDog extends CyberPet {
  
  public CyberPetDog(String name) {
    this.setName(name);
    this.setHappiness(20);
  }
  
  @Override
  public void sleep() {
    this.adjustHappiness(10);
    System.out.println("Doggy sleep");
  }
  
  @Override
  public void eat() {
    this.adjustHappiness(5);
    System.out.println("Doggy eat");
  }
  
  @Override
  public void play() {
    this.adjustHappiness(20);
    System.out.println("Doggy play");
  }
  
  @Override
  public void fightEnemies() {
    this.adjustHappiness(-10);
    System.out.println("Doggy fight");
  }

}