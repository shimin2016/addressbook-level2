package seedu.addressbook.data.person.address;

public class Block {
	private String blockAddress;
	
	public Block(String address){
		blockAddress = address;
	}
	
	public void setBlockAddress(String newAddress){
		blockAddress = newAddress;
	}
	
	public void editBlockAddress(String newAddress){
		blockAddress = newAddress;
	}
	
	public String getBlockAddress(){
		return blockAddress;
	}
	
	@Override
    public String toString() {
        return blockAddress;
    }
	
	@Override
	 public boolean equals(Object other) {
	 return other == this // short circuit if same object
			 || (other instanceof Block // instanceof handles nulls
					 && this.blockAddress == (((Block) other).blockAddress)); // state check
	 }

	 @Override
	 public int hashCode() {
		 return blockAddress.hashCode();
	 }
}
