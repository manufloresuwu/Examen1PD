package Examen.Cinco;

import java.util.ArrayList;
import java.util.List;

public class Interpreter extends AbstractExpression {

    private List<AbstractExpression> parseTree= new ArrayList<>();
    private ContextOperacionArit context;

    public Interpreter(String word){
        this.interpretecion(word);
    }

    public void interpretecion(String words) {
        String input = words;
        context= new ContextOperacionArit(input.replace(" ",""));
        for (String word : input.split(" ")) {
            switch (word){
                case "sumar":
                    parseTree.add(new TerminalExpressionSuma(word.length()));
                    break;
                case "restar":
                    parseTree.add(new TerminalExpressionResta(word.length()));
                    break;
                default:
                    parseTree.add(new TerminalExpressionNumero(word.length()));
                    break;
            }

        }
    }

    public int interpretar(){
        for (AbstractExpression terminalExpresion: parseTree) {
            terminalExpresion.interpreter(context);
        }
        return  context.output;
    }

    @Override
    public void interpreter(ContextOperacionArit context) {

    }

}
