package it.gestrap.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.gestrap.springmvc.service.ClientiServiceImpl;
import it.gestrap.entita.Clienti;
import it.gestrap.springmvc.service.ClientiService;

@Controller
public class HomeController {

	 @Autowired
	    private ClientiService service;
	 
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		return "index";
	}
	
	 @GetMapping("/delete")
	    public String delete(@RequestParam("idClienti") int theId) {
		 service.delete(theId);
	        return "redirect:/index";
	    }
	 
	 @GetMapping("/insert")
	    public String insert(
	    		@RequestParam("codice") String codice,
	    		@RequestParam("nome") String nome,
	    		@RequestParam("desc") String desc,
	    		@RequestParam("piva") String piva ) {
		 Clienti clienti = new Clienti();
		 clienti.setCodice(codice);
		 clienti.setNome(nome);
		 clienti.setDescrizione(desc);
		 clienti.setPiva(piva);
		 
		 service.save(clienti);
	        return "redirect:/index";
	    }
}