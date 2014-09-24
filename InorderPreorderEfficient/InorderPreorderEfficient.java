package InorderPreorderEfficient;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
class Node{
	Node left;
	Node right;
	int data;
}
 
public class InorderPreorderEfficient
{
    public InorderPreorderEfficient()
    {
    }
 
    public Node constructBinaryTree(List preOrder, List inOrder,
        int preOrderIndex, int inOrderIndex, int length)
    {
        if (length == 0)
        {
            return null;
        }
 
        Node node = new Node();
        int nodeData = ((Integer) preOrder.get(preOrderIndex)).intValue();
        node.data = nodeData;
 
        //  Need to calculate relative index where the current noda data is present in inOrder traversal
        int rootIndex = 0;
 
        for (int count = inOrderIndex; count < inOrder.size(); count++)
        {
            int inOrderData = ((Integer) inOrder.get(count)).intValue();
 
            if (inOrderData == nodeData)
            {
                break;
            }
 
            rootIndex++;
        }
 
        node.left = constructBinaryTree(preOrder, inOrder, preOrderIndex + 1,
                inOrderIndex, rootIndex);
 
        node.right = constructBinaryTree(preOrder, inOrder,
                preOrderIndex + rootIndex + 1, inOrderIndex + rootIndex + 1,
                length - (rootIndex + 1));
 
        return node;
    }
 
    public static void main(String[] args)
    {
        ArrayList preOrder = new ArrayList();
        preOrder.add(new Integer(1));
        preOrder.add(new Integer(2));
        preOrder.add(new Integer(4));
        preOrder.add(new Integer(8));
        preOrder.add(new Integer(9));
        preOrder.add(new Integer(10));
        preOrder.add(new Integer(11));
        preOrder.add(new Integer(5));
        preOrder.add(new Integer(3));
        preOrder.add(new Integer(6));
        preOrder.add(new Integer(7));
 
        ArrayList inOrder = new ArrayList();
        inOrder.add(new Integer(8));
        inOrder.add(new Integer(4));
        inOrder.add(new Integer(10));
        inOrder.add(new Integer(9));
        inOrder.add(new Integer(11));
        inOrder.add(new Integer(2));
        inOrder.add(new Integer(5));
        inOrder.add(new Integer(1));
        inOrder.add(new Integer(6));
        inOrder.add(new Integer(3));
        inOrder.add(new Integer(7));
 
        /*
        Constructs following tree
                        1
                    2         3
                4       5  6     7
            8       9
                 10     11
                                                        */
        InorderPreorderEfficient inPreTree = new InorderPreorderEfficient();
        Node node = inPreTree.constructBinaryTree(preOrder, inOrder, 0, 0, 11);
 
        //  For Testing
        preorderTraversal(node);
      /*  BinaryTree binaryTree = new BinaryTree();
        System.out.println("\n Inorder Traversal of constructed tree is ");
        binaryTree.printInorder(node);
        System.out.println("\n Preorder Traversal of constructed tree is ");
        binaryTree.printPreorder(node);
        System.out.println("\n Levelorder Traversal of constructed tree is ");
        binaryTree.printLevelOrder(node);*/
    }
    
    public static void preorderTraversal(Node root) {  
        if(root == null){  
            return;  
        }  
          
        Stack<Node> stack = new Stack<Node>();      // 辅助stack  
        stack.push(root);  
          
        while( !stack.isEmpty() ){  
            Node cur = stack.pop();     // 出栈栈顶元素  
            System.out.print(cur.data + " ");  
              
            // 关键点：要先压入右孩子，再压入左孩子，这样在出栈时会先打印左孩子再打印右孩子  
            if(cur.right != null){  
                stack.push(cur.right);  
            }  
            if(cur.left != null){  
                stack.push(cur.left);  
            }  
        }  
    }  
}