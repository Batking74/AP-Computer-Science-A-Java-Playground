public class Rocket {
    public String name;
    public double height;

    // Constructor:
    public Rocket(String newName, double newHeight) {
        name = newName;
        height = newHeight;
    }

    public void countdown(int numSeconds) {
        System.out.print("T-minus ");
        int i = 0;
        while(numSeconds >= i) {
            System.out.print(numSeconds);
            numSeconds--;
        }
        String lastText = " LIFTOFF!";
        System.out.println(lastText);
    }

    public void checkHeight() {
        if(height > 100) {
            System.out.println(name + " is a LARGE rocket");
        }
        else if(height < 20) {
            System.out.println(name + " is a SMALL rocket");
        }
        else {
            System.out.println(name + " is a MEDIUM rocket");
        }
    }
}