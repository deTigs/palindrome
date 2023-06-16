
fun main() {
    println("Enter text:")
    val text = readlnOrNull()?.toString()
    if (text is String) {
        val palindromeOrNot = if (text == text.reversed()) "Text is a palindrome"
        else "Text is not a palindrome"
        println(palindromeOrNot)
    }
}