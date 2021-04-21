package xyz.hyperreal.pretty

import org.scalatest._
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks


class Tests extends FreeSpec with ScalaCheckPropertyChecks with Matchers {

	case class P( a: Any, b: Any )

	"tests" in {
		prettyPrint( P(3, P(4, "asdf")) ) shouldBe
			"""
				|P(
				|  a = 3,
				|  b = P(a = 4, b = "asdf")
				|)
			""".trim.stripMargin
	}
	
}