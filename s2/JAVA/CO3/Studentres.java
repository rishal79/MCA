class Student {
    int academicScore;

    void setAcademicScore(int score) {
        academicScore = score;
    }

    void displayAcademic() {
        System.out.println("Academic Score: " + academicScore);
    }
}

interface Sports {
    void setSportsScore(int score);
    void displaySports();
}

class Result extends Student implements Sports {
    int sportsScore;

    public void setSportsScore(int score) {
        sportsScore = score;
    }

    public void displaySports() {
        System.out.println("Sports Score: " + sportsScore);
    }

    void displayResult() {
        displayAcademic();
        displaySports();
    }
}

public class Studentres {
    public static void main(String[] args) {
        Result r = new Result();
        r.setAcademicScore(85);
        r.setSportsScore(90);
        r.displayResult();
    }
}