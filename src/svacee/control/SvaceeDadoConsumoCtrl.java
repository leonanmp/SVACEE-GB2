/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svacee.control;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import svacee.model.SvaceeDadoConsumo;

public class SvaceeDadoConsumoCtrl {
    
    private File arquivo;
    private List<SvaceeDadoConsumo> dadosLista = new ArrayList<>();
    
    
    public SvaceeDadoConsumoCtrl(){
        
    }
    
    public void obterDadosCsv(File arq) throws FileNotFoundException, IOException {
        setArquivo(arq);
        String linha = "";
        String[] linhas;
        String[] colunas;

        BufferedReader br = null;
        FileReader fr = new FileReader(arq);
        
        br = new BufferedReader(fr);
        
        SvaceeDadoConsumo sdc;
        
        while ((linha = br.readLine()) != null) {

            linhas = linha.split(",");
            
            for(String v:linhas){
                
                colunas = v.split(";");
                
                sdc = new SvaceeDadoConsumo();
                
                sdc.setDataHra(Timestamp.valueOf(colunas[0]));
                sdc.setIdColeta(colunas[1]);
                sdc.setValKwH(Double.parseDouble(colunas[2]));
                
                getDadosLista().add(sdc);
                
                
            }                       
        }
    }
    
    //pegar o caminho absoluto que o JFileChooser vai retornar e
    //ler o arquivo aqui.

    /**
     * @return the sdc
     */


    /**
     * @param sdc the sdc to set
*/

    /**
     * @return the arquivo
     */
    public File getArquivo() {
        return arquivo;
    }

    /**
     * @param arquivo the arquivo to set
     */
    public void setArquivo(File arquivo) {
        this.arquivo = arquivo;
    }

    /**
     * @return the dadosLista
     */
    public List<SvaceeDadoConsumo> getDadosLista() {
        return dadosLista;
    }

    /**
     * @param dadosLista the dadosLista to set
     */
    public void setDadosLista(List<SvaceeDadoConsumo> dadosLista) {
        this.dadosLista = dadosLista;
    }
    
    
    
}
