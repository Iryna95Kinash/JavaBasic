package primitives;

public class Strings {
    public static void main(String[] args) {

        String name = "Taras";
        String surname = "Shevchenko";
        String bornPlace = "Moryntsi";
        int birth = 1814;

        String str1 = "Mango";
        String str2 = "Mango";



        System.out.println(name + " " + surname + " " + "from" + " " + bornPlace);
        System.out.println("\nUkrainian poet was born in " + birth);

        System.out.println(str1 == str2);
    }
}
// variables str1 and str2 are the same. If they are the same object, then their reference to the character array will be exactly the same. (found in google)