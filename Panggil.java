/**
 *
 * @author Asep kurniawan
 */
public class Panggil {
        public static void main (String[] args) {
        JenisReptil rtl = new JenisReptil();
        
        rtl.setMakanan("Daging&serangga");
        System.out.println("Makanan Hewan = " +rtl.getMakanan());
        rtl.setBerkembangbiak("Bertelur");
        System.out.println("Cara berkembangbiak Reptil = " +rtl.getBerkembangbiak());
        rtl.Tmpljenis();
        rtl.Tmplnama();
        rtl.Berjalan("Reptil Berlari = " +"Dengan 4 kaki");
        rtl.Berjalan("Reptil Berjalan = " +"Dengan 4 kaki", " Melata");
    }

    
}