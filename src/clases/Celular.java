package clases;

public class Celular extends Seguro {

	private static final String DESCRIPCION_CELULAR = "Seguro de robo de celular";
	private static final String PATRON_TEXTO_CEL = "Marca: %s - Modelo: %Ss - Valor Asegurado: %.2f";

	private static final float INDICE_PREMIO = 0.0025f;

	private String modelo;
	private String marca;
	private float valorAsegurado;

	public Celular(float valorAsegurado, String marca, String modelo) {
		super(DESCRIPCION_CELULAR);
		this.valorAsegurado = valorAsegurado;
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public float obtenerPremio() {

		return valorAsegurado * INDICE_PREMIO;
	}

	@Override
	public String texto() {
		return String.format(PATRON_TEXTO_CEL, this.marca, this.modelo, this.valorAsegurado);
	}

}
