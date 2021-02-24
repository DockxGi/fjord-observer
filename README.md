# Fjord Observer
## Description
This framework is an attempt to provide a consistent reusable structure to implement an Observer-Observable-Pattern in 
Java. We try to be more SOLID than existing solutions.

## The observables should not notify principle
Existing solutions make the Observable responsible for notifying the Observers about state changes. This is not a good 
practice because the Observable is already responsible for something else.

Example:
Let's say you have a class called Weather which is responsible for keeping weather information up to date. Other 
classes want to keep informed about the Weather:
* WarningSender (which is responsible for sending a warning SMS or Mail to people who need to be aware of severe/
dangerous weather)
* WeatherWebsite (which is responsible for updating weather information on a website)
* WeatherArchive (which is a system that stores historic information about weather information in a big database)

If the Weather class would be an Observable that contains a list of Observer classes and which has a notify method to 
notify all of these Observers when the state of the Weather changes then it would violate the Single Responsibilit 
Principle because it would  be responsible for keeping the weather information up to date and notifying all the
 Observers (and maintaining that list of Observers for that purpose.)
 
 So a better solution is to introduce a **Notifier** class which is responsible for notifying observers about
 state changes.
 
 ## Glossary
 * Observable: an object that can be observed
 * Observer: an object that must be notified when the state of the Observable changes
 * Notifier: an object that  is responsible for notifying Observers about state changes of a specific Observable
 * NotifiesObserver: name of the interface that Observer should use when communicating to the Notifier
 * WatchesObservable: name of the interface that Observable should use when communicating to the Notifier


