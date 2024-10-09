// Назаров Руслан
// 23-ИСП-3/1

// Вариант 6 -> Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).

fun main() {
    val n = 4
    findIncreasingNumbers(n)
}

fun findIncreasingNumbers(n: Int){
    if (n < 1 || n > 10){
        println("n должно быть от 1 до 10")
        return
    }
    generateNumbers(n, 0, mutableListOf())
}

fun generateNumbers(n: Int, start: Int, current: MutableList<Int>){
    if(current.size == n){
        println(current.joinToString(""))
        return
    }
    for(i in (start + 1)..9){
        current.add(i)
        generateNumbers(n, i, current)
        current.removeAt(current.size - 1)
    }
}