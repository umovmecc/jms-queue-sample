/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hornetq.jms.example;

/**
 *
 * @author dwildt
 */
public class ProcessaLocaisAtendimento implements Processador, DadoProcessado{

    public ProcessaLocaisAtendimento() {
        
    }

    public DadoProcessado processa(String conteudo){
        return this;
    }


}
