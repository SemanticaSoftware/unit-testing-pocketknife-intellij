package com.semantica.pocketknife.methodrecorder;

public class SomeClass {

	int a;

	public SomeClass(int a) {
		super();
		this.a = a;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		SomeClass other = (SomeClass) obj;
		if (a != other.a) {
			return false;
		}
		return true;
	}

}
