package edu.escuelaing.arem.math;

import java.lang.Math;

public class Operacion{


    /**
     * 
     * @param lista
     * @return
     */
    public static double Sum(LinkedList<Double> lista){
        double sTotal = 0;
        for(Double e:lista){
            sTotal = sTotal + e;
        }
        return sTotal;     
    }

    public  static double Promedio(LinkedList<Double>lista){
        double pTotal=0;
        double sTotal = Sum(lista);
        pTotal = sTotal/lista.size();
        return pTotal;
    }

    public static double SumEsp(LinkedList<Double>lista, double prom){
        double sTotal =0;
        double vExp;
        for(Double e:lista){
            vExp = e -prom;
            sTotal = sTotal + Math.pow(vExp,2);
        }
        return sTotal;
    }

    public static double DesviacionEstandar(LinkedList<Double>lista){
        double prom = Promedio(lista);
        double sTotalE = SumEsp(lista, prom);
        double res = sTotalE /(lista.size()-1);
        res = Math.sqrt(res);
        return res;
    }


}