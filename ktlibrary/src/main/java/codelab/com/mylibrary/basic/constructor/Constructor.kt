package codelab.com.mylibrary.basic.constructor

/**
 * Created by WhiteTec on 2017/6/23.
 */


fun main(args: Array<String>) {

    var human = Human("jack" ,12)
    var person = Person("jack")

    //person.getInfo()


    /*
        Human == init
        Human == name = jack  age = 12
        Human == init
        Human == name  jack
        Person == name = jack  surname = null
     */

}

class Person(name: String, var surname: String = "null") : Human(name) {

    var name = name

    init {
        System.out.println("Person == name = $name  surname = $surname")
    }


    fun getInfo() {
        System.out.println("Person == name = $name  surname = $surname")

    }

}

open class Human{

    init {
        System.out.println("Human == init  ")
    }

    constructor(name : String) {
        System.out.println("Human == name  " + name)

    }

    constructor(name: String, age: Int){
        System.out.println("Human == name = $name  age = $age")

    }

}