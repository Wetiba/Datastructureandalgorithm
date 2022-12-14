internal class BubbleSort {
    fun bubbleSort(arr: IntArray) {
        val n = arr.size
        for (i in 0 until   n - 1) for (j in 0 until n - i - 1) if (arr[j] > arr[j + 1]) {
            // swap arr[j+1] and arr[j]
            val temp = arr[j]
            arr[j] = arr[j + 1]
            arr[j + 1] = temp
        }
    }

    /* Prints the array */
    fun printArray(arr: IntArray) {
        val n = arr.size
        for (i in 0 until n) print(arr[i].toString() + " ")
        println()
    }

    companion object {
        // Driver method to test above
        @JvmStatic
        fun main(args: Array<String>) {
            val ob = BubbleSort()
            val arr = intArrayOf(5, 1, 4, 2, 8)
            ob.bubbleSort(arr)
            println("Sorted array")
            ob.printArray(arr)
        }
    }
}