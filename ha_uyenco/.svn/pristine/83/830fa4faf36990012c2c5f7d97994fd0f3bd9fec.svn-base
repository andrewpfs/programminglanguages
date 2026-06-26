package dslapp


import org.scalatest.funsuite.AnyFunSuite
import dslapp.dsl._
import dslapp.dsl.schedule._
import scala.language.postfixOps


class DSLTest extends AnyFunSuite {
  test("schedule meeting should return scheduled meeting") {
    val result = schedule meeting

    assert(result == "scheduled meeting")
  }

  test("test for schedule meeting with name") {
    val result = schedule meeting {
    _ name "early admissions"
    }
 
    assert(result == """scheduled meeting
    |name is early admissions""".stripMargin)
  }
 
  test("test for schedule meeting with name and start") {
    val result = schedule meeting {
    _ name "early admissions" starts 1430
    }
 
    assert(result == """scheduled meeting
    |name is early admissions
    |start time is 14:30""".stripMargin)
  }

  test("test for schedule meeting with name and start and end and duration") {
    val result = schedule meeting {
    _ name "early admissions" starts 1430 ends 1630
    }
 
    assert(result == """scheduled meeting
    |name is early admissions
    |start time is 14:30
    |end time is 16:30
    |duration is 2:00""".stripMargin)
  }

  test("test for schedule meeting with name and start and end and date ") {
    val result = schedule meeting { 
		_ name "early admissions" starts 1430 ends 1630 on October the 15 of 2018 
	}
	
    assert(result == """scheduled meeting
    |name is early admissions
    |start time is 14:30
    |end time is 16:30
    |duration is 2:00
    |on October 15 2018""".stripMargin)
  }

  test("test for schedule meeting with name and start and end and date and participants") {
    val result = schedule meeting { 
		_ name "early admissions" starts 1430 ends 1630 on October the 15 of 2018 participants "Kim R., Mike B., Paula P., Chin Z."
	}
	
    assert(result == """scheduled meeting
    |name is early admissions
    |start time is 14:30
    |end time is 16:30
    |duration is 2:00
    |on October 15 2018
    |there are 4 participants
    |participants are Kim R., Mike B., Paula P., Chin Z.""".stripMargin)
  }
}
