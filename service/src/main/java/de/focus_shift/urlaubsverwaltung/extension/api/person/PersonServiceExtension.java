package de.focus_shift.urlaubsverwaltung.extension.api.person;

import java.util.Optional;
import java.util.stream.Stream;

/** Interface to provide access to {@link PersonDTO}s. */
public interface PersonServiceExtension {

  /**
   * Creates a new person.
   *
   * @param person to be created
   * @return created person
   */
  PersonDTO create(PersonDTO person);

  /**
   * Updates the given person.
   *
   * @param person to be saved
   * @return updated person
   */
  PersonDTO update(PersonDTO person);

  /**
   * Deletes a {@link PersonDTO} in the database by its primary key.
   *
   * @param person the person to be deleted
   * @param signedInUserId the personId who wants to delete the given person
   */
  void delete(PersonDTO person, Integer signedInUserId);

  /**
   * finds a {@link PersonDTO} in the database by its primary key.
   *
   * @param id Integer the id of the person
   * @return optional {@link PersonDTO} for the given id
   */
  Optional<PersonDTO> getPersonById(Integer id);

  /**
   * finds a {@link PersonDTO} in the database by username.
   *
   * @param username of the person
   * @return optional {@link PersonDTO} for the given username
   */
  Optional<PersonDTO> getPersonByUsername(String username);

  /**
   * finds a {@link PersonDTO} in the database by mail address.
   *
   * @param mailAddress of the person
   * @return optional {@link PersonDTO} for the given mail address
   */
  Optional<PersonDTO> getPersonByMailAddress(String mailAddress);

  /**
   * returns all active persons.
   *
   * @return returns all active persons
   */
  Stream<PersonDTO> getActivePersons();

  /**
   * Find all inactive persons.
   *
   * @return returns all inactive persons
   */
  Stream<PersonDTO> getInactivePersons();

  /**
   * This method allows to get the signed-in user.
   *
   * @return user that is signed-in
   */
  PersonDTO getSignedInUser();

  /**
   * Entitles the given person with maximum permissions if no other person with maximum permissions
   * exists.
   *
   * @param person that maybe gets maximum permissions
   * @return saved {@link PersonDTO} with maybe maximum permissions.
   */
  PersonDTO appointAsInitialUserIfNoInitialUserPresent(PersonDTO person);
}
