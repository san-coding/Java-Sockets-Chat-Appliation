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
- Messages can only be sent sequentially , i.e the Client has to wait for the Server's response once it has sent a message, and vice-versa

## Preview


<img width="1283" alt="Screenshot 2021-08-10 at 10 57 36 AM" src="https://user-images.githubusercontent.com/65719940/128828801-fbcb7323-a2b0-434c-92b7-6bf716ab2757.png">

