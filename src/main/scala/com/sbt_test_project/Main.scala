package com.sbt_test_project

// CLI:
    // To start SBT: sbt
    // To compile: compile (continuous compile: ~compile)
    // To run: runMain com.sbt_test_project.Main

object Main {
    val fansiStr: fansi.Str = fansi.Color.Red("This should be a red string")
    
    def main(args: Array[String]): Unit = {
        println
        println("Testing Scala with SBT!!")
        println("Fansi text:", fansiStr)
        println
    }
}