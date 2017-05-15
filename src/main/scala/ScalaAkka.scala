import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props

/**
  * Created by subhajit.s  on 15-05-2017.
  */
class HelloActor extends Actor {
  def receive = {
    case "hello" => println("hello back at you")
    case _ => println("huh?")
  }
}

object ScalaAkka extends App {

  val system = ActorSystem("HelloSystem")
  // default Actor constructor
  val helloActor = system.actorOf(Props[HelloActor], name = "helloactor")
  helloActor ! "hello"
  helloActor ! "buenos dias"

}
