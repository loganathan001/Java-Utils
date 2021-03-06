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
 * The Class Tuple7.
 *
 * @param <A> the generic type
 * @param <B> the generic type
 * @param <C> the generic type
 * @param <D> the generic type
 * @param <E> the element type
 * @param <F> the generic type
 * @param <G> the generic type
 */
public final class Tuple7<A, B, C, D, E, F, G> {
	
	/** The a. */
	final private A a;
	
	/** The b. */
	final private B b;
	
	/** The c. */
	final private C c;
	
	/** The d. */
	final private D d;
	
	/** The e. */
	final private E e;
	
	/** The f. */
	final private F f;
	
	/** The g. */
	final private G g;

	/**
	 * Instantiates a new tuple 7.
	 *
	 * @param a the a
	 * @param b the b
	 * @param c the c
	 * @param d the d
	 * @param e the e
	 * @param f the f
	 * @param g the g
	 */
	public Tuple7(A a, B b, C c, D d, E e, F f, G g) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
		this.g = g;
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

	/**
	 * Gets the 5.
	 *
	 * @return the 5
	 */
	public E get5() {
		return e;
	}

	/**
	 * Gets the 6.
	 *
	 * @return the 6
	 */
	public F get6() {
		return f;
	}

	/**
	 * Gets the 7.
	 *
	 * @return the 7
	 */
	public G get7() {
		return g;
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
		result = prime * result + ((e == null) ? 0 : e.hashCode());
		result = prime * result + ((f == null) ? 0 : f.hashCode());
		result = prime * result + ((g == null) ? 0 : g.hashCode());
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
		Tuple7 other = (Tuple7) obj;
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
		if (e == null) {
			if (other.e != null)
				return false;
		} else if (!e.equals(other.e))
			return false;
		if (f == null) {
			if (other.f != null)
				return false;
		} else if (!f.equals(other.f))
			return false;
		if (g == null) {
			if (other.g != null)
				return false;
		} else if (!g.equals(other.g))
			return false;
		return true;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Tuple7 [1=" + a + ", 2=" + b + ", 3=" + c + ", 4=" + d + ", 5=" + e + ", 6=" + f + ", 7=" + g + "]";
	}

}
