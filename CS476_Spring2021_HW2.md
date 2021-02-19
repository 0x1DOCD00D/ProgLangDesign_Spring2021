# Homework 2
### Description: extend a language for arithmetic expression evaluations that you created in HW1 with classes, inheritance and dynamic dispatch.
### Grade: 10%

## Preliminaries
As part of this homework assignment you will gain hands-on experience with object-oriented language features for the simple language for specifying and evaluating arithmetic expressions that you created as part of your first homework. All logistic rules are applicable from the previous homework about creating your GitHub repository and submitting your homework solution. Please follow this naming convention for your GitHub repo while submitting this homework : "Firstname_Lastname_cs476_hw2" without quotes, where you specify your first and last names **exactly as you are registered with the University system**, so that we can easily recognize your submission. Then invite me, your course instructor as your collaborator, my github ID is 0x1DOCD00D. 

## Overview
In your first homework assignment you created a simple arithmetic expression evaluation language embedded in Scala for multiplication and addition that uses a dynamically updated environment to specify values for variables with computing and storing results of the evaluation of arithmetic expressions in variables and using them in different scopes. Also, you created macros that allow programmers to expand macro definitions in the expressions where the macro names are used. In this homework you will build on the language and its features created in your first homework. The requirements for this homework below is an outline - you can add more interesting features to your language for additional bonus points. Alternatively, if you implement only a subset of the required features please make sure to specify it in your documentation. This homework script is written using a retroscripting technique, in which the homework outlines are generally and loosely drawn, and the individual students improvise to create the implementation that fits their refined objectives. In doing so, students are expected to stay within the basic requirements of the homework and they are free to experiments. Asking questions is important, so please ask away at Piazza!

## Functionality
We have studied extensively the meaning of inheritance and dynamic dispatch and how it is implemented using the GNU and Borland layouts. We have learned that a class is a named scope that contains variable and method definitions and it may contain nested classes. Inheritance is used as a mechanism for software reuse, so that when a class extends some superclass it inherits its methods and new ones can be added to the subclass. In this homework, class methods can contain arithmetic expressions and the return value of a method is the value of the last expression that is contained in the method. It is up to you to decide how you can allow programmers to invoke the methods of the superclasses and what the semantics of the empty methods is. For additional point you can extend the language to enable upcasting and down casting.37

```scala
//example definitions of a class
Class("Base")
Class("Derived", Extends(Class("Base")))
Extends(Class("Derived"), Class("Base"))

//example declaration of class variables
Class("Derived", List(ClassVar("v1", VarType("int")), ClassVar("v2", VarType("string")))

//example definition of class methods
Method(Class("Base"), MethodName("m1"), List(Parameter("p1", ParamType("int")), Parameter("p2", ParamType("string"))), List(Assign(Variable("somevar"), Add(Variable("var"), Macro("someName"))), Let(Assign(Variable("var2"), Add(Variable("var"), Macro("someName")))) In Add(Variable("var2"), Value(1)))) 

//example of the instantiation of a class
val instance = CreateNew(Class("Derived"))

//example of the invocation of a method
val result = instance.InvokeMethod("m1", List(("p1", 1), ("p2", "howdy!"))

//examples of defining nested classes
Class("Base", Class("Nested"))
Class("Derived", Class("Inner1st", Class("Inner2nd")))

```
In your language, program are evaluated using the function **evaluate** that you created in your first homework. You can decide whether you want to evaluate your expressions only to integer values or you may extend evaluations to other types, e.g., strings. Handling nested classes is not much different from handling nested scopes - you will define your own rules for accessing variables and methods in nested classes, for accessing methods and variables of the superclasses from subclasses and of the outer classes from the nested classes. Correspondingly, you will maintain the environment for mapping variables to values and for implementing scoping rules. 

Your homework can be divided roughly into five steps. First, you decide on the semantics of inheritance and dynamic dispatch. Second, you design your own OO language extension using the class example. You will add the logic for evaluating method invocations on class instances. Next, you will create an implementation of nested classes with scoping rules for obscuring and shadowing that you define to resolve the values of variables that have the same names in nested classes. Fourth, you will create the dynamic dispatch mechanism to determine which methods are invoked on class instances. Finally, you will create Junit or Flatspec tests to verify the correctness of your implementation. You will write a short report to explain your implementation and the semantics of your language -- if the your code is commented well, it could be used as the report for evaluating your homework. 

