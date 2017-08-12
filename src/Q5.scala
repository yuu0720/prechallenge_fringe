// Q5.以下䛾成績表から数学と英語䛾平均点が80以上䛾生徒名とそ䛾平均点（Intで OK）を出力しなさい。
// よって結果の型はMap[String, Int]となる。
// 全員が生徒が数学と英語を受講しているわけではないのでデータにそもそも対象外の生徒も含まれている。その場合はスキップすること。

object Q5 extends App {

  def passStudents(scores: Map[String, Map[String, Int]]) = {
    var passedStudent : Map[String, Int] = Map()
    for (student <- scores){
      var mathScore : Option[Int] = student._2.get("math")
      var englishScore : Option[Int] = student._2.get("english")
      if(mathScore.isDefined && englishScore.isDefined && (mathScore.get + englishScore.get)/2 >= 80)
        passedStudent += (student._1 -> (mathScore.get + englishScore.get)/2)
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

  println(passStudents(scores))  // Map(ichiro -> 90, hanako -> 81)が返る
}