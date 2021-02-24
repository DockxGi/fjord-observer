#Fjord Observer

### Version 1.0-SNAPSHOT
This version contains the initial setup of the fjord-observer framework.

#### Features
* ADD interface Observer for classes that want to be notified about object state changes
* ADD interface Observable for classes that can be observed by Observers
* ADD interface Notifier for classes that are responsible for notifying Observers of state changes of an Observable
* ADD interface NotifiesObservers (part of the Notifier interface that Observers should use)
* ADD interface WatchesObservable (part of the Notifier interface that Observable should use)
* ADD AllObserversNotifier which is a Notifier that will notify all Observers


