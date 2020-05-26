/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguridad;

/**
 *
 * @author Ruben
 */
public class InyeccionSQL {
    public boolean valido=false;
    public int res;
   
    public boolean validarSQL(String dato){
        res = dato.indexOf("'OR''='");
        
        if (res != (-1)){
            valido=false;
        }else{
            res = dato.indexOf("'||''='");
            if (res != (-1)){
                valido=false;
            }else{
                res = dato.indexOf("'&&/*");
                if (res != (-1)){
                    valido=false;
                }else{
                    res = dato.indexOf("*/''='");
                    if (res != (-1)){
                        valido=false;
                    }else{
                        res = dato.indexOf("'AND/*");
                        if (res != (-1)){
                            valido=false;
                        }else{
                            res = dato.indexOf("'OR 1 = 1 --");
                            if (res != (-1)){
                                valido=false;
                            }else{
                                res = dato.indexOf("'|| 1 = 1 --");
                                if (res != (-1)){
                                    valido=false;
                                }else{
                                    res = dato.indexOf("UNION");
                                    if (res != (-1)){
                                        valido=false;
                                    }else{
                                        res = dato.indexOf("DROP");
                                        if (res != (-1)){
                                            valido=false;
                                        }else{
                                            valido=true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
           
        System.out.print("El valos res es: "+res+" El valor de valido es: "+valido);
        return valido;
    }
    
}
