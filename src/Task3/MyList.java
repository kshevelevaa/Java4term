package Task3;

import java.util.*;
import java.util.concurrent.Semaphore;


public class MyList<E> implements List<E> {

    private final Semaphore semaphore = new Semaphore(2,true);
    private final List<E> list = new ArrayList<>();
    @Override
    public int size() {
        int size=0;
        try {
            semaphore.acquire();
            size=list.size();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty=false;
        try {
            semaphore.acquire();
            isEmpty=list.isEmpty();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return isEmpty;
    }

    @Override
    public boolean contains(Object o) {
        boolean contains=false;
        try {
            semaphore.acquire();
            contains=list.contains(o);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return contains;
    }

    @Override
    public Iterator iterator() {
        Iterator iterator= null;

        try {
            semaphore.acquire();
            iterator=list.iterator();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        assert iterator!=null;
        return iterator;
    }

    @Override
    public Object[] toArray() {
        Object[] toArray=new Object[0];
        try {
            semaphore.acquire();
            toArray=list.toArray();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return toArray();
    }

    @Override
    public boolean add(E o) {
        boolean add=false;
        try {
            semaphore.acquire();
            add=list.add(o);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return add;
    }

    @Override
    public boolean remove(Object o) {
        boolean remove=false;
        try {
            semaphore.acquire();
            remove=list.remove(o);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return remove;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean addAll=false;
        try {
            semaphore.acquire();
            addAll=list.addAll(c);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return addAll;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        boolean addAll=false;
        try {
            semaphore.acquire();
            addAll=list.addAll(index,c);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return addAll;
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public E get(int index) {
        E get=null;
        try {
            semaphore.acquire();
            get=list.get(index);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return get;
    }

    @Override
    public E set(int index, E element) {
        E set=null;
        try {
            semaphore.acquire();
            set=list.set(index, element);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        assert set!=null;
        return set;
    }

    @Override
    public void add(int index, E element) {
        try
        {
            semaphore.acquire();
            list.add(index,element);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
    }

    @Override
    public E remove(int index) {
        E remove=null;
        try {
            semaphore.acquire();
            remove=list.remove(index);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return remove;
    }

    @Override
    public int indexOf(Object o) {
        int indexOf=0;
        try {
            semaphore.acquire();
            indexOf=list.indexOf(o);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return indexOf;
    }

    @Override
    public int lastIndexOf(Object o) {
            int lastIndexOf=0;
        try {
            semaphore.acquire();
            lastIndexOf=list.lastIndexOf(o);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return lastIndexOf;
    }

    @Override
    public ListIterator listIterator() {
        ListIterator listIterator=null;
        try {
            semaphore.acquire();
            listIterator=list.listIterator();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return listIterator;
    }

    @Override
    public ListIterator listIterator(int index) {
        ListIterator listIterator=null;
        try {
            semaphore.acquire();
            listIterator=list.listIterator(index);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return listIterator;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List subList=null;
        try {
            semaphore.acquire();
            subList=list.subList(fromIndex, toIndex);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return subList;
    }

    @Override
    public boolean retainAll(Collection c) {
        boolean retainAll=false;
        try {
            semaphore.acquire();
            retainAll=list.retainAll(c);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return retainAll;
    }

    @Override
    public boolean removeAll(Collection c) {
        boolean removeAll=false;
        try {
            semaphore.acquire();
            removeAll=list.removeAll(c);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return removeAll;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean containsAll=false;
        try {
            semaphore.acquire();
            containsAll=list.containsAll(c);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return containsAll;
    }


    @Override
    public <T> T[] toArray(T[] a) {
        T[] toArray= null;
        try {
            semaphore.acquire();
            toArray=list.toArray(a);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return  toArray;
    }
}


