package Clases;
import java.io.*;
import java.security.Key;
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
    
    public void GuardarArchivo(String nombreArchivo, String texto, Key clave) throws IOException{
        try(BufferedWriter write = new BufferedWriter(new FileWriter(nombreArchivo))){
            write.write("Texto cfrado : " + texto);
            write.newLine();
            
            write.write("Clave : " + java.util.Base64.getEncoder().encodeToString(clave.getEncoded()));
        }
    }
    
}
