class Animal{
    public
    void eat(){
        System.out.println("pizzaa");
    }
    void data(){
        System.out.println("dataaaaaa");
    }
}
class Dog1 extends Animal{
    void eat1(){
        System.out.println("cakee");
    }
    void sleep(){
        System.out.println("so jao");
    }
}
public class Main{
    public static void main(String[] args){
        Animal s1=new Dog1();
        s1.eat();
    }
}
