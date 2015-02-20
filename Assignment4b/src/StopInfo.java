public class StopInfo {
	private String stopName;
	private String stopLocation;
	private String stopSize;
	private Boolean stopWashrooms;

	public StopInfo() {
		stopName = "";
		stopLocation = "";
		stopSize = "Small";
		stopWashrooms = false;
	}

	public StopInfo(String newStopName, String newStopLocation) {
		stopName = newStopName;
		stopLocation = newStopLocation;
		stopSize = "Small";
		stopWashrooms = false;
	}

	public StopInfo(String newStopName, String newStopLocation,
			String newStopSize, Boolean newStopWashroom) {
		stopName = newStopName;
		stopLocation = newStopLocation;
		stopSize = newStopSize;
		stopWashrooms = newStopWashroom;
	}
	
	public Boolean equals(){
		return stopName.equals(stopLocation);
	}
	
	public String toString(){
		if(stopWashrooms == true){
			return "Stop: " + stopName + "\n" + "Location: " + stopLocation + "\n" + 
					"Size: " + stopSize + "\n" + "Washrooms available: Yes";
		}
		else{
			return "Stop: " + stopName + "\n" + "Location: " + stopLocation + "\n" + 
					"Size: " + stopSize + "\n" + "Washrooms available: No";
		}
	}

	public String getStopName() { return stopName; }

	public String getStopLocation() { return stopLocation; }

	public String getStopSize() { return stopSize; }

	public Boolean getStopWashrooms() {	return stopWashrooms; }
}
