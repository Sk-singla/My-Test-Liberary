# My-Test-Library
This is Test Library


gradle:
----------------------------
            allprojects {
              repositories {
                ...
                maven { url 'https://jitpack.io' }
              }
            }

            dependencies {
                    implementation 'com.github.Sk-singla:My-Test-Liberary:1.0'
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
	    <version>1.0</version>
	</dependency>

