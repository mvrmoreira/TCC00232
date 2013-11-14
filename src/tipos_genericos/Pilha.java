/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_genericos;

/**
 *
 * @author Moreira
 */
public class Pilha<T> 
{
    private Object[] conjunto = new Object[100];
    private int topo = 0;
    
    public static void main(String[] args) {
        Pilha<String> pilha;
        pilha = new Pilha<>();
    }
    
    public void push(T elemento)
    {
        int novoTopo = this.getTopo() + 1;
        this.setTopo(novoTopo);        
        this.getConjunto()[novoTopo] = elemento;
    }

    public int getTopo() {
        return topo;
    }

    public void setTopo(int topo) {
        this.topo = topo;
    }

    public Object[] getConjunto() {
        return conjunto;
    }
}
