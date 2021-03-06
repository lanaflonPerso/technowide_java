package demo.musique;

import musique.Album;
import musique.Duree;
import musique.Piste;

public class DemoAlbum {

	public static void main(String[] args) {
		
		Album album = new Album("A moon shaped pool");
		album.ajouter(new Piste("Burn The Witch", new Duree(1, 25)));
		album.ajouter(new Piste("Daydreaming", new Duree(3, 07)));
		album.ajouter(new Piste("Decks Dark", new Duree(4, 12)));
		album.ajouter(new Piste("Desert Island Disk", new Duree(3, 53)));
		album.ajouter(new Piste("Ful Stop", new Duree(6, 20)));
		
		System.out.printf("Titre : %1$s (%2$s)\n", album.getTitre(), album.getDuree());
		for(Piste piste : album) {
			System.out.printf("- %1$-20s (%2$s)\n", piste.getTitre(), piste.getDuree());
		}
	}
}
