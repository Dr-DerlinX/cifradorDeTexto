package Clases;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class Class_Encriptador {
    
    private SecretKey claveSecreta;
    private String textOriginar;
    private String textEncritado;
    private String textDesencritado;

    public Class_Encriptador(SecretKey clave) {
        this.claveSecreta = clave;
    }
    
    public SecretKey getClaveSecrta(){
        return claveSecreta;
    }
    public String getTextOriginar(){return textOriginar;}
    public String getEncritado(){return textEncritado;}
    public String getTextDesencritado(){return textDesencritado;}
    
    public void setClaveSecreta(SecretKey clave){
        this.claveSecreta = clave;
    }
    public  void setTextOriginar(String textOrginar){
        this.textOriginar = textOrginar;
    }
    public  void setTextEncrictado(String textEncriptado){
        this.textEncritado = textEncriptado;
    }
    public  void setTextDesencritado(String textDesenc){
        this.textDesencritado = textDesenc;
    }
}
