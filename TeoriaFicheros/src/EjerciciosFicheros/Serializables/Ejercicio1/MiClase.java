
package EjerciciosFicheros.Serializables.Ejercicio1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MiClase extends ObjectOutputStream {
   
    MiClase(FileOutputStream fos) throws IOException{
      super(fos);
    }

    @Override
    protected void writeStreamHeader() throws IOException {}    
    
}
