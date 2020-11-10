package representation;

public class ZoneGeographique {
	
	private final int numero;
	
	private final String nom;
	
	private float indemniteRepas;

	public ZoneGeographique(int numero, String nom) {
		this.numero = numero;
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "ZoneGeographique{" + "numero=" + this.numero + ", nom=" + this.nom + ", indemniteRepas=" + this.indemniteRepas + '}';
	}
		
	
	public int getNumero() {
		return this.numero;
	}

	public String getNom() {
		return this.nom;
	}

	public float getIndemniteRepas() {
		return this.indemniteRepas;
	}

	public void setIndemniteRepas(float indemniteRepas) {
		this.indemniteRepas = indemniteRepas;
	}
	
	
	
}
