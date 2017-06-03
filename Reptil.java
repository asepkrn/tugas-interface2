/**
 *
 * @author asep kurniawan
 */

public abstract class Reptil implements ReptilIntfarce {
    
    protected String jenis;
    protected String nama;
	
    protected String getjenis() {
        return this.jenis;
        
    }
    
    protected String getnama () {
        return this.nama;
        
    }
    public void setjenis(String jenis) {
      this.jenis= jenis;  
        
    }
    
    public void setnama(String nama) {
        this.nama=nama;
    }
    
    protected abstract void Tmpljenis();
    protected abstract void Tmplnama();
    
	
}