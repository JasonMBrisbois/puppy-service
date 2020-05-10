package com.jessicabrisbois.puppyservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Collection;
import java.util.Random;

@RepositoryRestResource(collectionResourceRel = "puppies", path = "puppies")
public interface PuppyRepository extends JpaRepository<Puppy, Integer> {

    @Query(value = "SELECT link FROM Puppy ORDER BY RAND() LIMIT 1", nativeQuery = true)
    String getPuppy();
    //ORDER BY RAND() LIMIT 1
    //@Query(value = "INSERT INTO Puppy (link) VALUE (?),", nativeQuery = true)
    //void insertPuppy(String the_link);
}

