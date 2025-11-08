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
    * Factory Method *
    * Abstract Factory *
    * Singleton *
    * Builder
    * Prototype
* Structural DP
    * Adaptor *
    * Bridge
    * Composition
    * Decorator (Sub-classing) *
    * Facade 
    * Flyweight
    * Proxy *
* Behavioral DP
    * Chain of Responsibility *
    * Command
    * Interpreter
    * Iterator
    * Mediator
    * Momento
    * Observer *
    * State
    * Strategy *
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
* has 2 types
    * behavioral class patterns: uses _inheritance_ to describe algorithms and flow of control
    * behavioral object patterns: uses _composition_ to describe how group of objects cooperate to perform a single task that no single object can do it alone
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
* **NB: Use Composition or Delegation instead of Inheritance unless you want substitutability...cus Inheritance demands more from the developer than Composition/Delegation does**
* Why Composition over Inheritance
    1. help keep each class encapsulated and focused on one task. keeps class hierarchies small preventing them from growing into unmanageable monsters
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

##### Open Close Principle (OCP)
Classes and methods should be Open for extension(new funtionality) and Close for modification
* class should be easily extendable without modifing the class itself
* code that new functionality can be added without changing existing code
* "**the most important principle of oop design"**
* achieved through abstraction and polymorphism
Aims: prevents touching dependency while changing code + reduces tight coupling 
 
##### Liskov Substitution Principle (LSP)
States that object of a superclass can be replaceable with objects of its subclasses without breaking the application
* requires that methods which uses superclass type must be able to work with the subclass without any issue
* LSP is closely related to the Single responsibility principle
* related to the open/close principle 

How to fix?: through inheritance
* **NB: Inheritance should be used only for substitutability**
 
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
    * IDP places stronger emphasis on abstraction
  
It's the **central underlying principle** in design pattern
> This principle helps achieve the Open-Close Principle
 
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
- Illustrative story - https://www.linkedin.com/posts/nelsonamigoscode_systemdesign-coding-interviewtips-activity-7110525568839753728-4d3M?utm_source=share&utm_medium=member_desktop

======= Creational ========
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
        
* implementation overview
    * main participants
        1. Product
            * representation of the actual complex object under construction 
            * internal product built by Concrete Builder
        2. Concrete Builder
            * construct n assembles parts of the product by impl the Builder interface
            * ...by overriding operations for components it's interested in creating
            * keeps track of the representation it creates
            * usually appends to the product via some type of list
            * sometimes parts of previous product constructed may be needed in the next component
                * builder would return child node to director, which then would be pass back to the builder to build the parent nodes
            * provides an interface for retrieving product (ie, getProduct())
        3. Builder
            * specifies abstract interface for creating parts of a products
            * defines an operation for each component that it may ask
            * general enough to construct product of diff kinds
        3. Director
            * construct obj using the Builder interface
    * Processes...
        * Client creates the Director obj configuring the desired Builder object
        *...Director notifies the builder when ever part of the product needs to be built
        *...Builder handles the request from the Director and adds parts to the product
        *...Client retrieves the final product from the builder (not the director)
        
### 5. Prototype Pattern
* the final creational pattern
* refers to creating a duplicate object while keeping performance in mind
* when used
    * when creating a new object instance is costly, requiring lots of time and resources and you have a similar object already existing
    * instantiating classes a runtime, ie. dynamic loading 
    * instances of class have only a few changes in their state
* provides mechanism for copying the original object to a new object and modifying it according to needs
    * copy types: shallow and deep
    * object to be copied should provide that copying feature
* examples
    1. making changes to a master document in order to have a dif feel
    2. creating an app from an existing one and adding few new features
    3. an obj that loads data from db 
        * need to modify data multiple time, not good idea to create new one using the new keyword and load all data from db again
        * obj loaded can be cached and return a clone of the cache for the next request. Reduces this number of db calls.  
    4. version control like gitHub's PR processes
* Advantages
    1. hides the complexity of creating object from client
    2. in some circumstances, copying object is more efficient than creating new one
    3. creating obj at cheaper cost 
