import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Lox.main(args);
        Expr expression = new Expr.Binary(
                new Expr.Unary(
                        new Token(TokenType.MINUS, "-", null, 1),
                        new Expr.Literal(123)),
                new Token(TokenType.STAR, "*", null, 1),
                new Expr.Grouping(
                        new Expr.Binary(
                                new Expr.Literal(69),
                                new Token(TokenType.PLUS, "+", null, 1),
                                new Expr.Literal(0)
                        )));

        System.out.println(new AstPrinter().print(expression));
    }
}