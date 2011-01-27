/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.hornetq.jms.example;

/**
 *
 * @author dwildt
 */
public interface Processador {

    public DadoProcessado processa(String conteudo);

}
