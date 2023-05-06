/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author micke
 */
@WebService(serviceName = "LiquidacionSueldo")
public class LiquidacionSueldo {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public Boolean hello(@WebParam(name = "name") String strNombreUsuario, @WebParam(name = "pass") String strPassUsuario) {
        String strNombreUsuarioLocal = "admin";
        String strPassUsuarioLocal = "1234";
        if (strNombreUsuario.equals(strNombreUsuarioLocal) && strPassUsuario.equals(strPassUsuarioLocal)) {
            return true;
        } else {
            return false;
        }

    }

    @WebMethod(operationName = "calcular_sueldo_liquido")
    public double calcular_sueldo_liquido(@WebParam(name = "sueldo_bruto") double dobSueldoBruto) {
        double dobBonoMobilizacion = dobSueldoBruto * 0.2;
        double dobBonoCumplimiento = dobSueldoBruto * 0.15;
        double dobDescSalud = dobSueldoBruto * 0.07;
        double dobDescAFP = dobSueldoBruto * 0.12;
        double dobSueldoLiquido = dobSueldoBruto + dobBonoMobilizacion + dobBonoCumplimiento - dobDescSalud - dobDescAFP;
        return dobSueldoLiquido;
    }

    @WebMethod(operationName = "verificar_usuario")
    public Boolean verificar_usuario(@WebParam(name = "nombre_usu") String nombre_usu, @WebParam(name = "contra_usu") String contra_usu) {
        String strNombreUsuarioLocal = "admin";
        String strPassUsuarioLocal = "1234";
        if (nombre_usu.equals(strNombreUsuarioLocal) && contra_usu.equals(strPassUsuarioLocal)) {
            return true;
        } else {
            return false;
        }
    }

    @WebMethod(operationName = "bono_movilizacion")
    public double bono_movilizacion(@WebParam(name = "sueldo_bruto") double sueldo_bruto) {
        double dobBonoMobilizacion = sueldo_bruto * 0.2;
        //dobSueldoBruto
        return dobBonoMobilizacion;

    }

    @WebMethod(operationName = "bono_cumplimiento")
    public double bono_cumplimiento(@WebParam(name = "sueldo_bruto") double sueldo_bruto) {
        double dobBonoCumplimiento = sueldo_bruto * 0.15;
        //TODO write your implementation code here:
        return dobBonoCumplimiento;
    }

    @WebMethod(operationName = "dcto_salud")
    public double dcto_salud(@WebParam(name = "sueldo_bruto") double sueldo_bruto) {
        double dobDescSalud = sueldo_bruto * 0.07;
        //TODO write your implementation code here:
        return dobDescSalud;
    }

    @WebMethod(operationName = "dcto_afp")
    public double dcto_afp(@WebParam(name = "sueldo_bruto") double sueldo_bruto) {
        double dobDescAFP = sueldo_bruto * 0.12;
        //TODO write your implementation code here:
        return dobDescAFP;
    }
    

}
