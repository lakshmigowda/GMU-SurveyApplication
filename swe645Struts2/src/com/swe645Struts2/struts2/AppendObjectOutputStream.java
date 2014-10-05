/*
 * Lakshmi Venkataiah
 * This class is used to append new objects to text file which stores student survey object data
 */

package com.swe645Struts2.struts2;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class AppendObjectOutputStream extends ObjectOutputStream {

	public AppendObjectOutputStream(OutputStream o) throws IOException {
		super(o);
	}

	@Override
	protected void writeStreamHeader() throws IOException {
		reset();
	}
}
