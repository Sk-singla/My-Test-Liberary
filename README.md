# My-Test-Liberary
This is Test Liberary


gradle:
----------------------------
            allprojects {
              repositories {
                ...
                maven { url 'https://jitpack.io' }
              }
            }

            dependencies {
                    implementation 'com.github.Sk-singla:My-Test-Liberary:Tag'
            }

maven:
---------------------------
            <repositories>
              <repository>
                  <id>jitpack.io</id>
                  <url>https://jitpack.io</url>
              </repository>
            </repositories>

            <dependency>
                <groupId>com.github.Sk-singla</groupId>
                <artifactId>My-Test-Liberary</artifactId>
                <version>Tag</version>
            </dependency>

