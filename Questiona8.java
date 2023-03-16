///8. Write a program to find following data of student using mark of four subjects like
//      C, C++, Java, and Python. Mark of 4 subjects will be accepted at the run time and
//      credit of all the mentioned subject is 3?
//   a) Grade of 4 subjects?
//  b) Total Mark and %age of mark secured by Students?
//   c) SGPA of Student?

/* 0 to 35 F 2
 * 35 to 49 D 5
 * 50 to 59 C 6
 * 60 to 69 B 7
 * 70 to 79 A 8
 * 80 to 80 E 9
 * 90 to 100 O 10
 */
class Questiona8{
    public static void main(String[] args) {
        int nos= args.length;
        int cp = 3, fms = 400, sqpat = 0, tms = 0, gp = 1;
        for (int i = 0; i < nos; i++) {
            char gd = 's';
            int m = Integer.parseInt(args[i]);
            tms = tms + m;
            if (m >= 35 && m < 40) {
                m = m + 5;
            }
            int mv = m / 10;
            switch (mv) {
                case 0:
                case 1:
                case 2:
                case 3:
                    gd = 'F';
                    gp = 2;
                    break;
                case 4:
                    gd = 'D';
                    gp = 5;
                    break;
                case 5:
                    gd = 'C';
                    gp = 6;
                    break;
                case 6:
                    gd = 'B';
                    gp = 7;
                    break;
                case 7:
                    gd = 'A';
                    gp = 8;
                    break;
                case 8:
                    gd = 'E';
                    gp = 9;
                    break;
                case 9:
                case 10:
                    gd = 'O';
                    gp = 10;
                    break;
                default:
                    gd = 's';
                    gp = 0;
            }
            System.out.println("Your mark for subject " + i + "is" + args[i] + "and grade is " + gd);
            sqpat = sqpat + gp * cp;
        }
        double percent = (tms / fms) / 100;
        double sgpa = sqpat / 12;
        System.out.println("Total Mark is " + tms);
        System.out.println("% of mark is " + percent);
        System.out.println("Your SGPA is " + sgpa);
    }
}