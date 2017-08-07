// Q1.Optionの値を標準出力するshow関数を作成しなさい。Noneなら何もしなくてよい。

object Q1 extends App{

  def show(value: Option[String]): Unit = {
    value match {
      case Some(x) => println(x)  // Someオブジェクトなら中身を出力
      case None => None  // Noneオブジェクトなら何もしない
    }
  }

  // Usage
  show(Some("hello")) // "hello"と出力
  show(None) // 何も出力されない
}