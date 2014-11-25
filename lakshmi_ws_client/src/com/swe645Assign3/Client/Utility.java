package com.swe645Assign3.Client;

import lakshmigowda.session.appmodel.SearchAppModel;

public class Utility {
	public static lakshmigowda.session.ejb.SearchAppModel mapSearcToServiceSAM(
			SearchAppModel search) {
		lakshmigowda.session.ejb.SearchAppModel serviceSearch = new lakshmigowda.session.ejb.SearchAppModel();
		serviceSearch.setCity(search.getCity());
		serviceSearch.setFirstName(search.getFirstName());
		serviceSearch.setLastName(search.getLastName());
		serviceSearch.setState(search.getState());
		return serviceSearch;
	}
}
