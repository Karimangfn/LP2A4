package br.edu.ifsp.spo.lp2a4.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.edu.ifsp.spo.lp2a4.spring.model.Results;
import br.edu.ifsp.spo.lp2a4.spring.model.Coordinates;
import br.edu.ifsp.spo.lp2a4.spring.model.Location;
import br.edu.ifsp.spo.lp2a4.spring.model.Name;
import br.edu.ifsp.spo.lp2a4.spring.model.Picture;
import br.edu.ifsp.spo.lp2a4.spring.service.PessoasService;

@Controller
public class PessoasController {

	@Autowired
	private PessoasService service;
	
	@RequestMapping("/MainPage")
	public ModelAndView MainPage() {
		ModelAndView ModelAndView = new ModelAndView("MainPages/Lista-Pessoas");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		return ModelAndView;
	}
	
	
	@RequestMapping("/MainPage/{id}")
	public @ResponseBody ModelAndView filtrar(@PathVariable Integer id) {
		ModelAndView ModelAndView = new ModelAndView("MainPages/Pessoas-Descricao");

		Results listResultsId = service.buscaId(id);

		ModelAndView.addObject("listResultsId", listResultsId);

		return ModelAndView;	
	}
	
	@RequestMapping("/regionNorte")
	public ModelAndView RegionNortePage() {
		ModelAndView ModelAndView = new ModelAndView("RegionPages/Lista-Pessoas-Norte");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		return ModelAndView;
	}
	
	@RequestMapping("/regionNordeste")
	public ModelAndView RegionNordestePage() {
		ModelAndView ModelAndView = new ModelAndView("RegionPages/Lista-Pessoas-Nordeste");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		return ModelAndView;
	}
	
	@RequestMapping("/regionCentroOeste")
	public ModelAndView RegionCentroOestePage() {
		ModelAndView ModelAndView = new ModelAndView("RegionPages/Lista-Pessoas-CentroOeste");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		return ModelAndView;
	}
	
	@RequestMapping("/regionSudeste")
	public ModelAndView RegionSudestePage() {
		ModelAndView ModelAndView = new ModelAndView("RegionPages/Lista-Pessoas-Sudeste");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		return ModelAndView;
	}
	
	@RequestMapping("/regionSul")
	public ModelAndView RegionSulPage() {
		ModelAndView ModelAndView = new ModelAndView("RegionPages/Lista-Pessoas-Sul");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		return ModelAndView;
	}
	
	@RequestMapping("/UserEspecial")
	public ModelAndView UserEspecialPage() {
		ModelAndView ModelAndView = new ModelAndView("UserPages/Lista-Pessoas-Especial");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();
		List<Coordinates> listcoordinates = service.listAllc();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		ModelAndView.addObject("listcoordinates", listcoordinates);
		return ModelAndView;
	}
	
	@RequestMapping("/UserNormal")
	public ModelAndView UserNormalPage() {
		ModelAndView ModelAndView = new ModelAndView("UserPages/Lista-Pessoas-Normal");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();
		List<Coordinates> listcoordinates = service.listAllc();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		ModelAndView.addObject("listcoordinates", listcoordinates);
		return ModelAndView;
	}
	
	@RequestMapping("/UserTrabalhoso")
	public ModelAndView UserTrabalhosoPage() {
		ModelAndView ModelAndView = new ModelAndView("UserPages/Lista-Pessoas-Trabalhoso");

		List<Results> listResults = service.listAll();
		List<Picture> listpicture = service.listAllp();
		List<Name> listname = service.listAlln();
		List<Location> listlocation = service.listAlll();
		List<Coordinates> listcoordinates = service.listAllc();

		ModelAndView.addObject("listResults", listResults);
		ModelAndView.addObject("listlocation", listlocation);
		ModelAndView.addObject("listpicture", listpicture);
		ModelAndView.addObject("listname", listname);
		ModelAndView.addObject("listcoordinates", listcoordinates);
		return ModelAndView;
	}
}
