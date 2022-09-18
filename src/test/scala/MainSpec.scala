import org.scalatest._
import flatspec._
import matchers._
import Main._
import scala.io.Source

class MainSpec extends AnyFlatSpec with should.Matchers {

  "saveJSON()" should "save post from https://jsonplaceholder.typicode.com/posts/<id> to output/<id>.json\"" in {

    def fileContent(id: Int): String = {
      val src = Source.fromFile(s"./output/$id.json")
      try src.mkString finally src.close()
    }

    def PostContent(id: Int): String = {
      ujson.read(requests.get(s"https://jsonplaceholder.typicode.com/posts/$id").text()).toString()
    }

    // run saveJSON() to save all posts, then test randomly picked files
    saveJSON()

    fileContent(1) shouldBe PostContent(1)
    fileContent(33) shouldBe PostContent(33)
    fileContent(100) shouldBe PostContent(100)
  }
}