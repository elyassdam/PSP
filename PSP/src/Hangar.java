
public class Hangar  {

	private String nombre;
	private Avion avion;
long timeStamp;
	

	public Hangar(String nombre, Avion avion, long timeStamp) {
		super();
		this.nombre = nombre;
		this.avion = avion;
		this.timeStamp = timeStamp;
	}

	public Hangar(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	


	}



