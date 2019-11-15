package design.patterns.behavioral.interpreter.challenge;

public class Client {

    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression John = new TerminalExpression("John");
        return new OrExpression(robert, John);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        Context context = new Context("John");
        System.out.println("Is John Male?" + isMale.interpret(context));

        Context context2 = new Context("Married Julie");
        System.out.println("Is Julie Married?" + isMarriedWoman.interpret(context2));

        Context context3 = new Context("Lucy");
        System.out.println("Is Lucy Male?" + isMale.interpret(context2));
    }
}
