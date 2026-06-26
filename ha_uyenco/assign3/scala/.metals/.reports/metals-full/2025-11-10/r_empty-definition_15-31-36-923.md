error id: file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign3/scala/dslapp/src/main/scala/dslapp/App.scala:scala/collection/SeqOps#size().
file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign3/scala/dslapp/src/main/scala/dslapp/App.scala
empty definition using pc, found symbol in pc: scala/collection/SeqOps#size().
empty definition using semanticdb
empty definition using fallback
non-local guesses:
	 -name/size.
	 -name/size#
	 -name/size().
	 -scala/Predef.name.size.
	 -scala/Predef.name.size#
	 -scala/Predef.name.size().
offset: 2335
uri: file:///C:/Users/andre/projects/uhcs/ha_uyenco/assign3/scala/dslapp/src/main/scala/dslapp/App.scala
text:
```scala
package dslapp


object dsl{
  object schedule{
    private var meetingName = ""
    private var startTime = ""
    private var endTime = ""
    private var date = ""
    private var duration = ""
    private var peopleList = ""
    private var peopleCount = 0


    def name(name: String) = {
      meetingName = name
      this
    }
    def starts(time: (Int)) = {
      var hour = time/100
      var minute = time - hour*100
      startTime = s"${hour}:${minute}"
      this
    }
    def ends(time: (Int)) = {
      var hour = time/100
      var minute = time - hour*100
      endTime = s"${hour}:${minute}"
      this
    }
    def on (month: String) = {
      date += month + " "
      this
    }
    def the (day: Int) = {
      date += day + " "
      this
    }
    def of (year: Int) = {
      date += year
      this
    }


    def totalDuration(startTime: String, endTime: String) = {
      val startMinutes = startTime.split(":")(0).toInt * 60 + startTime.split(":")(1).toInt
      val endMinutes = endTime.split(":")(0).toInt * 60 + endTime.split(":")(1).toInt
      val hours = (endMinutes - startMinutes) / 60
      val minutes = (endMinutes - startMinutes) % 60
      duration = f"$hours:$minutes%02d"
    }
   
    def meeting: String = "scheduled meeting"
    def meeting(closure: schedule.type => Unit): String = {
      meetingName = ""
      startTime = ""
      closure(this)
      var result = "scheduled meeting"
      if (meetingName.nonEmpty) result += s" name is $meetingName"
      if (startTime.nonEmpty) result += s" start time is $startTime"
      if (endTime.nonEmpty) {
        totalDuration(startTime, endTime)
        result += s" end time is $endTime"
        result += s" duration is $duration"
      }
      if (date.nonEmpty) result += s" on $date"
      if (peopleCount != 0) result += s" there are $peopleCount people"
      if (peopleList.nonEmpty) result += s" participants are $peopleList"
 
      result
    }


   /* def participants(name: String) = {
      val list = name.split(",").map(_.trim)
      peopleList += list.mkString(", ")
      peopleCount = list.length
      this
    }
*/
    def participants(name: String *) = {
      peopleList += name.mkString(", ") + " "
      peopleCount += name.si@@ze
      this
    }

    def January: String = "January"
    def February: String = "February"
    def March: String = "March"
    def April: String = "April"
    def May: String = "May"
    def June: String = "June"
    def July: String = "July"
    def August: String = "August"
    def September: String = "September"
    def October: String = "October"
    def November: String = "November"
    def December: String = "December"
   
  }
}

```


#### Short summary: 

empty definition using pc, found symbol in pc: scala/collection/SeqOps#size().