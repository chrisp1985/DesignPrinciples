Design Principles
======

Description TODO

# Low Level (Software) Design

## SOLID Principles
### Single Reponsibility
A class (or service) should have one responsibility. Don't hide extra things in a class or method, and make the method name
descriptive of what is actually going on.

### Open for Extension, Closed for Modification
Extend a class, don't edit it. Like for ifs/elses, don't just keep adding new clauses, use a strategy or state pattern
to shift the complex logic out of the class and use composition to resolve. The decorator pattern can be used, or extension
methods can be used (although these introduce coupling).

An example of this can be found in the [OldBookDecorator](src/main/java/com/chrisp1985/solid/openclosed/decorators/OldBookDecorator.java)
class.

### Liskov Principle
Similar to interface segregation, a subclass inheriting a parent shouldn't need to override a method if composition is used.

An example of this can be found in the [Book](src/main/java/com/chrisp1985/solid/liskovprinciple/Book.java)
class.

### Interface Segregation
Create interfaces that allow classes to inherit only what they need. Ie, don't throw not implemented exceptions etc, just make
the interface small and implement multiple interfaces or shift the stuff that's specific to a subclass only to that subclass.

An example of this can be found in the [Hardback Book](src/main/java/com/chrisp1985/solid/interfacesegregation/HardbackBook.java)
class.

### Dependency Inversion
The concrete implementation of the interface being injected would mean tight coupling between the concrete class and the 
injecting class. Passing the interface to the constructor means we can change the behaviour within the class by passing 
in a new dependency.

An example of this can be found in the [HardbackBook](src/main/java/com/chrisp1985/solid/dependencyinversion/HardbackBook.java)
class.

## GoF Patterns

### Strategy
The strategy pattern allows for swapping in different behaviours at runtime. Several classes can implement the same interface
to allow a class to allow for different strategies to run.

An example of this can be found in the [Payments](src/main/java/com/chrisp1985/gof/strategy/Payments.java)
class.

### Singleton
The singleton pattern allows for only one instantiation of an object to be in use. It does this by creating a private constructor
and accessing the object through a getObject() method that either a) returns the object if it's already been instantiated or
b) creates it for use. In the example case, a single book might be available in a library. You can't create multiple objects,
once it's created once, that's it.

An example of this can be found in the [DesignBookSingleton](src/main/java/com/chrisp1985/gof/singleton/DesignBookSingleton.java)
class.

### Adapter
The adapter pattern is the translation layer between two different interfaces. If a class allows for an interface to be injected
as a dependency in a constructor or method, the adapter pattern can be used to translate other implementations into the right
kind of class to be used in these methods.

An example of this can be found in the [UkToEuAdapter](src/main/java/com/chrisp1985/gof/adapter/UkToEuAdapter.java)
class.

### Decorator
The decorator pattern allows for continually wrapping around classes to add different behaviours. In the examples, we can have
a small book, a small red book, a small old red book etc. We can do that by having a decorator class that implements the
interface, and then decorators that extend the decorator class.

An example of this can be found in the [OldBookDecorator](src/main/java/com/chrisp1985/solid/openclosed/decorators/OldBookDecorator.java)
class.

### Facade
The facade basically masks a lot of method calls and classes and brings them together into one class. It means the client
(in this case, the tests) doesn't have to know where to get all of the bits to do a thing - in this case, it can find, convert
and reserve a book without needing to know the underlying services necessary.

An example of this can be found in the [LibraryFacade](src/main/java/com/chrisp1985/gof/facade/SearchService.java)
class.

### Builder
A builder removes the need to pile in a load of different attributes as method parameters and lets you set the various
parts and construct it into the necessary object at the end. This is achieved by passing back the class type for each
of the set methods so they can be chained together.

An example of this can be found in the [BookBuilder](src/main/java/com/chrisp1985/gof/builder/BookBuilder.java)
class.

### Factory
The factory method pattern aims to abstract the need for knowledge of underlying logic away from the client, allowing them
to make a simple call to a factory which then does all the heavy lifting for them.

An example of this can be found in the [ChocolateCakeFactory](src/main/java/com/chrisp1985/gof/factory/ChocolateCakeFactory.java)
class.

### Command
The command pattern allows for quick switching of behaviours. A command interface does a generic execute. All classes that
implement the command decide what 'execute' means to them. Then, when these commands are passed to a controller, the controller
can dynamically select which command to execute based on whatever has been sent via the 'setCommand' method.

An example of this can be found in the [ComputerOnOffButton](src/main/java/com/chrisp1985/gof/command/ComputerOnOffButton.java)
class.

### Observer


### Iterator


### Bridge


### Composite


### Flyweight


### Proxy


### Chain of Responsibility


### Interpreter


### Mediator


### Memento


### Template


### Visitor


### Prototype
Basically, cloning an object rather than creating a new expensive one from scratch.