

public class questao8S2IT{
    
    static class BinaryTree{
        int valor;
        BinaryTree left, right;
    }
	
    static int addBinaryTree(BinaryTree root)
    {
        if (root == null){
			return 0;
		}
		
        return (root.valor + addBinaryTree(root.left) + addBinaryTree(root.right));
    }
    
    
    static BinaryTree newBinaryTree(int valor)
    {
        BinaryTree node = new BinaryTree();
        node.valor = valor;
        node.left = node.right = null;
        return (node);
    }
	
    
    public static void main(String args[])
    {
        BinaryTree arvore = newBinaryTree(1);
		
		// ADICIONA ITENS A ARVORE BINARIA
		
        arvore.left = newBinaryTree(56);
        arvore.right = newBinaryTree(45);
        arvore.left.left = newBinaryTree(12);
        arvore.left.right = newBinaryTree(2);
        arvore.right.left = newBinaryTree(4);
        arvore.right.right = newBinaryTree(7);
        arvore.right.left.right = newBinaryTree(4);
        
        int sum = addBinaryTree(arvore);
        System.out.println(“Total: ” + sum);
    }
}