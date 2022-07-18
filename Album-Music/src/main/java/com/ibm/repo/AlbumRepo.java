package com.ibm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.entity.Album;
public interface AlbumRepo extends JpaRepository<Album,String>
{
	List<Album> findByArtist(String artist);
    //List<Flight> findBySourceAndDestination(String source, String destination);
	
	//@Query("From Flight WHERE source=:src AND destination=:dest")
	List<Album>findByGenre(String genre);

}