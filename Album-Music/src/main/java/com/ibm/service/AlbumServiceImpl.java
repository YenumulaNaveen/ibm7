package com.ibm.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.entity.Album;
import com.ibm.repo.AlbumRepo;
@Service
public class AlbumServiceImpl implements AlbumService{
	
	@Autowired
	private AlbumRepo repo;
	@Override
	public String save(Album a) {
		repo.save(a);
		return a.getTitle();
	}
	@Override
	public Album fetch(String title) {
		return(Album) repo.findById(title).get();
	}
	@Override
	public List<Album> list() {
		return repo.findAll();
	}
	@Override
	public List<Album> byArtist(String artist) {
		return repo.findByArtist(artist);
	}
	@Override
	public List<Album> byGenre(String genre) {
		return repo.findByGenre(genre);
	}
	
}