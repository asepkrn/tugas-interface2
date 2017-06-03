/**
 *
 * @author Asep kurniawan
 */
public class Mahasiswa {
	public String nama="asep";
	
	public void kuliah () {
		System.out.println ("kuliah");
		}
		
		public static void main	(String[] args){
			Mahasiswa asep= new Mahasiswa();
			
			System.out.println(asep.nama);
			asep.kuliah();
			
		}}