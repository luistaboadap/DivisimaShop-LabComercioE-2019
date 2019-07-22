package pe.edu.unsch.dao;

import java.util.List;

import pe.edu.unsch.entities.Pedido;



public interface PedidoDao {
	public Pedido find(Integer  id);
	public  List<Pedido> featured(int n);
	public List<Pedido> findAll();

}
