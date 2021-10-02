# Design Pattern w/ Java
Placing distinction on writing high quality code. Not good enough to just produce the correct output, but code that is easy to maintain, properly cohesive and loosely coupled.
Instructor: Jason Fedin

## Structure
* Overview of Design Pattern (DP)
* Benefits of DP (why use DP?)
* Types of DP: Each identifies a subset of pattern that can be used to solve specific problems
    * Creational - creating instances of objects
    * Behavioral - patterns in objects' communication
    * Structural - structure of object
* Important Design Principles and strategies related to Design Patterns (in Java): All the design patterns are going to employ these principles and strategies to relate the Design Patterns to these concepts. DP uses design principles. So basically, the characteristics of DP.
    * Design Smells: things seen in code that tells there's a problem with the design
    * Programming to an interface
    * Composition over Inheritance
    * Delegation Principles
    * Single Responsibility (Cohesion): objects should do small focused thing
    * Open-Closed Principle: objects are open for extension (extensibility), but close for modification
    * Liskov Substitution Principle
    * Interface Segregation Principle
    * Dependency Injection and Dependency Inversion
* UML
    * class diagrams
    * object-oriented concepts in UML (inheritance, interfaces, composition, annotation)
* Creational DP
    * Factory
    * Abstract Factory
    * Singleton
    * Builder
    * Prototype
* Structural DP
    * Adaptor
    * Bridge
    * Composition
    * Decorator (Sub-classing)
    * Facade
    * Flyweight
    * Proxy
* Behavioral DP
    * Chain of Responsibility
    * Command
    * Interpreter
    * Iterator
    * Mediator
    * Momento
    * Observer
    * State
    * Strategy
    * Template Method
    * Visitor 
* Includes...
    * organization around theory
    * the why behind and
    * many demonstrations (hands on coding)
* Outcome
    * understand the fundamentals of DPs
    * create Java apps that use DPs
    * master the art of problem solving in programming using efficient, proven and right methods (approaches)
    * learn how to write high quality Java code - modular, high cohesion and low coupling
    * become proficient in basic design principles
    * enjoy & have fun!
    
## Overview
* There things we do in our daily routine that we can recognize that it gets repeated all the time. Let's call it Routine/Pattern.
* Similarly, in the Software community certain solutions to a problem gets repeated and are addressed in a particular standard  way. Let's call it Design Pattern.
* Design Patterns are aimed towards Object-Oriented programming languages
* Helps design OO software and reusable OO software
* Design Patterns also provide a standard and direction in solving a common software problem
* Design Patters _are recurring solutions to redesign problems that you see over and over. - [SmallTalk Companion]_. 
They are standard solutions provides to recurring and common design problems.
* They represent the best practices that are used by experienced object-oriented software developers 
    * to solve general/common problems that the software developers face during software development
    * and these software solutions has been tried and tested over substantial period of time
    * not just only about the design of object but also involves the interaction of objects

#### History
* The concept of design pattern originated from Christopher Wolfgang Alexander
    * in Australia, who was a building architect   
    * had no computer programming skills in writing software
* He said, "Each pattern describes a problem which occurs over and over again in our environment, and then describes the core of the solution to that problem, in such a way that you can use this solution a million times over, without ever doing it the same way twice" (Alexander)
* In 1994 - 1995, the "Gang of four" applied Alexander's concepts to software development
    * Gang - Enrich Gamma, Richard Helm, Ralph Johnson and John Vlissides
    * they came up with the 23 design patterns   
    * expressed solutions in terms of Objects and Interfaces instead of Walls and Doors (from architect view)
    * applied the idea of patterns to software and called it Design Patterns
    * published a book "Design Patterns - Elements of Reusable Object-Oriented Software (Addison Wesley, 1995)"
    * they did not create these patterns described in the book - they documented them
* the 4 essential elements
    * pattern name to describe it 
    * solve problem
    * provide solution - not implementation specific (cus it works with other languages)  
    * consequences - result on space, memory, performance, trade-offs

#### Advantages
* uses the best solutions for certain problem faced during software development
    * reusable software
    * unexperienced devs learn software design easily and faster
    * avoids reinventing the wheel 
* helps understand OOP principles to achieve high quality code design
    * encapsulation, inheritance, polymorphism 
