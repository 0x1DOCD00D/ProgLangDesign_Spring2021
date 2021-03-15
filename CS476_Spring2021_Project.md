# Group Course Project
### Description: extend a language for arithmetic expression evaluations that you created in HW1/HW2 with partial evaluation.
### Grade: 35%

## Preliminaries
As part of this course you will gain hands-on experience with a programming language optimization technique called partial evaluation for the simple language for specifying and evaluating arithmetic expressions that you created as part of your homeworks. All logistic rules are applicable from the previous homeworks about creating your GitHub repository and submitting your solution. **This is a group project,** with at least one and at most five members allowed in a group. Each student can participate in at most one group; enrolling in more than one group will result in the grade zero. Each group will select a group leader who will create a github repository and will invite the other group classmates with the write access to that repo. Each submission will include the names of all groupmates in the README.md and all groupmates will receive the same grade for this course project submission. Group leaders with successful submissions and good quality work will receive an additional 2% bonus for their management skills - it applied only to groups with more than two members.

Please follow this naming convention for your GitHub repo while submitting this course project: "Group<Number>_cs476_Project" without quotes, where you specify your group number as an integer in place of <Number> and you will specify the first and last names of the group members **exactly as you are registered with the University system** in the submission file README.md, so that we can easily recognize your submission. Then invite me, your course instructor as your collaborator, my github ID is 0x1DOCD00D. I repeat, make sure that you will give the course instructor the read access to *your private project repository*.

## Overview
In your homework assignments you created a simple arithmetic expression evaluation language embedded in Scala for multiplication and addition that uses a dynamically updated environment to specify values for variables with computing and storing results of the evaluation of arithmetic expressions in variables and using them in different scopes as well as dynamic dispatch algorithms for resolving method invocations at runtime. In this course project you will work on adding an optimization for partial evaluation, a programming language technique that allow undefined variables to remain in expressions during evaluation while preserving the syntactical form of the expressions. Consider the following example of partial evaluation.
```scala
Multiply(Value(3), Multiply(Add(Value(5), Value(1)), Variable("var")))
```
The result of the partial evaluation of this expression would not be a value but the following new expression. 
```scala
Multiply(Value(3), Multiply(Value(6), Variable("var")))
```

A more interesting example of partial evaluation includes the use of the operator associativity property.
```scala
Multiply(Value(3), Multiply(Value(5), Variable("var")))
```
The result of the partial evaluation of this expression is the following new expression. 
```scala
Multiply(Value(15), Variable("var"))
```

In case of the assignment expression the variable **somevar** will be assigned the corresponding expression on the right-hand side instead of a value in the environment table.
```scala
//examples of a variable assignment with scope
Assign(Variable("somevar"), Add(Variable("var"), Value(3)))
```





This homework script is written using a retroscripting technique, in which the homework outlines are generally and loosely drawn, and the individual students improvise to create the implementation that fits their refined objectives. In doing so, students are expected to stay within the basic requirements of the homework and they are free to experiments. Asking questions is important, so please ask away at Piazza!

## Functionality
To make partial evaluation more interesting you will introduce a new conditional construct in your language that allows programmers to specify conditions and to evaluate the corresponding branches. Consider the following examples of this construct.

```scala
//example definitions of the conditional construct IFTRUE
Assign("Variable("lhs"), IFTRUE(Multiply(Value(15), Variable("var")) GREATEREQUAL Add(Value(2), Variable("var1"))) THENEXECUTE( 
  Assign(Variable("somevar"), Add(Variable("var"), Value(3))) )
ELSERUN (
  Class("Derived", Extends(Class("Base")))
  Extends(Class("Derived"), Class("Base"))
  Class("Derived", List(ClassVar("v1", VarType("int")), ClassVar("v2", VarType("string")))
  val instance = CreateNew(Class("Derived"))
  val result = instance.InvokeMethod("m1", List(("p1", 1), ("p2", "howdy!"))
) )
```

With conditional expressions both the **IFTRUE** and **ELSERUN** branches should be partially evaluated, since it is not known what branch will be taken when all values are supplied for the remaining undefined variables. As before, in your language, programs are evaluated using the function **evaluate** that you created in your homeworks. Also, you can decide whether you want to evaluate expressions only to integer values or you may extend evaluations to other types, e.g., strings and floats. Also, your environment table should be updated to map variables not only to values but also to expressions as a result of partial evaluation.

Special care should be taken when evaluating method invocations. Partial evaluation will be applied to all to all input parameter expressions and to the body of the method. The result of this partial evaluation should be an object that represents a partially evaluated method. In this project you do not need to handle recursion, but if you do I will add bonus points for your implementation.

