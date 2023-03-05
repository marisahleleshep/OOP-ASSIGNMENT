fun main(){
var body=human("Marisah",30,60)
    body.eat(2)
    println(body.weight)
    body.speak("I study javascript")
    body.birthday()
    println(body.age)

    var marisa = User("Marisah","Leleshep","leleshep@gmail.com","0721345671",2030)
     println(marisa.lastName)
    println(marisa.email)



}
class human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age++
    }

        }

class  User(var firstName: String, var lastName: String, var email: String, var phoneNumber: String, var password: Int) {
    fun details() {


    }

}
