package org.mp4parser.aj.internal.lang.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import org.mp4parser.aj.internal.lang.annotation.ajcDeclareAnnotation;
import org.mp4parser.aj.internal.lang.annotation.ajcDeclareEoW;
import org.mp4parser.aj.internal.lang.annotation.ajcDeclareParents;
import org.mp4parser.aj.internal.lang.annotation.ajcDeclarePrecedence;
import org.mp4parser.aj.internal.lang.annotation.ajcDeclareSoft;
import org.mp4parser.aj.internal.lang.annotation.ajcITD;
import org.mp4parser.aj.internal.lang.annotation.ajcPrivileged;
import org.mp4parser.aj.lang.annotation.After;
import org.mp4parser.aj.lang.annotation.AfterReturning;
import org.mp4parser.aj.lang.annotation.AfterThrowing;
import org.mp4parser.aj.lang.annotation.Around;
import org.mp4parser.aj.lang.annotation.Aspect;
import org.mp4parser.aj.lang.annotation.Before;
import org.mp4parser.aj.lang.annotation.DeclareError;
import org.mp4parser.aj.lang.annotation.DeclareParents;
import org.mp4parser.aj.lang.annotation.DeclareWarning;
import org.mp4parser.aj.lang.reflect.Advice;
import org.mp4parser.aj.lang.reflect.AdviceKind;
import org.mp4parser.aj.lang.reflect.AjType;
import org.mp4parser.aj.lang.reflect.AjTypeSystem;
import org.mp4parser.aj.lang.reflect.DeclareAnnotation;
import org.mp4parser.aj.lang.reflect.DeclareErrorOrWarning;
import org.mp4parser.aj.lang.reflect.DeclarePrecedence;
import org.mp4parser.aj.lang.reflect.DeclareSoft;
import org.mp4parser.aj.lang.reflect.InterTypeConstructorDeclaration;
import org.mp4parser.aj.lang.reflect.InterTypeFieldDeclaration;
import org.mp4parser.aj.lang.reflect.InterTypeMethodDeclaration;
import org.mp4parser.aj.lang.reflect.NoSuchAdviceException;
import org.mp4parser.aj.lang.reflect.NoSuchPointcutException;
import org.mp4parser.aj.lang.reflect.PerClause;
import org.mp4parser.aj.lang.reflect.PerClauseKind;
import org.mp4parser.aj.lang.reflect.Pointcut;

public class AjTypeImpl implements AjType {
    private Advice[] advice;
    private static final String ajcMagic = "ajc$";
    private Class clazz;
    private Advice[] declaredAdvice;
    private InterTypeConstructorDeclaration[] declaredITDCons;
    private InterTypeFieldDeclaration[] declaredITDFields;
    private InterTypeMethodDeclaration[] declaredITDMethods;
    private Pointcut[] declaredPointcuts;
    private InterTypeConstructorDeclaration[] itdCons;
    private InterTypeFieldDeclaration[] itdFields;
    private InterTypeMethodDeclaration[] itdMethods;
    private Pointcut[] pointcuts;

    public AjTypeImpl(Class class0) {
        this.declaredPointcuts = null;
        this.pointcuts = null;
        this.declaredAdvice = null;
        this.advice = null;
        this.declaredITDMethods = null;
        this.itdMethods = null;
        this.declaredITDFields = null;
        this.itdFields = null;
        this.itdCons = null;
        this.declaredITDCons = null;
        this.clazz = class0;
    }

