package consorcioVs;

import java.util.ArrayList;

public class Edificio {
	
	private ArrayList<Departamento> departamentos;
	private String direccion;
	private int cantidadDepartamentos;
	
	public Edificio(String direccion, int cantidadDepartamentos) {
		departamentos = new ArrayList<>();
		setCantidadDepartamentos(cantidadDepartamentos);
		setDireccion(direccion);
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public int getCantidadDepartamentos() {
		return cantidadDepartamentos;
	}
	
	private void setCantidadDepartamentos(int cantidadDepartamentos) {
		this.cantidadDepartamentos = cantidadDepartamentos;
	}
	
	private boolean esNumeroValido(int numero) {
		return numero <= cantidadDepartamentos;
	}
	
	public boolean agregarDepartamento(Departamento departamentoAAgregar) {
		boolean pudeAgregar = false;
		
		//1. Pregunto si el departamento que quieren agregar tiene un número válido
		if(esNumeroValido(departamentoAAgregar.getNumero())) {
			
			//2. Buscar a ver si NO existe el departamento (llamado a buscar)
			if(buscarDepartamento(departamentoAAgregar.getNumero()) == null) {
				
				//No hay un departamento con ese número, por lo tanto, AGREGO.
				departamentos.add(departamentoAAgregar);
				
				pudeAgregar = true;
				
			}
			
		}
	
		return pudeAgregar;
	}
	
	private Departamento buscarDepartamento(int numero) {
		
		Departamento departamentoABuscar = null;
		int i = 0;
		
		while(departamentoABuscar == null && i < departamentos.size())
		{
			//Pregunto si el departamento que estoy viendo es el buscado
			
			if(departamentos.get(i).getNumero() == numero) {
				
				//Encontré al departamento
				departamentoABuscar = departamentos.get(i);
				
			}else {
				
				//No lo encuentro, entonces me sigo moviendo en el Array
				i++;
			}
			
		}
		
		return departamentoABuscar;
		
	}
	
	public boolean actualizarVoto(int numero, String voto) {
		
		boolean pudeActualizar = false;
	
		//Me guardo la referencia de la búsqueda del departamento en un objeto.
		
		Departamento departamento;
		departamento = buscarDepartamento(numero);
		
		//Chequeo si existe la unidad en el Array

		if(departamento != null) {
			
			//Actualizar el voto de un departamento
			
			pudeActualizar = departamento.setVoto(voto);
			
		}
		return pudeActualizar;
	}
	
	public void listarTodos() {
		
		if(departamentos.size() > 0) {
			
			System.out.println("LISTADO DE DEPARTAMENTOS: ");
			
			for (Departamento departamento : departamentos) {
				System.out.println(departamento);
			}
			
		}
		else {
			System.out.println("NO SE AGREGARON DEPARTAMENTOS!!");
		}
		
	}
	
	public void listarVotosPositivos() {
		
		if(departamentos.size() > 0) {
			
			System.out.println("LISTADO DE DEPARTAMENTOS QUE VOTARON CHAU ENCARGADO: ");
			
			for (Departamento departamento : departamentos) {
				
				if(departamento.getVoto().equals("S")) {
					
					System.out.println(departamento);
				}
				
			}
			
		}
		else {
			System.out.println("NO SE AGREGARON DEPARTAMENTOS!!");
		}
		
	}
	
	public double calcularPorcentaje() {
		double porcentaje = 0;
		
		int contador = 0; 
		
		for (Departamento departamento : departamentos) {
			
			if(departamento.haVotado()) {
				contador++;
			}
			
		}
		if(departamentos.size()>0) {
			porcentaje = (double) (contador * 100) / departamentos.size();
		}
		
		return porcentaje;
	}
	
	
	
	
}
