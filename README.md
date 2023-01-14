# Urlaubsverwaltung Extension Java API

This project provides DTOs and service interfaces to write own extensions for [Urlaubsverwaltung](https://github.com/urlaubsverwaltung/urlaubsverwaltung).


## Requirements

This project requires Java 11 compiler.


## Usage

Include Urlaubsverwaltung Extension Java API to your project:

```xml
<dependency>
    <groupId>de.focus-shift.urlaubsverwaltung.extension.api</groupId>
    <artifactId>service</artifactId>
    <version>...</version>
</dependency>
```

After that, create a java class and use one of the *ServiceExtension classes like `PersonServiceExtension`:

```java
package my.custom.package;

import java.util.Set;
import java.util.UUID;

public class PersonServiceExtensionDemo {

    private final PersonServiceExtension personServiceExtension;

    public PersonServiceExtensionTest(PersonServiceExtension personServiceExtension) {
        this.personServiceExtension = personServiceExtension;
    }

    void doSomething() {
        PersonDTO myPerson = PersonDTO.builder()
                .firstName("Marlene")
                .lastName("Muster")
                .username(UUID.randomUUID().toString())
                .email("office@example.org")
                .permissions(Set.of(RoleDTO.OFFICE))
                .build();

        PersonDTO createdPerson = personServiceExtension.create(myPerson);
    }
}
```

Package your extension and run Urlaubsverwaltung with [PropertiesLauncher](https://docs.spring.io/spring-boot/docs/current/reference/html/executable-jar.html#appendix.executable-jar.property-launcher)


## Implementation Status

The following extension points are provided:

* [ ] absence
* [ ] account
* [ ] application
* [ ] department
* [ ] overtime
* [x] person
* [ ] publicholiday
* [ ] settings
* [ ] sicknote
* [ ] user
* [ ] workingtime


## License

Urlaubsverwaltung Extension Java API is Open Source software released under the [Apache License 2.0](LICENSE).
