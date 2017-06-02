package com.decorator.pattern.io.impl;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {

	protected LowerCaseInputStream(InputStream in) {
		super(in);
	}
	
	@Override
	public int read() throws IOException {
		int read = super.read();
		String string = String.valueOf(read);
		return Character.toLowerCase(string.charAt(0));
	}

}
