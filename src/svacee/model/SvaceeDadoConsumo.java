/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svacee.model;

import java.security.Timestamp;


/**
 *
 * @author Aluno
 */
public class SvaceeDadoConsumo {
    private Timestamp dataHra;
    private String idColeta;
    private double valKwH;
    
    public SvaceeDadoConsumo(){
        
    }

    /**
     * @return the dataHra
     */
    public Timestamp getDataHra() {
        return dataHra;
    }

    /**
     * @param dataHra the dataHra to set
     */
    public void setDataHra(Timestamp dataHra) {
        this.dataHra = dataHra;
    }

    /**
     * @return the idColeta
     */
    public String getIdColeta() {
        return idColeta;
    }

    /**
     * @param idColeta the idColeta to set
     */
    public void setIdColeta(String idColeta) {
        this.idColeta = idColeta;
    }

    /**
     * @return the valKwH
     */
    public double getValKwH() {
        return valKwH;
    }

    /**
     * @param valKwH the valKwH to set
     */
    public void setValKwH(double valKwH) {
        this.valKwH = valKwH;
    }
    
    
    
}
