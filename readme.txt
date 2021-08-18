Directions:
----------
1:
Import the .jar file as a project for Eclipse.

OR

Import the .jar file, delete .project, ensure the three folders (akkaCakes,
akkaUtils and dataCakes) are within the src folder as packages.
----------
2:
Ensure all .jar files in "jars" folder are referenced libraries in
the buildpath's "Classpath"


TO RUN:
run the main method in Cakes.java as "java Application"

TO RUN WITH FOUR BOBS:
Comment out the following
"ActorRef charles = s.actorOf(Props.create(Charles.class,()->new Charles(1000, bobOne, alice)),"Charles");"

and Uncomment out the following
"ActorRef charles = s.actorOf(Props.create(Charles.class,()->new Charles(1000, bobOne, alice, bobTwo, bobThree, bobFour)),"Charles");"

 >>> NOTE: This project was done locally, entirely on a singular machine.
		Therefore the ip addresses in AkkaConfig have all
		been commented out. <<< 

=============================
KNOWN BUGS:
Task2 (in Cakes.java main) contains two lines of code:
	alice.tell(charles, tim)
	bob.tell(charles, tim)

These two lines of code have no effect on the program, but deletion of
them has been forgotten. Feel free to remove.
