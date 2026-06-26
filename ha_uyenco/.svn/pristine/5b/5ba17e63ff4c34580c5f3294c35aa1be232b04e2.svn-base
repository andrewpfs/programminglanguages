rm -rf lib
mkdir lib

# Download JUnit library
if [ ! -f "lib/junit-platform-console-standalone-1.10.0.jar" ]; then
    echo "Downloading JUnit..."
    curl -L "https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.10.0/junit-platform-console-standalone-1.10.0.jar" -o "lib/junit-platform-console-standalone-1.10.0.jar"
fi

# Compile with JUnit in classpath
javac -cp "lib/*" main/*.java test/*.java

# Run tests
echo "Running tests..."
java -ea -cp "main:test:lib/*" org.junit.platform.console.ConsoleLauncher --scan-class-path
