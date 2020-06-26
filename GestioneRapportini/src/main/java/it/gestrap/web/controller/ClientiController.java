package it.gestrap.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.gestrap.entita.Clienti;
import it.gestrap.springmvc.service.ClientiService;

@Controller
@RequestMapping("/clienti")
public class ClientiController {

    @Autowired
    private ClientiService service;
    
    @GetMapping("/list")
    public String listCustomers(Model theModel) {
        List<Clienti> clienti = service.getAll();
        theModel.addAttribute("clienti", clienti);
        return "list-clienti";
    }

    @GetMapping("/showForm")
    public String showFormForAdd(Model theModel) {
    	Clienti theCustomer = new Clienti();
        theModel.addAttribute("cliente", theCustomer);
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("cliente") Clienti theCustomer) {
    	service.save(theCustomer);
        return "redirect:/customer/list";
    }

    @GetMapping("/updateForm")
    public String showFormForUpdate(@RequestParam("clienteId") int theId,
        Model theModel) {
    	Clienti cliente = (Clienti) service.get(theId);
        theModel.addAttribute("customer", cliente);
        return "customer-form";
    }

    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("clienteId") int theId) {
    	service.delete(theId);
        return "redirect:/customer/list";
    }
}