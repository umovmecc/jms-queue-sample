/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hornetq.jms.example;

/**
 *
 * @author dwildt
 */
public class ProcessaAgentes implements Processador, DadoProcessado {

    public ProcessaAgentes() {
    }

    public DadoProcessado processa(String conteudo) {
        return this;
    }

    
}
