package net.fellbaum.jemoji;

import com.fasterxml.jackson.annotation.k;
import j..util.Collection.-EL;
import j..util.stream.Collectors;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.List;

public enum d0 {
    ACTIVITIES("Activities"),
    ANIMALS_AND_NATURE("Animals & Nature"),
    COMPONENT("Component"),
    FLAGS("Flags"),
    FOOD_AND_DRINK("Food & Drink"),
    OBJECTS("Objects"),
    PEOPLE_AND_BODY("People & Body"),
    SMILEYS_AND_EMOTION("Smileys & Emotion"),
    SYMBOLS("Symbols"),
    TRAVEL_AND_PLACES("Travel & Places");

    private final String a;
    private static final List l;

    static {
        d0.l = Arrays.asList(((d0[])d0.m.clone()));
    }

    private d0(String s1) {
        this.a = s1;
    }

    @k
    public static d0 b(String s) {
        for(Object object0: d0.l) {
            d0 d00 = (d0)object0;
            if(d00.getName().equals(s)) {
                return d00;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalArgumentException("No EmojiGroup found for name " + s);
    }

    public EnumSet c() {
        return EnumSet.copyOf(((Collection)Collection.-EL.stream(q1.c()).filter((q1 q10) -> q10.b() == this).collect(Collectors.toList())));
    }

    public static List d() {
        return d0.l;
    }

    // 检测为 Lambda 实现
    private boolean e(q1 q10) [...]

    public String getName() {
        return this.a;
    }
}

