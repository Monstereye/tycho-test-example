/*******************************************************************************
 * Copyright (c) 2008, 2011 Sonatype Inc. and others.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Sonatype Inc. - initial API and implementation
 *******************************************************************************/

package tycho.demo.itp02;

import org.junit.Assert;
import org.junit.Test;

import tycho.demo.itp02.MyClassInITP02;

public class Test2 {

	@Test
	public void testReturnTrue() {

		// MatcherAssert.assertThat("reason", true);
		final MyClassInITP02 classUnderTest = new MyClassInITP02();
		Assert.assertTrue(classUnderTest.returnTrue());
	}

	@Test
	public void testReturnFalse() {
		final MyClassInITP02 classUnderTest = new MyClassInITP02();
		Assert.assertFalse(classUnderTest.returnFalse());
	}
}
