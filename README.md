# XOR Java Assignment

**Tools:** 
- Intellij
- SoupUI

**Dependencies:**
- Spring Boot: v2.0.4.RELEASE
- Spring Boot Gradle wrapper
- jackson-dataformat-xml v2.9.6
- stix v1.2.0.2

You can git clone or download from the green button.

## Instruction

### To build:
Since it is a gradle wrapper it should run without gradle installed!

Run command in  the root directory

```
gradle clean build
```
Then change directory to 

```
cd build/libs

java -jar listener-0.0.1-SNAPSHOT.jar

```

Check to see if it is running click on the following link:
- [https://localhost:8443/listener/status](https://localhost:8443/listener/status)

Using the xml file in resources/files/input.xml, I had to make changes since the word document was not correct format.

Using your client ex "soupUI" or "postman": [https://localhost:8443/listener/watchlist](https://localhost:8443/listener/watchlist)

Once you run the post command you will see output on client and in resources/files/watchlist.json or there will be log files as well.

