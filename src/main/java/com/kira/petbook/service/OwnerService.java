package com.kira.petbook.service;

import java.util.List;

import com.kira.petbook.models.Owner;

public interface OwnerService {

	/**Creates a new owner given a new object owner.<br>
	 * Should receive a JSON as parameter, <br>
	 * It'll be arranged in the future.<br>
	 * @param owner
	 * @return
	 */
	Owner createOwner(Owner owner);
	
	/**Search for an owner with the given name.<br><br>
	 * Returns Owner if found.<br>
	 * Returns null if not found.<br>
	 * Returns Exception if null parameter is passed.<br>
	 * 
	 * @return
	 */
	List<Owner> getOwnerByName();
}
