package Task5;
public class MyClass <T>{
    public MyClass(){

    }

    public T factoryMethod(){
        T elem = (T)new Object();
        return elem;
    }
}

class Main{
    public static void main(String[] args) {
        MyClass<Integer> obj = new MyClass<>();

        System.out.println(obj.factoryMethod());
    }
}