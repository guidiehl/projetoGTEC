
package br.com.guilhermediehl.dao;

import br.com.guilhermediehl.modelo.Colaborador;
import java.util.List;

public interface ColaboradorDAO {
    
    int insert(Colaborador u); 
    int salve(Colaborador u);
    boolean remove (int codigo);
    List<Colaborador> listAll();
    Colaborador listById(int codigo);   
    List<Colaborador> listByNome(String nome);
    
}
