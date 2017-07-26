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

---
## Code presentation
```
    private List<App> filterUserApps(List<App> apps) throws GenericException {
        log.debug("Search for all apps");

        UserModel user = permissionsChecker.getUser();

        log.debug("Found apps");

        if (user.isSystemAdmin()) {
            return apps;
        }

        return apps.stream().filter(app -> (
                app.getName().equals("CUSM") && permissionsChecker.isAdminInAnyApp(user))
                        || user.getAppDetailsByApp(app.getName()) != null
        ).collect(Collectors.toList());
    }
```
@[1](Declare function)
@[2,6](Debug log)
@[4](Declare user)
@[8-10](If IsAdmin)
@[12-15](Refactor!)
