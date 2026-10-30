# Urlaubsverwaltung Extension Java API

This project provides DTOs and service interfaces to write own extensions for [Urlaubsverwaltung](https://github.com/urlaubsverwaltung/urlaubsverwaltung).


## Requirements

This project requires Java 21 compiler.


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
* [x] application
* [ ] department
* [ ] overtime
* [x] person
* [ ] publicholiday
* [ ] settings
* [x] sicknote
* [ ] user
* [ ] workingtime

## Compatibility

| Extension API Version | Urlaubsverwaltung Version | Java Version |
|-----------------------|---------------------------|--------------|
| 3.x.x                 | 5.x.x                     | 21.x         |
| 2.x.x                 | 5.x.x                     | 21.x         |
| 1.x.x                 | 5.x.x                     | 21.x         |
| 0.x.x                 | 4.x.x                     | 11.x         |


## Release

Releases are published to Maven Central by the [Release workflow](.github/workflows/release.yml),
which is triggered by pushing a tag starting with `v`.

1. Make sure the [Build workflow](.github/workflows/build.yml) on `main` is green.
2. Set the release version in the `revision` property of the root `pom.xml`
   (e.g. `3.5.0-SNAPSHOT` → `3.5.0`) and commit it as `Prepare for next release version v3.5.0`.
3. Create an annotated tag and push it together with `main`:
   ```bash
   git tag -a v3.5.0 -m "Release v3.5.0"
   git push origin main v3.5.0
   ```
   The workflow runs `./mvnw -Prelease deploy`, which signs the artifacts with GPG and
   publishes them to Maven Central. It requires the repository secrets `CENTRAL_USERNAME`,
   `CENTRAL_PASSWORD`, `GPG_PRIVATE_KEY` and `GPG_PASSPHRASE`.
4. Set the next development version (e.g. `3.6.0-SNAPSHOT`), commit it as
   `Prepare for next development version` and push to `main`.

Releases published to Maven Central cannot be withdrawn, so double-check the version before pushing the tag.


## License

Urlaubsverwaltung Extension Java API is Open Source software released under the [Apache License 2.0](LICENSE).
