package meetingapp

import org.junit.Test
import static org.junit.Assert.*
import static MeetingScheduler.*

public class MeetingMakerMakerTest {
  @Test
  void firstLineOfDSLSchedule() { 
    def result = schedule meeting 

    assert result == "scheduled meeting"
  }
  
  @Test
  void twoLinesOfDSL(){ 
    def result = schedule meeting{ 
      name 'early admissions'
    }

    assert result == """scheduled meeting
		|name is early admissions""".stripMargin()
  }

  @Test
  void threeLinesofDSL(){
    def result = schedule meeting{ 
      name 'early admissions' 
      starts 14:30
    } 

    assert result == """scheduled meeting
		|name is early admissions
		|start time is 14:30""".stripMargin()
  }

  @Test
  void fourLinesofDSL(){
    def result = schedule meeting{ 
      name 'early admissions' 
      starts 14:30
      ends 16:30
    } 

    assert result == """scheduled meeting
		|name is early admissions
		|start time is 14:30
    |end time is 16:30
    |duration is 2 hours and 0 minutes""".stripMargin()
  }
  
  @Test
  void fiveLinesofDSL(){
    def result = schedule meeting{
      name 'early admissions'
      starts 14:30
      ends 16:30
      on October the 10 of 2025
    }

    assert result == """scheduled meeting
    |name is early admissions
    |start time is 14:30
    |end time is 16:30
    |duration is 2 hours and 0 minutes
    |date is October 10, 2025""".stripMargin()
  }

  @Test
  void sixLinesofDSL(){
    def result = schedule meeting{
      name 'early admissions'
      starts 14:30
      ends 16:30
      on October the 10 of 2025
      participants 'Kim R.', 'Mike B.', 'Paula P.', 'Chin Z.'
    }

    assert result == """scheduled meeting
    |name is early admissions
    |start time is 14:30
    |end time is 16:30
    |duration is 2 hours and 0 minutes
    |date is October 10, 2025
    |there are 4 people going. their names are Kim R., Mike B., Paula P., Chin Z.""".stripMargin()
  }

}
