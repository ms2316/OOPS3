public class CyberPetFactory {

  public CyberPet makeCyberPet(String pet, String name) {
    
    if ( pet.equals("Dog") ) {
    
      return new CyberPetDog(name);
      
    } else if ( pet.equals("Cat") ) {
    
      return new CyberPetCat(name);
      
    } else if ( pet.equals("Politician") ) {
    
      return new CyberPetPolitician(name);
      
    } else return null;
    
  }

}