public class HelloArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Привіт світ!");
        } else {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
