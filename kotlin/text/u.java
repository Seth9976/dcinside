package kotlin.text;

import y4.l;
import z3.f;

final class u {
    @l
    public static final u a;
    @l
    @f
    public static final r b;

    // 去混淆评级： 低(46)
    static {
        u.a = new u();
        u.b = new r("[\\x00-\\x20]*[+-]?(NaN|Infinity|((" + ('(' + "(\\p{Digit}+)" + "(\\.)?(" + "(\\p{Digit}+)" + "?)(" + "[eE][+-]?(\\p{Digit}+)" + ")?)|(\\.(" + "(\\p{Digit}+)" + ")(" + "[eE][+-]?(\\p{Digit}+)" + ")?)|((" + ("(0[xX](\\p{XDigit}+)(\\.)?)|(0[xX](\\p{XDigit}+)?(\\.)(\\p{XDigit}+)" + ')') + ")[pP][+-]?" + "(\\p{Digit}+)" + ')') + ")[fFdD]?))[\\x00-\\x20]*");
    }
}

