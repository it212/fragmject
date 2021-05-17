# 前言
学习```Kotlin```有一段时间了，想写一个项目总结收获，就有了这个可能是东半球最简洁的玩安卓客户端，在此感谢[玩Android](https://www.wanandroid.com/) 的开放API。
# 简介
采用 Kotlin 语言编写，单Activity多Fragment，MVVM + ViewModel + LiveData + Retrofit + 协程 + ViewBinding等架构设计的项目，项目结构清晰，代码简介优雅
# 截图展示
| ![1.jpg](https://gitee.com/zhao.git/FragmentProject/raw/master/screenshot/Screenshot_1621158973.png) | ![2.jpg](https://gitee.com/zhao.git/FragmentProject/raw/master/screenshot/Screenshot_1621155363.png) | ![3.jpg](https://gitee.com/zhao.git/FragmentProject/raw/master/screenshot/Screenshot_1621155387.png) |
| ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| ![4.jpg](https://gitee.com/zhao.git/FragmentProject/raw/master/screenshot/Screenshot_1621155408.png) | ![5.jpg](https://gitee.com/zhao.git/FragmentProject/raw/master/screenshot/Screenshot_1621155418.png) | ![6.jpg](https://gitee.com/zhao.git/FragmentProject/raw/master/screenshot/Screenshot_1621155439.png) |
# 利用单activity多fragment的优势做做页面的前置拦截，实现各种登录态等校验
既然是单activity多fragment设计，那么这个activity的基本作用之一，就是用来控制fragment的切换
MainActivity有个switcher方法用来切换fragmen不用多说
主要看navigation方法，页面的前置拦截就是在这个方法里面实现的，原理也很简单就是通过Fragment类名进行拦截在做相应的处理。
```
   fun navigation(clazz: Class<out Fragment>, bundle: Bundle?, addToBackStack: Boolean) {
        if (aspectFragments.contains(clazz) && !isLogin()) {
            switcher(LoginFragment::class.java, bundle, addToBackStack)
        } else {
            switcher(clazz, bundle, addToBackStack)
        }
    }

    private val aspectFragments = listOf(
        MyCoinFragment::class.java,
        MyCollectArticleFragment::class.java,
        MyShareArticleFragment::class.java
    )
```
# 主要开源框架
- [square/okhttp](https://github.com/square/okhttp)
- [square/retrofit](https://github.com/square/retrofit)
- [google/gson](https://github.com/google/gson)
- [bumptech/glide](https://github.com/bumptech/glide)
# Thanks
  感谢所有优秀的开源项目 ^_^   
  如果喜欢的话希望给个 Star 或 Fork ^_^  
  谢谢~~  
# LICENSE
```

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
