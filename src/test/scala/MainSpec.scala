import org.scalatest._
import flatspec._
import matchers._
import Main._
import scala.io.Source

class MainSpec extends AnyFlatSpec with should.Matchers {

  "saveJSON()" should "save post from https://jsonplaceholder.typicode.com/posts/<id> to output/<id>.json\"" in {

    // copied from https://jsonplaceholder.typicode.com/posts/1
    val text1 = "{\n  \"userId\": 1,\n  \"id\": 1,\n  \"title\": \"sunt aut facere repellat provident occaecati excepturi optio reprehenderit\",\n  \"body\": \"quia et suscipit\\nsuscipit recusandae consequuntur expedita et cum\\nreprehenderit molestiae ut ut quas totam\\nnostrum rerum est autem sunt rem eveniet architecto\"\n}"
    saveJSON(1)

    // copied from https://jsonplaceholder.typicode.com/posts/33
    val text33 = "{\n  \"userId\": 4,\n  \"id\": 33,\n  \"title\": \"qui explicabo molestiae dolorem\",\n  \"body\": \"rerum ut et numquam laborum odit est sit\\nid qui sint in\\nquasi tenetur tempore aperiam et quaerat qui in\\nrerum officiis sequi cumque quod\"\n}"
    saveJSON(33)

    // copied from https://jsonplaceholder.typicode.com/posts/100
    val text100 = "{\n  \"userId\": 10,\n  \"id\": 100,\n  \"title\": \"at nam consequatur ea labore ea harum\",\n  \"body\": \"cupiditate quo est a modi nesciunt soluta\\nipsa voluptas error itaque dicta in\\nautem qui minus magnam et distinctio eum\\naccusamus ratione error aut\"\n}"
    saveJSON(100)


    Source.fromFile("./output/1.json").mkString shouldBe text1
    Source.fromFile("./output/33.json").mkString shouldBe text33
    Source.fromFile("./output/100.json").mkString shouldBe text100
  }
}