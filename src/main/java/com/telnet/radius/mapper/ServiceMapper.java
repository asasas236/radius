package com.telnet.radius.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.telnet.radius.model.Changesrv;
import com.telnet.radius.model.Service;

public interface ServiceMapper {
	
	public List<Service> queryServices() throws DataAccessException;
	public Service queryServiceById(int srvid) throws DataAccessException;
	public Changesrv queryIsExistChangesrv(String username) throws DataAccessException;
	
	
	public void insertChangesrv(Changesrv csrv) throws DataAccessException;
	public void insertService(Service service) throws DataAccessException;
	
	public void insertAllowednases(int srvid, int nasid) throws DataAccessException;
	public void insertAllowedmanagers(int srvid, String managername) throws DataAccessException;
	
	public void updateService(Service service) throws DataAccessException;
	public void deleteNases(int srvid) throws DataAccessException;
	public void deleteManagers(int srvid) throws DataAccessException;
}
