import sl02.ListaConcatenata;
public class AlberoBinarioDiRicerca<T> extends AlberoBinario {
    private AlberoBinarioDiRicerca ABDR;

    public AlberoBinarioDiRicerca(ListaConcatenata lC) {
        this.radix = null;
        for (int i = 0; i < lC.size(); i++) {
            ABDR.insert(lC.get(i));
        }
    }

    public AlberoBinarioDiRicerca() {
        this.radix = null;
    }

    public boolean haIlNodo(T x) {
        Nodo questoNodo = radix;
        while (questoNodo != null) {
            Comparable temp = (Comparable) x;
            if (questoNodo.info == x) {
                return true;
            } else if (temp.compareTo(questoNodo.info) < 0) {
                questoNodo = questoNodo.sX;
            } else {
                questoNodo = questoNodo.dX;
            }
        }
        return false;
    }

    public void insert(T info) {
        Nodo newNode = new Nodo(info);
        if (radix == null) {
            radix = newNode;
            return;
        }
        Nodo current = radix;
        Nodo parent = null;
        while (true) {
            Comparable temp = (Comparable) info;
            parent = current;
            if (temp.compareTo(current.info) < 0) {
                current = current.sX;
                if (current == null) {
                    parent.sX = newNode;
                    return;
                }
            } else {
                current = current.dX;
                if (current == null) {
                    parent.dX = newNode;
                    return;
                }
            }
        }
    }

    public Nodo getSucessivo(Nodo node1) {
        Nodo sucessivo = null;
        Nodo sucessivoPadre = null;
        Nodo current = node1.dX;
        while (current != null) {
            sucessivoPadre = sucessivo;
            sucessivo = current;
            current = current.sX;
        }
        if (sucessivo != node1.dX) {
            sucessivoPadre.sX = sucessivo.dX;
            sucessivo.sX = node1.dX;
        }
        return sucessivo;
    }

    @Override
    public String toString(Nodo radix) {
        String res = null;
        if (radix != null) {
            toString(radix.sX);
            res.concat(" " + radix.info);
            toString(radix.dX);
        }
        return res;
    }
}
