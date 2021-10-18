package me.chuwy.otusfp

import scala.concurrent.duration._

import cats.implicits._

import cats.effect.kernel.Resource
import cats.effect.{Ref, IOApp, IO, Deferred}

object Main extends IOApp.Simple {

  /** Process a command
   * @return true if program has to exit
   */
  def process(cmd: Command): IO[Boolean] =
    cmd match {
      case Command.Echo =>
        ???
      case Command.Exit =>
        ???
      case Command.AddNumber(num) =>
        ???
      case Command.SetDeferred =>
        ???
      case Command.RunFiber(_) =>
        ???
    }

  def program: IO[Unit] =
    ???

  def run: IO[Unit] =
    program
}
