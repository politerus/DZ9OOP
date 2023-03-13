package Task2;

public class MyList <T> {
    private T[] array;
    private int size;
    private int length;
    private final int DEFAULTSIZE = 10;

    public MyList() {
        this.length = 0;
        this.size = DEFAULTSIZE;
        array = (T[]) new Object[this.size];
    }

    public MyList(int size){
        this.length = 0;
        this.size = size;
        array = (T[]) new Object[this.size];
    }

    public void add(T elem) throws ArrayIndexOutOfBoundsException{
        try{
            array[length++] = elem;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
    }

    public T getItem(int index){
        return array[index];
    }

    public int getSize(){
        for (int i = 0; i < this.array.length; i++) {
            if (array[i] == null){
                return i;
            }
        }
        return this.size;
    }


}

class Main{
    public static void main(String[] args) {
        MyList<String> l = new MyList<>(2);
        l.add("First elem");
        l.add("Second elem");


        System.out.println(l.getItem(0));
        System.out.println(l.getItem(1));
        System.out.println(l.getSize());

        MyList<Integer> k = new MyList<>();

        k.add(12);
        k.add(13);
        k.add(11);

        System.out.println(k.getSize());

    }
}