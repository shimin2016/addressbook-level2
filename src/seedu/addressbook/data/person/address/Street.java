package seedu.addressbook.data.person.address;

public class Street {

	private String streetAddress;

	public Street(String address){
		streetAddress = address;
	}

	public void setstreetAddress(String newAddress) {
		streetAddress = newAddress;
	}

	public void editstreetAddress(String newAddress) {
		streetAddress = newAddress;
	}

	public String getstreetAddress() {
		return streetAddress;
	}

	@Override
	public String toString() {
		return streetAddress;
	}
	
	@Override
	 public boolean equals(Object other) {
	 return other == this // short circuit if same object
			 || (other instanceof Block // instanceof handles nulls
					 && this.streetAddress == (((Street) other).streetAddress)); // state check
	 }

	 @Override
	 public int hashCode() {
		 return streetAddress.hashCode();
	 }
}
