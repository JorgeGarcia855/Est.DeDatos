/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolexpresiones;

/**
 *
 * @author Hernan Lozano
 */
import java.util.Hashtable;
import java.util.Stack;

class Node {

  char value = '\0'; // The character (either an operand or a operator)

  Node left = null; // The reference to the left child node of the binary tree
  Node right = null; // The reference to the right child node of the binary tree

  public Node() {
  }

  public Node(char value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public Node(char value) {
    this(value, null, null);
  }

  public void processNode(Hashtable values, Stack stackResults)
      throws Exception {
    // This recursive method realizes a postorder tree traversal to process the
    // node
    // Firstly, we process the left node recursively
    if (left != null) {
      left.processNode(values, stackResults);
    }

    // Secondly, we process the right node recursively
    if (right != null) {
      right.processNode(values, stackResults);
    }

    // In the other case, we process the actual node
    float result = 0;
    // Depending on the Node's value that indicates the corresponding opperation
    // the result value is calculated.
    switch (value) {
      case Operator.SUM -> result = (Float) stackResults.pop() + (Float) stackResults.pop();
      case Operator.SUBTRACTION -> {
        float subtrahend = (Float) stackResults.pop();
        float minuend = (Float) stackResults.pop();
        result = minuend - subtrahend;
      }
      case Operator.PRODUCT -> result = (Float) stackResults.pop() * (Float) stackResults.pop();
      case Operator.DIVISION -> {
        float divisor = (Float) stackResults.pop();
        float dividend = (Float) stackResults.pop();
        result = dividend / divisor;
      }
      default -> result = (Integer) (values.get(value));
    }

    // And finally, we store the result at the results' stack
    stackResults.push(result);

  }

}