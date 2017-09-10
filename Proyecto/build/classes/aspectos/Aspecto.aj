package aspectos;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Aspecto {

	@Before("execution(* view.Crear.btnCrearActionPerformed(java.awt.event.ActionEvent))")
	public void antesGuardar() {
		System.out.println("Antes de crear");
	}

	@Around("execution(* view.Crear.btnCrearActionPerformed(java.awt.event.ActionEvent))")
	public void antesDespuesGuardar() {
		System.out.println("ANTES Y DESPUES");
	}

	@After("execution(* view.Crear.btnCrearActionPerformed(java.awt.event.ActionEvent))")
	public void despuesGuardar() {
		System.out.println("Despues de crear");
	}
}
