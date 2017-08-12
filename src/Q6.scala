import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.concurrent.ExecutionContext.Implicits.global

object Q6 extends App {
  def firstOf[A](v1:Future[A], v2:Future[A]): Future[A] = {
    val futures = List(v1,v2)
    Future.firstCompletedOf(futures)
  }

  // Usage
  val s1 = Future{ Thread.sleep(9000); 1}
  val s2 =  Future{ Thread.sleep(3000); 2}
  val r1 = firstOf(s1,s2)
  println(Await.result(r1, Duration.Inf)) // 3s後に2と表示

  val r2 = firstOf(Future{ Thread.sleep(900); 1}, Future.failed(new Exception))
  println(r2.value.get.isFailure) // こちらは失敗が確定しているFutureを渡すので即trueが返る
}

/*
* デバッグ実行すると正しく表示される
* 普通に実行するとr2を実行した際にjava.util.NoSuchElementException: None.getができる
*
* */
