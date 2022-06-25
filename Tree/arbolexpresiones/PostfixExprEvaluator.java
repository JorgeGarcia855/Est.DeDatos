/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolexpresiones;

import java.util.Stack;
import java.util.Hashtable;

public class PostfixExprEvaluator implements Operator {

  Node postfixASTTree = null; // The node of the AST postfix expression tree.

  Stack stackNodes = null; // Auxiliary stack to store the nodes of the AST tree
  Stack stackResults = null; // Auxiliary stack to store the intermediate
                             // results

  public PostfixExprEvaluator(String sPostfix) throws Exception {

    // Create the AST Tree from the postfix expression
    postfixASTTree = createPostfixTree(sPostfix);
  }

  private Node createPostfixTree(String sPostfix) throws Exception {

    int i = 0;
    stackNodes = new Stack();

    // while there are tokens(char) left to analyze
    while (i < sPostfix.length()) {

      // Evaluate the token (char)
      char token = sPostfix.charAt(i++);

      switch (token) {
        // If it is an operator
        case Operator.SUM, Operator.PRODUCT, Operator.SUBTRACTION, Operator.DIVISION -> {

          // Popping the two operands
          Node leftOperand = (Node) stackNodes.pop();
          Node rightOperand = (Node) stackNodes.pop();

          // Create a new Binary Tree Node
          Node binaryOperation = new Node(token, rightOperand, leftOperand);

          // Push it on the stack
          stackNodes.push(binaryOperation);
        }
        // If it is an operand
        default -> {
          // Push the new node on the stack
          Node operand = new Node(token);
          stackNodes.push(operand);
        }
      }
    }

    // Finally, we return the first Node of the stack.
    return (Node) stackNodes.pop();

  }

  public float evaluateExpression(String expression, Hashtable values)
      throws Exception {

    // Expression's result
    float result = 0;
    // The results' stack
    stackResults = new Stack();

    // Create a Binary Tree with the postfix expression
    postfixASTTree = createPostfixTree(expression);

    // Traverse the tree to calculate the intermediate results
    postfixASTTree.processNode(values, stackResults);

    // The result value to be returned is located on top of the results' stack
    result = (Float) stackResults.pop();

    return result;
  }

  public static void main(String args[]) throws Exception {

    Hashtable values = new Hashtable();
    values.put('a', 2);
    values.put('b', 5);
    values.put('c', 3);
    values.put('d', 1);

    String sPostfix = "abc*-d+";

    PostfixExprEvaluator myExpression = new PostfixExprEvaluator(sPostfix);

    System.out.println(" Evaluating postfix expression '" + sPostfix
        + "' with values: " + values);

    System.out.println(" Result = "
        + myExpression.evaluateExpression(sPostfix, values));

  }

}
