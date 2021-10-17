public class hw6_4 {
    // Do not change method 'main'
    public static void main(String[] args) {

        Grade63[] grade = new Grade63[5];
        grade[0] = new Grade63("Tom", 35, 25, 85);
        grade[1] = new Grade63("Jane", 75, 40, 66);
        grade[2] = new Grade63("Brown", 75, 40, 55);
        grade[3] = new Grade63("Zino", 35, 54, 90);
        grade[4] = new Grade63("Yeri", 54, 25, 95);

        for (int i = 0; i < grade.length; i++)
            System.out.println(grade[i]);

        int best = bestGrade(grade);
        System.out.println("BEST: " + grade[best]);
    }

    // write bestGrade method here
    public static int bestGrade(Grade63[] score) {
        int best = 0;

        for (int i = 0; i < 5; i++) {
            if (score[i].math > score[best].math) {
                best = i;
            } else if (score[i].math == score[best].math) {
                if (score[best].history > score[i].history) {
                    best = i;
                } else if (score[i].history == score[best].history) {
                    if (score[i].science > score[best].science) {
                        best = i;
                    }
                }
            }
        }
        return best;
    }

}

// write class Grade63 here
class Grade63 {

    String name;
    int math, history, science;

    public String toString() {
        return (name + ": math(" + math + ") history(" + history + ") science(" + science + ")");
    }

    public Grade63(String name, int math, int history, int science) {
        this.name = name;
        this.math = math;
        this.history = history;
        this.science = science;

    }

}
