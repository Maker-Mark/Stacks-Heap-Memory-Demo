public class Apple
{
  private String color;
  private String name;
  private Poisen toxicity;
  
  public Apple()
  {
    name = "none";
    color = "invisible";
    toxicity = new Poisen (name.compareTo(color));
    // Now when we make the Poisen object, the heap nests the object in the same location as the apple with the data of the poisen object. 
    // the address of where the poisen object belongs(with var anmes toxicity) is stored in the apple obect so that we can find the actual engine in the heap 
  }
  
  public Apple(String name, String color)
  {
    
  this.name = name;
  this.color = color;
  toxicity = new Poisen (name.compareTo(color));
  
  }
  public  void setName(String name)
  {
    
  this.name = name;
  }
  
   public  void setColor(String Color){
     
  this.color = color;
  }
  
  public  String getName()
  {
    return name;
    
  }
  public  String getColor()
  {
    return color;
    
  }

  public  String toString(){
    return "This apple is a: " + name + " and is " + color + " with a posien level of " + toxicity.level;
  
}

}

  