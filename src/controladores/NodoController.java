/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelos.Lista;
import vistas.frmNodos;
import vistas.frmPrincipal;

/**
 *
 * @author umg
 */
public class NodoController implements ActionListener {
    
    //levantar formulario principal 
    frmPrincipal VistaPrincipal;
    frmNodos VistaNodos;
    Lista nuevaLista;

    public NodoController(frmPrincipal VistaPrincipal, frmNodos VistaNodos, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.nuevaLista = nuevaLista;
        
        //poner a la escucha los botones
        this.VistaPrincipal.btnAgregarNodo.addActionListener(this);
        this.VistaNodos.btnEncolar.addActionListener(this);
        
        
        //levantar vista principal
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    if(e.getSource() == this.VistaPrincipal.btnAgregarNodo)    
    {
        //abrir la vista nodos
        //poner a la escucha los botones apilar y encolar
        this.VistaNodos.btnApilar.addActionListener(this);
        this.VistaNodos.btnEncolar.addActionListener(this);
        //levantar el formulario vista nodos
        this.VistaNodos.setLocationRelativeTo(null);
        this.VistaNodos.setVisible(true);
    }
    if(e.getSource()==this.VistaNodos.btnApilar)
    {
        this.nuevaLista.Apilar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
        this.VistaNodos.txtLista.setText(this.nuevaLista.Listar());
    }
    
    if(e.getSource()==this.VistaNodos.btnEncolar)
    {
        this.nuevaLista.Encolar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
        this.VistaNodos.txtLista.setText(this.nuevaLista.Listar());
    }
    
    }
    
}
