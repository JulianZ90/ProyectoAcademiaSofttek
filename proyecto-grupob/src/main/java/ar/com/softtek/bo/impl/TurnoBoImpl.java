package ar.com.softtek.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import ar.com.softtek.bo.TurnoBo;
import ar.com.softtek.dao.TurnoDAO;
import ar.com.softtek.dto.TurnoDto;
import ar.com.softtek.model.Turno;

public class TurnoBoImpl implements TurnoBo {
	
	private TurnoDAO turnoDAO;
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("TurnoBOIMPL");




	public TurnoDAO getTurnoDAO() {
		return turnoDAO;
	}


	public void setTurnoDAO(TurnoDAO turnoDAO) {
		this.turnoDAO = turnoDAO;
	}


private TurnoDto mapeoADto(Turno turno){
		
		TurnoDto turnoDto = new TurnoDto();
		turnoDto.setIdTurno(turno.getIdTurno());
		turnoDto.setNombre(turno.getNombre());
		turnoDto.setApellido(turno.getApellido());
		turnoDto.setPlanMedico(turno.getPlanMedico());
		turnoDto.setFechaTurno(turno.getFechaTurno());
		turnoDto.setHoraTurno(turno.getHoraTurno());
		turnoDto.setFechaLlegada(turno.getFechaLlegada());
		turnoDto.setHoraLlegada(turno.getHoraLlegada());
		turnoDto.setFechaAtencion(turno.getFechaAtencion());
		turnoDto.setHoraAtencion(turno.getHoraAtencion());
		turnoDto.setImporte(turno.getImporte());
		turnoDto.setObservaciones(turno.getObservaciones());
		return turnoDto;
	}
	
	
    public List<TurnoDto> getTurnosByIdPaciente(int idPaciente) {
		
		List<Turno> turnos = new ArrayList<Turno>();
		List<TurnoDto> turnosDto = new ArrayList<TurnoDto>();
		
		turnos = this.turnoDAO.findTurnosByIdPaciente(idPaciente);
		
		for (Turno turno: turnos) {
			
			turnosDto.add(this.mapeoADto(turno));
		}
		
		return turnosDto;
	}
    
    
    public void addTurno(TurnoDto turnoDto) {
    	
    }
}
