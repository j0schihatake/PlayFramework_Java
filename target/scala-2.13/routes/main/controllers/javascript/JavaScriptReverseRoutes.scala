// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Develop/Java/JavaFirstPlayFramework/play-samples-play-java-rest-api-example/conf/routes
// @DATE:Sat Feb 08 22:27:12 MSK 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:1
package controllers.javascript {

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}
