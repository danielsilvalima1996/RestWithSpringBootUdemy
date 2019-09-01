package br.com.erudio.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.exception.UnsuportedMathOperationException;
import br.com.erudio.math.SimpleMath;
import br.com.erudio.request.converters.ConvertNumber;

@RestController
public class MathController {
	
	SimpleMath math = new SimpleMath();
	
	@RequestMapping(value="/sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value");
		}
		return math.sum(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/sub/{numberOne}/{numberTwo}")
	public Double sub(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value");
		}
		return math.sub(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/multi/{numberOne}/{numberTwo}")
	public Double multi(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value");
		}
		return math.multi(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value");
		}
		return math.div(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}

	@RequestMapping(value="/media/{numberOne}/{numberTwo}")
	public Double media(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) throws Exception {
		if (!ConvertNumber.isNumeric(numberOne) || !ConvertNumber.isNumeric(numberTwo)) {
			throw new UnsuportedMathOperationException("Please set a number value");
		}
		return math.media(ConvertNumber.convertToDouble(numberOne), ConvertNumber.convertToDouble(numberTwo));
	}
	
	@RequestMapping(value="/sqr/{numberOne}")
	public Double sqr(@PathVariable("numberOne") String numberOne) throws Exception {
		if (!ConvertNumber.isNumeric(numberOne)) {
			throw new UnsuportedMathOperationException("Please set a number value");
		}
		 return math.sqr(ConvertNumber.convertToDouble(numberOne));
	}
		
}