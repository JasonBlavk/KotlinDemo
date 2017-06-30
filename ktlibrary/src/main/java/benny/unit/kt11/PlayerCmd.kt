package net.println.kt11

/**
 * Created by benny on 11/27/16.
 *
 * 密封类 子类只能在类内部 和 同一个文件中
 *
 * 枚举 每一种类型只有一个实例
 * sealed 只有一个实例 用object，多个实例的话 就用class
 */
sealed class PlayerCmd {
    class Play(val url: String, val position: Long = 0): PlayerCmd()

    class Seek(val position: Long): PlayerCmd()

    object Pause: PlayerCmd()

    object Resume: PlayerCmd()

    object Stop: PlayerCmd()
}
