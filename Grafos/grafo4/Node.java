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
import java.util.ArrayList;
import java.util.List;
 
/**
 * @author raidentrance
 *
 */
public class Node {
    private String city;
    private List<Edge> edges;
 
    public Node(String city) {
        this.city = city;
    }
 
    public String getCity() {
        return city;
    }
 
    public void setCity(String city) {
        this.city = city;
    }
 
    public List<Edge> getEdges() {
        return edges;
    }
 
    public void addEdge(Edge edge) {
        if (edges == null) {
            edges = new ArrayList<>();
        }
        edges.add(edge);
    }
 
    @Override
    public String toString() {
        return "\n \tNode [city=" + city + ", edges=" + edges + "]";
    }
}
