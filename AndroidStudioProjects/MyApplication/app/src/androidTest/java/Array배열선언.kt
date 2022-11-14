fun main() {
    val data0: IntArray = IntArray(3, {0})
    val data2: BooleanArray = BooleanArray(3, {false})
    val data3 = intArrayOf(10, 20, 30)
    val data4 = booleanArrayOf(true, false, true)

    val data1 = arrayOf<Int>(10, 20, 30)
    println(
        """
            array size: ${data1.size}
            array data: ${data1[0]}, ${data1[1]}, ${data1.get(2)}
            
        """
    )
}