* improves ind'l and team communications by establishing a common terminology/platform
* gives a higher perspective on a problem
    * shift the level of thinking to a higher perspective
* improves modifiability and maintainability

## Types of Design Patterns
There 23 Patterns differ at levels of granularity, abstraction and how they relate to one another
* some patterns often used together - Composite and Iterator/Visitor
* some patterns are alternatives - Prototype and Abstract Factory
* similar designs but different intents - Composite and Decorator

Grouped into 3 main types. Organized by their purpose (Gang of four)
1. **Structural**: deal with the composition of classes or objects 
2. **Creational**:  concern the process of object creation
3. **Behavioral**: the way objects/classes interact, relate with one other, and distribute responsibility.
_[Flow-tip]: structure class, create object, control its behavior_

Organization by Scope (whether classes or objects)
1. **Class Patterns**: applies to relationship between classes and their subs. These relationships are established through _inheritance_.
2. **Object Patterns**: applies to relationship between objects. Can be changed at runtime making them more dynamic. Describes how objects can be composed into larger structures through object _composition_ and polymorphism.   

#### Creational Patterns
* Provides a way to create objects. In Java, the _new_ operator is used. 
`erbynn = new Erbynn()`
* But in creational design patterns, abstraction concept is used in the instantiation process. What's even abstraction?
    * hiding details, ie the creation logic is hidden
    * encapsulates the knowledge about which concrete class is used
    * programmer calls a method or use another object, rather than instantiating objects directly using the _new_ operator
* all that the system at large knows the objects is, their interfaces as defined by abstract classes
    * informs what get created, who creates it, how and when it gets created   
    * interface and abstract classes are used interchangeably.
        * similarly, both aren't instantiatable
        * by contrast, abstract has properties but interface doesn't, abstract has default behaviours whilst interface may not have (Java 11 allows).
* They could be 
    * competitors - either Prototype or Abstract Factory could be used profitably
    * complementary - Builder can use other patterns, Prototype can use Singleton in its implementation 
* Made of **5 patterns**: 
    1. Builder
    2. Prototype, 
    3. Factory
    4. Abstract Factory
    5. Singleton

#### Structural Patterns
* describes how classes and objects can be combined into larger form. 
    * ways to assemble objects 
    * usually uses _interfaces_
* deals with class and object composition
    * eg. Composite design pattern deals with how to build classes hierarchy made of 2 kinds of objects
* Made of **7 patterns**: 
    1. Adaptor
    2. Bridge
    3. Composition
    4. Decorator (Sub-classing)
    5. Facade
    6. Flyweight
    7. Proxy

#### Behavioural Patterns
* describes communication between objects
    * involves complex control flow that is difficult to follow at run-time
    * helps put focus on how objects are interconnected than the control flow
        * eg. Iteration of items
* concerned with algorithms and which object is assigned a task
    * behavioral class patterns uses _inheritance_ to describe algorithms and flow of control
    * behavioral object patterns uses _composition_ to describe how group of objects cooperate to perform a single task that no single object can do it alone
* terms: loosely coupled => less dependencies, easy to maintain, change to one doesn't affect another...cohesive => relate to responsibility, focus of an object. highly cohesive object is one with many responsibilities/doing too many things. difficult to modify, fix bug and maintain 
* made  of **11 patterns**:
    1. Chain of Responsibility
    2. Command
    3. Interpreter
    4. Iterator
    5. Mediator
    6. Memento
    7. Observer
    8. State
    9. Strategy
    10. Template Method
    11. Visitor
    
#### Selecting and Using Design Patterns

## Principles and Strategies of Design
#### Overview
Design patterns use these principles. Helps understand design patterns

#### Design Smells
They are structures in the design that violate the fundamental design principles which negatively affect design quality.
Need to be aware of design smells while following design principles.
Common characteristics of design smells includes;
* Rigidity
    * difficulty to change software
    * a change affect other subsequent change in dependency module (tightly coupled)
* Fragile
    * a single change breaks other places
    * extensibility causes a likelihood of introducing unexpected problems
* Immobility
    * parts that could be used in other systems cannot be separated from the original
* Viscosity
    * a design preserving change is more difficult to use than a hack
