/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.swing.JOptionPane;

/**
 *
 * @author umg
 */
public class Lista {
Nodo primero;
Nodo Auxiliar;
Nodo ultimo;
String cadena = "";

public void Apilar()
{
    
}
public void Apilar(int dato)
{
    Nodo nuevoNodo = new Nodo(dato);
    if(primero == null)
    {
        primero = nuevoNodo;
    }
    else 
    {
        nuevoNodo.siguiente = primero;
        primero = nuevoNodo;
    }
    JOptionPane.showMessageDialog(null, "Nodo Apilado");
}

public String Listar()
{
 Auxiliar = primero;
 cadena = "";
 while(Auxiliar != null)
 {
     
     cadena = cadena  + Auxiliar.getDato()+" ";
     Auxiliar = Auxiliar.siguiente;
 }
 return cadena;
}

public String Encolar(int Dato){
        Nodo nuevoNodo = new Nodo(Dato);
        if(ultimo == null){
            primero = nuevoNodo;
        }
        else{
            ultimo.siguiente = nuevoNodo;
        }
        ultimo = nuevoNodo;
        
        cadena = cadena + nuevoNodo.getDato();
        
           
        return cadena;
    }

}
