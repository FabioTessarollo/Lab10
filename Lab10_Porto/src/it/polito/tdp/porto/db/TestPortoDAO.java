package it.polito.tdp.porto.db;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class TestPortoDAO {
	
	public static void main(String args[]) {

		PortoDAO pd = new PortoDAO();
		Graph<Integer, DefaultEdge> graph = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);
		System.out.println(pd.getAutore(85));
		System.out.println(pd.getArticolo(2293546));
		System.out.println(pd.getArticolo(1941144));
		pd.getVertex();
		graph = pd.getGraph();
		
		
		


	}

}
