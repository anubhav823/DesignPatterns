package Reflection;

import java.lang.reflect.Modifier;

public class TestReflection {
public static void main(String[] args) {
	Class reflectClass = ClassForReflection.class;
	System.out.println(reflectClass.getName());
	int modifiers = reflectClass.getModifiers();
	System.out.println(Modifier.isPrivate(modifiers));
	Class superClass = reflectClass.getSuperclass();
	System.out.println(superClass.getName());
	
	Method[] methods = reflectClass.getMethods();
	
}
}
