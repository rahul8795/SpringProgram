package com.cts.scopes;

import java.util.HashMap;

public class CustomThreadLocal extends ThreadLocal<Object> {
	@Override
	protected Object initialValue() {
		return new HashMap<String, Object>();
	}
	

}
