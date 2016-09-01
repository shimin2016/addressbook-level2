package seedu.addressbook.data.person.address;

public class PostalCode {
	
	private int postalCode;

	public PostalCode(int code){
		postalCode = code;
	}

	public void setPostalCode(int newPostalCode) {
		postalCode = newPostalCode;
	}

	public void editPostalCode(int newPostalCode) {
		postalCode = newPostalCode;
	}

	public int getPostalCode() {
		return postalCode;
	}

	@Override
	public String toString() {
		return Integer.toString(postalCode);
	}
	
	@Override
	 public boolean equals(Object other) {
	 return other == this // short circuit if same object
			 || (other instanceof Block // instanceof handles nulls
					 && this.postalCode == (((PostalCode) other).postalCode)); // state check
	 }

	 @Override
	 public int hashCode() {
		 return Integer.hashCode(postalCode);
	 }
}
