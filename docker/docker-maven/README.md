# docker-maven
Java with docker and maven

to create docker build run

```bash
docker build -t docker-maven .
```

to run application

```bash
docker run -p 8080:8080 docker-maven
```
image contains one rest api 
```bash
<url of the docker machine>:8080/api/hello
```

Output will be
#### Hello Avijit
