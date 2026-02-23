// this is case LSP will be break
public class Bird {
  void fly();
}


public class Penguin extand Bird{
 void fly(){
   System.out.println("Penguins can't fly!");
 }
}

//in LSP we can use interface

public interface Bird {
 
}


public interface Flying Bird extend Bird{
  void fly();
}


public class Penguin implements Bird{

 }
