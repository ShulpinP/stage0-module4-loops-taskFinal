package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i =1;i<=cathetusLength;i++) {
            for (int j = -cathetusLength;j<=cathetusLength;j++) {
                if (j==0 ||(j==1)) {
                    continue;
                }
                if (j<0) {
                    if (-j<=i) {
                        System.out.print(-j);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j <= i) {
                        System.out.print(j);
                    } else {
                        System.out.print(" ");
                    }
                }
                if (j==cathetusLength) {
                    System.out.println();
                }
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
