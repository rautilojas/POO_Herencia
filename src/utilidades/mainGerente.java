package utilidades;
import entidades.Gerente;

public class mainGerente {

	public static void main(String[] args) {
		
		Gerente gerente1 = new Gerente("Alejandro", "Jacquet", "1428", "Calle 123", 250000.0, 324, 750000.0);
        System.out.println(gerente1.toString());

	}

}