//WAP to show the use of break, continue and return.

public class BreakContinueReturn {
    int returns(int i) {
        //System.out.println("Even Numbers to five: " + i);
        return i;
    }

    public static void main(String[] args) {
        BreakContinueReturn obj = new BreakContinueReturn();
        System.out.println("Even Numbers to Five:");
        for (int i = 1; i < 7; i++) {
            if (i == 5) {
                break;
            }
            if (i % 2 != 0) {
                continue;
            }
            int result = obj.returns(i);
            System.out.println("Returned form method: " + result);
        }
    }
}
