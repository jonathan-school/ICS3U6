/**
 * BoardingHouse
 * Contains an array of Pets
*/

public class BoardingHouse{
  Pet[] cage = new Pet[10];
  boolean full;
  
  void add(String name, int age, String animal){
    //Adds pet to the first empty index in pets array
    full = true;
    for(int i = 0; i < 10; i++){
      if(cage[i] == null && full){
        if(animal.equals("cat")){ //If cat
          cage[i] = new Cat(name, age);
        }
        else if(animal.equals("dog")){ //If dog
          cage[i] = new Dog(name, age);
        }
        
        full = false;
      }
    }
    if(full){
      System.out.println("All cages are full. Pet not added.");
    }
  }
  
  void remove(String name){
    //Removes a pet
    for(int i = 0; i < 10; i++){
      if(cage[i] != null && cage[i].name().equals(name)){
        cage[i] = null;
        System.out.println("Pet removed");
      }
      else{
        System.out.println("empty");
      }
    }
  }
  
  void speak(String n){
    full = false;
    for(int i = 0; i < 10; i++){
      if(cage[i] != null && cage[i].name().equals(n) && !full){
        System.out.println(cage[i].speak());
        full = true;
      }
    }
    if(!full){
      System.out.println("empty");
    }
  }
  
  void action(String name){
    full = false;
    for(int i = 0; i < 10; i++){
      if(cage[i] != null && cage[i].name().equals(name) && !full){
        System.out.println(cage[i].action());
        full = true;
      }
    }
    if(!full){
      System.out.println("empty");
    }
  }
}