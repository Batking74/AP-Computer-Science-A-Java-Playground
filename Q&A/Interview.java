public class Interview {

    public Interview() {
        super();
    }

    String [] messages = new String[3];
    messages[0] = "Hello there! What's your name? ";
    messages[1] = "How is your day so far? ";
    messages[2] = "I appreciate you answering my questions! ";

    public void getQuestion(int index) {
        messages[index];
    }
}
