/**
 * Dog
 * A dog object
*/

public class Dog extends Pet{
  private String speak = "woof";
  private String action = "wag tail";
  //Constructortem
  Dog(String name, int age){
    super(name, age);
  }
  
  String speak(){
    return this.speak;
  }
  String action(){
    return this.action;
  }
}