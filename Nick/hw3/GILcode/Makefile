JCC = javac
JFLAGS = -g
JVM = java

default: GL.class GILTest.class

GLTest.class: GILTest.java
	$(JCC) $(JFLAGS) GLTest.java

GL.class: GL.java
	$(JCC) $(JFLAGS) GL.java

clean:
	$(RM) *.class

run:
	$(JVM) GILTest

jar:
	jar cvf GL.jar *
