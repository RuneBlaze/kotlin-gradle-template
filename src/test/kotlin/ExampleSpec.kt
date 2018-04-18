import io.kotlintest.specs.StringSpec
import io.kotlintest.matchers.*

class ExampleSpec : StringSpec({
    "length should return size of string" {
        "substring" should include("sub")
    }
})