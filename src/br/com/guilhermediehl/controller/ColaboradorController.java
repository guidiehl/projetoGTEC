/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.guilhermediehl.controller;

import br.com.guilhermediehl.dao.ColaboradorDAO;
import br.com.guilhermediehl.modelo.Colaborador;
import br.com.guilhermediehl.persistencia.ColaboradorDAOImplements;
import java.util.List;

/**
 *
 * @author guest01
 */
public class ColaboradorController {
    
  
    public int salvar(Colaborador c){
        ColaboradorDAO dao = new ColaboradorDAOImplements();
        return dao.salve(c);
    }
    
    public List<Colaborador> listarTodos(){
        ColaboradorDAO dao = new ColaboradorDAOImplements();
        return dao.listAll();
    }
    public boolean remove (int id){
    ColaboradorDAO dao  = new ColaboradorDAOImplements();
    return dao.remove(id);
    
    }
    
    public Colaborador listById(int id){
        ColaboradorDAO dao = new ColaboradorDAOImplements();
        return dao.listById(id);
        
    }
    
    public List<Colaborador> listByNome(String nome){
        ColaboradorDAO dao = new ColaboradorDAOImplements();
        return dao.listByNome(nome);
    }
    
    public boolean Login(String login, String senha){
        ColaboradorDAO c = new ColaboradorDAOImplements();
        return c.Login(login, senha);
    }
}
    

