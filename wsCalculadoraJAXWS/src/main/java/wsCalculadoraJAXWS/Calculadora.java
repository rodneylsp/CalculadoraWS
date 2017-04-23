package wsCalculadoraJAXWS;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style= SOAPBinding.Style.RPC)
public class Calculadora {

	@WebMethod(operationName = "adicionar")
	public int add(@WebParam(name="num1") int numero1, @WebParam(name="num2") int numero2){
		return numero1 + numero2;
	}
	
	@WebMethod(operationName = "subtrair")
	public int subtrair(@WebParam(name="num1") int numero1, @WebParam(name="num2") int numero2){
		return numero1 - numero2;
	}
}
