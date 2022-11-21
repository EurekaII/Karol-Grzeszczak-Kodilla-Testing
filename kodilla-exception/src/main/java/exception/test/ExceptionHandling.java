package exception.test;

public class ExceptionHandling {

    public String probablyWillThrowExceptions() {
        SecondChallenge secondChallenge = new SecondChallenge();

        try {
            secondChallenge.probablyIWillThrowException(2, 1.5);
        } catch (Exception e) {
            System.out.println("Exception, invalid method arguments");
        } finally {
            System.out.println("Finally");
        }

        return "Done";

    }
}
