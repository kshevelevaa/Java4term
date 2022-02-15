package Task3;

import java.util.*;

public class Myset implements Set {
    HashSet hashset;
    @Override
    public synchronized int size() {
        return hashset.size();
    }

    @Override
    public synchronized boolean isEmpty() {
        return hashset.isEmpty();
    }

    @Override
    public  synchronized boolean contains(Object o) {
        return hashset.contains(o);
    }

    @Override
    public synchronized Iterator iterator() {
        return hashset.iterator();
    }

    @Override
    public synchronized Object[] toArray() {
        return hashset.toArray();
    }

    @Override
    public synchronized boolean add(Object o) {
        return hashset.add(o);
    }

    @Override
    public synchronized boolean remove(Object o) {
        return hashset.remove(o);
    }

    @Override
    public synchronized boolean addAll(Collection c) {
        return hashset.addAll(c);
    }

    @Override
    public synchronized void clear() {
        hashset.clear();
    }

    @Override
    public synchronized boolean removeAll(Collection c) {
        return hashset.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection c) {
        return hashset.retainAll(c);
    }

    @Override
    public synchronized boolean containsAll(Collection c) {
        return hashset.containsAll(c);
    }

    @Override
    public synchronized Object[] toArray(Object[] a) {
        return hashset.toArray(a);
    }
}
