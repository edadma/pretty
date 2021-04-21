package xyz.hyperreal.pretty

object Main extends App {

  case class P(a: Any, b: Any)

  println(prettyPrint(P(3, P(4, "asdf")), classes = true))

}
