package es.deusto.prog3.cap00.ejerciciosResueltos.edicionSprites;

import javax.swing.UIManager;  // Para usar look and feels distintos al est�ndar

/** Clase principal de edici�n de sprites<br/>
 * Enlace a un zip con gr�ficos para sprites de ejemplo:
 * <a href="https://drive.google.com/file/d/1UhqJT1zh_aYzcCgKa_6eRUdQvnqP8k0v/view?usp=sharing">link a fichero comprimido</a>
 * @author andoni.eguiluz @ ingenieria.deusto.es
 */
public class MainEdicionSprites {

	/** M�todo principal, crea una ventana de edici�n y la lanza 
	 * @param args
	 */
	public static void main(String[] args) {
		try { // Cambiamos el look and feel (se tiene que hacer antes de crear la GUI
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) { } // Si Nimbus no est� disponible, se usa el l&f por defecto
		VentanaEdicionSprites v = new VentanaEdicionSprites();
		v.setVisible( true );
	}

}
