import org.scalatest._

class TestSpecB extends FlatSpec {
  "This test" should "fail" in {
    assert(1 + 1 === 3)
  }
}
