@Grapes(
	@Grab(group = 'org.codehaus.groovy', module = 'groovy-dateutil', version='3.0.7')
	)

package com.myapp.groovy

/*def Mumbai = new City("Mumbai")

def Delhi = new City("Delhi")

def peopleLivingInMumbai = [new Person('Kshitij',22), new Person('Deep',22)]
def peopleLivingInMumbai1 = [new Person('Sachin',52), new Person('Rohit',32)]

def peopleLivingInDelhi = [new Person('Virat',32), new Person('Anushka',30)]

//Map
def mumbaiCity = [:]
mumbaiCity.computeIfAbsent(Mumbai, {person -> peopleLivingInMumbai})
mumbaiCity.computeIfAbsent(Mumbai, {person->[]}).addAll(peopleLivingInMumbai1)
mumbaiCity.forEach{city, people -> println people}

def delhiCity = [:]
delhiCity.computeIfAbsent(Delhi, {person -> peopleLivingInDelhi})
delhiCity.forEach { city, people -> println people }

//merge
delhiCity.each {city, people -> mumbaiCity.merge(city, people, {mum,del -> mum}) }
mumbaiCity.forEach{city, people -> println people}*/


def today = new Date().clearTime()
def nextWeek = today + 7

today.upto(nextWeek){
	println it.format('EEEE')
}
