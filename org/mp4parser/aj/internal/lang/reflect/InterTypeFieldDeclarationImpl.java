package org.mp4parser.aj.internal.lang.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;
import org.mp4parser.aj.lang.reflect.InterTypeFieldDeclaration;

public class InterTypeFieldDeclarationImpl extends InterTypeDeclarationImpl implements InterTypeFieldDeclaration {
    private Type genericType;
    private String name;
    private AjType type;

    public InterTypeFieldDeclarationImpl(AjType ajType0, String s, int v, String s1, AjType ajType1, Type type0) {
        super(ajType0, s, v);
        this.name = s1;
        this.type = ajType1;
        this.genericType = type0;
    }

    public InterTypeFieldDeclarationImpl(AjType ajType0, AjType ajType1, Field field0) {
        super(ajType0, ajType1, field0.getModifiers());
        this.name = field0.getName();
        this.type = AjTypeSystem.getAjType(field0.getType());
        Type type0 = field0.getGenericType();
        if(type0 instanceof Class) {
            this.genericType = AjTypeSystem.getAjType(((Class)type0));
            return;
        }
        this.genericType = type0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeFieldDeclaration
    public Type getGenericType() {
        return this.genericType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeFieldDeclaration
    public String getName() {
        return this.name;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeFieldDeclaration
    public AjType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return Modifier.toString(this.getModifiers()) + " " + this.getType().toString() + " " + this.targetTypeName + "." + this.getName();
    }
}

