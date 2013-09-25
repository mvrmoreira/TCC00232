/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Moreira
 */
public class Gerente extends Funcionario implements Autenticavel
{
    private int senha;

    /**
     *
     * @param senha
     * @return
     */
    @Override
    public boolean autentica(int senha) 
    {
        return this.senha == senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
}
