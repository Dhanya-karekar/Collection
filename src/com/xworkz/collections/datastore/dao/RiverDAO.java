package com.xworkz.collections.datastore.dao;

import com.xworkz.collections.dto.RiverDTO;

public interface RiverDAO {
	boolean save(RiverDTO dto);

	int totalItems();

	void update(RiverDTO dto);

	boolean delete(RiverDTO dto);

}
