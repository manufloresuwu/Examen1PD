package Examen.Cinco;

public class TerminalExpressionResta extends AbstractExpression{

    public TerminalExpressionResta(int amountDigit){
        this.amountDigit =amountDigit;
    }

    @Override
    public void interpreter(ContextOperacionArit context) {

        if (context.input.startsWith("restar")) {
            context.signo = -1;
            context.input = context.input.substring(this.amountDigit);
        }
    }

}
