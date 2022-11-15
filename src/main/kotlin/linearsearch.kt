// Java code for linearly searching x in arr[]. If x
// is present then return its location, otherwise
// return -1
internal object GFG {
    fun search(arr: IntArray, x: Int): Int {
        val N = arr.size
        for (i in 0 until N) {
            if (arr[i] == x) return i
        }
        return -1
    }

    // Driver's code
    @JvmStatic
    fun main(args: Array<String>) {
        val arr = intArrayOf(2, 3, 4, 10, 40)
        val x = 10

        // Function call
        val result = search(arr, x)
        if (result == -1) print(
            "Element is not present in array"
        ) else print(
            "Element is present at index "
                    + result
        )
    }
}