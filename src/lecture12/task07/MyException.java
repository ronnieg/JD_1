package lecture12.task07;

public class MyException extends Exception {

    public MyException() { super(); }

    public MyException(String message) { super(message); }

    public MyException(String message, Throwable cause) { super(message, cause); }

    public MyException(Throwable cause) { super(cause); }
}
