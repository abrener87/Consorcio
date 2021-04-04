package ejercicio;

public class Test {

	static final String VOTO_POSITIVO = "S";
	static final String VOTO_NEGATIVO = "N";
	
	public static void main(String[] args) {
		
		Edificio elEdificio = new Edificio("Yatay 240", 3);
		
		//-------- CONSTRUCCIÓN DEL EDIFICIO -------------//
		
		System.out.println("INTENTO AGREGAR EL DEPARTAMENTO 1");
		System.out.println(elEdificio.agregarDepartamento(new Departamento(1, "12345", "Lo Castro")));
		
		System.out.println("INTENTO AGREGAR NUEVAMENTE EL DEPARTAMENTO 1");
		System.out.println(elEdificio.agregarDepartamento(new Departamento(1, "99999", "Escandarani")));
		
		System.out.println("INTENTO AGREGAR DEPARTAMENTOS 2 Y 3");
		
		System.out.println(elEdificio.agregarDepartamento(new Departamento(3, "22222", "Goldberg")));
		System.out.println(elEdificio.agregarDepartamento(new Departamento(2, "33333", "Binker")));
		
		System.out.println("INTENTO AGREGAR AL DEPARTAMENTO 10");
		System.out.println(elEdificio.agregarDepartamento(new Departamento(10, "44444", "ENCARGADO")));
		
		
		//-------- ASIGNACIÓN DE VOTOS -------------//

		System.out.println("ASIGNO EL VOTO DEL DEPARTAMENTO 1");
		
		System.out.println(elEdificio.actualizarVoto(1, VOTO_POSITIVO));

		System.out.println("INTENTO HACER QUE VOTE NUEVAMENTE EL DEPARTAMENTO 1");
		
		System.out.println(elEdificio.actualizarVoto(1, VOTO_NEGATIVO));
		
		System.out.println("INTENTO HACER QUE VOTE EL DEPARTAMENTO 10");

		System.out.println(elEdificio.actualizarVoto(10, VOTO_NEGATIVO));

		
		//-------- RESULTADOS FINALES -------------//
		
		System.out.println("RESULTADOS FINALES");

		elEdificio.listarVotosPositivos();
		System.out.println(elEdificio.calcularPorcentaje());

	}

}
