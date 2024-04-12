package com.aks.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphDemo {

	Map<String, List<String>> results = null;

	public GraphDemo() {
		results = new HashMap<>();
	}

	public void addVertex(String name) {
		if (results.get(name) == null)
			results.put(name, new ArrayList<>());
	}

	public void addEdge(String v1, String v2) {
		if (results.get(v1) != null) {
			results.get(v1).add(v2);
		}
		if (results.get(v2) != null) {
			results.get(v2).add(v1);
		}
	}

	public void removeEdge(String v1, String v2) {
		if (results.get(v1) != null) {
			results.get(v1).remove(v2);
		}
		if (results.get(v2) != null) {
			results.get(v2).remove(v1);
		}
	}

	public void removeEdgeForVertex(String v1, String v2) {
		if (results.get(v2) != null) {
			results.get(v2).remove(v1);
		}
	}

	public void removeVertext(String v1) {
		if (results.get(v1) != null) {
			List<String> edge = results.get(v1);

			for (String ed : edge) {
				System.out.println(ed);
				removeEdgeForVertex(v1, ed);
			}
		}
		results.remove(v1);

	}

	public static void main(String[] args) {
		GraphDemo g = new GraphDemo();
		g.addVertex("Tokyo");
		g.addVertex("Dalas");
		g.addVertex("Aspan");
		g.addEdge("Tokyo", "Dalas");
		g.addEdge("Aspan", "Dalas");
		System.out.println(g.results);
		g.addEdge("Tokyo", "Aspan");
		System.out.println(g.results);
		g.removeEdge("Tokyo", "Aspan");
		System.out.println(g.results);
		g.removeVertext("Tokyo");
		System.out.println(g.results);
	}
}
