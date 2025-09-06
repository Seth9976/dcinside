package org.mp4parser.aj.internal.lang.reflect;

import java.lang.reflect.Type;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.DeclareParents;
import org.mp4parser.aj.lang.reflect.TypePattern;

public class DeclareParentsImpl implements DeclareParents {
    private AjType declaringType;
    private String firstMissingTypeName;
    private boolean isExtends;
    private Type[] parents;
    private boolean parentsError;
    private String parentsString;
    private TypePattern targetTypesPattern;

    public DeclareParentsImpl(String s, String s1, boolean z, AjType ajType0) {
        this.parentsError = false;
        this.targetTypesPattern = new TypePatternImpl(s);
        this.isExtends = z;
        this.declaringType = ajType0;
        this.parentsString = s1;
        try {
            this.parents = StringToType.commaSeparatedListToTypeArray(s1, ajType0.getJavaClass());
        }
        catch(ClassNotFoundException classNotFoundException0) {
            this.parentsError = true;
            this.firstMissingTypeName = classNotFoundException0.getMessage();
        }
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareParents
    public AjType getDeclaringType() {
        return this.declaringType;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareParents
    public Type[] getParentTypes() throws ClassNotFoundException {
        if(this.parentsError) {
            throw new ClassNotFoundException(this.firstMissingTypeName);
        }
        return this.parents;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareParents
    public TypePattern getTargetTypesPattern() {
        return this.targetTypesPattern;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareParents
    public boolean isExtends() {
        return this.isExtends;
    }

    @Override  // org.mp4parser.aj.lang.reflect.DeclareParents
    public boolean isImplements() {
        return !this.isExtends;
    }

    // 去混淆评级： 低(20)
    @Override
    public String toString() {
        return "declare parents : " + this.getTargetTypesPattern().asString() + (this.isExtends() ? " extends " : " implements ") + this.parentsString;
    }
}

