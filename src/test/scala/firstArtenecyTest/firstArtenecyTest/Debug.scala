package firstArtenecyTest.firstArtenecyTest

import io.gatling.core.Predef._
import firstArtenecyTest.firstArtenecyTest.scenarios.CommonScenario
import firstArtenecyTest.mygrpc.grpcProtocol

class Debug extends Simulation {

  setUp(
    new CommonScenario().myExampleTestScenario // запускаем наш сценарий
      .inject(atOnceUsers(3)),
  ).protocols(grpcProtocol)
    .maxDuration(15)


}