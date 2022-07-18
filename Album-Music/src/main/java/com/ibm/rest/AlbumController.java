package com.ibm.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ibm.entity.Album;
import com.ibm.service.AlbumService;

@RestController
public class AlbumController {
	
	@Autowired
	private AlbumService s;

	@PostMapping(value = "/add", consumes = "application/json")
	public String save(@RequestBody Album a) {
		String title = s.save(a);
		return "Album added with title:" + title;
	}

	@GetMapping(value = "/get/{title}", produces = "application/json")
	public Album fetch(String title) {
		return s.fetch(title);
	}

	@GetMapping(value = "/list", produces = "application/json")
	public List<Album> list() {
		return s.list();
	}

	@GetMapping(value = "/findR/{Artist}")
	public String byArtist(@PathVariable String Artist) {
		return "music finded by Artist"+Artist;
	}
	
	@GetMapping(value = "/findG/{genre}")
	public String byGenre(@RequestBody Album a) {
		return "music finded by Genre";
	}
}