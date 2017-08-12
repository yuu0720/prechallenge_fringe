object Q4 extends App{
  val m = Map(1->"one", 2->"two")
  val mOpt: Option[Map[Int, String]] = Some(m)
  println(mOpt.get(1)) // "one"が来る
  println(mOpt.get.apply(1))
}
