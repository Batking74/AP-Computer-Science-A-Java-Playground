public class Main {
    public static void main(String[] args) {
        Rocket saturn = new Rocket("Saturn", 112.3);
        Rocket mercury = new Rocket("Mercury", 20.0);
        Rocket count = new Rocket("T-minus", 50);
        saturn.countdown(10);
        mercury.countdown(0);
        saturn.checkHeight();
        mercury.checkHeight();
        count.countdown(7);
    }
}