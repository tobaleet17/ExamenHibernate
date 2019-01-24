
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Session;


public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session = HibernateUtilities.getSessionFactory().openSession();
		
		insertar(session);
		obtener(session);
		
		session.close();
		HibernateUtilities.getSessionFactory().close();
	}
	
	

private static void insertar(Session session) {
		
		java.util.Date utilDate = new java.util.Date();
		
		session.beginTransaction();
		
		Festival f1 = new Festival();
		Festival f2 = new Festival();
		f1.setNombre("pepe");
		f1.setLugar("Catarroja");
		f1.setFecha(new java.sql.Date(utilDate.getTime()));
		f2.setNombre("Ana");
		f2.setLugar("Picassent");
		f2.setFecha(new java.sql.Date(utilDate.getTime()));
		
		Actuacion a1 = new Actuacion("12", "Nuevo");
		Actuacion a2 = new Actuacion("25","Viejo");
		
		Grupo g1 = new Grupo("ACDC","ROCK",5);
		Grupo g2 = new Grupo("La trompeta","NEW",5);
		
		session.save(f1);
		session.save(f2);
		session.save(a1);
		session.save(a2);
		session.save(g2);
		session.save(g1);
		
		session.getTransaction().commit();
		
		
	}
private static void obtener(Session session) {
	
	
	
	session.beginTransaction();
	
	
	Festival f = session.get(Festival.class, "pepe");
	Actuacion a = session.get(Actuacion.class, "12");
	Grupo g = session.get(Grupo.class, "ACDC");
	
	System.out.println("Festival recuperado : " +f.getLugar().toString()+" con nombre "+f.getNombre().toString());
	System.out.println("Actuacion recuperada con escenario : "+a.getEscenario().toString());
	System.out.println("Grupo con el estilo : "+g.getEstilo().toString()+ " y miembros "+g.getNumMiembros());
	session.getTransaction().commit();
	
	
	
}
//private static void update(Session session) {
	
	//session.beginTransaction();
	
	
	
	
	
	//session.getTransaction().commit();
	
	
//}

}
