
package programkendaraan;

public class ProgramKendaraan {

 
    public static void main(String[] args) {
     
         Kendaraan kd = new Kendaraan();
        
        Mobil mb = new Mobil();
        Sepeda sp = new Sepeda();
        
        kd.Bergerak();
        mb.Bergerak();
        sp.Bergerak();
    }
  }
