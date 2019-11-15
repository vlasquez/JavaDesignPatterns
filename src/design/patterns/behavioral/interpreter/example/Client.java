package design.patterns.behavioral.interpreter.example;

public class Client {
    InterpreterContext ic;

    public Client(InterpreterContext ic) {
        this.ic = ic;
    }

    private String interpret(String str) {
        Expression exp = null;

        if (str.contains("Hexadecimal")) {
            exp = new IntToHexadecimalExpression(Integer.parseInt(str.substring(0, 2)));
        } else if (str.contains("Binary")) {
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0, 2)));
        } else {
            return str;
        }
        return exp.interpret(ic);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Client client = new Client(new InterpreterContext());
        System.out.println(str1 + "= " + client.interpret(str1));
        System.out.println(str2 + "= " + client.interpret(str2));
    }

}
