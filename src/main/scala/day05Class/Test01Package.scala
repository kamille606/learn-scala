package com {

  object Outer {
    val out: String = "123"
  }
  package lain {
    package scala {
      object Inner {
        def main(args: Array[String]): Unit = {
          println(Outer.out)


        }
      }
    }
  }

}
