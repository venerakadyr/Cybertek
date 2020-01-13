package finalAndMemory;

public class Bag {

     static final int totalBags;

    final String color;

    final int size;



/**  FIRST OPTION===== Declaring the final instance variable String color== using constructor;
 *   SECOND OPTION====RIGHTAWAY PASSING VALUE;
 *  THIRD OPTION====== INSTANCE INITIALIZER BLOCK. it just ===={}====,
 *  it simple block same as static block but without  static keyword. I will execute right before constructor
 *  WHY INITIALIZER BLOCK?== we could running few different  code to bring s value to initialize .In IB we can write any code.
 *  But we can't write any code at instance variable level.
 *
 */


  public Bag(){
      this.color="red";
  }

  public Bag(String color){
      this.color=color;
//      if we want to set different colors on different objects
  }


    {
        size = 4;
    }

     static {
         totalBags=45;
     }






}
