package lecture14.task03;

public class Main {
    public static void main(String[] args) {
        String string = "Here's how to define a paragraph in HTML<p>Here's how to define a paragraph in HTML.</p>Here's how to define a paragraph in HTML\n" +
                "Here's how to define a paragraph in HTML<p align=\"left|right|center|justify\">Here's how to define a paragraph in HTML\n" +
                "<p>This paragraph is defined using the HTML p tag.</p>\n" +
                "<p>This is a new paragraph which is also defined using the HTML p tag.</p>\n" +
                "<p class=\"important\">Note that this is an important paragraph. :)</p>";

        System.out.println(string);
        System.out.println("-----------------------------");
        System.out.println(string.replaceAll("<p?(?=\\w+).(.*?)>", "<p>"));
    }
}
