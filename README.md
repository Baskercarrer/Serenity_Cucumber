# Page Object with Serenity BDD

This project is a simple demonstration showing the difference between
the [PageObject](http://martinfowler.com/bliki/PageObject.html)
both implemented using the [Serenity BDD](http://serenity-bdd.info/#/) library and JUnit.

By default the tests run on Chrome, so make sure you have the latest chromedriver instance on your system path.
## PageObjects implementation

These tests use pages and steps defined in `src/main/java/net/serenitybdd/demos/todos/pageobjects`.

The overall project structure is shown below:
````
+ model
    Domain model classes
+ pages
    PageObjects
+ steps
    Tasks and assertions performed by the "user"
```

## Running the project

To run the project you'll need JDK 1.8 and Maven installed.

### Page Objects and JUnit

We've also included a demo of how the tests you've just seen implemented using the Screenplay Pattern
would have looked if they were implemented using the Page Objects.

To run it, execute:

mvn clean verify

## Reporting

The Serenity reports will be generated in the `target/site/serenity` directory.
