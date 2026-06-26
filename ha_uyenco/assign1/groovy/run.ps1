#export JAVA_HOME=$(/usr/libexec/java_home -v 21)
#export PATH=$JAVA_HOME/bin:$PATH


$env:JAVA_HOME = 'C:\Program Files\Java\jdk-21'
$env:Path = "$env:JAVA_HOME\bin;$env:Path"     

cd perfectapp
mvn test
