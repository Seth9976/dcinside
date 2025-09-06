package org.mp4parser.support;

import org.mp4parser.aj.lang.JoinPoint;
import org.mp4parser.aj.lang.NoAspectBoundException;
import org.mp4parser.aj.lang.annotation.Aspect;
import org.mp4parser.aj.lang.annotation.Before;

@Aspect
public class RequiresParseDetailAspect {
    private static Throwable ajc$initFailureCause;
    public static RequiresParseDetailAspect ajc$perSingletonInstance;

    static {
        try {
            RequiresParseDetailAspect.ajc$postClinit();
        }
        catch(Throwable throwable0) {
            RequiresParseDetailAspect.ajc$initFailureCause = throwable0;
        }
    }

    private static void ajc$postClinit() {
        RequiresParseDetailAspect.ajc$perSingletonInstance = new RequiresParseDetailAspect();
    }

    public static RequiresParseDetailAspect aspectOf() {
        RequiresParseDetailAspect requiresParseDetailAspect0 = RequiresParseDetailAspect.ajc$perSingletonInstance;
        if(requiresParseDetailAspect0 == null) {
            throw new NoAspectBoundException("org.mp4parser.support.RequiresParseDetailAspect", RequiresParseDetailAspect.ajc$initFailureCause);
        }
        return requiresParseDetailAspect0;
    }

    @Before("this(org.mp4parser.support.AbstractBox) && ((execution(public * * (..)) && !( execution(* parseDetails()) || execution(* getNumOfBytesToFirstChild()) || execution(* getType()) || execution(* isParsed()) || execution(* getHeader(*)) || execution(* parse()) || execution(* getBox(*)) || execution(* getSize()) || execution(* getOffset()) || execution(* setOffset(*)) || execution(* parseDetails()) || execution(* _parseDetails(*)) || execution(* parse(*,*,*,*)) || execution(* getIsoFile()) || execution(* getParent()) || execution(* setParent(*)) || execution(* getUserType()) || execution(* setUserType(*))) && !@annotation(org.mp4parser.support.DoNotParseDetail)) || @annotation(org.mp4parser.support.ParseDetail))")
    public void before(JoinPoint joinPoint0) {
        if(!(joinPoint0.getTarget() instanceof AbstractBox)) {
            throw new RuntimeException("Only methods in subclasses of org.mp4parser.support.AbstractBox can  be annotated with ParseDetail");
        }
        if(!((AbstractBox)joinPoint0.getTarget()).isParsed()) {
            ((AbstractBox)joinPoint0.getTarget()).parseDetails();
        }
    }

    public static boolean hasAspect() {
        return RequiresParseDetailAspect.ajc$perSingletonInstance != null;
    }
}

