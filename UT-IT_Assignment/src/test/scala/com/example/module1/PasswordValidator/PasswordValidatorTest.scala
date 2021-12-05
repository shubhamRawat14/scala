package com.example.module1.PasswordValidator

import org.scalatest.funsuite.AnyFunSuite

class PasswordValidatorTest extends AnyFunSuite{
  var checkPassword = new PasswordValidator()

  test("Check if password is valid or not"){
    val password = "Shubham"
    val expectedResult = false
    assert(checkPassword.isValidPassword(password) == expectedResult )
  }

  test("Check if entered password valid if length is more than 15"){
    val password = "Shubhamsinghrawat123123"
    val expectedResult = false
    assert(checkPassword.isValidPassword(password) == expectedResult )
  }

  test("Check if entered password valid if length is less than 8"){
    val password = "Rawat#1"
    val expectedResult = false
    assert(checkPassword.isValidPassword(password) == expectedResult )
  }

  test("Check if lowercase password is valid "){
    val password = "knoldus@123"
    val expectedResult = false
    //should be false bcz it doesn't contain uppercase
    assert(checkPassword.isValidPassword(password) == expectedResult)
  }

  test("Check if password without digit passes"){
    val password = "Knoldus.com"
    val expectedResult = false
    //result should be false bcz input is without digit
    assert(checkPassword.isValidPassword(password) == expectedResult)
  }

  test("Check if password without special character is valid"){
    val password = "Knoldus1221com"
    val expectedResult = false
    assert(checkPassword.isValidPassword(password) == expectedResult)
  }
}