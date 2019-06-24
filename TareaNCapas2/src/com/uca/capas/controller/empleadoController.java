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
import com.uca.capas.service.EmpleadoService;
import com.uca.capas.service.SucursalService;


@Controller
public class empleadoController {
	
	@Autowired
	EmpleadoService eServ;
	
	@Autowired
	SucursalService sSucur;
	
	@RequestMapping(value="/registrarEmpleado")
	public ModelAndView registrarEmpleado(@RequestParam("codigoSucursal") Integer codigo){
		ModelAndView mav = new ModelAndView();
		Sucursal perfilSucursal = sSucur.findOne(codigo);
		mav.addObject("sucursalEncontrada",perfilSucursal);
		mav.addObject("empleado",new Empleado());
		mav.setViewName("registrarEmpleado");
		return mav;
	}
	
	@RequestMapping(value="/editarEmpleado")
	public ModelAndView verPerfil(@RequestParam("codigoEmpleado") Integer codigo,@RequestParam("codigoSucursal") Integer codigoSucursal){
		ModelAndView mav = new ModelAndView();
		Empleado perfilEmpleado = eServ.findOne(codigo);
		Sucursal sucursal = sSucur.findOne(codigoSucursal);
		perfilEmpleado.setSucursal(sucursal);
		mav.addObject("sucursalEncontrada",sucursal);
		mav.addObject("empleado",perfilEmpleado);
		mav.setViewName("editarEmpleado");
		return mav;
	}
	
	@RequestMapping(value="/eliminarEmpleado")
	public ModelAndView eliminar(@RequestParam("codigoEmpleado") Integer codigo,@RequestParam("codigoSucursal") Integer codigoSucursal){
		ModelAndView mav = new ModelAndView();
		eServ.delete(codigo);;
		Sucursal sucursal = sSucur.findOne(codigoSucursal);
		mav.addObject("sucursalEncontrada",sucursal);
		mav.setViewName("verPerfil");
		return mav;
	}
	
	@RequestMapping(value="/insertarDataEmpleado",method=RequestMethod.POST)
	public ModelAndView initMain(@Valid @ModelAttribute Empleado empleado,BindingResult result,  @RequestParam("codigoSucursal") Integer codigo){
			ModelAndView mav = new ModelAndView();
			if(result.hasErrors()) {
				//mav.addObject("message3","Errores al enviar formulario");
				Sucursal sucursal = sSucur.findOne(codigo);
				empleado.setSucursal(sucursal);
				mav.addObject("sucursalEncontrada",sucursal);
				mav.setViewName("registrarEmpleado");
			}
			else {
				Sucursal sucursal = sSucur.findOne(codigo);
				empleado.setSucursal(sucursal);

				System.out.println(empleado.getSucursal().getCodigoSucursal());
				eServ.save(empleado);
				Sucursal perfilSucursal = sSucur.findOne(codigo);
				mav.addObject("sucursalEncontrada",perfilSucursal);
				mav.setViewName("verPerfil");
			}
			return mav;
	}
	
	@RequestMapping(value="/updateDataEmpleado",method=RequestMethod.POST)
	public ModelAndView update(@Valid @ModelAttribute Empleado empleado, BindingResult result, @RequestParam("codigoEmpleado") Integer codigoEmpleado , @RequestParam("codigoSucursal") Integer codigo){
			ModelAndView mav = new ModelAndView();
			if(result.hasErrors()) {
				//mav.addObject("message3","Errores al enviar formulario");
				Sucursal sucursal = sSucur.findOne(codigo);
				empleado.setSucursal(sucursal);
				mav.addObject("sucursalEncontrada",sucursal);
				mav.setViewName("registrarEmpleado");
			}
			else {
				Sucursal sucursal = sSucur.findOne(codigo);
				empleado.setSucursal(sucursal);
				empleado.setCodigoEmpleado(codigoEmpleado);
				System.out.println(empleado.getSucursal().getCodigoSucursal());
				eServ.save(empleado);
				Sucursal perfilSucursal = sSucur.findOne(codigo);
				mav.addObject("sucursalEncontrada",perfilSucursal);
				mav.setViewName("verPerfil");
			}
			return mav;
	}

}
