# tmdb-sdk

A wrapper for the [TMBD](https://www.themoviedb.org/?_dc=1491949818) API. 

## Install ##

### Step 1 ###  

Add this to your root `build.gradle` file:

``` gradle
allprojects {
  repositories {
     maven { url 'https://jitpack.io' }
  }
}
```
### Step 2 ###

Add the dependency

``` gradle
dependencies {
  compile 'com.github.vpaliyX:tmdb-sdk:-SNAPSHOT'
}

```

## How to use? ##

```kotlin
val service=TMDB(Config.CLIENT_ID).moviesService
service.getPopular()
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .subscribe()
 ```
 Or you can add query parameters:
 
 ```kotlin
val service=TMDB(Config.CLIENT_ID).moviesService
service.getPopular(){
            query("1","arg")
            query("2","arg")
            query("3","arg")
       }
      .subscribeOn(Schedulers.io())
      .observeOn(AndroidSchedulers.mainThread())
      .subscribe()
 ```
 
 

