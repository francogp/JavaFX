# 1) RUN .JAR
* openjdk-14\bin\java.exe --module-path Trabajo/Programas/Java/lib/javafx-sdk-14.0.1/lib;out/production --add-modules javafx.controls,javafx.fxml --add-exports javafx.graphics/com.sun.javafx.sg.prism=ALL-UNNAMED -Dfile.encoding=windows-1252 -jar Programas\Java\IntellijProjects\TestFX\out\artifacts\TestFX_jar\TestFX.jar
# 2) EXPORT JDK + FX
* openjdk-14\bin\jlink.exe --compress=2 --strip-debug --module-path Trabajo/Programas/Java/lib/javafx-jmods-14.0.1/jmods;out/production --add-modules testfx --output out/jar
\jar
### 2.1 RUN ON CONSOLE
* jar\bin\java -m testfx/sample.Main
### 2.2 RUN ON GRAPHIC ONLY CONSOLE
* jar\bin\javaw -m testfx/sample.Main

c:\Users\franc\.jdks\openjdk-14.0.1\bin\jlink.exe  --compress=2 --strip-debug --no-header-files --module-path C:/Users/franc/.jdks/javafx-jmods-14.0.1/;out/production --add-modules testfx --output out/jar
