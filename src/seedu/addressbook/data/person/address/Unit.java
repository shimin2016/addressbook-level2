package seedu.addressbook.data.person.address;

public class Unit {

	private int floorNumber;
	private int unitNumber;

	public Unit(String unitAddress){
		String[] _unitAddress = unitAddress.replace("#","").split("-");
		this.floorNumber = Integer.parseInt(_unitAddress[0]);
		this.unitNumber = Integer.parseInt(_unitAddress[1]);
	}

	public void setUnitNumber(int newNuitNumber) {
		unitNumber = newNuitNumber;
	}

	public void edituNitNumber(int newNuitNumber) {
		unitNumber = newNuitNumber;
	}
	
	public void setFloorNumber(int newFloorNumber) {
		floorNumber = newFloorNumber;
	}

	public void editFloorNumber(int newFloorNumber) {
		floorNumber = newFloorNumber;
	}

	public int getUnitNumber() {
		return unitNumber;
	}

	public int getFloorNumber() {
		return floorNumber;
	}
	@Override
	public String toString() {
		return "#"+String.format("%02d", floorNumber)+"-"+String.format("%03d", unitNumber);
	}
	
	@Override
	 public boolean equals(Object other) {
	 return other == this // short circuit if same object
			 || (other instanceof Block // instanceof handles nulls
			 && this.floorNumber == (((Unit) other).floorNumber) && this.unitNumber == (((Unit) other).unitNumber)); // state check
	 }

	 @Override
	 public int hashCode() {
		 return Integer.hashCode(unitNumber);
	 }
}
