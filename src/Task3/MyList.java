package Task3;

import java.util.*;
import java.util.concurrent.Semaphore;


public class MyList<E> implements List<E> {

    private static final Semaphore semaphore = new Semaphore(1,true);
    private final List<E> list = new ArrayList();
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
        return contains(o);
    }

    @Override
    public Iterator iterator() {
        Iterator iterator=null;
        try {
            semaphore.acquire();
            iterator=list.iterator();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return iterator();
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
        return add(o);
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
        return remove(o);
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
        return addAll(c);
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
        return addAll(index,c);
    }

    @Override
    public void clear() {

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
        return get(index);
    }

    @Override
    public E set(int index, E element) {
        Object set=null;
        try {
            semaphore.acquire();
            set=list.set(index, element);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        finally {
            semaphore.release();
        }
        return set(index, element);
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
        return remove(index);
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
        return indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}