* Needless repetition
    * copy and pasting code through the system
* Opaque 
    * when code is not written in a clear and expressive manner
    * difficult to understand
* Needless complexity
    * striving for perfection causing over designing and making code more complex
    * quality design is lightweight, flexible, easy to read, understandable and modifiable

Focus: to achieve **highly cohesive (responsibility)** and **loosely coupled (dependency)** design, code and solution.

DESIGN PATTERS ARE AWESOME!...since they solve the above problems and ensure high quality design in application

#### Programming to an Interface
Simply means programming to a super type.
* variables not instantiated on a particular concrete class
* always program for an interface and not the actual implementation
* client (caller) need not to know the specific types of object and the class that implement these objects
* reduces implementation dependencies between subsystems
* interface types (eg. IAnimal) can be used on
    * variable types
    * method return types
    * method parameter types
* **polymorphism** makes it possible to program to supertypes (interfaces)

##### Polymorphism
Recall: Abstract class Animal having two concrete implementations, Cat and Dog <br>
Program to an implementation; 
```java
Dog doga = new Dog();
doga.bark();
``` 
> Forces to code to a concrete implementation. 
> Doesn't hide concrete implementation.

Program to an interface/supertype
```java
Animal animal = new Dog();
animal.makeSound();
```
> better, rather than hardcoding the instantiation of the subtype(new Dog() on the left side).
> calls method in abstract class.
> animal reference used polymorphically.
> assigns the concrete implementation of the object at runtime.

improved;
```java
animal = getAnimal();
animal.makeSound()
```
> actual animal subtype(Dog) is encapsulated, hidden, unknown

Abstract Classes Vs Interfaces
* interface variables are public static final. abstract can be private and protected too
* interface methods are public or public static. abstract can be private and protected too
* utilize abstract class to group and share code among related classes
    * utilize interfaces on unrelated classes
* utilize interfaces if u wanna specify the behavior of a particular data type (like Animal)
* utilize interfaces if u want multiple inheritance
> all depends on the use case

##### Composition over Inheritance
Another design principle which deals with using 'has-a' relationship over 'is-a'.
'is-a' => tightly coupled
'has-a' => loosely couples
* Composition: use of HAS-A relationship btn classes in OO design
    * something being a part of another thing
    * a class contains another class as its member variable
    * implies the child class cannot exist independently without the parent
    * eg - wheels on an airplane, rooms in a house, cells in a body (when body is destroyed, cells get destroyed)
    * _used in many design patterns_
* Aggregation: HAS-A relationship b/n object where child can exist independently without the parent
    * weak connection compared to Composition
    * can exist separately
    * eg - students in a class (get rid of class and the student still exist), tires on a car (tire can be taken off and be installed on different ones )
* Vs = composition's child life is completely controlled by the parent unlike aggregation
* Why Composition over Inheritance
    1. help keep each class encapsulated and focused on one task. keeps class hierarchies small preventing them grow into unmanageable monsters
    2. inheritance breaks encapsulation since subclasses heavily depend on the parent/base class behavior
        * changes in super class, may break sub class's behavior
        * inheritance = tightly coupled...composition = loosely coupled
    3. most design patterns favor Composition over Inheritance
        * Strategy
        * Decorator
        * If design pattern uses Composition then that means it has been tried and tested severally
    4. composition offers better test-ability of a class than inheritance
        * can easily provide a mock implementation
        * for inheritance, u gotta mock both the super and subclasses
    5. software reuse   
        * composition is more reusable
        * developers turn to use inheritance for the sake of code reuse
        * composition is more flexible and extensible when reusing existing code
        * composition allows for code reuse from a _final_ class     
            * impossible for final class to be inherited(extended) in Java
> Composition = maintainability + extensibility; Inheritance = reuseability (there a other ways to achieve reuse);

##### Delegation 
One class 'delegating' its behavior to anther class
* the class doesn't do all stuff by itself
* forwards certain method calls to another class (called delegate)
* the class simply calls other class which knows _what_ needs to be done, without knowing _how_ the other class does it

an example of object composition
   * another way of software reuse with composition over inheritance
     
makes you think of which message to forward/delegate
   * doesn't force subclasses to accept methods of super class unlike inheritance

primary advantage is run-time flexibility

