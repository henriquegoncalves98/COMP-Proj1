@ECHO OFF
ECHO Starting!
call jjtree jmm.jjt
ECHO Done!
call cd AST
call javacc jmm.jj
ECHO Done!
call javac *.java
ECHO To run write: java Jmm [NameOfFile.ext]
