package ituring_shulou.iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }
    public Object next() {
        return bookShelf.getBookAt(index++);
    }
}