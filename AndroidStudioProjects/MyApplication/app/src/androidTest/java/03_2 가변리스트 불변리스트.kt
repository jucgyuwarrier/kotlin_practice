fun main() {
    //불변 리스트 한번 선언해두면 변경 못함
    var list = listOf<Int>(10, 20, 30)
    println(
        """
            list size : ${list.size}
            list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}
            
        """
    )

    var mutableList = mutableListOf<Int>(10, 20, 30)
    //가변 리스트 mutableList로 생성하면 중간에도 리스트값을 변경 할 수 있음
    mutableList.add(3, 40)
    mutableList.set(0, 50)
    println(
        """
            list size : ${mutableList.size}
            list data : ${mutableList[0]}, ${mutableList.get(1)},
                        ${mutableList.get(2)}, ${mutableList.get(3)}
            
        """

    )

}