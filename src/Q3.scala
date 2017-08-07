// Q3.以下のNumEnglishDictionaryのtranslateメソッドを完成させなさい。
// 数字に対する英単語が辞書にあればその値を、無ければNoneを返しなさい。
// なお、Noneが渡された場合はNoneを返すこと。

object Q3 extends App {

  object NumEnglishDictionary {
    private val dictionary = Map(1 -> "one", 2 -> "two")

    def translate(num: Option[Int]): Option[String] = {
      num match {
        case Some(n) => dictionary.get(n) match {
          case null => None
          case s => s
        }
        case None => None
      }

    }
  }

  // Usage
  println(NumEnglishDictionary.translate(Some(1))) // Some("one")
  println(NumEnglishDictionary.translate(Some(3))) // None
  println(NumEnglishDictionary.translate(None))  // None
}