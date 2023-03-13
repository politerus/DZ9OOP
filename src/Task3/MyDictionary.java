package Task3;
import java.util.ArrayList;

public class MyDictionary<Key, Value>{

    class Elem{
        public Key key;
        public Value value;

        public Elem(Key key, Value value) {
            this.key = key;
            this.value = value;
        }
    }

    private Elem elem;
    private ArrayList<Elem> list = new ArrayList<>();

    public void add(Key key, Value value){
        this.elem = elem;
        elem = new Elem(key, value);
        list.add(elem);
    }

    public Value getElemByKey(Key keyForV){

        for (int i = 0; i < list.size(); i++){
            if (keyForV.equals(list.get(i).key))
                return list.get(i).value;
        }
        return null;
    }

    public int getNumberOfElem(){
        int size = list.size();
        return size;
    }

    public MyDictionary(){ }

}

class Main{
    public static void main(String[] args) {
        MyDictionary<Integer, String> imSoBadAtThis = new MyDictionary<>();
        MyDictionary<String, String> iShouldGiveUp = new MyDictionary<>();
        imSoBadAtThis.add(1,"Book");
        imSoBadAtThis.add(22,"Comics");
        imSoBadAtThis.add(66,"Notebook");
        iShouldGiveUp.add("key", "New Book");
        iShouldGiveUp.add("key2", "New Book");
        System.out.println(imSoBadAtThis.getElemByKey(1));
        System.out.println(iShouldGiveUp.getNumberOfElem());
    }
}