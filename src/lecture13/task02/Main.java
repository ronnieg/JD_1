package lecture13.task02;

public class Main {
    public static void main(String[] args) {
        String s = "Penguins are a group of aquatic, :( flightless birds. " +
                "They live almost exclusively in the :( Southern Hemisphere, " +
                "with only one species, the Galapagos:( penguin, found north:( of the equator.";
        System.out.println(s);
        System.out.println(s.replaceAll(":\\(", ":\\)"));
    }
}