    private void addAnnotationStyleDeclareParents(List list0) {
        Field[] arr_field = this.clazz.getDeclaredFields();
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            Class class0 = DeclareParents.class;
            if(field0.isAnnotationPresent(class0) && field0.getType().isInterface()) {
                DeclareParents declareParents0 = (DeclareParents)field0.getAnnotation(class0);
                String s = field0.getType().getName();
                list0.add(new DeclareParentsImpl(declareParents0.value(), s, false, this));
            }
        }
    }

    private void addAnnotationStyleITDFields(List list0, boolean z) {
    }

    private void addAnnotationStyleITDMethods(List list0, boolean z) {
        if(this.isAspect()) {
            Field[] arr_field = this.clazz.getDeclaredFields();
            for(int v = 0; v < arr_field.length; ++v) {
                Field field0 = arr_field[v];
                if(field0.getType().isInterface() && (field0.isAnnotationPresent(DeclareParents.class) && ((DeclareParents)field0.getAnnotation(DeclareParents.class)).defaultImpl() != DeclareParents.class)) {
                    Method[] arr_method = field0.getType().getDeclaredMethods();
                    for(int v1 = 0; v1 < arr_method.length; ++v1) {
                        Method method0 = arr_method[v1];
                        if(Modifier.isPublic(method0.getModifiers()) || !z) {
                            list0.add(new InterTypeMethodDeclarationImpl(this, AjTypeSystem.getAjType(field0.getType()), method0, 1));
                        }
                    }
                }
            }
        }
    }

    private Advice asAdvice(Method method0) {
        if(method0.getAnnotations().length == 0) {
            return null;
        }
        Before before0 = (Before)method0.getAnnotation(Before.class);
        if(before0 != null) {
            return new AdviceImpl(method0, before0.value(), AdviceKind.BEFORE);
        }
        After after0 = (After)method0.getAnnotation(After.class);
        if(after0 != null) {
            return new AdviceImpl(method0, after0.value(), AdviceKind.AFTER);
        }
        AfterReturning afterReturning0 = (AfterReturning)method0.getAnnotation(AfterReturning.class);
        if(afterReturning0 != null) {
            String s = afterReturning0.pointcut();
            if(s.equals("")) {
                s = afterReturning0.value();
            }
            String s1 = afterReturning0.returning();
            return new AdviceImpl(method0, s, AdviceKind.AFTER_RETURNING, s1);
        }
        AfterThrowing afterThrowing0 = (AfterThrowing)method0.getAnnotation(AfterThrowing.class);
        if(afterThrowing0 != null) {
            String s2 = afterThrowing0.pointcut();
            if(s2 == null) {
                s2 = afterThrowing0.value();
            }
            String s3 = afterThrowing0.throwing();
            return new AdviceImpl(method0, s2, AdviceKind.AFTER_THROWING, s3);
        }
        Around around0 = (Around)method0.getAnnotation(Around.class);
        return around0 != null ? new AdviceImpl(method0, around0.value(), AdviceKind.AROUND) : null;
    }

    private Pointcut asPointcut(Method method0) {
        org.mp4parser.aj.lang.annotation.Pointcut pointcut0 = (org.mp4parser.aj.lang.annotation.Pointcut)method0.getAnnotation(org.mp4parser.aj.lang.annotation.Pointcut.class);
        if(pointcut0 != null) {
            String s = method0.getName();
            if(s.startsWith("ajc$")) {
                s = s.substring(s.indexOf("$$") + 2, s.length());
                int v = s.indexOf("$");
                if(v != -1) {
                    s = s.substring(0, v);
                }
            }
            return new PointcutImpl(s, pointcut0.value(), method0, AjTypeSystem.getAjType(method0.getDeclaringClass()), pointcut0.argNames());
        }
        return null;
    }

    @Override
    public boolean equals(Object object0) {
        return object0 instanceof AjTypeImpl ? ((AjTypeImpl)object0).clazz.equals(this.clazz) : false;
    }

    private Advice[] getAdvice(Set set0) {
        if(this.advice == null) {
            this.initAdvice();
        }
        ArrayList arrayList0 = new ArrayList();
        Advice[] arr_advice = this.advice;
        for(int v = 0; v < arr_advice.length; ++v) {
            Advice advice0 = arr_advice[v];
            if(set0.contains(advice0.getKind())) {
                arrayList0.add(advice0);
            }
        }
        Advice[] arr_advice1 = new Advice[arrayList0.size()];
        arrayList0.toArray(arr_advice1);
        return arr_advice1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Advice getAdvice(String s) throws NoSuchAdviceException {
        if(s.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if(this.advice == null) {
            this.initAdvice();
        }
        Advice[] arr_advice = this.advice;
        for(int v = 0; v < arr_advice.length; ++v) {
            Advice advice0 = arr_advice[v];
            if(advice0.getName().equals(s)) {
                return advice0;
            }
        }
        throw new NoSuchAdviceException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Advice[] getAdvice(AdviceKind[] arr_adviceKind) {
        Class class0 = AdviceKind.class;
        if(arr_adviceKind.length == 0) {
            return this.getAdvice(EnumSet.allOf(class0));
        }
        EnumSet enumSet0 = EnumSet.noneOf(class0);
        enumSet0.addAll(Arrays.asList(arr_adviceKind));
        return this.getAdvice(enumSet0);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public AjType[] getAjTypes() {
        return this.toAjTypeArray(this.clazz.getClasses());
    }

    @Override
    public Annotation getAnnotation(Class class0) {
        return this.clazz.getAnnotation(class0);
    }

    @Override
    public Annotation[] getAnnotations() {
        return this.clazz.getAnnotations();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Constructor getConstructor(AjType[] arr_ajType) throws NoSuchMethodException {
        return this.clazz.getConstructor(this.toClassArray(arr_ajType));
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Constructor[] getConstructors() {
        return this.clazz.getConstructors();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public DeclareAnnotation[] getDeclareAnnotations() {
        Annotation annotation0;
        ArrayList arrayList0 = new ArrayList();
        Method[] arr_method = this.clazz.getDeclaredMethods();
        int v = 0;
        while(v < arr_method.length) {
            Method method0 = arr_method[v];
            Class class0 = ajcDeclareAnnotation.class;
            if(method0.isAnnotationPresent(class0)) {
                ajcDeclareAnnotation ajcDeclareAnnotation0 = (ajcDeclareAnnotation)method0.getAnnotation(class0);
                Annotation[] arr_annotation = method0.getAnnotations();
                int v1 = 0;
                while(true) {
                    annotation0 = null;
                    if(v1 < arr_annotation.length) {
                        Annotation annotation1 = arr_annotation[v1];
                        if(annotation1.annotationType() == class0) {
                            ++v1;
                            continue;
                        }
                        else {
                            annotation0 = annotation1;
                        }
                    }
                    break;
                }
                arrayList0.add(new DeclareAnnotationImpl(this, ajcDeclareAnnotation0.kind(), ajcDeclareAnnotation0.pattern(), annotation0, ajcDeclareAnnotation0.annotation()));
            }
            ++v;
        }
        if(this.getSupertype().isAspect()) {
            arrayList0.addAll(Arrays.asList(this.getSupertype().getDeclareAnnotations()));
        }
        DeclareAnnotation[] arr_declareAnnotation = new DeclareAnnotation[arrayList0.size()];
        arrayList0.toArray(arr_declareAnnotation);
        return arr_declareAnnotation;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public DeclareErrorOrWarning[] getDeclareErrorOrWarnings() {
        Class class0 = DeclareError.class;
        Class class1 = DeclareWarning.class;
        ArrayList arrayList0 = new ArrayList();
        Field[] arr_field = this.clazz.getDeclaredFields();
        for(int v1 = 0; v1 < arr_field.length; ++v1) {
            Field field0 = arr_field[v1];
            try {
                if(field0.isAnnotationPresent(class1)) {
                    DeclareWarning declareWarning0 = (DeclareWarning)field0.getAnnotation(class1);
                    if(Modifier.isPublic(field0.getModifiers()) && Modifier.isStatic(field0.getModifiers())) {
                        String s = (String)field0.get(null);
                        arrayList0.add(new DeclareErrorOrWarningImpl(declareWarning0.value(), s, false, this));
                    }
                }
                else if(field0.isAnnotationPresent(class0)) {
                    DeclareError declareError0 = (DeclareError)field0.getAnnotation(class0);
                    if(Modifier.isPublic(field0.getModifiers()) && Modifier.isStatic(field0.getModifiers())) {
                        String s1 = (String)field0.get(null);
                        arrayList0.add(new DeclareErrorOrWarningImpl(declareError0.value(), s1, true, this));
                    }
                }
            }
            catch(IllegalArgumentException | IllegalAccessException unused_ex) {
            }
        }
        Method[] arr_method = this.clazz.getDeclaredMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Class class2 = ajcDeclareEoW.class;
            if(method0.isAnnotationPresent(class2)) {
                ajcDeclareEoW ajcDeclareEoW0 = (ajcDeclareEoW)method0.getAnnotation(class2);
                arrayList0.add(new DeclareErrorOrWarningImpl(ajcDeclareEoW0.pointcut(), ajcDeclareEoW0.message(), ajcDeclareEoW0.isError(), this));
            }
        }
        DeclareErrorOrWarning[] arr_declareErrorOrWarning = new DeclareErrorOrWarning[arrayList0.size()];
        arrayList0.toArray(arr_declareErrorOrWarning);
        return arr_declareErrorOrWarning;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public org.mp4parser.aj.lang.reflect.DeclareParents[] getDeclareParents() {
        ArrayList arrayList0 = new ArrayList();
        Method[] arr_method = this.clazz.getDeclaredMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Class class0 = ajcDeclareParents.class;
            if(method0.isAnnotationPresent(class0)) {
                ajcDeclareParents ajcDeclareParents0 = (ajcDeclareParents)method0.getAnnotation(class0);
                arrayList0.add(new DeclareParentsImpl(ajcDeclareParents0.targetTypePattern(), ajcDeclareParents0.parentTypes(), ajcDeclareParents0.isExtends(), this));
            }
        }
        this.addAnnotationStyleDeclareParents(arrayList0);
        if(this.getSupertype().isAspect()) {
            arrayList0.addAll(Arrays.asList(this.getSupertype().getDeclareParents()));
        }
        org.mp4parser.aj.lang.reflect.DeclareParents[] arr_declareParents = new org.mp4parser.aj.lang.reflect.DeclareParents[arrayList0.size()];
        arrayList0.toArray(arr_declareParents);
        return arr_declareParents;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public DeclarePrecedence[] getDeclarePrecedence() {
        ArrayList arrayList0 = new ArrayList();
        Class class0 = org.mp4parser.aj.lang.annotation.DeclarePrecedence.class;
        if(this.clazz.isAnnotationPresent(class0)) {
            arrayList0.add(new DeclarePrecedenceImpl(((org.mp4parser.aj.lang.annotation.DeclarePrecedence)this.clazz.getAnnotation(class0)).value(), this));
        }
        Method[] arr_method = this.clazz.getDeclaredMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Class class1 = ajcDeclarePrecedence.class;
            if(method0.isAnnotationPresent(class1)) {
                arrayList0.add(new DeclarePrecedenceImpl(((ajcDeclarePrecedence)method0.getAnnotation(class1)).value(), this));
            }
        }
        if(this.getSupertype().isAspect()) {
            arrayList0.addAll(Arrays.asList(this.getSupertype().getDeclarePrecedence()));
        }
        DeclarePrecedence[] arr_declarePrecedence = new DeclarePrecedence[arrayList0.size()];
        arrayList0.toArray(arr_declarePrecedence);
        return arr_declarePrecedence;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public DeclareSoft[] getDeclareSofts() {
        ArrayList arrayList0 = new ArrayList();
        Method[] arr_method = this.clazz.getDeclaredMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            Class class0 = ajcDeclareSoft.class;
            if(method0.isAnnotationPresent(class0)) {
                ajcDeclareSoft ajcDeclareSoft0 = (ajcDeclareSoft)method0.getAnnotation(class0);
                arrayList0.add(new DeclareSoftImpl(this, ajcDeclareSoft0.pointcut(), ajcDeclareSoft0.exceptionType()));
            }
        }
        if(this.getSupertype().isAspect()) {
            arrayList0.addAll(Arrays.asList(this.getSupertype().getDeclareSofts()));
        }
        DeclareSoft[] arr_declareSoft = new DeclareSoft[arrayList0.size()];
        arrayList0.toArray(arr_declareSoft);
        return arr_declareSoft;
    }

    private Advice[] getDeclaredAdvice(Set set0) {
        if(this.declaredAdvice == null) {
            this.initDeclaredAdvice();
        }
        ArrayList arrayList0 = new ArrayList();
        Advice[] arr_advice = this.declaredAdvice;
        for(int v = 0; v < arr_advice.length; ++v) {
            Advice advice0 = arr_advice[v];
            if(set0.contains(advice0.getKind())) {
                arrayList0.add(advice0);
            }
        }
        Advice[] arr_advice1 = new Advice[arrayList0.size()];
        arrayList0.toArray(arr_advice1);
        return arr_advice1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Advice getDeclaredAdvice(String s) throws NoSuchAdviceException {
        if(s.equals("")) {
            throw new IllegalArgumentException("use getAdvice(AdviceType...) instead for un-named advice");
        }
        if(this.declaredAdvice == null) {
            this.initDeclaredAdvice();
        }
        Advice[] arr_advice = this.declaredAdvice;
        for(int v = 0; v < arr_advice.length; ++v) {
            Advice advice0 = arr_advice[v];
            if(advice0.getName().equals(s)) {
                return advice0;
            }
        }
        throw new NoSuchAdviceException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Advice[] getDeclaredAdvice(AdviceKind[] arr_adviceKind) {
        Class class0 = AdviceKind.class;
        if(arr_adviceKind.length == 0) {
            return this.getDeclaredAdvice(EnumSet.allOf(class0));
        }
        EnumSet enumSet0 = EnumSet.noneOf(class0);
        enumSet0.addAll(Arrays.asList(arr_adviceKind));
        return this.getDeclaredAdvice(enumSet0);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public AjType[] getDeclaredAjTypes() {
        return this.toAjTypeArray(this.clazz.getDeclaredClasses());
    }

    @Override
    public Annotation[] getDeclaredAnnotations() {
        return this.clazz.getDeclaredAnnotations();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Constructor getDeclaredConstructor(AjType[] arr_ajType) throws NoSuchMethodException {
        return this.clazz.getDeclaredConstructor(this.toClassArray(arr_ajType));
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Constructor[] getDeclaredConstructors() {
        return this.clazz.getDeclaredConstructors();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Field getDeclaredField(String s) throws NoSuchFieldException {
        Field field0 = this.clazz.getDeclaredField(s);
        if(field0.getName().startsWith("ajc$")) {
            throw new NoSuchFieldException(s);
        }
        return field0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Field[] getDeclaredFields() {
        Field[] arr_field = this.clazz.getDeclaredFields();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            if(!field0.getName().startsWith("ajc$") && !field0.isAnnotationPresent(DeclareWarning.class) && !field0.isAnnotationPresent(DeclareError.class)) {
                arrayList0.add(field0);
            }
        }
        Field[] arr_field1 = new Field[arrayList0.size()];
        arrayList0.toArray(arr_field1);
        return arr_field1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeConstructorDeclaration getDeclaredITDConstructor(AjType ajType0, AjType[] arr_ajType) throws NoSuchMethodException {
        InterTypeConstructorDeclaration[] arr_interTypeConstructorDeclaration = this.getDeclaredITDConstructors();
    alab1:
        for(int v = 0; v < arr_interTypeConstructorDeclaration.length; ++v) {
            InterTypeConstructorDeclaration interTypeConstructorDeclaration0 = arr_interTypeConstructorDeclaration[v];
            try {
                if(interTypeConstructorDeclaration0.getTargetType().equals(ajType0)) {
                    AjType[] arr_ajType1 = interTypeConstructorDeclaration0.getParameterTypes();
                    if(arr_ajType1.length == arr_ajType.length) {
                        int v1 = 0;
                        while(v1 < arr_ajType1.length) {
                            if(!arr_ajType1[v1].equals(arr_ajType[v1])) {
                                continue alab1;
                            }
                            ++v1;
                        }
                        return interTypeConstructorDeclaration0;
                    }
                }
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeConstructorDeclaration[] getDeclaredITDConstructors() {
        if(this.declaredITDCons == null) {
            ArrayList arrayList0 = new ArrayList();
            Method[] arr_method = this.clazz.getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(method0.getName().contains("ajc$postInterConstructor")) {
                    Class class0 = ajcITD.class;
                    if(method0.isAnnotationPresent(class0)) {
                        ajcITD ajcITD0 = (ajcITD)method0.getAnnotation(class0);
                        arrayList0.add(new InterTypeConstructorDeclarationImpl(this, ajcITD0.targetType(), ajcITD0.modifiers(), method0));
                    }
                }
            }
            InterTypeConstructorDeclaration[] arr_interTypeConstructorDeclaration = new InterTypeConstructorDeclaration[arrayList0.size()];
            this.declaredITDCons = arr_interTypeConstructorDeclaration;
            arrayList0.toArray(arr_interTypeConstructorDeclaration);
        }
        return this.declaredITDCons;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeFieldDeclaration getDeclaredITDField(String s, AjType ajType0) throws NoSuchFieldException {
        InterTypeFieldDeclaration[] arr_interTypeFieldDeclaration = this.getDeclaredITDFields();
        for(int v = 0; v < arr_interTypeFieldDeclaration.length; ++v) {
            InterTypeFieldDeclaration interTypeFieldDeclaration0 = arr_interTypeFieldDeclaration[v];
            if(interTypeFieldDeclaration0.getName().equals(s)) {
                try {
                    if(interTypeFieldDeclaration0.getTargetType().equals(ajType0)) {
                        return interTypeFieldDeclaration0;
                    }
                }
                catch(ClassNotFoundException unused_ex) {
                }
            }
        }
        throw new NoSuchFieldException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeFieldDeclaration[] getDeclaredITDFields() {
        ArrayList arrayList0 = new ArrayList();
        if(this.declaredITDFields == null) {
            Method[] arr_method = this.clazz.getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                Class class0 = ajcITD.class;
                if(method0.isAnnotationPresent(class0) && method0.getName().contains("ajc$interFieldInit")) {
                    ajcITD ajcITD0 = (ajcITD)method0.getAnnotation(class0);
                    String s = method0.getName().replace("FieldInit", "FieldGetDispatch");
                    try {
                        Method method1 = this.clazz.getDeclaredMethod(s, method0.getParameterTypes());
                        arrayList0.add(new InterTypeFieldDeclarationImpl(this, ajcITD0.targetType(), ajcITD0.modifiers(), ajcITD0.name(), AjTypeSystem.getAjType(method1.getReturnType()), method1.getGenericReturnType()));
                    }
                    catch(NoSuchMethodException unused_ex) {
                        throw new IllegalStateException("Can\'t find field get dispatch method for " + method0.getName());
                    }
                }
            }
            InterTypeFieldDeclaration[] arr_interTypeFieldDeclaration = new InterTypeFieldDeclaration[arrayList0.size()];
            this.declaredITDFields = arr_interTypeFieldDeclaration;
            arrayList0.toArray(arr_interTypeFieldDeclaration);
        }
        return this.declaredITDFields;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeMethodDeclaration getDeclaredITDMethod(String s, AjType ajType0, AjType[] arr_ajType) throws NoSuchMethodException {
        InterTypeMethodDeclaration[] arr_interTypeMethodDeclaration = this.getDeclaredITDMethods();
    alab1:
        for(int v = 0; v < arr_interTypeMethodDeclaration.length; ++v) {
            InterTypeMethodDeclaration interTypeMethodDeclaration0 = arr_interTypeMethodDeclaration[v];
            try {
                if(interTypeMethodDeclaration0.getName().equals(s) && interTypeMethodDeclaration0.getTargetType().equals(ajType0)) {
                    AjType[] arr_ajType1 = interTypeMethodDeclaration0.getParameterTypes();
                    if(arr_ajType1.length == arr_ajType.length) {
                        int v1 = 0;
                        while(v1 < arr_ajType1.length) {
                            if(!arr_ajType1[v1].equals(arr_ajType[v1])) {
                                continue alab1;
                            }
                            ++v1;
                        }
                        return interTypeMethodDeclaration0;
                    }
                }
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        throw new NoSuchMethodException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeMethodDeclaration[] getDeclaredITDMethods() {
        if(this.declaredITDMethods == null) {
            ArrayList arrayList0 = new ArrayList();
            Method[] arr_method = this.clazz.getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(method0.getName().contains("ajc$interMethodDispatch1$")) {
                    Class class0 = ajcITD.class;
                    if(method0.isAnnotationPresent(class0)) {
                        ajcITD ajcITD0 = (ajcITD)method0.getAnnotation(class0);
                        arrayList0.add(new InterTypeMethodDeclarationImpl(this, ajcITD0.targetType(), ajcITD0.modifiers(), ajcITD0.name(), method0));
                    }
                }
            }
            this.addAnnotationStyleITDMethods(arrayList0, false);
            InterTypeMethodDeclaration[] arr_interTypeMethodDeclaration = new InterTypeMethodDeclaration[arrayList0.size()];
            this.declaredITDMethods = arr_interTypeMethodDeclaration;
            arrayList0.toArray(arr_interTypeMethodDeclaration);
        }
        return this.declaredITDMethods;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Method getDeclaredMethod(String s, AjType[] arr_ajType) throws NoSuchMethodException {
        Method method0 = this.clazz.getDeclaredMethod(s, this.toClassArray(arr_ajType));
        if(!this.isReallyAMethod(method0)) {
            throw new NoSuchMethodException(s);
        }
        return method0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Method[] getDeclaredMethods() {
        Method[] arr_method = this.clazz.getDeclaredMethods();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            if(this.isReallyAMethod(method0)) {
                arrayList0.add(method0);
            }
        }
        Method[] arr_method1 = new Method[arrayList0.size()];
        arrayList0.toArray(arr_method1);
        return arr_method1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Pointcut getDeclaredPointcut(String s) throws NoSuchPointcutException {
        Pointcut[] arr_pointcut = this.getDeclaredPointcuts();
        for(int v = 0; v < arr_pointcut.length; ++v) {
            Pointcut pointcut0 = arr_pointcut[v];
            if(pointcut0.getName().equals(s)) {
                return pointcut0;
            }
        }
        throw new NoSuchPointcutException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Pointcut[] getDeclaredPointcuts() {
        Pointcut[] arr_pointcut = this.declaredPointcuts;
        if(arr_pointcut != null) {
            return arr_pointcut;
        }
        ArrayList arrayList0 = new ArrayList();
        Method[] arr_method = this.clazz.getDeclaredMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Pointcut pointcut0 = this.asPointcut(arr_method[v]);
            if(pointcut0 != null) {
                arrayList0.add(pointcut0);
            }
        }
        Pointcut[] arr_pointcut1 = new Pointcut[arrayList0.size()];
        arrayList0.toArray(arr_pointcut1);
        this.declaredPointcuts = arr_pointcut1;
        return arr_pointcut1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public AjType getDeclaringType() {
        Class class0 = this.clazz.getDeclaringClass();
        return class0 != null ? new AjTypeImpl(class0) : null;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Constructor getEnclosingConstructor() {
        return this.clazz.getEnclosingConstructor();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Method getEnclosingMethod() {
        return this.clazz.getEnclosingMethod();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public AjType getEnclosingType() {
        Class class0 = this.clazz.getEnclosingClass();
        return class0 != null ? new AjTypeImpl(class0) : null;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Object[] getEnumConstants() {
        return this.clazz.getEnumConstants();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Field getField(String s) throws NoSuchFieldException {
        Field field0 = this.clazz.getField(s);
        if(field0.getName().startsWith("ajc$")) {
            throw new NoSuchFieldException(s);
        }
        return field0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Field[] getFields() {
        Field[] arr_field = this.clazz.getFields();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_field.length; ++v) {
            Field field0 = arr_field[v];
            if(!field0.getName().startsWith("ajc$") && !field0.isAnnotationPresent(DeclareWarning.class) && !field0.isAnnotationPresent(DeclareError.class)) {
                arrayList0.add(field0);
            }
        }
        Field[] arr_field1 = new Field[arrayList0.size()];
        arrayList0.toArray(arr_field1);
        return arr_field1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Type getGenericSupertype() {
        return this.clazz.getGenericSuperclass();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeConstructorDeclaration getITDConstructor(AjType ajType0, AjType[] arr_ajType) throws NoSuchMethodException {
        InterTypeConstructorDeclaration[] arr_interTypeConstructorDeclaration = this.getITDConstructors();
    alab1:
        for(int v = 0; v < arr_interTypeConstructorDeclaration.length; ++v) {
            InterTypeConstructorDeclaration interTypeConstructorDeclaration0 = arr_interTypeConstructorDeclaration[v];
            try {
                if(interTypeConstructorDeclaration0.getTargetType().equals(ajType0)) {
                    AjType[] arr_ajType1 = interTypeConstructorDeclaration0.getParameterTypes();
                    if(arr_ajType1.length == arr_ajType.length) {
                        int v1 = 0;
                        while(v1 < arr_ajType1.length) {
                            if(!arr_ajType1[v1].equals(arr_ajType[v1])) {
                                continue alab1;
                            }
                            ++v1;
                        }
                        return interTypeConstructorDeclaration0;
                    }
                }
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeConstructorDeclaration[] getITDConstructors() {
        if(this.itdCons == null) {
            ArrayList arrayList0 = new ArrayList();
            Method[] arr_method = this.clazz.getMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(method0.getName().contains("ajc$postInterConstructor")) {
                    Class class0 = ajcITD.class;
                    if(method0.isAnnotationPresent(class0)) {
                        ajcITD ajcITD0 = (ajcITD)method0.getAnnotation(class0);
                        if(Modifier.isPublic(ajcITD0.modifiers())) {
                            arrayList0.add(new InterTypeConstructorDeclarationImpl(this, ajcITD0.targetType(), ajcITD0.modifiers(), method0));
                        }
                    }
                }
            }
            InterTypeConstructorDeclaration[] arr_interTypeConstructorDeclaration = new InterTypeConstructorDeclaration[arrayList0.size()];
            this.itdCons = arr_interTypeConstructorDeclaration;
            arrayList0.toArray(arr_interTypeConstructorDeclaration);
        }
        return this.itdCons;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeFieldDeclaration getITDField(String s, AjType ajType0) throws NoSuchFieldException {
        InterTypeFieldDeclaration[] arr_interTypeFieldDeclaration = this.getITDFields();
        for(int v = 0; v < arr_interTypeFieldDeclaration.length; ++v) {
            InterTypeFieldDeclaration interTypeFieldDeclaration0 = arr_interTypeFieldDeclaration[v];
            if(interTypeFieldDeclaration0.getName().equals(s)) {
                try {
                    if(interTypeFieldDeclaration0.getTargetType().equals(ajType0)) {
                        return interTypeFieldDeclaration0;
                    }
                }
                catch(ClassNotFoundException unused_ex) {
                }
            }
        }
        throw new NoSuchFieldException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeFieldDeclaration[] getITDFields() {
        ArrayList arrayList0 = new ArrayList();
        if(this.itdFields == null) {
            Method[] arr_method = this.clazz.getMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                Class class0 = ajcITD.class;
                if(method0.isAnnotationPresent(class0)) {
                    ajcITD ajcITD0 = (ajcITD)method0.getAnnotation(class0);
                    if(method0.getName().contains("ajc$interFieldInit") && Modifier.isPublic(ajcITD0.modifiers())) {
                        String s = method0.getName().replace("FieldInit", "FieldGetDispatch");
                        try {
                            Method method1 = method0.getDeclaringClass().getDeclaredMethod(s, method0.getParameterTypes());
                            arrayList0.add(new InterTypeFieldDeclarationImpl(this, ajcITD0.targetType(), ajcITD0.modifiers(), ajcITD0.name(), AjTypeSystem.getAjType(method1.getReturnType()), method1.getGenericReturnType()));
                        }
                        catch(NoSuchMethodException unused_ex) {
                            throw new IllegalStateException("Can\'t find field get dispatch method for " + method0.getName());
                        }
                    }
                }
            }
            InterTypeFieldDeclaration[] arr_interTypeFieldDeclaration = new InterTypeFieldDeclaration[arrayList0.size()];
            this.itdFields = arr_interTypeFieldDeclaration;
            arrayList0.toArray(arr_interTypeFieldDeclaration);
        }
        return this.itdFields;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeMethodDeclaration getITDMethod(String s, AjType ajType0, AjType[] arr_ajType) throws NoSuchMethodException {
        InterTypeMethodDeclaration[] arr_interTypeMethodDeclaration = this.getITDMethods();
    alab1:
        for(int v = 0; v < arr_interTypeMethodDeclaration.length; ++v) {
            InterTypeMethodDeclaration interTypeMethodDeclaration0 = arr_interTypeMethodDeclaration[v];
            try {
                if(interTypeMethodDeclaration0.getName().equals(s) && interTypeMethodDeclaration0.getTargetType().equals(ajType0)) {
                    AjType[] arr_ajType1 = interTypeMethodDeclaration0.getParameterTypes();
                    if(arr_ajType1.length == arr_ajType.length) {
                        int v1 = 0;
                        while(v1 < arr_ajType1.length) {
                            if(!arr_ajType1[v1].equals(arr_ajType[v1])) {
                                continue alab1;
                            }
                            ++v1;
                        }
                        return interTypeMethodDeclaration0;
                    }
                }
            }
            catch(ClassNotFoundException unused_ex) {
            }
        }
        throw new NoSuchMethodException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public InterTypeMethodDeclaration[] getITDMethods() {
        if(this.itdMethods == null) {
            ArrayList arrayList0 = new ArrayList();
            Method[] arr_method = this.clazz.getDeclaredMethods();
            for(int v = 0; v < arr_method.length; ++v) {
                Method method0 = arr_method[v];
                if(method0.getName().contains("ajc$interMethod$")) {
                    Class class0 = ajcITD.class;
                    if(method0.isAnnotationPresent(class0)) {
                        ajcITD ajcITD0 = (ajcITD)method0.getAnnotation(class0);
                        if(Modifier.isPublic(ajcITD0.modifiers())) {
                            arrayList0.add(new InterTypeMethodDeclarationImpl(this, ajcITD0.targetType(), ajcITD0.modifiers(), ajcITD0.name(), method0));
                        }
                    }
                }
            }
            this.addAnnotationStyleITDMethods(arrayList0, true);
            InterTypeMethodDeclaration[] arr_interTypeMethodDeclaration = new InterTypeMethodDeclaration[arrayList0.size()];
            this.itdMethods = arr_interTypeMethodDeclaration;
            arrayList0.toArray(arr_interTypeMethodDeclaration);
        }
        return this.itdMethods;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public AjType[] getInterfaces() {
        return this.toAjTypeArray(this.clazz.getInterfaces());
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Class getJavaClass() {
        return this.clazz;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Method getMethod(String s, AjType[] arr_ajType) throws NoSuchMethodException {
        Method method0 = this.clazz.getMethod(s, this.toClassArray(arr_ajType));
        if(!this.isReallyAMethod(method0)) {
            throw new NoSuchMethodException(s);
        }
        return method0;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Method[] getMethods() {
        Method[] arr_method = this.clazz.getMethods();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_method.length; ++v) {
            Method method0 = arr_method[v];
            if(this.isReallyAMethod(method0)) {
                arrayList0.add(method0);
            }
        }
        Method[] arr_method1 = new Method[arrayList0.size()];
        arrayList0.toArray(arr_method1);
        return arr_method1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public int getModifiers() {
        return this.clazz.getModifiers();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public String getName() {
        return this.clazz.getName();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Package getPackage() {
        return this.clazz.getPackage();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public PerClause getPerClause() {
        if(this.isAspect()) {
            String s = ((Aspect)this.clazz.getAnnotation(Aspect.class)).value();
            if(s.equals("")) {
                return this.getSupertype().isAspect() ? this.getSupertype().getPerClause() : new PerClauseImpl(PerClauseKind.SINGLETON);
            }
            if(s.startsWith("perthis(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTHIS, s.substring(8, s.length() - 1));
            }
            if(s.startsWith("pertarget(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERTARGET, s.substring(10, s.length() - 1));
            }
            if(s.startsWith("percflow(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOW, s.substring(9, s.length() - 1));
            }
            if(s.startsWith("percflowbelow(")) {
                return new PointcutBasedPerClauseImpl(PerClauseKind.PERCFLOWBELOW, s.substring(14, s.length() - 1));
            }
            if(!s.startsWith("pertypewithin")) {
                throw new IllegalStateException("Per-clause not recognized: " + s);
            }
            return new TypePatternBasedPerClauseImpl(PerClauseKind.PERTYPEWITHIN, s.substring(14, s.length() - 1));
        }
        return null;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Pointcut getPointcut(String s) throws NoSuchPointcutException {
        Pointcut[] arr_pointcut = this.getPointcuts();
        for(int v = 0; v < arr_pointcut.length; ++v) {
            Pointcut pointcut0 = arr_pointcut[v];
            if(pointcut0.getName().equals(s)) {
                return pointcut0;
            }
        }
        throw new NoSuchPointcutException(s);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public Pointcut[] getPointcuts() {
        Pointcut[] arr_pointcut = this.pointcuts;
        if(arr_pointcut != null) {
            return arr_pointcut;
        }
        ArrayList arrayList0 = new ArrayList();
        Method[] arr_method = this.clazz.getMethods();
        for(int v = 0; v < arr_method.length; ++v) {
            Pointcut pointcut0 = this.asPointcut(arr_method[v]);
            if(pointcut0 != null) {
                arrayList0.add(pointcut0);
            }
        }
        Pointcut[] arr_pointcut1 = new Pointcut[arrayList0.size()];
        arrayList0.toArray(arr_pointcut1);
        this.pointcuts = arr_pointcut1;
        return arr_pointcut1;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public AjType getSupertype() {
        Class class0 = this.clazz.getSuperclass();
        return class0 == null ? null : new AjTypeImpl(class0);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public TypeVariable[] getTypeParameters() {
        return this.clazz.getTypeParameters();
    }

    @Override
    public int hashCode() {
        return this.clazz.hashCode();
    }

    private void initAdvice() {
        Method[] arr_method = this.clazz.getMethods();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_method.length; ++v) {
            Advice advice0 = this.asAdvice(arr_method[v]);
            if(advice0 != null) {
                arrayList0.add(advice0);
            }
        }
        Advice[] arr_advice = new Advice[arrayList0.size()];
        this.advice = arr_advice;
        arrayList0.toArray(arr_advice);
    }

    private void initDeclaredAdvice() {
        Method[] arr_method = this.clazz.getDeclaredMethods();
        ArrayList arrayList0 = new ArrayList();
        for(int v = 0; v < arr_method.length; ++v) {
            Advice advice0 = this.asAdvice(arr_method[v]);
            if(advice0 != null) {
                arrayList0.add(advice0);
            }
        }
        Advice[] arr_advice = new Advice[arrayList0.size()];
        this.declaredAdvice = arr_advice;
        arrayList0.toArray(arr_advice);
    }

    @Override
    public boolean isAnnotationPresent(Class class0) {
        return this.clazz.isAnnotationPresent(class0);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isArray() {
        return this.clazz.isArray();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isAspect() {
        return this.clazz.getAnnotation(Aspect.class) != null;
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isEnum() {
        return this.clazz.isEnum();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isInstance(Object object0) {
        return this.clazz.isInstance(object0);
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isInterface() {
        return this.clazz.isInterface();
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isLocalClass() {
        return this.clazz.isLocalClass() && !this.isAspect();
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isMemberAspect() {
        return this.clazz.isMemberClass() && this.isAspect();
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isMemberClass() {
        return this.clazz.isMemberClass() && !this.isAspect();
    }

    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isPrimitive() {
        return this.clazz.isPrimitive();
    }

    // 去混淆评级： 低(20)
    @Override  // org.mp4parser.aj.lang.reflect.AjType
    public boolean isPrivileged() {
        return this.isAspect() && this.clazz.isAnnotationPresent(ajcPrivileged.class);
    }

    private boolean isReallyAMethod(Method method0) {
        if(method0.getName().startsWith("ajc$")) {
            return false;
        }
        if(method0.getAnnotations().length == 0) {
            return true;
        }
        if(method0.isAnnotationPresent(org.mp4parser.aj.lang.annotation.Pointcut.class)) {
            return false;
        }
        if(method0.isAnnotationPresent(Before.class)) {
            return false;
        }
        if(method0.isAnnotationPresent(After.class)) {
            return false;
        }
        if(method0.isAnnotationPresent(AfterReturning.class)) {
            return false;
        }
        return method0.isAnnotationPresent(AfterThrowing.class) ? false : !method0.isAnnotationPresent(Around.class);
    }

    private AjType[] toAjTypeArray(Class[] arr_class) {
        AjType[] arr_ajType = new AjType[arr_class.length];
        for(int v = 0; v < arr_class.length; ++v) {
            arr_ajType[v] = AjTypeSystem.getAjType(arr_class[v]);
        }
        return arr_ajType;
    }

    private Class[] toClassArray(AjType[] arr_ajType) {
        Class[] arr_class = new Class[arr_ajType.length];
        for(int v = 0; v < arr_ajType.length; ++v) {
            arr_class[v] = arr_ajType[v].getJavaClass();
        }
        return arr_class;
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

