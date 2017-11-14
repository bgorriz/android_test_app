# Task

The task is to create Android app which shows a list of messages and supports deletion.


## Input data
Messages should be downloaded from this endpoint:

```
https://rawgit.com/wireapp/android_test_app/master/endpoint/{PAGE}.json
```

Where `{PAGE}` is a number, starting from `0`.
In our example those are static files, and there is only 10 of them, but in production app this files could be changing,
and there could be many more pages. Client should fetch new pages until it gets `404`.

## Requirements
Your app should:

- download messages from specified endpoint
- display messages in scrollable list on screen
- give user a way to delete specific message, preferably by swiping, but long press is also acceptable

Everything else is up to you, implement it however you want.
Feel free to add more features that you think would be nice and will show your skills.
Take as much time as you need.

As always, clean and tested code counts the most.

## Suggestions for bonus points

- lazy loading, client doesn't need to load all available messages on start, notice that messages are sorted,
and more pages can be fetched when user scrolls through the list
- caching, it would be good if the app was able to display previously fetched messages even when it is restarted without
network connection, it could also remember what entries were previously deleted
- inline images, some messages contain a link to an image, it owuld be nice to display those images inline

## For Scala applicants
Provided in the source code above is a simple scala-on-android application using the [sbt-android](https://github.com/scala-android/sbt-android) plugin. Feel free to use this template or write your own build setup if you prefer. Please quickly read the introduction on the sbt-android plugin website and follow their instructions carefully (e.g., using IntelliJ instead of Android Studio - if you so choose!). The guide also includes steps for installing the `ANDROID_SDK` which you will need installed on your system in order to run the project. Plenty more information on the android platform can be found on the [Android Developer Website](https://developer.android.com/index.html)

After cloning the project, you should simply be able to run `sbt android:install` from the `scala-template` directory, and the application will be built and installed on a connected device or emulator.

Furthermore, some other tips for a smoother development experience in IntelliJ:
* Ensure that the project SDK is Android Java, and not just Java
* From the SBT android plugin: To ensure proper building, configure the IDE Run command to execute an SBT android:package task instead of Make (remove the make entry); this is found under Run Configurations.
* Make sure that you mark the `target` directory as `Not Excluded` in order for the R class to appear as compiled
* Once that is done, IntelliJ should notice that you have an Android project - configure it, and you can use Android Monitor

If anything is unclear, please let us know.


## General
 * This application was last tested out on 14.11.2017 and everything went smoothly. If you're unable to just clone and build, please let us know. We care more about your ability to build an app than we do about your ability to google for sbt hacks :)
