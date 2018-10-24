package lecture12.task04;

public class MyException extends RuntimeException {
    public MyException() {
        super();
    }
    public MyException(String s) {
        super(s);
    }
    public MyException(String s, Throwable throwable) {
        super(s, throwable);
    }
    public MyException(Throwable throwable) {
        super(throwable);
    }
}
