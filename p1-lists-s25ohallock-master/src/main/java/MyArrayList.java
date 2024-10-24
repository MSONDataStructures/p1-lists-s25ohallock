public class MyArrayList {
    private Integer[] list;
    private int size;
    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        list = new Integer[10];
        size = 0;
    }
    /**
     * Appends the specified Integer to the end of the list.
     * @param item Integer to be appended to this list
     * @throws NullPointerException if item is null
     */
    public void addLast(Integer item) {
        if (item == null) {
            throw new NullPointerException("Item cannot be null.");
        }
        list[size++] = item;
    }

    /**
     * Inserts the specified Integer at the specified position in this list.
     * Shifts the element currently at that position (if any) and subsequent
     * elements to the right.
     * @param index index at which the specified element is to be inserted
     * @param item Integer to be inserted
     * @throws NullPointerException if item is null
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public void add(int index, Integer item) {
        if (item == null) {
            throw new NullPointerException("Item cannot be null, silly");
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }
        // Shift elements to the right to make room
        for (int i = size; i > index; i--) {
            list[i] = list[i - 1];
        }

        list[index] = item;
        size++;
    }

    /**
     * Removes the Integer at the specified position in this list.
     * Shifts any subsequent elements to the left.
     * @param index the index of the element to remove
     * @return the element that was removed from the list
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public Integer remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index. Oops");
        }
        Integer removed = list[index];

        // Shift elements to the left
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }

        return removed;
    }

    /**
     * Returns the Integer at the specified position in this list.
     * @param index index of the element to return
     * @return the Integer at the specified position in this list
     * @throws IndexOutOfBoundsException if index is out of range
     */

    public Integer get(int index) {
        return list[index];
    }

    /**
     * Replaces the Integer at the specified position with the specified item.
     * @param index index of the integer to replace
     * @param item Integer to be stored at the specified position
     * @throws NullPointerException if item is null
     * @throws IndexOutOfBoundsException if index is out of range
     */
    public void set(int index, Integer item) {
        if (item == null){
            throw new NullPointerException("Item cannot be null!!");
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        list[index] = item;
    }
    /**
     * Returns the number of Integers in this list.
     * @return the number of Integers in this list
     */
    public int size() {
        return size;
    }

    /**
     * Returns the index of the first occurrence of the specified Integer,
     * or -1 if this list does not contain the Integer.
     * @param item Integer to search for
     * @return the index of the first occurrence, or -1 if not found
     * @throws NullPointerException if item is null
     */

    public int indexOf(Integer item) {
        if (item == null) {
            throw new NullPointerException("The item cannot be null. Got it?");
        }

        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns true if this list contains the specified Integer.
     * @param item Integer whose presence is to be tested
     * @return true if this list contains the specified element
     * @throws NullPointerException if item is null
     */
    public boolean contains(Integer item) {
        if (item == null) {
            throw new NullPointerException("Sadly, item cannot be null");
        }

        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Removes all the elements from this list.
     * The capacity of the array should not change.
     */

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }
    /**
     * Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
    public boolean isEmpty() {
        return size == 0;
    }

}
