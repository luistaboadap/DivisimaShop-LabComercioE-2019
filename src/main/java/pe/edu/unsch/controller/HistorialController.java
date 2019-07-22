package pe.edu.unsch.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class HistorialController {
	
	
	@RequestMapping(value = "/historial", method = RequestMethod.GET)
	public String historial(Locale locale,Model model) {
		String var="variable!!";
		model.addAttribute("variable",var);
		return "views/public/historial/historial";
	}

}
