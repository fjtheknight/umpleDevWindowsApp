cd ..\umple\build
ant -Dmyenv=wlocal -f build.umple.xml codegen umpleParser rtcpp umpleSelf compile packageJars

:END
cmd /k