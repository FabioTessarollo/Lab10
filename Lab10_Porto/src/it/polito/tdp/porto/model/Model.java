package it.polito.tdp.porto.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import it.polito.tdp.porto.db.PortoDAO;

public class Model {
	
	PortoDAO db = new PortoDAO();
	List<Author> coautori = new ArrayList<Author>();
	
	Graph<Integer, DefaultEdge> graph = new SimpleGraph<Integer, DefaultEdge>(DefaultEdge.class);
	
	public Model() {
	}
	
	public void createGraph() {
		db.getVertex();
		this.graph = db.getGraph();
	}
	
	public List<Author> getCoautori(Author a){
		coautori.clear();
		
		for (Integer i : Graphs.neighborListOf(graph, a.getId())){
			coautori.add(db.getAutore(i));
		}
		return coautori;
	}

}
