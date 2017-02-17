JCC = javac
JFLAGS = -g
JVM = java

default: GIL.class GILTest.class

GILTest.class: GILTest.java
	$(JCC) $(JFLAGS) GILTest.java

GIL.class: GIL.java
	$(JCC) $(JFLAGS) GIL.java

clean:
	$(RM) *.class

run:
	$(JVM) GILTest

jar:
	jar cvf GIL.jar *
