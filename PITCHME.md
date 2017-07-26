# HWS - HelloWebServices

Doesn't do much, atm.

---
## Projects
* com.samples.hws.core
* com.samples.hws.service

+++
## Online Demo

* http://hellows.herokuapp.com/

---
## Clone
```
> git clone git://github.com/vincintz/HWS.git
> cd HWS
```

+++
## Build
```
> mvn clean install
```

+++
## Run
```
> java -jar \
      com.samples.hws.runner/target/dependency/jetty-runner.jar \
      --port 8080 com.samples.hws.runner/target/*.war
```