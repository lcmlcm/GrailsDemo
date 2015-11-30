package demo

class User {
	String userName
	String password
	
	String toString() {
		" $name : $password "     
    }

    static constraints = {
		userName(blank:false)
		password(blank:false,size:6..16)
    }
}
