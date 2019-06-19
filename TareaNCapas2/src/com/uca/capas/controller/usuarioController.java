package com.uca.capas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Sucursal;
import com.uca.capas.domain.Usuario;
import com.uca.capas.service.SucursalService;
import com.uca.capas.service.UsuarioService;

@Controller
public class usuarioController {
	@Autowired
	private UsuarioService userRepo;
	
	@Autowired
	private SucursalService sucursalService;

	@RequestMapping(value = "/userLogin",method = RequestMethod.POST)
	public ModelAndView initMain(@ModelAttribute Usuario usuario){
		ModelAndView mav = new ModelAndView();
		if(userRepo.findByUserPass(usuario.getUsuario(), usuario.getClave())) {
			List<Sucursal> sucursal = null;
			sucursal = sucursalService.findAll();
			mav.addObject("sucursales",sucursal);
			mav.setViewName("usuarioAdmin");
		}else {
			mav.addObject("message","Credenciales invalidas");
			mav.setViewName("main");
		}
		return mav;
	}
	
	@RequestMapping(value = "/regresarAdministrador")
	public ModelAndView initMain(){
		ModelAndView mav = new ModelAndView();
			List<Sucursal> sucursal = null;
			sucursal = sucursalService.findAll();
			mav.addObject("sucursales",sucursal);
			mav.setViewName("usuarioAdmin");
		   return mav;
	}
	
	
	
}
