package com.ibm.service;

import java.util.List;

import com.ibm.entity.Album;

public interface AlbumService{

	String save(Album a);
	
	Album fetch(String title);
	
	List<Album> list();
	
//	boolean remove(int code);
//	boolean update(Album a);
	
	List<Album> byArtist(String artist);

	List<Album> byGenre(String genre);
	
	
}