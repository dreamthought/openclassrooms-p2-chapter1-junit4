# Part 2 - Chapter 1: Helpful JUnit Annotations
## Supporting JUnit4 Examples 

* You can run the tests with `mvn clean test`
* These examples are fully described in my Openclassrooms course on testing in Java.

Here are some things for your to try out:
* Run just the conversion tests with
 `mvn -Dgroups='com.openclassrooms.testing.Categories$ConversionTests' test`
* Run all the tests in your IDE

_Don't forget the quotes around the class name or the $ might mean something completely different on your command line!_

## Your Fun Challenge
* We have a failing test. Run the tests and find it.
* @Ignore this test so it skips.
* Run your tests again.
* Complete and fix the test!

_Remember to remove the @Ignore when you're done!_

## Tips
* Uncomment the @Ignore already in the code
* Write the Arrange, Act and Assert to prove that 1000 meters converts to 1KM.

