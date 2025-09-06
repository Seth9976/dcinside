package org.mp4parser.aj.internal.lang.reflect;

import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.InterTypeDeclaration;

public class InterTypeDeclarationImpl implements InterTypeDeclaration {
    private AjType declaringType;
    private int modifiers;
    private AjType targetType;
    protected String targetTypeName;

    public InterTypeDeclarationImpl(AjType ajType0, String s, int v) {
        this.declaringType = ajType0;
        this.targetTypeName = s;
        this.modifiers = v;
        try {
            this.targetType = (AjType)StringToType.stringToType(s, ajType0.getJavaClass());
        }
        catch(ClassNotFoundException unused_ex) {
        }
    }

    public InterTypeDeclarationImpl(AjType ajType0, AjType ajType1, int v) {
        this.declaringType = ajType0;
        this.targetType = ajType1;
        this.targetTypeName = ajType1.getName();
        this.modifiers = v;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeDeclaration
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeDeclaration
    public int getModifiers() {
        return this.modifiers;
    }

    @Override  // org.mp4parser.aj.lang.reflect.InterTypeDeclaration
    public AjType getTargetType() throws ClassNotFoundException {
        AjType ajType0 = this.targetType;
        if(ajType0 == null) {
            throw new ClassNotFoundException(this.targetTypeName);
        }
        return ajType0;
    }
}

