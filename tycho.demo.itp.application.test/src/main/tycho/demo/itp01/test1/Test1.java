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

package tycho.demo.itp01.test1;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import tycho.demo.itp.Application;

public class Test1 {

	@Test
	public void sampleAction() {

		final Application app = Mockito.mock(Application.class);

		Assert.assertTrue(true);

	}

}
