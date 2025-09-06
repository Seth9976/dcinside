package org.mp4parser.aj.lang.reflect;

import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

public interface AjType extends AnnotatedElement, Type {
    Advice getAdvice(String arg1) throws NoSuchAdviceException;

    Advice[] getAdvice(AdviceKind[] arg1);

    AjType[] getAjTypes();

    Constructor getConstructor(AjType[] arg1) throws NoSuchMethodException;

    Constructor[] getConstructors();

    DeclareAnnotation[] getDeclareAnnotations();

    DeclareErrorOrWarning[] getDeclareErrorOrWarnings();

    DeclareParents[] getDeclareParents();

    DeclarePrecedence[] getDeclarePrecedence();

    DeclareSoft[] getDeclareSofts();

    Advice getDeclaredAdvice(String arg1) throws NoSuchAdviceException;

    Advice[] getDeclaredAdvice(AdviceKind[] arg1);

    AjType[] getDeclaredAjTypes();

    Constructor getDeclaredConstructor(AjType[] arg1) throws NoSuchMethodException;

    Constructor[] getDeclaredConstructors();

    Field getDeclaredField(String arg1) throws NoSuchFieldException;

    Field[] getDeclaredFields();

    InterTypeConstructorDeclaration getDeclaredITDConstructor(AjType arg1, AjType[] arg2) throws NoSuchMethodException;

    InterTypeConstructorDeclaration[] getDeclaredITDConstructors();

    InterTypeFieldDeclaration getDeclaredITDField(String arg1, AjType arg2) throws NoSuchFieldException;

    InterTypeFieldDeclaration[] getDeclaredITDFields();

    InterTypeMethodDeclaration getDeclaredITDMethod(String arg1, AjType arg2, AjType[] arg3) throws NoSuchMethodException;

    InterTypeMethodDeclaration[] getDeclaredITDMethods();

    Method getDeclaredMethod(String arg1, AjType[] arg2) throws NoSuchMethodException;

    Method[] getDeclaredMethods();

    Pointcut getDeclaredPointcut(String arg1) throws NoSuchPointcutException;

    Pointcut[] getDeclaredPointcuts();

    AjType getDeclaringType();

    Constructor getEnclosingConstructor();

    Method getEnclosingMethod();

    AjType getEnclosingType();

    Object[] getEnumConstants();

    Field getField(String arg1) throws NoSuchFieldException;

    Field[] getFields();

    Type getGenericSupertype();

    InterTypeConstructorDeclaration getITDConstructor(AjType arg1, AjType[] arg2) throws NoSuchMethodException;

    InterTypeConstructorDeclaration[] getITDConstructors();

    InterTypeFieldDeclaration getITDField(String arg1, AjType arg2) throws NoSuchFieldException;

    InterTypeFieldDeclaration[] getITDFields();

    InterTypeMethodDeclaration getITDMethod(String arg1, AjType arg2, AjType[] arg3) throws NoSuchMethodException;

    InterTypeMethodDeclaration[] getITDMethods();

    AjType[] getInterfaces();

    Class getJavaClass();

    Method getMethod(String arg1, AjType[] arg2) throws NoSuchMethodException;

    Method[] getMethods();

    int getModifiers();

    String getName();

    Package getPackage();

    PerClause getPerClause();

    Pointcut getPointcut(String arg1) throws NoSuchPointcutException;

    Pointcut[] getPointcuts();

    AjType getSupertype();

    TypeVariable[] getTypeParameters();

    boolean isArray();

    boolean isAspect();

    boolean isEnum();

    boolean isInstance(Object arg1);

    boolean isInterface();

    boolean isLocalClass();

    boolean isMemberAspect();

    boolean isMemberClass();

    boolean isPrimitive();

    boolean isPrivileged();
}

