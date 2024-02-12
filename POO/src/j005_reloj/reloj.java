package j005_reloj;

public class reloj {

	String marca;
	Boolean digital;
	double precio;
	String digital1;

	public reloj() {

		marca = "Casio";
		digital = true;
		precio = 50.0;

		if (digital == true) {
			digital1 = "es digital";
		} else {
			digital1 = "no es digital";
		}
	}

}
