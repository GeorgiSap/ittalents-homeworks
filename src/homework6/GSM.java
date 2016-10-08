package homework6;

public class GSM {
	String model;
	boolean hasSimCard;
	String simMobileNumber;
	double outgoingCallsDuration;
	Call lastIncomingCall;
	Call lastOutgoingCall;
	
	void  insertSimCard(String newSimMobileNumber) {
		if (!hasSimCard && isValid(newSimMobileNumber)) {
			simMobileNumber = newSimMobileNumber;
			hasSimCard = true;
		} else {
			System.out.println("Invalid number or already has sim card.");
		}
	}
	
	void removeSimCard() {
		if (hasSimCard) {
		hasSimCard = false;
		simMobileNumber = "";
		} else {
			System.out.println("No sim card.");
		}
	}
	
	void  call(GSM receiver, float duration) {
		if (duration > 0 && duration <= 480 && hasSimCard && receiver.hasSimCard && 
				isValid(simMobileNumber) && isValid(receiver.simMobileNumber) &&
						!simMobileNumber.equals(receiver.simMobileNumber)) {
			Call call = new Call();
			call.caller = this;
			call.receiver = receiver;
			call.duration = duration;
			lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			outgoingCallsDuration += duration;
		} else {
			System.out.println("Invalid parameters.");
		}	
	}
	
	double getSumForCall() {
		return outgoingCallsDuration * Call.priceForAMinute;
	}
	
	void printInfoForTheLastOutgoingCall() {
		if (lastOutgoingCall != null && lastOutgoingCall.caller != null && lastOutgoingCall.receiver != null &&
				isValid(lastOutgoingCall.caller.simMobileNumber) && 
				isValid(lastOutgoingCall.receiver.simMobileNumber) && 
				lastOutgoingCall.duration > 0 && lastOutgoingCall.duration < 480) {
		System.out.println("Caller: " + lastOutgoingCall.caller.simMobileNumber);
		System.out.println("Receiver: " + lastOutgoingCall.receiver.simMobileNumber);
		System.out.println("Duration: " + lastOutgoingCall.duration);
		System.out.println("PricePerMinute: " + Call.priceForAMinute);
		} else {
			System.out.println("No/ incomplete information.");
		}
	}
	
	void printInfoForTheLastIncomingCall() {
		if (lastIncomingCall != null && lastIncomingCall.caller != null && lastIncomingCall.receiver != null &&
				isValid(lastIncomingCall.caller.simMobileNumber) && 
				isValid(lastIncomingCall.receiver.simMobileNumber) && 
				lastIncomingCall.duration > 0 && lastIncomingCall.duration < 480) {
		System.out.println("Caller: " + lastIncomingCall.caller.simMobileNumber);
		System.out.println("Receiver: " + lastIncomingCall.receiver.simMobileNumber);
		System.out.println("Duration: " + lastIncomingCall.duration);
		System.out.println("PricePerMinute: " + Call.priceForAMinute);
		} else {
			System.out.println("No/ incomplete information.");
		}
	}
	
	boolean isValid(String mobileNumber) {
		if (mobileNumber == null || mobileNumber.length() != 10 || !mobileNumber.startsWith("08")) {
			return false;
		}
		for (int index = 2; index < mobileNumber.length(); index++) {
			if (mobileNumber.charAt(index) < '0' || mobileNumber.charAt(index) > '9') {
				return false;
			}
		}
		return true;
		
	}

}
