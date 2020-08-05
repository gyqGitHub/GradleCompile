package com.hsb.gradlecompile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * 对于给定的构建变体，如果 Gradle 遇到两个或更多个源代码集目录定义了同一个 Java 类的情况，就会抛出构建错误。
 * 例如，在构建调试 APK 时，您不能同时定义 src/debug/Utility.java 和 src/main/Utility.java。
 * 这是因为，Gradle 在构建过程中会查看这两个目录并抛出“重复类”错误。
 * 如果您希望不同的构建类型有不同版本的 Utility.java，则可以让每个构建类型定义各自的文件版本，
 * 而不是将其包含在 main/ 源代码集中。
 */
class DebugMainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("gyq",resources.getString(R.string.dk_aos_version))
    }
}