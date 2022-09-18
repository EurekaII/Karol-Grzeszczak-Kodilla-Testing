import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        System.out.println("Welcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        processor.execute(() -> System.out.println("This is an example text."));

        System.out.println("Calculating expression with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, Double::sum);

        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculating expression with method references");
        expressionExecutor.executeExpression(3,3, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);

    }
}

