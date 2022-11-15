// Java program for reversing the linked list
// class LinkedList {
//    internal class Node(var data: Int) {
//        var next: LinkedList.Node? = null
//    }

    /* Function to reverse the linked list */
    fun reverse(node: LinkedList): LinkedList {
        var node: LinkedList = node
        var prev: LinkedList.Node? = null
        var current: LinkedList.Node? = node
        var next: LinkedList.Node? = null
        while (current != null) {
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        node = prev
        return node
    }

    // prints content of double linked list
    fun printList(node: LinkedList.Node?) {
        var node: LinkedList.Node? = node
        while (node != null) {
            print(node.data.toString() + " ")
            node = node.next
        }
    }

    companion object {
        var head: LinkedList.Node? = null

        // Driver Code
        @JvmStatic
        fun main(args: Array<String>) {
            val list = LinkedList<Any>()
            LinkedList.Companion.head = LinkedList.Node(85)
            LinkedList.Companion.head.next = LinkedList.Node(15)
            LinkedList.Companion.head.next.next = LinkedList.Node(4)
            LinkedList.Companion.head.next.next.next = LinkedList.Node(20)
            println("Given linked list")
            list.printList(LinkedList.Companion.head)
            LinkedList.Companion.head = list.reverse(LinkedList.Companion.head)
            println("")
            println("Reversed linked list ")
            list.printList(LinkedList.Companion.head)
        }
    }
}