import java.io.PrintWriter

object Main extends App {

  def saveJSON(): Unit = {
    val req = requests.get("https://jsonplaceholder.typicode.com/posts")

    ujson.read(req.text).arr foreach { post =>
      val id = post("id")
      new PrintWriter(s"output/$id.json") {
        write(post.toString())
        close()
      }
    }
  }

  saveJSON()
}