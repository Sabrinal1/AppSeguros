package clases;

public abstract class Seguro implements Mostrable {

	private static final String MOSTRAR_PATTERN = "Seguro de %s, cuya descripci�n es %s - detalle: %s, pagar� mensualmente $ %.2f.\n";

	private String descripcion;
	private Asegurado asegurado;

	public Seguro(String descripcion) {
		this.descripcion = descripcion;
	}

	public abstract float obtenerPremio();

	public void establecerAsegurado(Asegurado asegurado) {
		this.asegurado = asegurado;
	}

	@Override
	public void mostrar() {

		System.out.printf(MOSTRAR_PATTERN, getClass().getSimpleName(), this.descripcion, this.texto(),
				this.obtenerPremio());
	}

	protected Asegurado getAsegurado() {
		return asegurado;
	}

	public int obtenerEdadAsegurado() {
		return asegurado.getEdad();
	}

	public boolean tenedorMasculino() {
		return asegurado.esMasculino();
	}

	public boolean tenedorFemenino() {
		return asegurado.esFemenino();
	}
}
