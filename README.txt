# Time checker
Convert Nepal time to NY time

The project consists of two classes. One contains the main method, which is used to run the program. The other class handles everything else, including incoming HTTP requests and correct computation of the time.

# Running the project

Eclipse:
Once the project has been imported in Eclipse, it needs to be built using gradle. Once the project has been built successfully, the project need to run as a java application. If the project is up and running, the arguments can be inputted in the web browser to validate the results.
Example- http://localhost:8080/api/v1/time/NewYork?time=10:30PM&city=Kathmandu

Terminal:
Alternatively the project can be set up through the terminal in the following ways:


#Running tests

Eclipse:
Use Testng for testing purposes. Once it has been set up, the testing can be done in the IDE itself. The dependency of the test file needs to be added to the original gradle file. 
Example- testCompile ('org.testng:testng:6.10')
Then the test file can be run as Testng, which should run all the tests.

#Editing the project
Any fixes in the code must be done using the relevant branch. For instance:
# for bug fixing
git checkout -b bugfix/<bug-short-name>

# for feature addition
git checkout -b feature/<feature-short-name>

When done, make pull request to develop branch.
