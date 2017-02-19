JCC = javac
JFLAGS = -g
JVM = java

default: GL.class GILTest.class

GILTest.class: GILTest.java
	$(JCC) $(JFLAGS) GLTest.java

GSLTest.class: GSLTest.java
	$(JCC) $(JFLAGS) GSTest.java

GL.class: GL.java
	$(JCC) $(JFLAGS) GL.java

clean:
	$(RM) *.class

run:
	$(JVM) GSLTest

jar:
	jar cvf GL.jar *