* Agents/Participants involved
    1. Client: creates obj by asking the Prototype
    2. Prototype: declares an interface for cloning itself
    2. ConcretePrototype: impl the operation for cloning itself
    
<br>   
====== Structural ========

Describes how classes and objects can be combined to form larger one.<br>
    * these patterns utilizes inheritance to interfaces and impl<br>
    * describes how to assemble objects
    * building a hierarchy made up of different kinds of objects
    * describes how relationships b/n classes and objects are defined
    * examples; bridge, decorator, composite, facade, proxy, and flyweight pattern
    * 7 structural design patterns 
    
### 1. Adaptor Pattern
* Geared towards making unrelated classes work together
    * usually applied to systems after being designed
    * converts a class to another responsibility, example converts a plumber to be a chef.
* more examples: 
    * card reader - acts as adapter b/n memory card and a laptop
    * simple ac adapter (multisocket) - changes the shape of the outlet in order to match the plug 

### 2. Bridge Pattern
* Lets abstractions and implementations decoupling varying independently
    * usually applied to systems after being designed
* toughest to understand cus it is so powerful and applies to many situations
    * goes against a common tendency to handle special cases with inheritance 
* There is an Abstraction class hierarchy and Implementation class hierarchy (with lots of implementations)
    * the has-a relationship between the two is called the "bridge"
    * helps to independently vary the abstraction and the implementation
* Extremely helpful when our class and it's functionalities may change in frequently intervals
    * class having many implementations
    * binding b/n abstraction and corresponding implementation is removed
    * both hierarchies (abstractions and implementations) can grow and extend through child classes
    * abstraction contains a reference to its implementer
    * can change implementers dynamically (at runtime) by changing reference in the abstraction
    
### 3. Composite Pattern
- Treat ind'l as a group
- Individual and groups that can be treated the same with similar kind of object
- Tree structure - composite and leaf node
- A composite is an object designed as a composition of one/more similar object that all exhibit similar functionality
    * group of object treated same way as a single instance of same type of object
- Why and When used ?
    * when many objects have common functionalities 
        * creates a class that contains a group of its own objects
    * example
        * all employees form an organization, a group of people creates a department
        * a tree structure of menus, submenus along with menu items can be treated as "big huge menu" 
    
    * usage
        * Client uses the Component interface to interact w/ objects in the composition structure
        * if recipient is a leaf, then request is handled directly
        * if recipient is a composite, then it usually forwards request to its child components    
        * Client doesn't know whether dealing with a leaf or a composite component
    * cons
        * disobeys the Single Responsibility principle as it groups objects
    
### 4. Decorator Pattern
what?
* primarily help attach additional responsibility to an object dynamically
    * provides a flex alternative to subclassing for extending functionality
    * modifies functionality of an object at runtime
    * decorator adds responsibilities to individual objects, not to an entire class

When to use?
* adding new functionality to an existing object without altering its structure/functionality

Example:
* suppose adding a new floor to already owned house
    * we don't wanna change the architecture of the ground floor
* user interface toolkits use decorator to add graphical additions (like border, scroll) to widgets

How?
* compose object by wrapping one object w/ another to provide new functionality
    * focus on how object is composed to dynamically gain functionality
* it's a structural pattern cuz does NOT focus on the communication and interconnection b/n objects (behavioural pattern)

Why?
* helps code incrementally, adding functionality step-by-step
* biggest advantage: add new functionality to particular object with disturbing existing object in the system
    * functionality can be attached and detached at runtime
    * more flex than static inheritance

Con 
* might result in large number of small classes
    * lots of little objects can be hard to debug 
    
### 5. Facade Pattern
* Not implemented
* What:
    * Pattern provides a unified interface to a set of interfaces in a sys
    * Defines a high level interface making sub-sys easier to use
    * Hides complexities of the subsys from the client 
    * Delegates request to the appropriate subsys object that is responsible
    * Does NOT add additional functionality
* Advantages:
    * shields client from subsys component
        * reducing num of objects client deals with 
    * reduces complex dependencies
    * provides single, simplified interface reping the dependencies or subsys
