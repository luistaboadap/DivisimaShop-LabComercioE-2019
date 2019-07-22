package pe.edu.unsch.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import pe.edu.unsch.entities.Pedido;


@Repository("pedidoDao")
public class PedidoDaoImpl implements PedidoDao{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Pedido> findAll() {
		return entityManager
				.createQuery("from Pedido where", Pedido.class)
				.getResultList();
	}
	
	@Override
	public Pedido find(Integer id) {
		return (Pedido) entityManager
				.find(Pedido.class, id);
	}

	@Override
	public List<Pedido> featured(int n) {
		return entityManager
				.createQuery("from Pedido where feature =: feature order by id desc", Pedido.class)
				.setParameter("feature", true)
				.setMaxResults(n)
				.getResultList();
	}

}
