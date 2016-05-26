package ar.com.softtek.dao.impl;

import java.util.List;

import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.model.Paciente;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PacienteDAOImpl extends HibernateDaoSupport implements PacienteDAO {

	public void addPaciente(Paciente paciente) {
		getHibernateTemplate().save(paciente);

	}

	public List<Paciente> listPaciente() {
		return (List<Paciente>) getHibernateTemplate().find("from Paciente");

	}

}
