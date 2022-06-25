package unbosque;

import vivin.GenericTree;
import vivin.GenericTreeNode;

public class Ejercicio {
    public static void main(String[] args) {
//        ArbolGenerico<String> arbol = new ArbolGenerico<>();
//        NodoGenerico<String> raizA = new NodoGenerico<>("a");
//        NodoGenerico<String> padreB = new NodoGenerico<>("b");
//        NodoGenerico<String> padreC = new NodoGenerico<>("c");
//        arbol.setRaiz(raizA);
//        raizA.insertar(padreB);
//        raizA.insertar(padreC);
//        padreB.insertar(new NodoGenerico<>("d"));
//        padreC.insertar(new NodoGenerico<>("e"));
//        padreC.insertar(new NodoGenerico<>("f"));
//        System.out.println(arbol.crearArbol(Recorrido.POSTORDEN));

        GenericTree<Integer> tree = new GenericTree<>();
        GenericTreeNode<Integer> root = new GenericTreeNode<>(50);
        GenericTreeNode<Integer> parent1 = new GenericTreeNode<>(40);
        GenericTreeNode<Integer> parent2 = new GenericTreeNode<>(70);
        GenericTreeNode<Integer> p1child1 = new GenericTreeNode<>(35);
        GenericTreeNode<Integer> p1child2 = new GenericTreeNode<>(42);
        GenericTreeNode<Integer> p1c1_child1 = new GenericTreeNode<>(10);
        GenericTreeNode<Integer> p1c1_child2 = new GenericTreeNode<>(36);
        GenericTreeNode<Integer> p1c2_child1 = new GenericTreeNode<>(48);
        GenericTreeNode<Integer> p1c2_gchild = new GenericTreeNode<>(49);

        tree.setRoot(root);
        root.addChild(parent1);
        root.addChild(parent2);

        parent1.addChild(p1child1);
        parent1.addChild(p1child2);

        p1child1.addChild(p1c1_child1);
        p1child1.addChild(p1c1_child2);

        p1child2.addChild(p1c2_child1);
        p1c2_child1.addChild(p1c2_gchild);

        System.out.println(tree.toStringWithDepth());
        System.out.println(tree.getNumberOfNodes());
        System.out.println(root.toStringVerbose());
    }
}
