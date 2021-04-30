package com.myapp.groovy

def csvFiles = []
def products = []

String dir = 'C:/DevOps-WorkSpace/GroovyDemo/data'

new File(dir).eachFile{
	file -> if(file.name.endsWith(".csv")) {
		csvFiles << file
	}
}
//csvFiles.each {println it}

csvFiles.each { file -> file.splitEachLine(","){
	lines -> products << new Product(id:Integer.parseInt(lines[0]),
		name:lines[1],rating:Double.parseDouble(lines[2]),
		price:Double.parseDouble(lines[3]))
		}
}

//products.each {println it}

println "Enter product name"
def productName = System.in.newReader().readLine()
products.stream().filter{product -> product.name.equalsIgnoreCase(productName) }.each { println it }
