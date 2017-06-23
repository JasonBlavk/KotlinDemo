package codelab.com.mylibrary.function

import android.content.Context
import android.util.AttributeSet
import android.view.View

/**
 * Created by WhiteTec on 2017/5/26.
 */


fun main(args: Array<String>) {
//
//    loop@ for (i in 1..100) {
//        for (j in 1..100) {
//            if (j == 3) break
//            print("i = $i  j =  + $j  \n")
//        }
//    }

    DontCreateMe()

    print(Tree().year)

    printAllValues<RGB>() // 输出 RED, GREEN, BLUE


}


class TTest(var name: Int = 4) {

    fun TestAA(nxx: Int) {

    }

}


class DontCreateMe {
}

open class Outer {
    private val a11 = 1
    protected open val b = 2
    internal val c = 3
    val d = 4  // 默认为 public

    protected class Nested {
        public val e: Int = 5
    }


}

internal class Subclass : Outer() {
    // a 不可访问
    // b, c 和 d 可以访问
    // Nested 和 e 可以访问

    class C private constructor(outer: Outer) {


    }

    fun test() {
        Nested()

        val test = 1


        class ner {

        }

    }


    override val b = 5   // 'b' 可见度为 protected
}

class Unrelated(outer: Outer) {


    fun test(outer: Outer) {


    }
    // o.a, o.b 不可访问
    // o.c 和 o.d 可以访问(属于同一模块)
    // Outer.Nested 不可访问, Nested::e 也不可访问
}

class Person(val name: String) {
    constructor(name: String, age: Int) : this(name) {
    }
}

class MyView : View {

    constructor(ctx: Context) : super(ctx)

    constructor(ctx: Context, attrs: AttributeSet) : super(ctx, attrs)
}

open class Base {
    open fun v() {}
    fun nv() {}
}

class Derived() : Base() {
    override fun v() {}
}

sealed class Expr {
    open class Const(val number: Double) : Expr()
    open class Sum(val e1: Expr, val e2: Expr) : Expr()
    object NotANumber : Expr()

    class Sun(val nn: Double) : Const(nn)

    var allByDefault: Int? = 1


}

private var _table: Map<String, Int>? = null

abstract class Flower {
    abstract val leaf: Int
    var name: String

    constructor(name1: String) {

        name = name1
    }

    init {
        name = "nodefine"
    }

}

class Flow1 : Flower(",") {

    override val leaf: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}

class Flow(name1: String) : Flower(name1) {
    override val leaf: Int
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.

}


val isEmpty: Boolean
    get() = 12 == 0

open class Tree {

    var year: Int = 0
        get() {
            field += 1
            return field
        }
}

fun getPro(): Int {
    return 1
}

interface MyInterface {
    fun bar()


    val property: Int // 抽象属性
        get() = getPro() + 1

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(property)
    }
}

class Foo : MyInterface {
    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

interface MyInterface1 {
    val name: String
    val property: Int // 抽象属性

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(property)
    }
}

interface A {
    fun foo() {
        print("A")
    }

    fun bar()
}

interface B {
    fun foo() {
        print("B")
    }

    fun bar() {
        print("bar")
    }
}

class C : A {
    override fun bar() {
        print("bar")
    }
}

class D : A, B {
    override fun bar() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }
}
enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

open class D1 {
    fun bar() {}

    fun foo() {}
}

class C1 {
    fun baz() {}

    fun D1.foo() {
        bar()   // 这里将会调用 D.bar
        baz()   // 这里将会调用 C.baz
    }

    fun caller(d: D1) {
        d.foo()   // 这里将会调用扩展函数
    }
}

enum class ProtocolState1 {
    NORTH {
        override fun signal() = SOUTH
    },

    SOUTH {
        override fun signal() = NORTH
    };

    abstract fun signal(): ProtocolState1
}

enum class RGB { RED, GREEN, BLUE }



inline fun <reified T : Enum<T>> printAllValues() {
    print(enumValues<T>().joinToString { it.name })
    RGB.values()

}
