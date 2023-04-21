package com.sbt_test_project

import org.scalatest.funsuite.AnyFunSuite

// To run: test:testOnly com.sbt_test_project.SimpleTest
    // Run with matcher: test:testOnly *SimpleTest
    // Run all tests: test
    // Run outside of SBT console: sbt test
class SimpleTest extends AnyFunSuite {
    test("simplest test possible") {
        assert("Scala".toLowerCase == "scala")
    }
}