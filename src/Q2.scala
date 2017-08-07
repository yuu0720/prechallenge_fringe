//Q2.値があれば最初の一文字※を返し、空文字もしくはNoneなら空文字を返すgetFirst関数を作りなさい。
// ※戻り値型はCharじゃなくてStringでよい。

object Q2 extends App {
  def getFirst(value: Option[String]): String = {
    value match {
      case Some(s) if s.length > 0 => s.charAt(0).toString
      case None | Some("") => "";
    }
  }

  // Usage
  println("\"" + getFirst(Some("hello")) + "\"") // "h"
  println("\"" + getFirst(Some("")) + "\"") // 空文字を表示 ""
  println("\"" + getFirst(None) + "\"") //空文字を表示 ""
}