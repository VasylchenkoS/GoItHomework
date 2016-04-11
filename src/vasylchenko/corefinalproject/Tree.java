package vasylchenko.corefinalproject;

public class Tree {
        public Tree right;
        public Tree left;
        public int key;

        public Tree(int k) {
            key = k;
        }
        public void add(Tree aTree) {
            if ( aTree.key > key )
                if ( right != null ) right.add( aTree );
                else right = aTree;
            else
            if ( left != null ) left.add( aTree );
            else left = aTree;
        }
        public void traverse() {
            if ( left != null) left.traverse();
            if ( right != null ) right.traverse();
            System.out.println( " " + key );
        }
}
