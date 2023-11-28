public class Questions extends Main {
    private String likesSchool;

    public Questions() {
        super();
    }

    public Questions(String answer) {
        likesSchool = answer;
    }

    public String likesSchool() {
        String[] yes = {"YES,", "Yes", "yes", "Y", "y"};
        String answer = "";
        for(int i = 0; i < yes.length; i++) {
            if(likesSchool == yes[i] ) {
                answer = "You do like school";
            }
            else {
                answer = "You don't like school";
            }
        }
        return answer;
    }
}
