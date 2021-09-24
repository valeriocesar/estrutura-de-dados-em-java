package one.digitalinnovation;

public class Pilha {

    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public void push(No novoNo) {
        No refAuxiliar = refNoEntradaPilha; // Guarda sua referencia de topo
        refNoEntradaPilha = novoNo; // Pega referencia de topo e seta como novo nó, que é o último a ser empilhado
        refNoEntradaPilha.setRefNo(refAuxiliar); // O novo nó é o último, o nó anterior é antiga referência de topo
    }

    public No pop() {
        if (this.isEmpty()) ;
        {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
    }

    public No top() {
        return refNoEntradaPilha;
    }

    public boolean isEmpty() {
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------------\n";
        stringRetorno += "       Pilha\n";
        stringRetorno += "-------------------\n";

        No noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado = " + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }

        }
        stringRetorno += "====================\n";
        return stringRetorno;
    }
}
