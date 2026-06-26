package meetingapp

import groovy.transform.*

@Field static Map meetingInfo = [:]

static def schedule (event, closure = null) {
  meetingInfo.clear() 
  
  if(event.startsWith("scheduled")){
    return event
  } 

  def result = "scheduled ${event}"

  if(closure){
    closure.delegate = this
    closure() 

    if(meetingInfo['name']){
      result += """
      |name is ${meetingInfo['name']}"""
    }

		if(meetingInfo['start']){
      result += """
		  |start time is ${meetingInfo['start']}"""
    }

    if(meetingInfo['end']){
      duration(meetingInfo['start'], meetingInfo['end'])
      result += """
      |end time is ${meetingInfo['end']}
      |duration is ${meetingInfo['duration']}"""
    }

    if(meetingInfo['month']){
      result += """
      |date is ${meetingInfo['month']} ${meetingInfo['day']}, ${meetingInfo['year']}"""
    }

    if(meetingInfo['participant']){
      result += """
      |there are ${meetingInfo['count']} people going. their names are ${meetingInfo['participant']}"""
    }
  }
  result.stripMargin()
}

static def duration(start, end){
  def startParts = start.split(':')
  def endParts = end.split(':')
  def startDuration = startParts[0].toInteger() * 60 + startParts[1].toInteger()
  def endDuration = endParts[0].toInteger() * 60 + endParts[1].toInteger()
  def duration = endDuration - startDuration
  def hours = duration / 60
  def minutes = duration % 60
  meetingInfo['duration'] = "${hours} hours and ${minutes} minutes"
}

static def getMeeting() {
  "meeting"
}

static def meeting(closure) {
  schedule("meeting", closure)
}

static def name(title){
  meetingInfo['name'] = title
}

static def starts(time){
  time.each{key, value -> 
    def hour = key.toInteger()
    def minute = value.toInteger()
    time = "${hour}:${minute}"
  } 

  meetingInfo['start'] = time.toString() 
}

static def ends(time){
  time.each{key, value -> 
    def hour = key.toInteger()
    def minute = value.toInteger()
    time = "${hour}:${minute}"
  } 
  
  meetingInfo['end'] = time.toString() 
}

static def on(month) { 
  meetingInfo['month'] = "${month}"
  this
}

static def the(day) { 
  meetingInfo['day'] = "${day}"
  this
}

static def of(year) { 
  meetingInfo['year'] = "${year}"
  this
}

static def participants(String... names) {
  meetingInfo['participant'] = names.join(', ')
  meetingInfo['count'] = names.size()
}

static def getJanuary() { 'January' }
static def getFebruary() { 'February' }
static def getMarch() { 'March' }
static def getApril() { 'April' }
static def getMay() { 'May' }
static def getJune() { 'June' }
static def getJuly() { 'July' }
static def getAugust() { 'August' }
static def getSeptember() { 'September' }
static def getOctober() { 'October' }
static def getNovember() { 'November' }
static def getDecember() { 'December' }