examples:
* the equals() and hashcode() - the class itself does comparison(compare two objects) instead of client class(caller) doing that check 
* event delegation - event delegated to handlers to handle
* if class B, and delegated class A. use delegation if A is final but want to enhance it

design patterns that uses delegation principle
   * State - object delegates request to State object that represent the current state
   * Strategy - obj delegates a specific request to an obj that represents a strategy(or has a strategy) for carrying out a request
   * Visitor - operation that get performed on each element of an object structure is always delegated to the Visitor object

##### Single Responsibility
This states that every class should have only one job.
* one class responsible for one task(or functionality) among a whole set of responsibilities that the system has

closely related to the concepts of **coupling** and **cohesion**
* coupling: degree of how interdependent software classes and methods are
    * how closely connected two classes or methods are (the strength of relationship b/n classes)
    * tight coupling => two classes/methods are closely connected (change in one module affect another) 
    * low coupling => small dependencies (easier to change code without affecting other part)
* cohesion: what the class(or method) can do (how focused a class/method is)
    * low cohesion => class does variety of different things (ie, unfocused)
    * high cohesion => class is focused on what it does

aims: limiting the impact of change by designing low/loosely coupled classes that are highly cohesive 

eg of responsibilities
* persistence
* validation
* notification 
* formatting
* parsing
* mapping
* class instantiation 

##### Open Close Principle
Classes and methods should be Open for extension(new funtionality) and Close for modification
* class should be easily extendable without modifing the class itself
* code that new functionality can be added without changing existing code
* "the most important principle of oop design"
Aims: prevents touching dependency while changing code + reduces tight coupling 
 
##### Liskov Substitution Principle
States that object of a superclass can be replaceable with objects of its subclasses without breaking the application
* requires that methods which uses superclass type must be able to work with the subclass without any issue
* LSP is closely related to the Single responsibility principle
* related to the open/close principle 

How to fix?: through inheritance
 
##### Interface Segregation Principle
Client should not be forced to implement an interface if there exist a method they do not use
* happens when an interface has many functionalities and not all will be used
* if done, it's just to compile...this is referred as a **"fat"** interface
* this principle, avoids design drawbacks that are associated with a fat interface by refactoring each **fat** interface into multiple segregated interfaces to achieve a **lean interface** (methods of specific purpose)

How to fix?: split the interface into multiple based on one functionality

##### Dependency Inversion Principle
Higher level classes must not depend directly on lower level classes
* both higher and lower classes should depend on abstraction(interface)
* lower level classes is accessible to higher level classes via **abstract interface**
        * cus the actual implementation of lower level classes can vary
* no variable to have a reference to a concrete class
    * use factory design to avoid this

"Inversion" in the name => inverts the way we think about OO design
    * ie, from top-to-bottom level, with bottom-to-top with abstraction

Similar to "Program to an Interface, not an actual implementation"
    * IDP makes stronger emphasis on abstraction
  
It's the **central underlying principle** in design pattern   
 
##### Dependency Injection Principle
A class, A has a **dependency** on another class, B, if class A uses an instance of class B.
* called **class dependency** 
* if class A uses the 'new' operator to instantiate class B, this is called **hard dependency**
* classes needs to be independent as possible via Dependency Injection
    * increases class resuse
    * ability **test** classes independently
    * makes code flexible and maintainable
* this principle solves the **hard dependency**

Dependency injection => technique whereby one object supplies the dependencies of another
* enables replacement of dependencies without changing the class that uses it
* dependency => object that can be used (say a service)
* injection => way of passing dependency(service) to the dependant object(client) that would use it
* improves **Dependency Inversion**
    * main focus => introduces interface b/n lower level class and higher level class
    * *however, dependency exist since only decouples lower level class but not its instantiation*  
* 4 guides to achieve Dependency Injection
    1. the service to be used
    2. the client that uses the service
    3. the interface implemented by service and uses by client
    4. the injector that creates the service instance and injects into the client
    
> guide 1 - 3 => achieves Dependency Inversion
> plus 4 => achieves Dependency Injection  

* why / benefits: 
    * removes hard-coded dependency
    * loosely coupled application
    * extendable and maintainable
    * testable

