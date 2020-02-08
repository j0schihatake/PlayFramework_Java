// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Develop/Java/JavaFirstPlayFramework/play-samples-play-java-rest-api-example/conf/posts.routes
// @DATE:Sat Feb 08 22:27:13 MSK 2020


package posts {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
