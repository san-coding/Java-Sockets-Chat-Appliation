# Java-Sockets-Chat-Appliation
A simple  TCP client server chat application implemented in JAVA using socket programming

## Commands to run the Application

Open two terminals side by side in the project folder containing the client.java and server.java files.

### First run the Server
```
javac server.java
```

```
java server
```

### Run the Client
```
javac client.java
```

```
java client
```

## Workflow

- Server waits for the client to connect
- Client connects to the server
- Server waits for the client to send the first message
- Client sends the message , and waits for server's response
- Messages can only be sent sequentially , i.e client has to wait for server's response once it has sent a message, and vice-versa
