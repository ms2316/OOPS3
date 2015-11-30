public class CyberPetPolitician extends CyberPet {
  
  public CyberPetPolitician(String name) {
    this.setName(name);
    this.setHappiness(-100);
  }
  
  @Override
  public void sleep() {
    this.adjustHappiness(1);
    System.out.println("Politician sleep");
  }
  
  @Override
  public void eat() {
    this.adjustHappiness(1);
    System.out.println("Politician eat");
  }
  
  @Override
  public void play() {
    this.adjustHappiness(-1);
    System.out.println("Politician play");
  }
  
  @Override
  public void fightEnemies() {
    this.adjustHappiness(20);
    System.out.println("Politician fight");
  }

}