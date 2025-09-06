package androidx.constraintlayout.core.motion.parse;

import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import java.util.Arrays;

public class KeyParser {
    interface DataType {
        int get(int arg1);
    }

    interface Ids {
        int get(String arg1);
    }

    public static void a(String[] arr_s) {
        KeyParser.c("{frame:22,\ntarget:\'widget1\',\neasing:\'easeIn\',\ncurveFit:\'spline\',\nprogress:0.3,\nalpha:0.2,\nelevation:0.7,\nrotationZ:23,\nrotationX:25.0,\nrotationY:27.0,\npivotX:15,\npivotY:17,\npivotTarget:\'32\',\npathRotate:23,\nscaleX:0.5,\nscaleY:0.7,\ntranslationX:5,\ntranslationY:7,\ntranslationZ:11,\n}");
    }

    private static TypedBundle b(String s, Ids keyParser$Ids0, DataType keyParser$DataType0) {
        int v1;
        TypedBundle typedBundle0 = new TypedBundle();
        try {
            CLObject cLObject0 = CLParser.d(s);
            int v = cLObject0.size();
            for(v1 = 0; true; ++v1) {
                if(v1 >= v) {
                    return typedBundle0;
                }
                CLKey cLKey0 = (CLKey)cLObject0.D(v1);
                String s1 = cLKey0.c();
                CLElement cLElement0 = cLKey0.h0();
                int v2 = keyParser$Ids0.get(s1);
                if(v2 == -1) {
                    System.err.println("unknown type " + s1);
                }
                else {
                    switch(keyParser$DataType0.get(v2)) {
                        case 1: {
                            typedBundle0.d(v2, cLObject0.getBoolean(v1));
                            break;
                        }
                        case 2: {
                            typedBundle0.b(v2, cLElement0.k());
                            System.out.println("parse " + s1 + " INT_MASK > " + cLElement0.k());
                            break;
                        }
                        case 4: {
                            typedBundle0.a(v2, cLElement0.j());
                            System.out.println("parse " + s1 + " FLOAT_MASK > " + cLElement0.j());
                            break;
                        }
                        case 8: {
                            typedBundle0.c(v2, cLElement0.c());
                            System.out.println("parse " + s1 + " STRING_MASK > " + cLElement0.c());
                        }
                    }
                }
            }
        }
        catch(CLParsingException cLParsingException0) {
        }
        System.err.println(cLParsingException0.toString() + "\n" + Arrays.toString(cLParsingException0.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        return typedBundle0;
    }

    public static TypedBundle c(String s) {
        return KeyParser.b(s, new a(), new b());
    }
}

