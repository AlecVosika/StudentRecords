package sr;

public class Tree {

    Node root = null;

    public Node find(int anId) {
        Node curNode = root;
        int childNumber;
        while(true) {
            if(( childNumber=curNode.findItem(anId) ) != -1)
                return childNumber; // found it
            else if( curNode.isLeaf())
                return -1; // can’t find it
            else // search deeper
                curNode = getNextChild(curNode, anId);
        } // end while
    }


    //assignment 
    //create to string for the tree
}