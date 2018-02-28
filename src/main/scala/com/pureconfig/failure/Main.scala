package com.pureconfig.failure

import com.typesafe.config.ConfigFactory

import scala.concurrent.duration.FiniteDuration

object Main extends App {

  case class A(a: Int,
               b: Double,
               c: FiniteDuration,
               d: Int,
               e: Int,
               f: Int,
               g: FiniteDuration,
               h: FiniteDuration,
               i: Map[String, Int],
               j: B,
               k: E,
               l: F,
               m: L,
               n: O,
               o: R,
               p: P)

  case class B(a: D, b: C)

  case class C(a: Int)

  case class D(a: Int)

  case class E(a: String, b: Int)

  case class F(a: String, b: G, c: H, d: I)

  case class G(a: Int)

  case class H(a: Int, b: Map[String, String])

  case class I(a: Int,
               b: J,
               c: K,
               d: Map[String, String])

  case class J(a: Int)

  case class K(a: String,
               b: FiniteDuration)

  case class L(a: String,
               b: String,
               c: String,
               d: String,
               e: Map[String, String],
               f: Option[M])

  case class M(a: Boolean, b: String, c: N)

  case class N(a: String, b: String, c: String)

  case class O(a: String, b: Int, c: Int, d: FiniteDuration)

  case class P(a: Q, b: O)

  case class Q(a: String)

  case class R(a: L)

  import pureconfig._
  val _ = loadConfig[A](ConfigFactory.load()).right.get

}
