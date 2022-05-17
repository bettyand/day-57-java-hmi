import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.points.add(points);
        this.grades.add(pointsToGrades(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        double numGrades = grades.size();
        if (numGrades == 0) {
            return -1;
        }

        double avg = 0;
        for (Integer grade : grades) {
            avg += grade;
        }
        avg /= numGrades;
        return avg;
    }

    public double averageOfPoints() {
        double numScores = points.size();
        if (numScores == 0) {
            return -1;
        }

        double avg = 0;
        for (Integer score : points) {
            avg += score;
        }
        avg /= numScores;
        return avg;
    }
}