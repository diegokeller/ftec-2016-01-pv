package com.ftec.pv.jaxb;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.annotation.XmlType;

@XmlType
public class Main {

	public static void main(String[] args) {

		Produto p1 = new Produto("Abacaxi", 1.23);
		Produto p2 = new Produto("Banana", 2.46);

		Item i1 = new Item(p1, 5);
		Item i2 = new Item(p2, 7);

		Pedido pd1 = new Pedido();
		pd1.setData(new Date());
		pd1.setItens(new ArrayList<Item>());
		pd1.getItens().add(i1);
		pd1.getItens().add(i2);

		Pedido pd2 = new Pedido();
		pd2.setData(new Date());
		pd2.setItens(new ArrayList<Item>());
		pd2.getItens().add(i1);
		pd2.getItens().add(i2);

		Pedidos pedidos = new Pedidos();
		pedidos.setPedidos(new LinkedList<Pedido>());
		pedidos.getPedidos().add(pd1);
		pedidos.getPedidos().add(pd2);
		
		try {
			JAXBContext context = JAXBContext.newInstance("com.ftec.pv.jaxb");
			Marshaller m = context.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			m.marshal(pedidos, new FileOutputStream("pedidos.xml"));
		} catch (PropertyException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
