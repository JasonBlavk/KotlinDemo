package codelab.com.mylibrary.function

/**
 * Created by WhiteTec on 2017/5/18.
 */

class Human {
    var name: String? = null
    var age: Int? = 0
    var sex: String = ""

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age

    }

    constructor(name: String, age: Int, sex: String) {
        this.name = name
        this.age = age
        this.sex = sex
    }

    constructor(age: Int) {
        this.age = age
    }
}

var Human.city :String
    get() = sex
    set(value){
        name = value
    }

fun Human.foo() = "c"


