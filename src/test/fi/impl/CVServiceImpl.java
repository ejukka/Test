package test.fi.impl;

import test.fi.CV;
import test.fi.CVService;

public class CVServiceImpl implements CVService {

	public CV getCV() {
		return new CVImpl();
	}
}
