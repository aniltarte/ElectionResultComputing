ElectionResultComputing
=======================

A skeleton project prepared for a workshop on Java 8, the Expertalk event is scheduled on 31st May 2014.
Follow the [Expertalk Meetup event link](http://www.meetup.com/expertalks/events/179983882/ "Java 8") for more details.
This project will help participants to do a quick start.

Project setup instructions
---------------------------
1. Clone the project, better option is to fork it
    * git clone https://github.com/aniltarte/ElectionResultComputing.git
2. Run gradle build command from project root directory
    * gradle clean build
    * gradle cleanIdea idea
3. Open project in Intellij Idea, that's it.

Background on the problem
-----------------------------
* In the workshop you will be analysing the Loksabha election 2014 results using Java 8 features.
* For simplicity you will consider only Maharashtra state.
* I have made the raw result available via election-data.jar, which is already included in the project.
* You can see how the election result is used in the ComputingSpec class, included in the project.

Notes
------------
1. Install Java 8, latest version
2. Setup  Intellij Community edition 13.1.1, its free to use and reason is it has best support for Java 8 as of now.
3. If you plan to use gradle, make sure it is latest(1.11 or above). You don't need to use any build tool as project setup is very simple and you don't need to use any dependencies but junit and election-data.jar.