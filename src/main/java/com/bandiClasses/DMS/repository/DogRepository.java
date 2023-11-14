/**
 * 
 */
package com.bandiClasses.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.bandiClasses.DMS.Models.Dog;

/**
 * @author Pravallika Mummadi
 * Nov 11, 2023
 */
public interface DogRepository extends CrudRepository<Dog,Integer>{


/**
 * @param name
 * @return
 */
List<Dog> findByName(String name);
	
}
