object Question01 extends App {
  def encrypt(str: String, shift: Int, current: Int): String = {
    if (current == str.length()) {
      ""
    } else {
      var index = str.charAt(current).toInt
      index += shift
      var new_char = index.toChar
      new_char + encrypt(str, shift, current + 1)
    }
  }

  def decrypt(str: String, shift: Int, current: Int): String = {
    if (current == str.length()) {
      ""
    } else {
      var index = str.charAt(current).toInt
      index -= shift
      var new_char = index.toChar
      new_char + decrypt(str, shift, current + 1)
    }
  }

  println("Encrypted: " + encrypt("HelloWorld", 3, 0))
  println("Decrypted: " + decrypt("KhoorZruog", 3, 0))
}