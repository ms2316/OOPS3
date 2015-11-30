public abstract class CyberPet {
  
  protected String name;
  protected int happiness;
  
  public String getName() { return name; }
  public void setName(String newName) { name = newName; }
  
  public int getHappiness() { return happiness; }
  public void setHappiness(int newHappiness) { happiness = newHappiness; }
  public void adjustHappiness(int value) { happiness += value; }

  public boolean isTired() {
    return (happiness < 0);
  }
  
  public abstract void sleep();
  public abstract void eat();
  public abstract void play();
  public abstract void fightEnemies();

}