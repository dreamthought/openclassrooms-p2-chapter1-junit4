# Part 2 - Chapter 1: Helpful JUnit Annotations
## Supporting JUnit4 Examples 

* You can run the tests with `mvn clean test`
* These examples are fully described in my Openclassrooms course on testing in Java.

Here are some things for your to try out:
* Run just the conversion tests with
 `mvn -Dgroups='com.openclassrooms.testing.Categories$ConversionTests' test`
* *Don't forget the quotes around the class name or the $ might mean something completely different on your command line*!
* We have a failng test which needs to be @Ignored'd - this skips that test until you're ready to fix it.
* Have a look at the incomplete `convert` method in  `Calculator.java`. Can you TDD converting Celsius to Fahrenheit?
