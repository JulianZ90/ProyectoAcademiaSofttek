package ar.com.softtek.bo.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import ar.com.softtek.bo.PacienteBo;
import ar.com.softtek.dao.PacienteDAO;
import ar.com.softtek.model.Paciente;
import ar.com.softtek.dto.NuevoAfiliadoDto;

public class PacienteBoImpl implements PacienteBo {

	PacienteDAO pacienteDAO;
	private  ArrayList<Paciente> pacientes;
	private static final long serialVersionUID = 1L;
	private static final Logger log = LogManager.getLogger("Paciente BOIMPL");
	


	private Paciente mapeo(NuevoAfiliadoDto pacienteDto) {
		
		Paciente paciente = new Paciente();
		int telefono = Integer.parseInt(pacienteDto.getTelefono());
		paciente.setNombre(pacienteDto.getNombre());
		paciente.setApellido(pacienteDto.getApellido());
		paciente.setDni(pacienteDto.getDni());
		paciente.setTipoDni(pacienteDto.getTipoDni());
		paciente.setTelefono(telefono);
		paciente.setMail(pacienteDto.getMail());
		paciente.setFecNac(pacienteDto.getFecNac());
		paciente.setSexo(pacienteDto.getSexo());
		paciente.setEstadoCivil(pacienteDto.getEstadoCivil());
		paciente.setDireccion(pacienteDto.getDireccion());
		paciente.setFamiliaresACargo(pacienteDto.getCantHijos());
		paciente.setPlanMedico(pacienteDto.getPlanMedico().getDescripcion());
				
		return paciente;
	}

	public PacienteDAO getPacienteDAO() {
		return pacienteDAO;
	}

	public void setPacienteDAO(PacienteDAO pacienteDAO) {
		this.pacienteDAO = pacienteDAO;
	}

	public ArrayList<Paciente> getPacientes() {
		return pacientes;
	}

	public void setPacientes(ArrayList<Paciente> pacientes) {
		this.pacientes = pacientes;
	}

	public void addPaciente(NuevoAfiliadoDto pacienteDto) {
		
		
		try {
			Paciente paciente = this.mapeo(pacienteDto);
			this.pacienteDAO.addPaciente(paciente);
//			this.pacientes.add(paciente);
		} catch (Exception e) {
			log.error("Error al tratar de hacer addPaciente "+ e.getMessage());
			// TODO: handle exception
		}
		
		
	}

	public List<Paciente> listPaciente() {
		return pacienteDAO.findAll();
	}
	
	
	public void deletePaciente(NuevoAfiliadoDto pacienteDto) {
	    	
	    	Paciente paciente = this.mapeo(pacienteDto);		
			this.pacienteDAO.deletePaciente(paciente);
	    }
	
	
	
}
