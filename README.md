先吐槽一下，hello world的Demo好写，但实际开发中坑很多。

之前，用Android.mk编译，写了一个Hello World，OK。但之后，项目中4个凯源类库多文件夹下，LOCAL_C_INCLUDES等宏无效，编译的时候一直报错找不到.h文件；又在Application中使用APP_系列宏，依旧找不到。
无奈，我在谷歌开发者论坛上发帖，还没等到大神来帮我。

偶然发现，尽管Android Studio下编译失败，但在终端命令行下编译是成功的。我把它当bug提交给了官方。

尽管终端下ndk－build， OK；但却不能享受自动计算文件依赖。如：jni下有main.c common/hello.c等多个源文件，使用Android.mk只需指定main.c，其他的工具会自动帮我们处理——很爽吧；ndk-build就必须完全自己处理了。


由于很不爽，这个问题就没就此结束。从githib上clone下官方sample（新版ndk里没有demo，自己git clone https://github.com/googlesamples/android-ndk）, demo里所有的项目都是使用gradle编译的。
我特意修改测试了下include路径及源文件自动推导，OK！！！这回爽了。


最后的问题，如何帮项目从Android.mk build改成gradle build， 参照http://tools.android.com/tech-docs/new-build-system/gradle-experimental。

我尝试修改，第一次commit：android.mk build；改成gradle build后再cmmit。大家可以参考下，使用git/tig查看很方便。