package com.springdemo.springcore.properties;

import java.util.Properties;

public class Locations {
	private Properties dialect;
	// property is similar to the map

	@Override
	public String toString() {
		return "Locations [dialect=" + dialect + "]";
	}

	public Properties getDialect() {
		return dialect;
	}

	public void setDialect(Properties dialect) {
		this.dialect = dialect;
	}

}
