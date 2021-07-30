# Design Pattern w/ Java
Placing distinction on writing high quality code. Not good enough to just produce the correct output, but code that is easy to maintain, properly cohesive and loosely coupled.

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