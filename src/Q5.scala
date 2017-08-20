// Q5.以下䛾成績表から数学と英語䛾平均点が80以上䛾生徒名とそ䛾平均点（Intで OK）を出力しなさい。
// よって結果の型はMap[String, Int]となる。
// 全員が生徒が数学と英語を受講しているわけではないのでデータにそもそも対象外の生徒も含まれている。その場合はスキップすること。

object Q5 extends App {

  def passStudents(scores: Map[String, Map[String, Int]]) = {
    //    val passedStudent : Map[String, Int] = for (student <- scores if ((student._2.getOrElse("math", 0)+student._2.getOrElse("english", 0))/2) > 80) yield {
    val passedStudent: Map[String, Int] = for (student <- scores; average = (student._2.getOrElse("math", 0) + student._2.getOrElse("english", 0)) / 2
                                               if average >= 80) yield {
      student._1 -> average
    }

    passedStudent
  }


  // Usage

  val scores = Map(
    "ichro" -> Map("math" -> 82, "english" -> 99),
    "jiro" -> Map("japanese" -> 100, "social" -> 88),
    "saburo" -> Map("math" -> 76, "english" -> 80),
    "shiro" -> Map("math" -> 99, "social" -> 81),
    "hanako" -> Map("math" -> 84, "english" -> 78, "social" -> 66))

  println(passStudents(scores)) // Map(ichiro -> 90, hanako -> 81)が返る
}