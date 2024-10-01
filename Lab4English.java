// author: Viviana Zuloaga

class Lab4English {

    static double greater(double n1, double n2) {
        if (n1 >= n2)
            return n1;
        else
            return n2;
    }

    // FIRST EXERCISE
    static String lifeStage(int age){
        if (age >= 0 && age < 12){
            return "Childhood ";
        } else if (age >= 12 && age < 18){
            return "Adolescence ";
        } else if (age >= 18 && age < 35){
            return "Youth ";
        } else if (age >= 35 && age < 70){
            return "Adulthood ";
        } else if (age >= 70) {
            return "Old age ";
        } return "Invalid";
    }

    // SECOND EXERCISE

    static double progGrade (double labs, double firstExam, double secondExam){

        if (secondExam >= 4){
            return (labs * 0.2) + (firstExam * 0.2) + (secondExam * 0.6);
        }
        return 0;

    }

    // THIRD EXERCISE

    static double progressiveProgGrade(double labs, double firstExam, double secondExam){
        if (secondExam > labs) {
            return (secondExam * 0.8) + (firstExam * 0.2);
        } else if (secondExam > firstExam){
            return (labs * 0.2) + (secondExam * 0.8);
        } return 0;
    }

    static public void main(String[] args) {

        System.out.println("Tests for greater function");

        System.out.println("The greater or equal of " + 3.5 + " and " + 3.6 + " is " +  greater(3.5, 3.6));

        System.out.println("The greater or equal of " + 5 + " and " + 5 + " is " +  greater(5, 5));


        System.out.println("Stage of life: " + lifeStage(10));
        System.out.println("Stage of life: " + lifeStage(14));
        System.out.println("Stage of life: " + lifeStage(22));
        System.out.println("Stage of life: " + lifeStage(39));
        System.out.println("Stage of life: " + lifeStage(99));

        System.out.println("Final Programming I grade: " + progGrade(9.5, 10, 10));

        System.out.println("Final Programming I grade: " + progressiveProgGrade(9.7, 9.8, 10));


    }
}
