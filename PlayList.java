
/*el indice de ruido se calcula como la distancia
etre su tono promedio y el tono mas alto
debe contar todas las que superar el umbral (parametro)
 * 
 * 
 */

package testPlayList;
public class PlayList {

    
    
  //contador con el umbral  
public int cancionesQueSuperanUmbralDelRuido(double [] umbral){
 int contador = 0;
for(int i = 0; i <umbral.length;i++){
 if(umbral[i] < contador) {
contador++;
                      
   }
                      
} return contador;
                      
}

/*public int cancionesQueSuperanUmbralDelRuido2(double [] umbral){
 int contador = 0;
for(int i = 0; i <cancion.length;i++){
double ruido =(get.promedioDelTono - get.tonoMasAlto) 
 if(ruido> umbral) {
contador++;
                      
   }
                      
} return contador;
                      
}
*/


 //sacar el promedio del tono
 public int promedioDelTono(double [] tono) {
 double suma=0;
for(int i = 0; i <tono.length;i++){
 suma += tono[i];
  }
                 
 return (int) (suma / tono.length);
 }
                 
                 
 //sacar el tono mas alto
public int tonoMasAlto(double [] tono) {
    double tonoAlto= tono[0];
    for(int i = 0; i <tono.length;i++){
if(tono[i]> tonoAlto){
 tonoAlto = tono[i];
 }
                 
   }
 return tonoMasAlto(tono);
 }
                 
                 
   public class Cancion {
    
  private double [] tonos;
 private String titilo;
            
      
   
   }


public int cancionesQueSuperanUmbralDelRuido(int[] ca) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cancionesQueSuperanUmbralDelRuido'");
}
   
}

//test
package testPlayList;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class PruebaPlayList {
//No hay cancion
 @Test
    public void ningunaCancionEnLaPlayList() {
   PlayList play = new PlayList();
    double [] umbral = {};
 Assertions.assertEquals(0, play.cancionesQueSuperanUmbralDelRuido(umbral) );
           
    }
//se agrega 6 canciones y las 6 superan
    @Test
    public void TodasLasCancionesSuperanElRuido() {
   PlayList play = new PlayList();
    double [] umbral ={7.0};
    int [] esperado = {6};
 Assertions.assertEquals(esperado, play.cancionesQueSuperanUmbralDelRuido(umbral) );
           
    }
/*   @Test
    public void ruidoNegativo() {
   PlayList play = new PlayList();
   double [] umbral = {-1};
   AssertThrows(Error.class -> () {
    play.cancionesQueSuperanUmbralDelRuido(-1)
   });  
    

*/
//se agrega 6 canciones y ninguna superan
@Test 

public void NingunaCancionSuperaElRuido(){
    PlayList play = new PlayList();
    double [] umbral = {0,0,0,0,0,0};
    int [] esperado = {0};
 Assertions.assertEquals(esperado, play.cancionesQueSuperanUmbralDelRuido(umbral) );
       


}

//se agrega 6 canciones y solo una superan
@Test
public void UnaCancionSuperaElRuido(){
    PlayList play = new PlayList();
    double [] umbral = {1,1,1,1,1,7};
     int [] esperado = {1};
    Assertions.assertEquals(esperado, play.cancionesQueSuperanUmbralDelRuido(umbral) );
       
 
}

}


