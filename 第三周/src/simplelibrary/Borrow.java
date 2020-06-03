package simplelibrary;

public class Borrow implements Runnable
{
    private Book b = new Book();
    Borrow(Book b){
        this.b = b;
    }
    @Override
    public void run() {
        while (true){
            b.borrowBook();
        }

    }
}
