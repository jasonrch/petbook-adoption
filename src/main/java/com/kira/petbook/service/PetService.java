package com.kira.petbook.service;

import java.util.List;

import com.kira.petbook.models.Pet;

public interface PetService {
	
	/**Creates a new pet given a new object pet.<br>
	 * Should receive a JSON as parameter, <br>
	 * It'll be arranged in the future.<br>
	 * 
	 * @param pet
	 * @return
	 */
	Pet createPet(Pet pet);
	
	/**Gets the first 30 pets on the database. <br>
	 * Should manage to not show null values. <br>
	 * If there are less then 30 pets, should show all pets. <br>
	 * 
	 * @return
	 */
	List<Pet> getFirst30Pets();
	
}
