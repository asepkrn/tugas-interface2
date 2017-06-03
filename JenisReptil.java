/**
 *
 * @author asep kurniawan
 */
public class JenisReptil extends Reptil  {
 
    private String Makanan ;
    private String Berkembangbiak;
   
    public void setMakanan(String mkn){
        this.Makanan=mkn;
    }
    public void setBerkembangbiak(String bk){
        this.Berkembangbiak = bk;        
    }
    public String getMakanan(){
        return this.Makanan;
    }
    public String getBerkembangbiak(){
        return this.Berkembangbiak;
    }    

    
    @Override
    protected void Tmpljenis() {
     super.setjenis("kecil"); 
     System.out.println("Jenis Reptil = " +super.getjenis());
    }

    @Override
    protected void Tmplnama() {
       super.setnama("cicak"); 
     System.out.println("nama Reptil = " +super.getnama());
    }
    public void Berjalan(String jln) {
		System.out.println(jln);
}
    public void Berjalan(String jln1, String jln2) {
		System.out.println(jln1 + jln2);
}

    
}