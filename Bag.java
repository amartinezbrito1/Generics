import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Bag<T> {
    //generics assignment
    private ArrayList<T> items;
    private Random random;
    public Bag()
    {
        items = new ArrayList<>();
        random = new Random();
    }
    //public T item;
    public void add(T item)
    {
     items.add(item);
    }

    public T remove()
    {
        if(items.isEmpty())
        {
            return null;
        }
        //getting random item to be removed from the list
        int randIndex =  random.nextInt(items.size());
        //returning item already removed from the list
        return items.remove(randIndex);
    }

    public Bag<T> remove(int num)
    {
        //new bag first
        Bag<T> newBag =  new Bag<>();
        for(int i =0;i<num;i++)
        {
            T item = remove();
            if(item == null)
            {
                break;
            }
            //add the new set of items to the new bag
            newBag.add(item);

        }
        return newBag;
    }
    public void add(Bag<T> items)
    {
     this.items.addAll(items.items);
    }
    public ArrayList<T> empty()
    {
        ArrayList<T> copy = new ArrayList<>(items);
        Collections.shuffle(copy, random);
        items.clear();
        return copy;
    }
    public T removeAndReplace()
    {
        if(items.isEmpty())
            return null;
        //picking a random item
        int randIndex = random.nextInt(items.size());

        return items.get(randIndex);
    }
    public int getSize()
    {
        return items.size();
    }

}
