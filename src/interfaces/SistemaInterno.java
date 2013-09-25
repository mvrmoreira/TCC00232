/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Moreira
 */
public class SistemaInterno 
{
    void login(Autenticavel a)
    {
        int senha = 123456;
        if (a.autentica(senha))
        {
            System.out.println("Entrou!");
        }
        else
        {
            System.out.println("Deu ruim!");
        }
    }
    
    public static void main(String[] args) 
    {
        Gerente gerente = new Gerente();
        gerente.setSenha(123456);
        
        SistemaInterno sistema = new SistemaInterno();
        sistema.login(gerente);
    }
}
