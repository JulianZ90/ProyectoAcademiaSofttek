package ar.com.softtek.dao.impl;

import java.util.List;

import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.dto.BusquedaAfiliadoDto;
import ar.com.softtek.model.Paciente;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class PacienteDAOImpl extends HibernateDaoSupport implements PacienteDAO {
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("PacienteDAOIMPL ");
	
	private Paciente paciente;
	

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}


	public List<Paciente> findAll() {
		String queryString = "FROM PACIENTE";
		return (List<Paciente>) super.getHibernateTemplate().find(queryString);
	}

	public Paciente findById(Long id) {
		
		Paciente paciente = (Paciente) super.getHibernateTemplate().load(Paciente.class, id);
		return paciente;
	}

	public List<Paciente> findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	public long addPaciente(Paciente paciente) {

		try {
			super.getHibernateTemplate().save(paciente);
			return paciente.getIdPaciente();
		} catch (Exception e) {
			log.error("Error al intentar hace el save"+e.getMessage());
		}
	return -1;
	
	}

	public void deletePaciente(Paciente paciente) {
		super.getHibernateTemplate().delete(paciente);

	}

	public void updatePaciente(Paciente paciente) {
		super.getHibernateTemplate().update(paciente);
	}
	
	
	public Paciente buscarPorValor(int valorBuscado,String tipodato){
		DetachedCriteria crit = DetachedCriteria.forClass(Paciente.class);
			switch(tipodato){
				case "documento": crit.add(Restrictions.eq("dni", valorBuscado));
				case "paciente": crit.add(Restrictions.eq("idPaciente", valorBuscado));
				case "plan": crit.add(Restrictions.eq("planMedico", valorBuscado));
			}	
	return (Paciente) getHibernateTemplate().findByCriteria(crit).get(0);
	}
	
}







//case "apenom": {
//String[] splitted  = String.valueOf(valorBuscado).split("\\s+");
//Criterion nombreCriteria = Restrictions.eq("nombre", splitted[0]);
//Criterion apellidoCriteria = Restrictions.eq("apellido", splitted[1]);
//crit.add(nombreCriteria).add(apellidoCriteria);
//}