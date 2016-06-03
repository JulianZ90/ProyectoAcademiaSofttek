package ar.com.softtek.dao.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import ar.com.softtek.dao.TurnoDAO;
import ar.com.softtek.model.Turno;

public class TurnoDAOImpl extends HibernateDaoSupport implements TurnoDAO {

	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("TurnoDAOIMPL ");
	
	
	
	@Override
	public void addTurno(Turno turno) {
		
		try {
			super.getHibernateTemplate().save(turno);

		} catch (Exception e) {
			log.error("Error al intentar hacer el save" + e.getMessage());
		}
	}
	
	@Override
	public List<Turno> findTurnosByIdPaciente(int idPaciente) {
		
		List<Turno> turnos = new ArrayList<Turno>();
		Session session = super.getSession();
		Criteria criteria = session.createCriteria(Turno.class);
		criteria.add(Restrictions.eq("idPaciente", idPaciente));
		turnos = (List<Turno>) criteria.list();
		return turnos;
	}
}
