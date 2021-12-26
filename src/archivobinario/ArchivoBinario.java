/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivobinario;
import java.io.*;
/**
 *
 * @author Guillermo
 */
public class ArchivoBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException
    {
        // TODO code application logic here
        File Archivo = new File ("Archivo binario.dat");
        if (!Archivo.exists()) Archivo.createNewFile();
        FileOutputStream fos= new FileOutputStream(Archivo);
        DataOutputStream dos= new DataOutputStream(fos);
        dos.writeInt (123);
        dos.writeDouble (1.5);
        dos.writeUTF ("Prueba de texto");
        dos.close();
        fos.close();
        FileInputStream fis= new FileInputStream (Archivo);
        DataInputStream dis= new DataInputStream (fis);
        int a= dis.readInt();
        double b = dis.readDouble();
        String c= dis.readUTF();
        System.out.println("El contenido de Archivo es: "+a+" " + b + " " + c + " ");
        fis.close();
        dis.close();
    }
    
}
