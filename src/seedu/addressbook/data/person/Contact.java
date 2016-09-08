package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
    public final String value;
    private boolean isPrivate;
    
    /**
     * Validates given contact information.
     *
     * @throws IllegalValueException if given contact information string is invalid.
     */
    public Contact(String contact, boolean isPrivate, String MESSAGE_CONTACT_CONSTRAINTS, String ADDRESS_VALIDATION_REGEX) throws IllegalValueException {
        contact = contact.trim();
        this.isPrivate = isPrivate;
        if (!isValidContact(contact,ADDRESS_VALIDATION_REGEX)) {
            throw new IllegalValueException(MESSAGE_CONTACT_CONSTRAINTS);
        }
        this.value = contact;   
    }
    
    /**
     * Returns true if a given string is a valid person contact.
     */
    public static boolean isValidContact(String test, String CONTACT_VALIDATION_REGEX) {
        return test.matches(CONTACT_VALIDATION_REGEX);
    }
    
    @Override
    public String toString() {
        return value;
    }
    
    public boolean isPrivate() {
        return isPrivate;
    }
    
    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Contact // instanceof handles nulls
                && this.value.equals(((Contact) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
