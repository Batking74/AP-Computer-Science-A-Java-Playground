public class MyFirstJavaMain {
    public static void main(String[] args) {
        int kekesViewCount = 2_300_928;
        System.out.println(kekesViewCount);
        double myGradePointAverage = 3.59;
        String sentenceOne = "Keke Palmer's View count is ";
        String sentenceTwo = ", and my Comulative GPA in high school is ";
        String sentenceThree = " so I average an ";
        char gpa = 'A';
        System.out.println(sentenceOne + kekesViewCount + sentenceTwo + myGradePointAverage + sentenceThree + gpa);
        Square mySquare = new Square();
        Square mySquare_2 = new Square(20, 40, "Yellow");
        mySquare.getWidth();
        mySquare.getHeight();
        mySquare.getArea();
        mySquare_2.getWidth();
        mySquare_2.getHeight();
        mySquare_2.getArea();
    }
}
