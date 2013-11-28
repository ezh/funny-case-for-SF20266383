import org.scalatest._

class TestSpecA extends FlatSpec {
  "This test" should "succeed" in {
    assert(1 + 1 === 2)
  }
}
