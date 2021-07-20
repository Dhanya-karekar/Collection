package com.xworkz.collections.highwaydao;

import java.util.Collection;

import com.xworkz.collections.highwayType.HighWayType;
import com.xworkz.collections.highwaydto.HighWayDTO;

public interface HighWayDAO {

	boolean save (HighWayDTO dto);
	Collection<HighWayDTO> findAll();
	Collection<HighWayDTO> findAllNumber();
	int totalItems();
	Collection<HighWayDTO> findbyHighWayType(HighWayType type);
	Collection<HighWayDTO> findbyStateName(String sname);
	Collection<Integer> findNumberbyStateName(String sname);
	boolean exist(HighWayDTO dto);
	boolean isCondition(int number);
	double findLengthByNumber(int no);
	HighWayDTO findByMaxLength();
	HighWayDTO findByMinLength();

}

