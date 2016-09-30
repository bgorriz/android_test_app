# Task

The task is to create Android app which shows a list of messages and supports deletion.


## Input data
Messages should be downloaded from this endpoint:

```
https://rawgit.com/wireapp/android_test_app/master/{PAGE}.json
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

