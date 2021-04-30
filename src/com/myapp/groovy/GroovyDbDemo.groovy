@Grapes([
	@Grab(group='org.codehaus.groovy', module='groovy-sql', version='3.0.7'),
	@Grab(group='mysql',module='mysql-connector-java',version='8.0.14')
])
package com.myapp.groovy
import groovy.sql.Sql

def db = [url:'jdbc:mysql://localhost:3306/proj_db', user:'root', password:'root',
	driver:'com.mysql.cj.jdbc.Driver']

def sql = Sql.newInstance(db.url,db.user,db.password,db.driver)

//println sql.connection

/*
 * def rows = sql.eachRow('select * from products'){ row -> println
 * row.productName }
 */
/*
 * //class MyProduct{ //// def productId, price, description; // def productName
 * = "Iphone10"; // //} //println sql.rows('select * from products where
 * productname=?.productName',[new MyProduct()])
 */



  def productInsert= ''' INSERT into products values(?,?,?,?) '''
 // sql.execute(productInsert,[1,'Macbook',17896.5,'Macbook20121Pro'])
 sql.withBatch(3,productInsert){ps ->
	 ps.addBatch(6,"oppo",12345,"OppoV7")
	 ps.addBatch(7,"vivo",54321,"VivoPro")
	 ps.addBatch(9,"Redmi",98765,"RedmiNote")
 }
  
  

/*
 * def updateProduct = ''' update products set productName="Iphone11" where
 * productId =3 ''' sql.execute(updateProduct)
 */



