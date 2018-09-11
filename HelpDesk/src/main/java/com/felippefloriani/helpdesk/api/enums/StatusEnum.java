package com.felippefloriani.helpdesk.api.enums;

public enum StatusEnum {
	
	New,
	Assigned,
	Resolved,
	Aproved,
	Disaproved,
	Closed;
	
	
	public static StatusEnum get(String status) {
		switch(status) {
		case "New": return New;
		case "Resolved": return Resolved;
		case "Approved": return Aproved;
		case "Disaproved": return Disaproved;
		case "Assigned": return Assigned;
		case "Closed": return Closed;
		default : return New;
		
		}
	}

}
