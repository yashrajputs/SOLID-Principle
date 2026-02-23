// this is wrong way to write 
public interface Worker{
  void work();
  void eat();
}

//class 
public class Robot implements Worker{
  public void work(){
    System.out.println("Robot is working");
  }
  public void eat(){
    System.out.println("Robot is eating");
  }
}

// correct
// we have create separate method for both 
public interface Workable{
  void work();
}

public interface Eatable{
  void eat();
}


public class Robot implements Worker{
  public void workable(){
    System.out.println("Robot is working");
  }
}
