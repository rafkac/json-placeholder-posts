import java.io.PrintWriter

object Main extends App {
  val ID_MIN = 1
  val ID_MAX = 100

  (ID_MIN to ID_MAX).foreach(saveJSON)

  def saveJSON(id: Int): Unit = {
    val r = requests.get(s"https://jsonplaceholder.typicode.com/posts/${id}")
    new PrintWriter(s"output/${id}.json") {
      write(r.text())
      close()
    }
  }
}