# Design Pattern w/ Java
Placing distinction on writing high quality code. Not good enough to just produce the correct output, but code that is easy to maintain, properly cohesive and loosely coupled.
Instructor: Jason Fedin

### Structure
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
    
### Overview
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
* In 1994-1995, the "Gang of four" applied Alexander's concepts to software development
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

### Types of Design Patterns
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