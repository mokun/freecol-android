/**
 *	Copyright (C) 2012   The FreeCol-Android Team
 *
 *  This file is part of FreeCol-Android.
 *
 *  FreeCol-Android is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 2 of the License, or
 *  (at your option) any later version.
 *
 *  FreeCol is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with FreeCol-Android.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.freecolandroid.repackaged.javax.swing.border;

import org.freecolandroid.repackaged.java.awt.Component;
import org.freecolandroid.repackaged.java.awt.Graphics;
import org.freecolandroid.repackaged.java.awt.Insets;

public abstract class AbstractBorder implements Border {

	@Override
	public void paintBorder(Component c, Graphics g, int x, int y, int width,
			int height) {
		// Does nothing
	}

	@Override
	public Insets getBorderInsets(Component c) {
		// Does nothing
		return new Insets(0, 0, 0, 0);
	}

}
