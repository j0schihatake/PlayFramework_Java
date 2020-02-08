// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Develop/Java/JavaFirstPlayFramework/play-samples-play-java-rest-api-example/conf/routes
// @DATE:Sat Feb 08 22:27:12 MSK 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
