package Examen.Cinco;

public class TerminalExpressionSuma extends AbstractExpression{

    public TerminalExpressionSuma(int amountDigit){
        this.amountDigit = amountDigit;
    }

    @Override
    public void interpreter(ContextOperacionArit context) {

        if (context.input.startsWith("sumar")) {
            context.signo = 1;
            context.input = context.input.substring(this.amountDigit);
        }

    }

}
