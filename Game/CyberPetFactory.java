public class CyberPetFactory {

  public CyberPet makeCyberPet(String pet, String name) {
    
    if (pet == "Dog") {
    
      return new CyberPetDog(name);
      
    } else if (pet == "Cat") {
    
      return new CyberPetCat(name);
      
    } else if (pet == "Politician") {
    
      return new CyberPetPolitician(name);
      
    } else return null;
    
  }

}