Your course project can be divided roughly into five steps. First, you will decide on the semantics of partial evaluation and its reduction rules (e.g., operation associativity) for your language. Second, you will design/reuse your own homework language implementation with the conditional construct. You will add the logic for partially evaluating method invocations on class instances. Next, you will implement reduction rules in the evaluation function and document how they work. Fourth, you will determine how to partially evaluate method calls in presence of the dynamic dispatch mechanism, since it may require partially evaluating more than one method in the subsumption hierarchy. Finally, you will create Junit or Flatspec tests to verify the correctness of your implementation. You will write a short report to explain your implementation and the semantics of your language -- if the your code is commented well, it could be used as the report for evaluating yourcourse project. 

## Baseline
Your absolute minimum gradeable baseline project should include all the constructs from the homeworks and their full and partial evaluations in the corresponding function evaluate. Your project should be buildable using the SBT, and your documentation must specify how you create and evaluate expressions in your language with appropriate test cases. You should extensively comment your code and use descriptive names for program entities - it is considered to be a good programming practice for code comprehension; if your code is easy to read with sufficient comments explaining the semantics of your language constructs, I will accept it as your official project documentation.

## Piazza collaboration
You can post questions and replies, statements, comments, discussion, etc. on Piazza. For this homework, feel free to share your ideas, mistakes, code fragments, commands from scripts, and some of your technical solutions with the rest of the class, and you can ask and advise others using Piazza on language design issues, resolving error messages and dependencies and configuration issues. When posting question and answers on Piazza, please select the appropriate folder, i.e., project to ensure that all discussion threads can be easily located. Active participants and problem solvers will receive bonuses from the big brother :-) who is watching your exchanges on Piazza (i.e., your class instructor). However, *you must not post the source code of your program or specific details on how your implemented your design ideas!*

## Git logistics
**This is a group project.** For grading, only the latest push timed before the deadline will be considered. **If you push after the deadline, your grade for the course project will be zero**. For those of you who struggle with the Git, I recommend a book by Ryan Hodson on Ry's Git Tutorial. The other book called Pro Git is written by Scott Chacon and Ben Straub and published by Apress and it is [freely available](https://git-scm.com/book/en/v2/). There are multiple videos on youtube that go into details of the Git organization and use.

## Discussions and submission
As it is mentioned above, you can post questions and replies, statements, comments, discussion, etc. on Piazza. Remember that you cannot share your code and your solutions privately, but you can ask and advise others using Piazza and StackOverflow or some other developer networks where resources and sample programs can be found on the Internet, how to resolve dependencies and configuration issues. Yet, your implementation should be your own and you cannot share it. Alternatively, you cannot copy and paste someone else's implementation and put your name on it. Your submissions will be checked for plagiarism. **Copying code from your classmates or from some sites on the Internet will result in severe academic penalties up to the termination of your enrollment in the University**. When posting question and answers on Piazza, please select the appropriate folder, i.e., hw2 to ensure that all discussion threads can be easily located.


## Submission deadline and logistics
Friday, May 7 at 6PM CST via your git repository. Your submission will include the code, your documentation with instructions and detailed explanations on how to assemble and deploy your program along with the tests and a document that explains the semantics of your language, and what the limitations of your implementation are. Again, do not forget, please make sure that you will give your instructor the read access to your repository. The names of all team members should be written down in your README.md file and other documents. Your code should compile and run from the command line using the commands **sbt clean compile test** and **sbt clean compile run**. Also, you project should be IntelliJ friendly, i.e., your graders should be able to import your code into IntelliJ and run from there. Use .gitignore to exlude files that should not be pushed into the repo.


## Evaluation criteria
- the maximum grade for this course project is 35%. Points are subtracted from this maximum grade: for example, saying that 2% is lost if some requirement is not completed means that the resulting grade will be 35%-2% => 33%; if the core functionality does not work, no bonus points will be given for recursive method call implementation;
- only some basic expression language is implemented without partial evaluation and nothing else is done: up to 35% lost;
- having less than five unit and/or integration tests: up to 25% lost;
- missing comments and explanations from the program: up to 35% lost;
- no instructions in README.md on how to install and run your program: up to 15% lost;
- the program crashes without completing the core functionality or it is incorrect: up to 35% lost;
- the documentation exists but it is insufficient to understand how you assembled and deployed all language components: up to 25% lost;
- the minimum grade for this project cannot be less than zero.

That's it, folks!
