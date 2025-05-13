package clases;

public class Auto extends Seguro {

	private static final String DESCRIPCION_AUTO = "Seguro de automotor todo riesgo";
	private static final String PATRON_TEXTO_AUTO = "Marca: %s - Modelo: %s - Valor Asegurado: %.2f";

	private static final float INDICE_PREMIO = 0.0015f;

	private String modelo;
	private MarcaAuto marca;
	private float valorAsegurado;

	public Auto(float valorAsegurado, MarcaAuto marca, String modelo) {
		super(DESCRIPCION_AUTO);
		this.valorAsegurado = valorAsegurado;
		this.marca = marca;
		this.modelo = modelo;
	}

	@Override
	public float obtenerPremio() {

		return valorAsegurado * INDICE_PREMIO * marca.getIndiceMarca();
	}

	@Override
	public String texto() {
		return String.format(PATRON_TEXTO_AUTO, this.marca, this.modelo, this.valorAsegurado);
	}

}
