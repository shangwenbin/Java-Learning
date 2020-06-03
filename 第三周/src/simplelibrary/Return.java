package simplelibrary;

public class Return implements Runnable
{
    private Book b =new Book();
    Return(Book b){
        this.b = b;
    }
    @Override
    public void run() {
        while(true){
            b.returnBook();
        }
    }
}
