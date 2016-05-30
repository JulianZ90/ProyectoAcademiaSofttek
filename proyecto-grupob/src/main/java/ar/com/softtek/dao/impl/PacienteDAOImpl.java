package ar.com.softtek.dao.impl;

import java.util.List;

import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.model.Paciente;


import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PacienteDAOImpl extends HibernateDaoSupport implements PacienteDAO {
	
	
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
		super.getHibernateTemplate().save(paciente);
		return paciente.getId();
	}

	public void deletePaciente(Paciente paciente) {
		super.getHibernateTemplate().delete(paciente);

	}

	public void updatePaciente(Paciente paciente) {
		super.getHibernateTemplate().update(paciente);
	}


	
}
