package representation;

public class Representant {

	private final int numero;
	private final String nom;
	private final String prenom;
	private String adresse;
	private float salaireFixe;
        private float CAMensuel;
        private ZoneGeographique secteur;

	public Representant(int numero, String nom, String prenom, ZoneGeographique secteur) {
		this.numero = numero;
		this.nom = nom;
		this.prenom = prenom;
                this.secteur = secteur;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public float getSalaireFixe() {
		return this.salaireFixe;
	}

	public void setSalaireFixe(float salaireFixe) {
		this.salaireFixe = salaireFixe;
	}
        
        public float getCAMensuel() {
		return this.CAMensuel;
	}

	public void setCAMensuel(float CAMensuel) {
		this.CAMensuel = CAMensuel;
	}

	public ZoneGeographique getSecteur() {
            return this.secteur;
		// TODO: Implémenter cette méthode
		//throw new UnsupportedOperationException("Pas encore implémenté");
	}

	public void setSecteur(ZoneGeographique secteur) {
            this.secteur = secteur;
		// TODO: Implémenter cette méthode
		//throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * Enregistre le CA de ce représentant pour un mois donné. 
	 * @param mois le numéro du mois (de 0 à 11)
	 * @param montant le CA réalisé pour ce mois (positif ou nul)
	 **/
	public void enregistrerCA(int mois, float montant) {
		// vérifier les paramètres
		if (mois < 0 || mois > 11) {
			throw new IllegalArgumentException("Le mois doit être compris entre 0 et 11");
		}
		if (montant < 0) {
			throw new IllegalArgumentException("Le montant doit être positif ou null");
		}
                
                setCAMensuel(montant);
                
		// TODO: Implémenter cette méthode
		//throw new UnsupportedOperationException("Pas encore implémenté");
	}

	/**
	 * Calcule le salaire mensuel de ce répresentant pour un mois donné
	 * @param mois le numéro du mois (de 0 à 11)
	 * @param pourcentage le pourcentage (>= 0 ) à appliquer sur le CA réalisé pour ce mois
	 * @return le salaire pour ce mois, tenant compte du salaire fixe, de l'indemnité repas, et du pourcentage sur CA
	 */
	public float salaireMensuel(int mois, float pourcentage) {
            return this.salaireFixe + this.secteur.getIndemniteRepas() + (pourcentage * this.getCAMensuel());
		// TODO: Implémenter cette méthode
		//throw new UnsupportedOperationException("Pas encore implémenté");
	}

	@Override
	public String toString() {
		return "Representant{" + "numero=" + this.numero + ", nom=" + this.nom + ", prenom=" + this.prenom + '}';
	}

}
