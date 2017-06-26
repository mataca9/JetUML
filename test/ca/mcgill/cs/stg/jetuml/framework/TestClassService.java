/*******************************************************************************
 * JetUML - A desktop application for fast UML diagramming.
 *
 * Copyright (C) 2016 by the contributors of the JetUML project.
 *
 * See: https://github.com/prmr/JetUML
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *******************************************************************************/
package ca.mcgill.cs.stg.jetuml.framework;
import ca.mcgill.cs.stg.jetuml.framework.ClassService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ca.mcgill.cs.stg.jetuml.diagrams.ClassDiagramGraph;
import ca.mcgill.cs.stg.jetuml.framework.Grid;
import ca.mcgill.cs.stg.jetuml.framework.MultiLineString;
import ca.mcgill.cs.stg.jetuml.graph.ClassNode;

public class TestClassService
{
	private ClassNode aNode1, aNode2;
	
	@Before
	public void setup()
	{
		aNode1 = new ClassNode();
	}
	
	@Test
	public void testListClass()
	{
		assertTrue(ClassService.listClasses() instanceof ArrayList);
	}
	
	@Test
	public void testClearClass()
	{
		ClassService.clearClasses();
		assertTrue(ClassService.listClasses().isEmpty());
	}
	
	@Test
	public void testAddClass()
	{
		ClassService.clearClasses();
		ClassService.addClass(aNode1);
		assertTrue(ClassService.listClasses().size() == 1);
	}
	
	@Test
	public void testMultipleAddClass()
	{
		ClassService.addClass(aNode1);
		ClassService.addClass(aNode2);
		assertTrue(ClassService.listClasses().size() == 2);
	}
	
	@Test
	public void testRemoveClass()
	{
		ClassService.clearClasses();
		int id = ClassService.addClass(aNode1);
		ClassService.removeClass(id);
		assertTrue(ClassService.listClasses().isEmpty());
	}
	
}