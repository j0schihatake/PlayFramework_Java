// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Develop/Java/JavaFirstPlayFramework/play-samples-play-java-rest-api-example/conf/posts.routes
// @DATE:Sat Feb 08 22:27:13 MSK 2020

package v1.post;

import posts.RoutesPrefix;

public class routes {
  
  public static final v1.post.ReversePostController PostController = new v1.post.ReversePostController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final v1.post.javascript.ReversePostController PostController = new v1.post.javascript.ReversePostController(RoutesPrefix.byNamePrefix());
  }

}
