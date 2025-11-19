import java.awt.*;

abstract class Animal2{
    abstract void eat();
}

class Cat extends Animal2{
    void eat(){
        System.out.println("kitkat");
    }
}

public class  abstraction {
    public static void main(String[]  args){
        Cat s1=new Cat();
        s1.eat();
    }
}