* When to use:
    * when to provide a simple interface to a complex subsys
    * when there'r many dependencies b/t client and an abstraction's impl
    
* Facade Vs Adopter Vs Decorator
    * Adopter: wraps to changes an interface into one a client experts
    * Decorator: wraps an object to add new responsibilities
    * Facade: wraps a set of objects to simplify

### 6. Flyweight Pattern
This pattern uses sharing technique to support a large # of fined-grained objects efficiently
* primarily used to reduce the number of objects created
* uses already existing created object by storing them 
* creates a new instance when no existing object is found or matched
    
Intrinsic and Extrinsic state - need to be identified
* common term used in the flyweight pattern
* intrinsic state/props: can be shared in flyweight and shared...static or default for all/some objects
* extrinsic state/props: depends on a flyweight and it's NOT shareable...additional changes that differ from the core props 

When used?
* when app uses a large number of objects
* when app does not depend on objects identity

Advantages and Drawbacks
* number of objects at runtime is reduced
* centralizes states for "virtual" objects into a single location for sharing

### 7. Proxy Pattern
This pattern provides a rep for another object in order to control the client's access to it

### Adapter vs Bridge
* bot promote flex by providing a level of abstraction
* but 
    - adapter focuses on resolving incompatibilities b/n two existing classes/interfaces
        - makes things work after design
    - bridge focuses on bridging an abstraction and its(potential numerous) implementations, providing stable interface to client to vary implementations
        - used upfront when abstractions must have several implementations
### Composite vs Decorator
* decorator: adds responsibility to object without subclassing
* composite: treats multiple related objects uniformly as one


### 8. Chain of Responsibility
* this pattern avoids coupling the sender of a request to its receiver by giving more than one object a chance to handle request
    * chains the receiving obj and pass the request along the chain until an obj handles it
* processes series of object one by one (in a sequential manner)

how
* after one process is done, if anything is still pending, it is forwarded to the next object in the chain
    * each receiver contains a reference to another receiver

TODO: challenge implementation

### 9. Command Pattern
No overview and impl

### 10. Interpreter Pattern
No overview and impl <br>
used in implementation of simple language, language translator, regular expression, parsing

### 11. Iterator Pattern
No overview and impl

### 12. Mediator Pattern
* mediator design pattern defines **object that encapsulate how a set of objects interact**
* takes responsibility of **communication among a group of objects**
    * an intermediary who can track the comm btn two objects
    * all objects in the sys are aware of this mediator
    * objects know that they **need to go through the mediator to comm among themselves**
* mediator works as a **router btn objects**
    * has its own logic to provide way of comm
* reduces communication complexity btn multiple objects / classes

Participants:
1. Mediator: defines an interface for communicating with Colleague objects
    * Concrete mediator: impl cooperative behaviour by coordinating Colleague objects to route request btn appropriate colleagues, knows and maintains its colleague
2. Colleagues:
    * each colleague has its mediator
    * each communicates with its mediator by sending and receiving request from the mediator
    * each comm with its mediator when an event of interest occurs
        * one way is to implement Mediator as an Observer
        * **sends notification to mediator whenever a change occurs**
        * **mediator responds by propagating the effects of the change to other colleagues**

Advantages:
* replaces many-to-many interactions with one-to-many interactions btn the mediator and its colleague
    * easy to understand and maintain
Example: 
* airport control room works as a mediator for communication b/n diff flight

When to use:
* to centralize complex communications and control b/n related objects
* when reusing an object is difficult because it refers and communicates with **other many objects**

### 12. Momento Pattern
* This design pattern help to capture and externalize an object's internal state so that the obj can be restored to the later state
    * without violating encapsulation
* Simply, **saves object state can be undo-ed**
* Implemented in such a way that object's saved state is not accessible outside of the object
    * achieved using **internal class**

* Examples:
    * in notepad, undo can be made frequently by pressing ctrl + z
    * the state in a finite state machine
    * "save progress" option in a video game
 
* When to use:
    * to be able to return an object to one of its previous states when a user request an "undo" 
        * to record the internal state of an object in order to restore obj to their prev state
        * when impl checkpoints and undo mechanisms
        
