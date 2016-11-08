/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package svacee.control;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;

public class SvaceeLeitor {
    
    
    public SvaceeLeitor(){
        
    }
    
    public void run() {

        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";
        try {

            JFileChooser jfc = new JFileChooser();
            int retorno = jfc.showOpenDialog(null);
            if (retorno == JFileChooser.APPROVE_OPTION) {
                File arq = jfc.getSelectedFile();
                FileReader fr = new FileReader(arq);
                br = new BufferedReader(fr);
                /*while ((linha = br.readLine()) != null) {

                    String[] pais = linha.split(csvDivisor);

                    System.out.println("Noome [code= " + pais[pais.length - 2]
                            + "valor1=" + pais[pais.length - 1] + "]");

                }
                        */
            } 

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
}
