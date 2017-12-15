 import java.lang.Comparable;

    public class AlberoBinario <T>{

        Nodo radix;

        public AlberoBinario(){
            this.radix=null;
        }
        public void addSX(T info){
            Nodo newNodo = new Nodo(info);
            if(radix==null)radix=newNodo;
            else{
                radix.sX=newNodo;
            }
            return;
        }
        public void addDX(T info){
            Nodo newNodo = new Nodo(info);
            if(radix==null)radix=newNodo;
            else{
                radix.dX=newNodo;
            }
            return;
        }
        public void visitaSimmetrica(Nodo focusNode) {
            if (focusNode != null) {
                visitaSimmetrica(focusNode.sX);
                System.out.println(focusNode);
                visitaSimmetrica(focusNode.dX);
            }
        }
        public void visitaAnticipata(Nodo focusNode) {
            if (focusNode != null) {
                System.out.println(focusNode);
                visitaAnticipata(focusNode.sX);
                visitaAnticipata(focusNode.dX);
            }
        }
        public void visitaDifferita(Nodo focusNode) {
            if (focusNode != null) {
                visitaDifferita(focusNode.sX);
                visitaDifferita(focusNode.dX);
                System.out.println(focusNode);
            }
        }
        public Nodo findNode(T x) {
            Comparable temp = (Comparable) x;
            Nodo sentinella = radix;
            while (sentinella.info != x) {
                if (temp.compareTo(sentinella.info)<0)sentinella = sentinella.sX;
                else sentinella = sentinella.dX;
                if (sentinella == null)return null;
            }
            return sentinella;
        }
        public String toString(Nodo radix){
            String res = null;
            if(radix!=null){
                res.concat(toString(radix.sX));
                res.concat(" " + radix.info);
                res.concat(toString(radix.dX));
            }
            return res;
        }
    }
