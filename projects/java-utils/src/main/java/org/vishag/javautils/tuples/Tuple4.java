/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at

 *   http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.vishag.javautils.tuples;

/**
 * The Class Tuple4.
 *
 * @param <A> the generic type
 * @param <B> the generic type
 * @param <C> the generic type
 * @param <D> the generic type
 */
public final class Tuple4<A, B, C, D> {
	
	/** The a. */
	final private A a;
	
	/** The b. */
	final private B b;
	
	/** The c. */
	final private C c;
	
	/** The d. */
	final private D d;

	/**
	 * Instantiates a new tuple 4.
	 *
	 * @param a the a
	 * @param b the b
	 * @param c the c
	 * @param d the d
	 */
	public Tuple4(A a, B b, C c, D d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	/**
	 * Gets the 1.
	 *
	 * @return the 1
	 */
	public A get1() {
		return a;
	}

	/**
	 * Gets the 2.
	 *
	 * @return the 2
	 */
	public B get2() {
		return b;
	}

	/**
	 * Gets the 3.
	 *
	 * @return the 3
	 */
	public C get3() {
		return c;
	}

	/**
	 * Gets the 4.
	 *
	 * @return the 4
	 */
	public D get4() {
		return d;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((a == null) ? 0 : a.hashCode());
		result = prime * result + ((b == null) ? 0 : b.hashCode());
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + ((d == null) ? 0 : d.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tuple4 other = (Tuple4) obj;
		if (a == null) {
			if (other.a != null)
				return false;
		} else if (!a.equals(other.a))
			return false;
		if (b == null) {
			if (other.b != null)
				return false;
		} else if (!b.equals(other.b))
			return false;
		if (c == null) {
			if (other.c != null)
				return false;
		} else if (!c.equals(other.c))
			return false;
		if (d == null) {
			if (other.d != null)
				return false;
		} else if (!d.equals(other.d))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tuple4 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}

}
