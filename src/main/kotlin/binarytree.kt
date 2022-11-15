// Java program to calculate width of binary tree
/* A binary tree node has data, pointer to left child
and a pointer to right child */
internal class Node(var data: Int) {
    var left: Node?
    var right: Node? = null

    init {
        left = right
    }
}

internal class BinaryTree() {
    var root: Node? = null

    /* Function to get the maximum width of a binary tree*/
    fun getMaxWidth(node: Node?): Int {
        var maxWidth = 0
        var width: Int
        val h = height(node)
        var i: Int

        /* Get width of each level and compare
		the width with maximum width so far */i = 1
        while (i <= h) {
            width = getWidth(node, i)
            if (width > maxWidth) maxWidth = width
            i++
        }
        return maxWidth
    }

    /* Get width of a given level */
    fun getWidth(node: Node?, level: Int): Int {
        if (node == null) return 0
        if (level == 1) return 1 else if (level > 1) return (getWidth(node.left, level - 1)
                + getWidth(node.right, level - 1))
        return 0
    }

    /* UTILITY FUNCTIONS */ /* Compute the "height" of a tree -- the number of
	nodes along the longest path from the root node
	down to the farthest leaf node.*/
    fun height(node: Node?): Int {
        if (node == null) return 0 else {
            /* compute the height of each subtree */
            val lHeight = height(node.left)
            val rHeight = height(node.right)

            /* use the larger one */return if (lHeight > rHeight) lHeight + 1 else rHeight + 1
        }
    }

    companion object {
        /* Driver code */
        @JvmStatic
        fun main(args: Array<String>) {
            val tree = BinaryTree()

            /*
		Constructed binary tree is:
			1
			/ \
		2 3
		/ \ \
		4 5	 8
				/ \
				6 7
		*/tree.root = Node(1)
            tree.root.left = Node(2)
            tree.root.right = Node(3)
            tree.root.left.left = Node(4)
            tree.root.left.right = Node(5)
            tree.root.right.right = Node(8)
            tree.root.right.right.left = Node(6)
            tree.root.right.right.right = Node(7)

            // Function call
            println(
                "Maximum width is "
                        + tree.getMaxWidth(tree.root)
            )
        }
    }
}