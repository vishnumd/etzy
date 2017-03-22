# Introduction
This project serves as a template to kick-start your automated testsuite to test against a HTML5 website.

References:
http://serenity-bdd.info/docs/serenity/

## How to customize this project template to test your web project
 
Edit serenity.properties to make changes specific to your project.

## Running tests

To run all tests, run the command below:

`$ gradle clean test aggregate`

To run scenarios tagged as tag1 OR tag2 on Chrome: 

`$ gradle clean test aggregate -Dwebdriver.driver=chrome -Dcucumber.options="--tags @tag1,@tag2"` 

To run scenarios tagged as tag1 AND tag2 on Safari against abc.com: 
`$ gradle clean test aggregate -Dwebdriver.driver=safari -Dwebdriver.base.url=http://abc.com -Dcucumber.options="--tags @tag1 --tags @tag2"`

## Reporting

View the report at target/site/serenity/index.html


