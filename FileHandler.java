import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 * 
 * @author Jose Anton, Alejandro Ortega, Pedro Pablo Guzmán
 * @version
 * 1.0.0
 */
public class FileHandler {

    public FileHandler() {

    }
    /**
     * Abre un archivo
     * @param pathName el nombre del archivo a abrir
     * @return el archivo abierto
     */
    public File createFile(String pathName) {
        return new File(pathName);
    }
    /**
     * Lee los datos del archivo abierto
     * @param file el archvio a leer
     * @return un arraylist con los datos del archivo 
     */
    public String[] readDataFromFile(File file) {
        try {
            BufferedReader buffReader = new BufferedReader(new FileReader(file));
            String st;
            ArrayList<String> strArray = new ArrayList<String>();
            while ((st = buffReader.readLine()) != null) {
                strArray.add(st);
            }
            buffReader.close();
            return strArray.toArray(new String[strArray.size()]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    /**
     * Reescribe los datos del archivo
     * @param file el archvio en el que se escribirán los datos
     * @param data el string que será escrito en el archivo
     * @return true si se agrego el dato, false si hubo un error
     */
    public boolean writeDataToFile(File file, String data) {
        try {
            FileWriter fWriter = new FileWriter(file);
            fWriter.write(data);
            fWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    /**
     * Permite agregar datos nuevos al archvio abierto
     * @param file el archivo al que se le agregarán datos
     * @param data los datos que se ingresarán en el archivo
     * @return true si se agrego el dato, false si hubo un error
     */
    public boolean appendDataToFile(File file, String data) {
        try {
            FileWriter fWriter = new FileWriter(file, true);
            fWriter.write(data + "\n");
            fWriter.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    
}