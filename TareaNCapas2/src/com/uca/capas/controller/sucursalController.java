package com.uca.capas.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.domain.Empleado;
import com.uca.capas.domain.Sucursal;
import com.uca.capas.service.SucursalService;

@Controller
public class sucursalController {

	
	@Autowired
	SucursalService sSucur;
	
	@RequestMapping(value="/registrarSucursal")
	public ModelAndView initMain(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("sucursal",new Sucursal());
		mav.setViewName("insertarSucursal");
		return mav;
	}
	
	@RequestMapping(value="/updateSucursal")
	public ModelAndView update(@RequestParam("codigoSucursal") Integer codigoSucursal){
		ModelAndView mav = new ModelAndView();
		Sucursal sucursal = sSucur.findOne(codigoSucursal);
		mav.addObject("sucursal",sucursal);
		mav.setViewName("editarSucursal");
		return mav;
	}

	
	@RequestMapping(value="/insertarData",method=RequestMethod.POST)
	public ModelAndView initMain(@Valid @ModelAttribute Sucursal sucursal,BindingResult result){
			ModelAndView mav = new ModelAndView();
			if(result.hasErrors()) {
				mav.addObject("message2","Errores al enviar formulario");
				mav.setViewName("insertarSucursal");
			}
			else {
				sSucur.save(sucursal);
				List<Sucursal> sucursales = sSucur.findAll();
				mav.addObject("sucursales",sucursales);
				mav.setViewName("usuarioAdmin");
			}
			return mav;
	}

	
	@RequestMapping(value="/deleteSucursal")
	public ModelAndView delete(@RequestParam("codigoSucursal") Integer codigo){
		ModelAndView mav = new ModelAndView();
		sSucur.delete(codigo);
		List<Sucursal> sucursales = sSucur.findAll();
		mav.addObject("sucursales",sucursales);
		mav.setViewName("usuarioAdmin");
		return mav;
	}
	

	@RequestMapping(value="/verPerfil")
	public ModelAndView verPerfil(@RequestParam("codigoSucursal") Integer codigo){
		ModelAndView mav = new ModelAndView();
		Sucursal perfilSucursal = sSucur.findOne(codigo);
		mav.addObject("sucursalEncontrada",perfilSucursal);
		mav.setViewName("verPerfil");
		return mav;
	}
	
	@RequestMapping(value="/updateDataSucursal",method=RequestMethod.POST)
	public ModelAndView update(@Valid @ModelAttribute Sucursal sucursal, BindingResult result , @RequestParam("codigoSucursal") Integer codigo){
			ModelAndView mav = new ModelAndView();
			if(result.hasErrors()) {
				//mav.addObject("message3","Errores al enviar formulario");
				Sucursal sucursalE = sSucur.findOne(codigo);
				mav.addObject("sucursal",sucursal);
				mav.setViewName("editarSucursal");
			}
			else {
				sSucur.findOne(codigo);
				sSucur.save(sucursal);
				List<Sucursal> sucursales = sSucur.findAll();
				mav.addObject("sucursales",sucursales);
				mav.setViewName("usuarioAdmin");
			}
			return mav;
	}
}

