import static java.lang.Integer.valueOf;

public class Valutatore {
    private static final char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    private static final char[] numbers = {'0','1','2','3','4','5','6','7','8','9'};
    private static final char[] operators = {'+','-','*','/'};
    private static boolean isChar(char c) {
        for (int i = 0; i < characters.length; i++) {
            if (c == characters[i]) return true;
        }
        return false;
    }
    private static boolean isNumber(char c) {
        for (int i = 0; i < numbers.length; i++) {
            if (c == numbers[i]) return true;
        }
        return false;
    }
    private static boolean isOperator(char c) {
        for (int i = 0; i < operators.length; i++) {
            if (c == operators[i]) return true;
        }
        return false;
    }
    public AlberoBinario dividi(String esp){
        for(int i=0;i<esp.length();i++) {
            String temp="";
            while(isChar(esp.charAt(i))) {
                temp.concat(esp.substring(i, i));
                i++;
            }
        }

        AlberoBinario albero=new AlberoBinario();

    }
}
class Variable {
    String variabile;
    public Variable(String variabile){
        this.variabile=variabile;
    }
}
class Number{
    Integer numero;
    public Number(String number){
        this.numero=valueOf(number);
    }
}
class Operator<T>{
    String operator;
    public Operator(String operator){
        this.operator=operator;
    }
    private String add(Number n,Number m){
        Integer res=n.numero+m.numero;
        return res.toString();
    }
    private String add(Number n,Variable m){
        return n.numero.toString().concat("+"+m.variabile);
    }
    private String add(Variable n,Number m){
        return n.variabile.concat("+"+m.numero.toString());
    }
    private String add(Variable n,Variable m){
        return n.variabile.concat("+"+m.variabile);
    }

    private String subtract(Number n,Number m){
        Integer res=n.numero-m.numero;
        return res.toString();
    }
    private String subtract(Number n,Variable m){
        return n.numero.toString().concat("+"+m.variabile);
    }
    private String subtract(Variable n,Number m){
        return n.variabile.concat("+"+m.numero.toString());
    }
    private String subtratc(Variable n,Variable m){
        return n.variabile.concat("+"+m.variabile);
    }

    private String multiply(Number n,Number m) {
        Integer res=n.numero*m.numero;
        return res.toString();
    }
    private String multiply(Number n,Variable m){
        return n.numero.toString().concat("*"+m.variabile);
    }
    private String multiply(Variable n,Number m){
        return n.variabile.concat("*"+m.numero.toString());
    }
    private String multiply(Variable n,Variable m){
        return n.variabile.concat("*"+m.variabile);
    }

    private String divide(Number n,Number m){
        Double res=n.numero.doubleValue()*m.numero.doubleValue();
        return res.toString();
    }
    private String divide(Number n,Variable m){
        return n.numero.toString().concat("/"+m.variabile);
    }
    private String divide(Variable n,Number m){
        return n.variabile.concat("/"+m.numero.toString());
    }
    private String divide(Variable n,Variable m){
        return n.variabile.concat("/"+m.variabile);
    }

    public void execute() {
        if (this.operator.equals("+")) operator.add();
        else if (this.operator.equals("-")) operator.subtact();
        else if (this.operator.equals("*")) operator.multiply();
        else if (this.operator.equals("/")) operator.divide();
    }
        Nodo sX;
        Nodo dX;
        Nodo(Operator op){
            this.sX=null;
            this.dX=null;
        }
        Nodo (Operator op, Nodo sX,Nodo dX){
            this.op= op;
            this.dX=dX;
            this.sX=sX;
        }
    }
}
