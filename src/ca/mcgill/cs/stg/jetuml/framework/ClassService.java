package ca.mcgill.cs.stg.jetuml.framework;

import java.util.ArrayList;
import java.util.List;

import ca.mcgill.cs.stg.jetuml.graph.ClassNode;

public class ClassService {
	private static List<ClassNode> classes = new ArrayList<ClassNode>();
	
	public static int addClass(ClassNode node){
		classes.add(node);
		return classes.size()-1;
	}
	
	public static void removeClass(int id){
		classes.remove(id);
	}
	
	public static void setClass(int id, ClassNode node){
		classes.set(id, node);
	}
	
	public static List<ClassNode> listClasses(){
		return classes;
	}

}
