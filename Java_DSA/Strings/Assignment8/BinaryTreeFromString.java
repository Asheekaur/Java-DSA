/*

💡 **Question 4**

You need to construct a binary tree from a string consisting of parenthesis and integers.

The whole input represents a binary tree. It contains an integer followed by zero, one or two pairs of parenthesis. 
The integer represents the root's value and a pair of parenthesis contains a child binary tree with the same structure.
You always start to construct the **left** child node of the parent first if it exists.

*/

package Java_DSA.Strings.Assignment8;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeFromString {
    public static TreeNode str2tree(String s) {
        if (s.isEmpty()) {
            return null;
        }

        int firstParen = s.indexOf("(");
        int val = (firstParen == -1) ? Integer.parseInt(s) : Integer.parseInt(s.substring(0, firstParen));
        TreeNode root = new TreeNode(val);

        if (firstParen == -1) {
            return root;
        }

        int start = firstParen, openParenCount = 0;
        for (int i = start; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                openParenCount++;
            } else if (s.charAt(i) == ')') {
                openParenCount--;
            }

            if (openParenCount == 0 && start == firstParen) {
                root.left = str2tree(s.substring(start + 1, i));
                start = i + 1;
            } else if (openParenCount == 0) {
                root.right = str2tree(s.substring(start + 1, i));
            }
        }

        return root;
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        String s = "4(2(3)(1))(6(5))";
        TreeNode root = str2tree(s);
        System.out.print("Inorder traversal of the constructed binary tree: ");
        inorderTraversal(root);
    }
}
