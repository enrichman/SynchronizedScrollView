# SynchronizedScrollView

[![Build Status](https://travis-ci.org/enrichman/SynchronizedScrollView.svg?branch=master)](https://travis-ci.org/enrichman/SynchronizedScrollView) [![Maven Central](https://maven-badges.herokuapp.com/maven-central/it.enricocandino/synchronizedscrollview/badge.svg)](https://maven-badges.herokuapp.com/maven-central/it.enricocandino/synchronizedscrollview) [![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-SynchronizedScrollView-green.svg?style=true)](https://android-arsenal.com/details/1/3109)

Custom ScrollView that keeps fragments in a ViewPager synchronized at the same height.

<br/>
<img src="http://i.giphy.com/l0COHqmbntjDxaNFK.gif" height="428" width="240">


Download
--------

Add the dependency via Gradle:
```groovy
compile 'it.enricocandino:synchronizedscrollview:1.0.1'
```
or Maven:
```xml
<dependency>
    <groupId>it.enricocandino</groupId>
    <artifactId>synchronizedscrollview</artifactId>
    <version>1.0.1</version>
</dependency>
```

Examples
--------

Just use the SynchronizedScrollView as a normal ScrollView:

```xml
<it.enricocandino.view.SynchronizedScrollView
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:id="@+id/my_scroll_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent">

    <LinearLayout
        android:id="@+id/container"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"/>

</it.enricocandino.view.SynchronizedScrollView>
```

Check the sample for a working app!

Apps
--------

Let me know if you used the library in your project.
I will be happy to list it here!

Developed By
--------

Enrico Candino - www.enricocandino.it

<a href="https://twitter.com/enrichmann">
  <img alt="Follow me on Twitter"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/twitter-icon.png" />
</a>
<a href="https://plus.google.com/+EnricoCandino">
  <img alt="Follow me on Google+"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/google-plus-icon.png" />
</a>
<a href="https://it.linkedin.com/in/enrico-candino-78995553">
  <img alt="Follow me on LinkedIn"
       src="http://icons.iconarchive.com/icons/danleech/simple/96/linkedin-icon.png" />
</a>


License
--------

    The MIT License (MIT)
    
    Copyright (c) 2015 Enrico Candino
    
    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.

