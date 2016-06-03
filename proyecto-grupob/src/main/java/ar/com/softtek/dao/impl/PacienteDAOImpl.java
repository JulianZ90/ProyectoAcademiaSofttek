package ar.com.softtek.dao.impl;

import java.util.HashMap;
import java.util.List;

import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.model.Paciente;
import ar.com.softtek.model.Turno;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Query;
import org.hibernate.Session;
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
			log.error("Error al intentar hacer el save" + e.getMessage());
		}
		return -1;

	}

    
	public void deletePaciente(Paciente paciente) {
		
		Session session = super.getSession();
		Query query = session.getNamedQuery("bajaPaciente");
        query.setParameter("dni", paciente.getDni());
	}

	public void updatePaciente(Paciente paciente) {
		super.getHibernateTemplate().update(paciente);
	}
	
	

	public List<Paciente> buscarPorValor(String valorBuscado, String tipodato) {
		
		HashMap<String, String> mapito = new HashMap<String,String>();
			mapito.put("documento", "dni");
			mapito.put("paciente", "idPaciente");
			mapito.put("plan", "planMedico");
			mapito.put("apenom","NyAp");

		HashMap<String,Object> convertTo = new HashMap<String,Object>();
			
			try {
				convertTo.put("documento", Integer.parseInt(valorBuscado));
				convertTo.put("paciente",Integer.parseInt(valorBuscado) );
				convertTo.put("plan", Integer.parseInt(valorBuscado));
			} catch (NumberFormatException e) {
				convertTo.put("apenom", valorBuscado);
			}
			
		
		List<Paciente> ps ;	
			
		DetachedCriteria crit = DetachedCriteria.forClass(Paciente.class);
		crit.add(Restrictions.eq(mapito.get(tipodato),convertTo.get(tipodato)));
		ps = (List<Paciente>) getHibernateTemplate().findByCriteria(crit);
		return ps;
	}


}

