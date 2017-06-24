package codelab.com.mylibrary.basic.concept

/**
 * Created by WhiteTec on 2017/6/24.
 */

/**
 * Java 一些基础概念说明
 *
    成员变量和类变量的区别：
    1、两个变量的生命周期不同
    成员变量随着对象的创建而存在，随着对象的回收而释放。
    静态变量随着类的加载而存在，随着类的消失而消失。
    2、调用方式不同
    成员变量只能被对象调用。
    静态变量可以被对象调用，还可以被类名调用。
    3、别名不同
    成员变量也称为实例变量。
    静态变量也称为类变量。
    4、数据存储位置不同
    成员变量存储在堆内存的对象中，所以也叫对象的特有数据。

    静态变量数据存储在方法区（共享数据区）的静态区，所以也叫对象的共享数据。

 *
 *
 * Kotlin
 * 通过var声明可变属性，val声明只读属性
 * Kotlin类中声明的变量，都会提供默认的get、set（val没有该方法）方法，所以声明的都是属性。Kotlin中没有字段，只有幕后字段（backing filed）。
 *
 * 自定义Getters和Setters
 * value是setter的参数，其类型同于属性的类型。
   field就是我们之前说的幕后字段，用于将真正的值赋值给属性，而不会导致循环调用。它只能在属性的访问器中使用。


 */

class People {

    var name: String? = null //声明name属性
        get() {//重写get方法
            return "hhh"
        }
        set(value) {
            field  = value
        }

//        set(value) {//错误写法 会导致循环调用
//            name=value //1)
//        }


    var address: String = "地球"
    var age: Int? = null


    // =============================幕后属性===================================


    private var _table: HashMap<String, String>? = null//私有属性
    var table: HashMap<String, String>? = null
        get() {
            if (_table == null) {
                _table = HashMap<String, String>()
            }
            return _table //返回私有属性
        }

    // =============================编译期常量===================================

    /**
     * 编译期常量的使用
     */
    @Deprecated(SUBSYSTEM_DEPRECATED.toString()) fun foo() {


    }

    // =============================延迟初始化属==================================
    /**
     *延迟初始化属性lateinit 不可以构造函数中 没有自定义 getter 或 setter 并且不能是原生类型（比如Int）
     */
    lateinit var subject: String


    constructor(name :String){

    }

}


/**
 * 已知值的属性可以使用 const 修饰符标记为 编译期常量。 这些属性需要满足以下要求：
    位于顶层或者是 object 的一个成员
    用 String 或原生类型 值初始化
    没有自定义 getter
 */
const val SUBSYSTEM_DEPRECATED: Int = 1
