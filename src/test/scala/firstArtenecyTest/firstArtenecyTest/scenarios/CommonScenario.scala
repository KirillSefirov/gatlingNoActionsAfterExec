package firstArtenecyTest.firstArtenecyTest.scenarios

import com.github.phisgr.example.chat.{ChatServiceGrpc, GreetRequest}
import io.gatling.core.Predef._
import io.gatling.core.structure.ScenarioBuilder
import com.github.phisgr.gatling.grpc.Predef._

class CommonScenario {

  val myExampleTestScenario: ScenarioBuilder= scenario("Nothing After Grpc")
    .exec{session =>
      println("BEFORE GRPC")
      session
    }
    .exec(
    grpc("Expect UNAUTHENTICATED")
      .rpc(ChatServiceGrpc.METHOD_GREET)
      .payload(GreetRequest(username = "Test User"))
      )
    .exec{session =>
      println("AFTER GRPC")
      session
    }
//  .during(31) {
//    pause(1.seconds)
//  }

}