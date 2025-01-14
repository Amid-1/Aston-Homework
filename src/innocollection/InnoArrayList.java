package innocollection;

import java.util.*;

public class InnoArrayList<T> implements List<T> {

    private static final int DEFAULT_CAPACITY = 10;

    private Object[] elements;
    private int count;

    public InnoArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.count = 0;
    }

    @Override
    public boolean add(T element) {
        if (count == elements.length) {
            resize();
        }
        elements[count++] = element;
        return true;
    }

    private void resize() {
        Object[] newElements = new Object[elements.length + elements.length / 2];
        System.arraycopy(elements, 0, newElements, 0, elements.length);
        elements = newElements;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) elements[index];
    }

    @Override
    public T remove(int index) {
        checkIndex(index);
        T removedElement = (T) elements[index];
        System.arraycopy(elements, index + 1, elements, index, count - index - 1);
        count--;
        elements[count] = null;
        return removedElement;
    }

    public boolean remove(Object element) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(elements[i], element)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public void insert(int index, T element) {
        checkIndex(index);
        if (count == elements.length) {
            resize();
        }
        System.arraycopy(elements, index, elements, index + 1, count - index);
        elements[index] = element;
        count++;
    }

    @Override
    public void sort(Comparator<? super T> comparator) {
        Arrays.sort((T[]) elements, 0, count, comparator);
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= count) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count);
        }
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(elements[i], o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(elements, count);
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        if (a.length < count) {
            return (T1[]) Arrays.copyOf(elements, count, a.getClass());
        }
        System.arraycopy(elements, 0, a, 0, count);
        if (a.length > count) {
            a[count] = null;
        }
        return a;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object element : c) {
            if (!contains(element)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T element : c) {
            add(element);
        }
        return !c.isEmpty();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean modified = false;
        for (Object element : c) {
            modified |= remove(element);
        }
        return modified;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        Arrays.fill(elements, 0, count, null);
        count = 0;
    }

    @Override
    public T set(int index, T element) {
        checkIndex(index);
        T oldElement = (T) elements[index];
        elements[index] = element;
        return oldElement;
    }

    @Override
    public void add(int index, T element) {
        insert(index, element);
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < count; i++) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        for (int i = count - 1; i >= 0; i--) {
            if (Objects.equals(elements[i], o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < count;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return (T) elements[currentIndex++];
            }
        };
    }
}