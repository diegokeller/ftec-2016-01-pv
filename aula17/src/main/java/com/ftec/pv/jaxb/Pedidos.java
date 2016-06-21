package com.ftec.pv.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pedidos")
@XmlAccessorType(XmlAccessType.FIELD)
public class Pedidos {

	@XmlElement(name="pedido")
	private List<Pedido> pedidos;

	public Pedidos() {
		// TODO Auto-generated constructor stub
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

}
