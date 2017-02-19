JCC = javac
JFLAGS = -g
JVM = java

default: GSL.class GSLTest.class

GILTest.class: GSLTest.java
	$(JCC) $(JFLAGS) GSLTest.java

GIL.class: GSL.java
	$(JCC) $(JFLAGS) GSL.java

clean:
	$(RM) *.class

run:
	$(JVM) GSLTest

jar:
	jar cvf GSL.jar *