* Advantages
    * protects the integrity of saved state data
    * does not break encapsulation

* Consequence
    * considerable overhead can be caused if large amount of info need to be stored
       * unless encapsulating and restoring state is cheap, the pattern might not be appropriate
       
       
### 13. Observer Pattern
Observer design pattern defines a one-to-many relationship b/n objects so that when one object changes state, all of its dependents/listeners are notified and updated automatically
    * many objects need to be notified whenever an event occurs
    * notify-ers and notify-ees are decoupled
        * more flex with requirement change
    * mostly used pattern

How?
* many observers(objects) which are observing a particular subject(objects)
* observers register themselves to a subject
* observers get notified automatically whenever subject data changes
* when observers lose interest in the subject, they simply unregister and no longer gets notified
 
Examples:
* newspaper and magazine subscription
* celebrity having many fans
* GUI toolkits and event listeners
    * the button (subject) and onClickListener (observer)
* social media, email subscriptions

When To Use:
* when a change in one object requires changing others, do not know the numbers object to be changed/updated
* when an object should be able to notify other objects without making assumptions about who these objects are


### 14. State Design Pattern
Allows object to alter its behavior when its internal state changes
 * **object will appear to change its class** (new On() / new Off())
 * behaviour get changed at runtime depending on the state (polymorph)
<br><br>
* Normally, to change the behaviour of object based on its state, a state variable is used together with if-else condition to perform diff action based on the state
* In State DP, dep on if/else or switch/case conditional logic is removed
    * object is created representing each state (on/off) +
    * **context object (tv) whose behavior varies as its state changes**
    * uses Context and State implementation systematic

Example:
* traffic signal - stop, ready, go (behave diff based on state)

When?
- when an object's behaviour depends on its state, and must change its state at run-time depending on that state
- when operations have many conditional statements depending on the obj's state

why?
- puts all behaviour associated with a state into one object improving cohesion
- easy to add more state for additional behaviour


### 14. Strategy Design Pattern
Strategy defines a family of algorithms that are interchangeable
* conceptually, these algos do same things with diff implementations
* behaviour of algo is selected dynamically at runtime
* encapsulate **each algorithm into separate class**
* client app **passes the algo to be used as a parameter**
* achieved through polymorphism

Object are created representing the various strategies + context object whose behaviour varies as per its strategy object
* the strategy obj changes the executing algo of the context obj

When?
* used when need to configure many behaviours for a class, thus diff variants in algo
* alternative to subclassing, choice implementation 

Why?
* strategies can be switched at runtime (polymorphism)
* enables client use required algo, instead of using "switch" or "if/els" statement
* simplifies unit testing
 
vs State Pattern
* Strategy are like subclasses that decide how to impl steps in an algo
* State as an alt to putting lots of conditionals in the context
* In State, Context **contains the state as an instance property instance variable**
    * state is **passed as constructor param or set by default**
    * in Strategy, it is **passed as arg to the method**
    
    
### 14. Template Design Pattern
Template defines the skeleton of the step by step method calls that are need (algo)
    * helps us generalized a common process at **abstraction level**
    * template === just method calls in abstract class method 
    * software reuse if the fundamental goal of this method
    
### 15. Visitor Design Pattern
* Visitor's major focus is to **separate out certain logic from the elements/ pojo classes themselves** keeping data classes simple
    * allows **add operations to a collection (Composite structure) without changing the collection itself**
        * easy to add operations that depends on components of collections (complex objects)
        * can define a new operation over an object class by adding a new Visitor
            * eg: if there is an arraylist and has methods, it will never be affected...cus new method is added to the item itself
            * eg: calculating the total cost of items in a collection,  
                * logic is normally put in item classes normally, but will needs to be moved out to another class using the Visitor pattern 
                    * a class called Visitor will visit each item, take the object, add the logic and then return a value;
* core part is the Visitor Interface
    * defines a visit operation for each type of concrete element
* the pojo interface simply defines an **accept** method allowing visitor to run some action on that pure pojo class element

drawback
* the return type of visit() methods should be known at the time of designing
* if Visitor interface have too many implementations, it makes it diff to extend
