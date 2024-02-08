package Clases;
import java.io.*;
/**
 *
 * @author HP-001
 */
public class Class_Archivos {
    
    FileInputStream entrada;
    FileOutputStream salida;
    File archivo;
    
    public Class_Archivos(){
    }
    
    public String AbrirArchivo(File archivo){
        String contenido = "";
        try {
            entrada = new FileInputStream(archivo);
            int ascci;
            while ((ascci = entrada.read()) != -1) {
                
                char carates = (char)ascci;
                contenido += carates;
            }
        } catch (Exception e) {
        }
        return contenido;
    } 
    
    public String GuardarArchivo(File archivo, String contenido){
        
        String respuesta = null;
        
        try {
            
            salida = new FileOutputStream(archivo);
            byte[] byteText = contenido.getBytes();
            salida.write(byteText);
            respuesta = "Se a guardado correcta mente...!";
            
        } catch (Exception e) {
        }
        return respuesta;
    }
    
}
