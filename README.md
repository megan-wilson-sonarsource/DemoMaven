
 ```
 mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false -DgroupId="middleware" -DartifactId="MavenTest" -Dpackage="middleware"
 ```

 - archetypeGroupId=org.apache.maven.archetypes
 - archetypeArtifactId=maven-archetype-quickstart
 - DarchetypeVersion=1.4
 - DinteractiveMode=false
 - groupId="middleware"
 - artifactId="MavenTest"
 - package="middleware"

Note:  (groupId="middleware") = (package="middleware")

```
 ➜  MavenTest mvn package
 ➜  MavenTest java -cp target/MavenTest-1.0-SNAPSHOT.jar middleware.App
```
Hello World!

Java 11 pom.xml:
```
  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
  </properties>
```

```
mvn versions:display-plugin-updates
[INFO] The following plugin updates are available:
[INFO]   maven-clean-plugin ................................. 3.1.0 -> 3.2.0
[INFO]   maven-compiler-plugin ............................. 3.8.0 -> 3.11.0
[INFO]   maven-deploy-plugin ................................ 2.8.2 -> 3.1.1
[INFO]   maven-install-plugin ............................... 2.5.2 -> 3.1.1
[INFO]   maven-jar-plugin ................................... 3.0.2 -> 3.3.0
[INFO]   maven-project-info-reports-plugin .................. 3.0.0 -> 3.4.2
[INFO]   maven-resources-plugin ............................. 3.0.2 -> 3.3.1
[INFO]   maven-site-plugin ............................... 3.7.1 -> 4.0.0-M6
[INFO]   maven-surefire-plugin ............................. 2.22.1 -> 3.0.0

[WARNING] Project does not define minimum Maven version required for build, default is: 3.2.5
[INFO] Plugins require minimum Maven version of: 3.0

[ERROR] Project does not define required minimum version of Maven.
[ERROR] Update the pom.xml to contain maven-enforcer-plugin to
[ERROR] force the Maven version which is needed to build this project.
[ERROR] See https://maven.apache.org/enforcer/enforcer-rules/requireMavenVersion.html
[ERROR] Using the minimum version of Maven: 3.0


mvn versions:display-dependency-updates
[INFO] The following dependencies in Dependencies have newer versions:
[INFO]   junit:junit ........................................... 4.11 -> 4.13.2

mvn versions:use-latest-versions
mvn versions:use-latest-releases
[INFO] Updated junit:junit:jar:4.11 to version 4.13.2
```

pom.xml:
```
    <prerequisites>
      <maven>3.9.1</maven>
    </prerequisites>
```

pom.xml:
```
 <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-enforcer-plugin</artifactId>
          <version>3.3.0</version>
          <executions>
            <execution>
              <id>enforce-maven</id>
              <goals>
                <goal>enforce</goal>
              </goals>
              <configuration>
                <rules>
                  <requireMavenVersion>
                    <version>3.5.0</version>
                  </requireMavenVersion>
                </rules>
              </configuration>
            </execution>
          </executions>
        </plugin>
```

 pom.xml:
 ```
   <build>
    <pluginManagement><!-- lock down plugins versions to avoid using Maven defaults (may be moved to parent pom) -->
      <plugins>
        <!-- clean lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#clean_Lifecycle -->
        <plugin>
          <artifactId>maven-clean-plugin</artifactId>
          <version>3.2.0</version>
        </plugin>
        <!-- default lifecycle, jar packaging: see https://maven.apache.org/ref/current/maven-core/default-bindings.html#Plugin_bindings_for_jar_packaging -->
        <plugin>
          <artifactId>maven-compiler-plugin</artifactId>
          <version>3.11.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-deploy-plugin</artifactId>
          <version>3.1.1</version>
        </plugin>
        <plugin>
          <groupId>org.apache.maven.plugins</groupId>
          <artifactId>maven-enforcer-plugin</artifactId>
          <version>3.3.0</version>
          <executions>
            <execution>
              <id>enforce-maven</id>
              <goals>
                <goal>enforce</goal>
              </goals>
              <configuration>
                <rules>
                  <requireMavenVersion>
                    <version>3.5.0</version>
                  </requireMavenVersion>
                </rules>
              </configuration>
            </execution>
          </executions>
        </plugin>
        <plugin>
          <artifactId>maven-install-plugin</artifactId>
          <version>3.1.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-jar-plugin</artifactId>
          <version>3.3.0</version>
        </plugin>
        <plugin>
          <artifactId>maven-project-info-reports-plugin</artifactId>
          <version>3.4.2</version>
        </plugin>
        <plugin>
          <artifactId>maven-resources-plugin</artifactId>
          <version>3.3.1</version>
        </plugin>
        <plugin>
          <artifactId>maven-site-plugin</artifactId>
          <version>4.0.0-M6</version>
        </plugin>
                <plugin>
          <artifactId>maven-surefire-plugin</artifactId>
          <version>3.0.0</version>
        </plugin>
        <!-- site lifecycle, see https://maven.apache.org/ref/current/maven-core/lifecycles.html#site_Lifecycle -->
      </plugins>
    </pluginManagement>
  </build>
 ```

Added to GitHub:
```
 git remote add origin https://github.com/megan-wilson-sonarsource/DemoMaven.git
```

