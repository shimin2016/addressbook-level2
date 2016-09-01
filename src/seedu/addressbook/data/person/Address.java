package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;
import seedu.addressbook.data.person.address.*;

/**
 * Represents a Person's address in the address book.
 * Guarantees: immutable; is valid as declared in {@link #isValidAddress(String)}
 */
public class Address {

    public static final String EXAMPLE = "123, Clementi Ave 3, #12-34, 231534";
    public static final String MESSAGE_ADDRESS_CONSTRAINTS = "Person addresses must be in following format: "
    	+ "block number, street's name, unit number and postal code. Each of them must split by a comma and a whitespace.";
  //  public static final String ADDRESS_VALIDATION_REGEX = "^[\\d]{3}([A-Z])?, .+, #[\\d]{1,2}-[\\d}{1,4}, [\\d]{6}$";
    public static final String ADDRESS_VALIDATION_REGEX = "[\\d]+([A-Z])?, .+, #[\\d]{1,2}-[\\d]{2,3}, [\\d]{6}";
    
//    public final String value;
    private Block block;
    private Street street;
    private Unit unit;
    private PostalCode postalCode;
    private boolean isPrivate;

    /**
     * Validates given address.
     *
     * @throws IllegalValueException if given address string is invalid.
     */
    public Address(String address, boolean isPrivate) throws IllegalValueException {
        this.isPrivate = isPrivate;
        if (!isValidAddress(address)) {
            throw new IllegalValueException(MESSAGE_ADDRESS_CONSTRAINTS);
        }
        String[] newAddress = address.split(", ");
        this.block = new Block(newAddress[0]);
        this.street = new Street(newAddress[1]);
        this.unit = new Unit(newAddress[2]);
        this.postalCode = new PostalCode(Integer.parseInt(newAddress[3]));
    }

    /**
     * Returns true if a given string is a valid person email.
     */
    public static boolean isValidAddress(String test) {
        return test.matches(ADDRESS_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return block+", "+street+", "+unit+", "+postalCode;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Address // instanceof handles nulls
                && this.block.equals(((Address) other).block)
                && this.street.equals(((Address) other).street)
                && this.unit.equals(((Address) other).unit)
                && this.postalCode.equals(((Address) other).postalCode)); // state check
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(block.hashCode()+street.hashCode()+unit.hashCode()+postalCode.hashCode());
    }

    public boolean isPrivate() {
        return isPrivate;
    }
}