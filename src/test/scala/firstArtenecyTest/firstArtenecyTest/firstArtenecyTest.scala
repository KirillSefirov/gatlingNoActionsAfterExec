package firstArtenecyTest

import com.github.phisgr.gatling.grpc.Predef._
import com.github.phisgr.gatling.grpc.protocol.StaticGrpcProtocol

package object mygrpc {

  val grpcHost: String = "localhost"
  val grpcPort: Int    = 9999

  val grpcProtocol: StaticGrpcProtocol = grpc(managedChannelBuilder(grpcHost, grpcPort).usePlaintext())


}