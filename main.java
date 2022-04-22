import addition.Addition;

public class main {
    public static void main(String[] args) {

        introducing();
        Addition resultofaddition = new Addition();
        resultofaddition.addition();
    }

    private static void introducing() {
        System.out.println("Welcome in my first calculator");
        System.out.println("First option is going to be addition,next generation will be developed to other types of caltulations");
    }
}
