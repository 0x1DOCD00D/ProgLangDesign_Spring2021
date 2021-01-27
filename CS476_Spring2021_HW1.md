# Homework 1
### Description: create a language for arithmetic expression evaluations using variables and scopes.
### Grade: 10%

## Preliminaries
As part of this homework assignment you will gain experience with creating and managing your Git repository, implementing your first domain-specific language using Scala for writing and evaluating arithmetic expressions with variables and scopes, creating JUnit tests, and creating your SBT build and run scripts for your simulation application. Doing this homework is essential for successful completion of the rest of this course, since all other homeworks and the course project will share the same features of this homework: branching, merging, committing, pushing your code into your Git repo, creating test cases and build scripts, and using various tools like a debugger for diagnosing problems with your applications.

First things first, you must create your account at [Github](https://github.com), a Git repo management system. It is desirable that you use your UIC email account that has the extension @uic.edu. Please follow this naming convention while submitting your work : "Firstname_Lastname_cs476_hw1" without quotes, where you specify your first and last names **exactly as you are registered with the University system**, so that we can easily recognize your submission. Then invite me, your course instructor as your collaborator Ð my github id is 
0x1DOCD00D. Since it is a large class, please use your UIC email address for communications or Piazza and avoid emails from other accounts like funnybunny1992@gmail.com. If you don't receive a response within 12 hours, please contact us via Piazza, it may be a case that your direct emails went to the spam folder.

Next, if you haven't done so, you will install [IntelliJ](https://www.jetbrains.com/student/) with your academic license, the JDK, the Scala runtime and the IntelliJ Scala plugin and the [Simple Build Toolkit (SBT)](https://www.scala-sbt.org/1.x/docs/index.html) and make sure that you can create, compile, and run Java and Scala programs. Please make sure that you can run [various Java tools from your chosen JDK between versions 8 and 15](https://docs.oracle.com/en/java/javase/index.html).

I recommend using the book on Programming in Scala: Updated for Scala 2.12 published on May 10, 2016 by Martin Odersky and Lex Spoon. You can obtain this book using the academic subscription on Safari Books Online. I posted a free third edition of this book in Piazza. There are many other books and resources available on the Internet to learn Scala. Those who know more about functional programming can use the book on Functional Programming in Scala published on Sep 14, 2014 by Paul Chiusano and Runar Bjarnason.

## Overview
In Lecture 3 I created and shared with you a simple arithmetic expression evaluation language embedded in Scala for multiplication and addition that uses a statically defined environment to specify values for variables. In this homework, you will expand this language by adding expressions for storing results of some computations in variables and using them in different scopes. In addition, you will add macros that will expand macro definitions with corresponding expressions.

This homework script is written using a retroscripting technique, in which the homework outlines are generally and loosely drawn, and the individual students improvise to create the implementation that fits their refined objectives. In doing so, students are expected to stay within the basic requirements of the homework and they are free to experiments. Asking questions is important, so please ask away at Piazza!

## Functionality
Once you installed and configured IntelliJ you should be able to clone [the course repo]( git@github.com:0x1DOCD00D/ProgLangDesign_Spring2021.git) and run the example of the expression evaluator in [Main.scala]( https://github.com/0x1DOCD00D/ProgLangDesign_Spring2021/blob/main/Jan25/src/main/scala/Main.scala) in the folder Jan25. 

```scala
//example definition of a macro
Macro(MacroName(ÒsomeNameÓ), Multiply(Add(Variable(ÒvarÓ), Value(1)), Value(3)))
//examples of a variable assignment with scope
Assign(Variable(ÒsomevarÓ), Add(Variable(ÒvarÓ), Macro(ÒsomeNameÓ)))
Let(Assign(Variable(Òvar2Ó), Add(Variable(ÒvarÓ), Macro(ÒsomeNameÓ)))) In Add(Variable(Òvar2Ó), Value(1))
//examples of scope definition and use
Scope(ÒscopenameÓ, Scope(ÒothernameÓ, Assign(Variable(ÒsomevarÓ), Add(Variable(ÒvarÓ), Macro(ÒsomeNameÓ)))))
```
Scopes can be created dynamically as part of the expressions in addition to being predefined in the environment. Macros will use lazy evaluation to substitute the expression for a given macro name in the expression where the macro name is used.

Your homework can be divided roughly into five steps. First, you learn how to configure and run your Scala project with the code that I wrote in class. Second, you design your own language for arithmetic expression evaluation or you can build your homework using the class example. You will add the logic for assigning results of arithmetic computations to variables, which will later be used in the same or other expressions. Next, you will create an implementation of scopes, named and anonymous with scoping rules for obscuring and shadowing that you define to resolve the values of variables that have the same names in expressions. Fourth, you will create macros to substitute macro definitions for the used macro names in expressions. Finally, you will create Junit or Flatspec tests to verify the correctness of your implementation. You will write a report to explain your implementation and the semantics of your language. 

## Baseline
Your absolute minimum gradeable baseline project can be based on the example that I wrote in class. To be considered for grading, your project should include the constructs Assign, Let, Macro, your project should be buildable using the SBT, and your documentation must specify how you create and evaluate expressions in your language. 

## Piazza collaboration
You can post questions and replies, statements, comments, discussion, etc. on Piazza. For this homework, feel free to share your ideas, mistakes, code fragments, commands from scripts, and some of your technical solutions with the rest of the class, and you can ask and advise others using Piazza on language design issues, resolving error messages and dependencies and configuration issues. When posting question and answers on Piazza, please select the appropriate folder, i.e., hw1 to ensure that all discussion threads can be easily located. Active participants and problem solvers will receive bonuses from the big brother :-) who is watching your exchanges on Piazza (i.e., your class instructor). However, *you must not post the source code of your program or specific details on how your implemented your design ideas!*

## Git logistics
**This is an individual homework.** Separate repositories will be created for each of your homeworks and for the course project. Inviting other students to join your repo for an individual homework will result in losing your grade. For grading, only the latest push timed before the deadline will be considered. **If you push after the deadline, your grade for the homework will be zero**. For more information about using the Git and Bitbucket specifically, please use this [link as the starting point](https://confluence.atlassian.com/bitbucket/bitbucket-cloud-documentation-home-221448814.html). For those of you who struggle with the Git, I recommend a book by Ryan Hodson on Ry's Git Tutorial. The other book called Pro Git is written by Scott Chacon and Ben Straub and published by Apress and it is [freely available](https://git-scm.com/book/en/v2/). There are multiple videos on youtube that go into details of the Git organization and use.

I repeat, make sure that you will give the course instructor the read/write access to *your repository* so that I can leave the file feedback.txt with the explanation of the grade assigned to your homework.

## Discussions and submission
As it is mentioned above, you can post questions and replies, statements, comments, discussion, etc. on Piazza. Remember that you cannot share your code and your solutions privately, but you can ask and advise others using Piazza and StackOverflow or some other developer networks where resources and sample programs can be found on the Internet, how to resolve dependencies and configuration issues. Yet, your implementation should be your own and you cannot share it. Alternatively, you cannot copy and paste someone else's implementation and put your name on it. Your submissions will be checked for plagiarism. **Copying code from your classmates or from some sites on the Internet will result in severe academic penalties up to the termination of your enrollment in the University**. When posting question and answers on Piazza, please select the appropriate folder, i.e., hw1 to ensure that all discussion threads can be easily located.


## Submission deadline and logistics
Friday, February 19 at 10PM CST via the bitbucket repository. Your submission will include the code, your documentation with instructions and detailed explanations on how to assemble and deploy your program along with the tests and a document that explains the semantics of your language, and what the limitations of your implementation are. Again, do not forget, please make sure that you will give your instructor the read access to your repository. Your name should be shown in your README.md file and other documents. Your code should compile and run from the command line using the commands **sbt clean compile test** and **sbt clean compile run** or the corresponding commands for Gradle. Also, you project should be IntelliJ friendly, i.e., your graders should be able to import your code into IntelliJ and run from there. Use .gitignore to exlude files that should not be pushed into the repo.


## Evaluation criteria
- the maximum grade for this homework is 10%. Points are subtracted from this maximum grade: for example, saying that 2% is lost if some requirement is not completed means that the resulting grade will be 10%-2% => 8%; if the core homework functionality does not work, no bonus points will be given;
- only some basic expression language is implemented without scopes and assignments and macros and nothing else is done: up to 10% lost;
- having less than five unit and/or integration tests: up to 5% lost;
- missing comments and explanations from the program: up to 5% lost;
- no instructions in README.md on how to install and run your program: up to 5% lost;
- the program crashes without completing the core functionality: up to 10% lost;
- the documentation exists but it is insufficient to understand how you assembled and deployed all language components: up to 8% lost;
- the minimum grade for this homework cannot be less than zero.

That's it, folks!
