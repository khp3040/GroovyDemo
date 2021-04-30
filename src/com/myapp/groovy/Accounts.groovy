package com.myapp.groovy
import groovy.transform.Canonical
@Canonical

class Accounts {

	BigDecimal balance;
	
	Accounts plus (Accounts other) {
	new Accounts(balance: this.balance + other.balance)
		}
	
		Accounts minus(Accounts other) {
			new Accounts(balance: this.balance - other.balance)
		}
		
		Accounts multiply(Accounts other) {
			new Accounts(balance: this.balance * other.balance)
		}
		
	}

