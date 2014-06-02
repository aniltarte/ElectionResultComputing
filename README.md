UPDATES
===================================
A solution to this exercise and all other details are available at https://github.com/aniltarte/ElectionResultAnalysis, this project is obsolete now.

ElectionResultComputing
-----------------------------------

A skeleton project prepared for a workshop on Java 8, the Expertalk event is scheduled on 31st May 2014.
Follow the [Expertalk Meetup event link](http://www.meetup.com/expertalks/events/179983882/ "Java 8") for more details.
This project will help participants to do a quick start.

Stories
---------------------------------------------
1. List the election result
2. List the election result for Pune
   * List it down!
   * It is more clear if I see it sorted by Votes in descending order
   * Lets remove the noise, I am interested in top 5
   * Can I see just the runner up?
3. Lets do similar to the Mumbai's result (same steps as 2a, 2b and 2c)
4. List number of candidates per party
5. List winners per constituency
6. Time to see, party wise performance, yay!
7. Total votes in constituencies 
8. Runner ups show, party wise
9. Party wise vote share
10. Close Fights
11. One Sided Contest
 
Note - Time to apply declarative style to your own domain
   * Time to evolve domain specific language (DSL)



Project setup instructions
---------------------------
1. Clone the project, better option is to fork it
    * git clone https://github.com/aniltarte/ElectionResultComputing.git
2. Run gradle build command from project root directory
    * gradle clean build
    * gradle cleanIdea idea
3. Open project in Intellij Idea, that's it.

Background to the problem
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
