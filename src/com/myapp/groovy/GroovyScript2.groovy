package com.myapp.groovy

def list = [new Product(id:1,name:"Iphone",price:67855.5,rating:5),
	new Product(id:4,name:"Ipad",price:47855.5,rating:4.5),
	new Product(id:3,name:"Macbook",price:167855.5,rating:5)]

println list.toSorted{ it.price }

// min max avg sum

def stats = list.stream().mapToDouble({(Double)it.price}).summaryStatistics()

println stats.getMax()
println stats.getMin()
println stats.getAverage()
println stats.getSum()
