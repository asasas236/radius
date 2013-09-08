package com.telnet.radius.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.telnet.radius.mapper.ManagerMapper;
import com.telnet.radius.mapper.NasMapper;
import com.telnet.radius.mapper.ServiceMapper;
import com.telnet.radius.model.Manager;
import com.telnet.radius.model.Nas;

@Service
public class PlanService{

	private ServiceMapper serviceMapper;
	private ManagerMapper managerMapper;
	private NasMapper nasMapper;
	
	public PlanService(){
		
	}

	@Autowired
	public PlanService(ServiceMapper serviceMapper,
			ManagerMapper managerMapper, NasMapper nasMapper) {
		this.serviceMapper = serviceMapper;
		this.managerMapper = managerMapper;
		this.nasMapper = nasMapper;
	}

	@Transactional
	public List<com.telnet.radius.model.Service> planList()
			throws DataAccessException {
		return serviceMapper.queryServices();
	}

	@Transactional
	public List<Manager> mangaerList() throws DataAccessException {
		return this.managerMapper.queryManagerList();
	}

	@Transactional
	public List<Nas> nasList() throws DataAccessException {
		return this.nasMapper.queryAll();
	}

	@Transactional
	public com.telnet.radius.model.Service findServiceById(int srvid)
			throws DataAccessException {
		return this.serviceMapper.queryServiceById(srvid);
	}

	@Transactional
	public void createPlan(com.telnet.radius.model.Service service)
			throws DataAccessException {
		serviceMapper.insertService(service);
		if (service.getNasidArray() != null) {
			for (Integer nasid : service.getNasidArray()) {
				serviceMapper.insertAllowednases(service.getSrvid(), nasid);
			}
		}
		if (service.getManagernameArray() != null) {
			for (String managername : service.getManagernameArray()) {
				serviceMapper.insertAllowedmanagers(service.getSrvid(), managername);
			}
		}
	}

	@Transactional
	public void updatePlan(com.telnet.radius.model.Service service)
			throws DataAccessException {
		this.serviceMapper.updateService(service);
		this.serviceMapper.deleteNases(service.getSrvid());
		this.serviceMapper.deleteManagers(service.getSrvid());
		if (service.getNasidArray() != null) {
			for (Integer nasid : service.getNasidArray()) {
				serviceMapper.insertAllowednases(service.getSrvid(), nasid);
			}
		}
		if (service.getManagernameArray() != null) {
			for (String managername : service.getManagernameArray()) {
				serviceMapper.insertAllowedmanagers(service.getSrvid(), managername);
			}
		}
	}

}