## Baseline
Your absolute minimum gradeable baseline project should include the constructs Class, Extends, CreateNew, InvokeMethod, Parameter, Method, ClassVar and VarType or their equivalents and their evaluations in the corresponding function evaluate. Your project should be buildable using the SBT, and your documentation must specify how you create and evaluate expressions in your language with appropriate test cases. Extensively commenting your code and using descriptive names for program entities are considered good programming practices for code comprehension; if your code is easy to read with sufficient comments explaining the semantics of your language constructs, I will accept it as your official homework documentation.

## Piazza collaboration
You can post questions and replies, statements, comments, discussion, etc. on Piazza. For this homework, feel free to share your ideas, mistakes, code fragments, commands from scripts, and some of your technical solutions with the rest of the class, and you can ask and advise others using Piazza on language design issues, resolving error messages and dependencies and configuration issues. When posting question and answers on Piazza, please select the appropriate folder, i.e., hw1 to ensure that all discussion threads can be easily located. Active participants and problem solvers will receive bonuses from the big brother :-) who is watching your exchanges on Piazza (i.e., your class instructor). However, *you must not post the source code of your program or specific details on how your implemented your design ideas!*

## Git logistics
**This is an individual homework.** Separate repositories will be created for each of your homeworks and for the course project. Inviting other students to join your repo for an individual homework will result in losing your grade. For grading, only the latest push timed before the deadline will be considered. **If you push after the deadline, your grade for the homework will be zero**. For those of you who struggle with the Git, I recommend a book by Ryan Hodson on Ry's Git Tutorial. The other book called Pro Git is written by Scott Chacon and Ben Straub and published by Apress and it is [freely available](https://git-scm.com/book/en/v2/). There are multiple videos on youtube that go into details of the Git organization and use.

I repeat, make sure that you will give the course instructor the read/write access to *your repository* so that I can leave the file feedback.txt with the explanation of the grade assigned to your homework.

## Discussions and submission
As it is mentioned above, you can post questions and replies, statements, comments, discussion, etc. on Piazza. Remember that you cannot share your code and your solutions privately, but you can ask and advise others using Piazza and StackOverflow or some other developer networks where resources and sample programs can be found on the Internet, how to resolve dependencies and configuration issues. Yet, your implementation should be your own and you cannot share it. Alternatively, you cannot copy and paste someone else's implementation and put your name on it. Your submissions will be checked for plagiarism. **Copying code from your classmates or from some sites on the Internet will result in severe academic penalties up to the termination of your enrollment in the University**. When posting question and answers on Piazza, please select the appropriate folder, i.e., hw2 to ensure that all discussion threads can be easily located.


## Submission deadline and logistics
Sunday, March 7 at 6PM CST via your git repository. Your submission will include the code, your documentation with instructions and detailed explanations on how to assemble and deploy your program along with the tests and a document that explains the semantics of your language, and what the limitations of your implementation are. Again, do not forget, please make sure that you will give your instructor the read access to your repository. Your name should be shown in your README.md file and other documents. Your code should compile and run from the command line using the commands **sbt clean compile test** and **sbt clean compile run**. Also, you project should be IntelliJ friendly, i.e., your graders should be able to import your code into IntelliJ and run from there. Use .gitignore to exlude files that should not be pushed into the repo.


## Evaluation criteria
- the maximum grade for this homework is 10%. Points are subtracted from this maximum grade: for example, saying that 2% is lost if some requirement is not completed means that the resulting grade will be 10%-2% => 8%; if the core homework functionality does not work, no bonus points will be given;
- only some basic expression language is implemented without scopes and assignments and macros and nothing else is done: up to 10% lost;
- having less than five unit and/or integration tests: up to 5% lost;
- missing comments and explanations from the program: up to 5% lost;
- no instructions in README.md on how to install and run your program: up to 5% lost;
- the program crashes without completing the core functionality or it is incorrect: up to 10% lost;
- the documentation exists but it is insufficient to understand how you assembled and deployed all language components: up to 8% lost;
- the minimum grade for this homework cannot be less than zero.

That's it, folks!
