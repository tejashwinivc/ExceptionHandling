# Java Election Voting System
This is a simple Java program demonstrating exception handling in a scenario of checking eligibility for voting in an election. It defines custom exceptions UnderAge and OverAge to handle cases where a person is too young or too old to vote, respectively.
 
 # The program consists of three classes:
-ElectionCommission: Represents the election commission responsible for checking the eligibility of voters. It contains methods to accept the age input from the user and check if the user is eligible to vote.
-Government: Simulates the government conducting the election. It creates an instance of the ElectionCommission class and handles exceptions thrown during the voting process.
-CustomException2: The main class that contains the main method to execute the program.

# Exceptions
UnderAge: Custom exception thrown when the person is too young to vote (age < 18).
OverAge: Custom exception thrown when the person is too old to vote (age > 60).
Other Exceptions: Catch-all exception block to handle any other exceptions that might occur during the voting process.