* injection types
    * constructor injection
    * setter injection: client exposes a setter method
    * interface injection
    
    
### UML
Documentation that describes the design pattern
  * an acronym that stands for "Unified Modelling Language" 
  * modelling => activity carried out in software dev during the design phase
  * UML => modelling language to create models and providing standard way in visualizing the design of a system 
    * documenting tool to illustrate object and their relationships
    * aim: communication of design concepts among team members
    * demonstrate design concepts like abstraction, polymorphism, encapsulation
    * 9 types of UML diagrams
        * Class diagram
        * Object
        * Use case
        * Sequence
        * Collaboration
        * Activity
        * Statechart
        * Deployment 
        * Component
        
NB: Cover the implementation before the theory

## Design Patterns

### 1. Factory Method
* falls under creational pattern
    * factory handles the details of object creation by defining an interface for creating an object (Creator)
* gives way to encapsulate the instantiation of concrete types
    * promote the approach of coding to an interface rather than an implementation
    * provides abstraction b/n implementation and client classes through inheritance
* defines an interface for creating objects 
* used when
    * a class wants its subclasses to specify the object it creates
    * a class needs to instantiate a subclass of another class, but does not know which one
        * it lets the subclass decides which class to instantiate
* benefits
    * decouples the business logic of creation of a class from its actual logic of the class 
        * ie. decouples the implementation of product (object) from its use
    * makes code more robust, less coupled and easy to extend
* ways of implementing Factory method
    * Factory (Abstract Creator)
    * Factory (Concrete Creator)
    * Factory (Static Method Creator): also called the Static Factory

### 2. Abstract Factory Method
* a creational pattern
* provides an interface for creating families of related object or dependent object without specifying their concrete classes
* it's a **"factory of factories"**. A super factory that creates other factories
    * factory method is a subset of Abstract Factory
* creates objects via abstractions
* methods are implemented as factory methods
* there's often on Concrete class implemented for each family
* * *todo:** implementation...

### 3. Singleton Method
* a creational pattern
* example
    * logging service

### 4. Builder Pattern
* creational pattern
* the builder pattern separates the construction of a complex object from its representation
    * used when there is a lot of complexity in creating an object
    * creation of object vary. it depends on the parameters / requirement
    * uses the same construction processes to create same object but these processes can create different representation of the object
    * the builder class is independent of other objects
* useful when creating an object is very complex and the object is independent of the assembly of the parts of the object
    * for building composite structures (many has-a relationships)
    * when object has many internal representations
    * when object demands many arguments / attributes
    * when the complex object does not depend on its individual parts that make up the object and how they are assembled
    * when the construction process must allow different representations(or requirements) for the object that is constructed
* examples
    * 1. creating a computer
        * can see that different parts a assembled depending on the demand of the customer
            * customer A can demand a 500GB hdd and intel processor
            * customer B can demand a 315GB ssd with AMD processor
            * NB: all these will still make a computer buh with diff specs 
    * 2. building a vacation planner for Disney World
        * different packages available for a booking
            * guests can choose a hotel and various types of admission tickets
            * guests can make restaurant reservations, and even book special events
            * therefore, this requires flexible design
                * each guest can have a diff # of days and types of activities
                * local resident might not need a hotel, but wants to book for dinner
                * external guest will hotel, dinner and special activity
* why Builder Pattern? 
    * solves problems with Factory and Abstract Factory patterns
        * these patterns don't work well when the object to created requires a lot of attributes
        * 3 major issues caused on that
            * too many args to be passed from client to the Factory class
                * difficult to maintain the order of the args on the client side
            * some args might be optional 
                * client is force to send NULL to optional params in the Factory class
            * factory class will be complex
                * if the object is heavy and complex to create
        * temp solution
            * pass required params to the Factory class constructor and optional param to a setter method
        * better solution 
            * use Builder pattern
            * provides a way to build an object step-by-step
            * provides a method that returns the final complex object   
            
* advantages
    * encapsulate the processes in building a complex object
    * allows objects to be constructed in multi-steps(based on scenario requirement) unlike one-step process by the Factory design pattern
    * hides the internal representation of the product from the client
    * flexible product implementation because client only sees an abstract interface

* when not used
    * if the object needs to be mutable
        * ie, object which can be modified after the creational process is over