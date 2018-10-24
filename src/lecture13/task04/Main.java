package lecture13.task04;

public class Main {

    public static StringBuilder fio(String firstName, String lastName, String middleName) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(lastName.toUpperCase().toCharArray()[0]).append(".").append(firstName.toUpperCase().toCharArray()[0]).append(".").append(middleName.toUpperCase().toCharArray()[0]);
        return stringBuilder;
    }

    public static void main(String[] args) {
        System.out.println(fio("egor", "Bukatkin", "vAsilievich"));
    }
}
