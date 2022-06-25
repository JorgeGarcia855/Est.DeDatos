/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafo4;

/**
 *
 * @author Hernan Lozano
 */
public class MapRepresentation {
 
    public static Graph getCities() {
        Node df = new Node("DF");
        Node toluca = new Node("Toluca");
        Node cuernavaca = new Node("Cuernavaca");
        Node puebla = new Node("Puebla");
        Node tlaxcala = new Node("Tlaxcala");
 
        df.addEdge(new Edge(df, toluca, 100));
        df.addEdge(new Edge(df, cuernavaca, 90));
 
        toluca.addEdge(new Edge(toluca, cuernavaca, 150));
        toluca.addEdge(new Edge(toluca, puebla, 350));
        toluca.addEdge(new Edge(toluca, tlaxcala, 340));
 
        cuernavaca.addEdge(new Edge(cuernavaca, puebla, 100));
 
        puebla.addEdge(new Edge(puebla, tlaxcala, 20));
 
        Graph graph = new Graph();
        graph.addNode(df);
        graph.addNode(toluca);
        graph.addNode(cuernavaca);
        graph.addNode(puebla);
        return graph;
    }
 
    public static void main(String[] args) {
        Graph graph = getCities();
        System.out.println(graph);
    }
}
