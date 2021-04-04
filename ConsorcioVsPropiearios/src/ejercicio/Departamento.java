package ejercicio;

public class Departamento {
	
	private int numero;
	private String dniPropietario;
	private String nombrePropietario;
	private String voto;
	private boolean votoRealizado;
	
	public Departamento(int numero, String dniPropietario, String nombrePropietario) {
		setNumero(numero);
		setDniPropietario(dniPropietario);
		setNombrePropietario(nombrePropietario);
		setVotoRealizado(false);
		voto = "N";
	}
	
	public int getNumero() {
		return numero;
	}
	
	private void setNumero(int numero) {
		if(numero>=1) {
			this.numero = numero;
		}else {
			this.numero = 1;
		}
	}
	
	public String getDniPropietario() {
		return dniPropietario;
	}
	
	private void setDniPropietario(String dniPropietario) {
		this.dniPropietario = dniPropietario;
	}
	
	public String getNombrePropietario() {
		return nombrePropietario;
	}
	
	private void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}
	
	public String getVoto() {
		return voto;
	}
	
	public boolean setVoto(String voto) {
		boolean cambio = false;
		
		//Verifico si no votó previamente
		if(!haVotado()) {
			this.voto = voto;
			setVotoRealizado(true);
			
			//Cambio en el llamado actual
			cambio = true;
		}
		
		return cambio;
	}
	
	
	public boolean haVotado() {
		return votoRealizado;
	}
	
	private void setVotoRealizado(boolean votoRealizado) {
		this.votoRealizado = votoRealizado;
	}

	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", dniPropietario=" + dniPropietario + ", nombrePropietario="
				+ nombrePropietario + ", voto=" + voto + ", votoRealizado=" + votoRealizado + "]";
	}
	
	
	
}
