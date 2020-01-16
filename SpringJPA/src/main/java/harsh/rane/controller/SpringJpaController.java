package harsh.rane.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import harsh.rane.dao.ElementRepository;
import harsh.rane.model.Element;

@RestController
public class SpringJpaController {
	@Autowired
	ElementRepository elementrepository;

	@GetMapping
	public void getElementDetails(@RequestParam(name = "id") Long ElementId,
			@RequestParam(name = "name") String ElementName) {
		elementrepository.findOne(ElementName);
		elementrepository.findOne(ElementId);
	}

	@PostMapping
	public void postElementDetails(@RequestBody Element element) {

	}

	@PutMapping("put")
	public void putElementDetails(@RequestBody Element element) {

	}

	@DeleteMapping
	public void DeleteElementDetails(@RequestParam(name = "id") Long ElementId) {

	}
}
