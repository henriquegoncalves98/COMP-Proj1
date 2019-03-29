#!/bin/bash
jjtree jmm.jjt && cd AST && javacc jmm.jj && javac *.java