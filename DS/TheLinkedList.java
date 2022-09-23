import java.util.LinkedList;
import java.util.ListIterator;
public class TheLinkedList{

    public static void main(String[] args){

LinkedList<Person> linkedList = new LinkedList<>();
linkedList.add(new Person("bk",20));
linkedList.add(new Person("ck",30));
linkedList.add(new Person("dk",40));
linkedList.addFirst(new Person("ak",10));
linkedList.addLast(new Person("zk",50));


// System.out.println(linkedList.poll());
// System.out.println(linkedList.size());

ListIterator<Person> personListIterator = linkedList.listIterator();

while(personListIterator.hasNext()){
    System.out.println(personListIterator.next());   // for going from first to last
}

System.out.println();

while(personListIterator.hasPrevious()){
    System.out.println(personListIterator.previous());   // for going from last to first if you already gone from first to last
}


    }

   static record Person(String name, int age){}  // custom data type 
}