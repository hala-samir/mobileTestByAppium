# Appium 
Appium is used to test Swag app.

The following are the dependencies needed to install Appium

    Node.js
    Java
    Appium Server
    Appium Client Libraries
    Selenium Libraries
    Android Studio
    Maven
    TestNG
    Then clone the repo: git clone https://github.com/hala-samir/Monefy.git
    Then after downloading the project and its depedancies of the maven file (pom.xml)
    Now we can run the test suite from a command line : mvn test
 
# The approach used in testing and  why this tech stack:
### Page Factory Model 
  The used approach here is page object model (POM) and page factory. POM can offer smooth handing. 
  If there are changes in UI have been done so, a tester will fix only the page object classes to updated
  the changed element instead of fixing a changed element in each test uses it(if POM is not used).
### Maven 
  Maven is also used to manage a project's build, reporting and documentation from a central piece
  of information and a project will be easy shared without having to lots of manual libararies downloading.
### Appium 
  Appium is an opensource mobile testing tool. It is a plateform independent so, it can be used on any machine
  and it does not need any enhancing in a tested application, so a developer does not need to customize his app. 
  to be tested by appium.
  Appium supported mini programming languages like Java, Javascript, C#, PHP, Python and Ruby.
  Appium can test native mobile apps, hybrid mobile apps and browser apps.
  Appium can be used with muliple framworks like data driven framwork and behavior driven.
        
        
        
  
    
