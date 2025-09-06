package net.fellbaum.jemoji;

import com.fasterxml.jackson.annotation.k;
import java.util.Arrays;
import java.util.List;

public enum q1 {
    ALPHANUM("alphanum", d0.j),
    ANIMAL_AMPHIBIAN("animal-amphibian", d0.c),
    ANIMAL_BIRD("animal-bird", d0.c),
    ANIMAL_BUG("animal-bug", d0.c),
    ANIMAL_MAMMAL("animal-mammal", d0.c),
    ANIMAL_MARINE("animal-marine", d0.c),
    ANIMAL_REPTILE("animal-reptile", d0.c),
    ARROW("arrow", d0.j),
    ARTS_AND_CRAFTS("arts & crafts", d0.b),
    AV_SYMBOL("av-symbol", d0.j),
    AWARD_MEDAL("award-medal", d0.b),
    BODY_PARTS("body-parts", d0.h),
    BOOK_PAPER("book-paper", d0.g),
    CAT_FACE("cat-face", d0.i),
    CLOTHING("clothing", d0.g),
    COMPUTER("computer", d0.g),
    COUNTRY_FLAG("country-flag", d0.e),
    CURRENCY("currency", d0.j),
    DISHWARE("dishware", d0.f),
    DRINK("drink", d0.f),
    EMOTION("emotion", d0.i),
    EVENT("event", d0.b),
    FACE_AFFECTION("face-affection", d0.i),
    FACE_CONCERNED("face-concerned", d0.i),
    FACE_COSTUME("face-costume", d0.i),
    FACE_GLASSES("face-glasses", d0.i),
    FACE_HAND("face-hand", d0.i),
    FACE_HAT("face-hat", d0.i),
    FACE_NEGATIVE("face-negative", d0.i),
    FACE_NEUTRAL_SKEPTICAL("face-neutral-skeptical", d0.i),
    FACE_SLEEPY("face-sleepy", d0.i),
    FACE_SMILING("face-smiling", d0.i),
    FACE_TONGUE("face-tongue", d0.i),
    FACE_UNWELL("face-unwell", d0.i),
    FAMILY("family", d0.h),
    FLAG("flag", d0.e),
    FOOD_ASIAN("food-asian", d0.f),
    FOOD_FRUIT("food-fruit", d0.f),
    FOOD_MARINE("food-marine", d0.f),
    FOOD_PREPARED("food-prepared", d0.f),
    FOOD_SWEET("food-sweet", d0.f),
    FOOD_VEGETABLE("food-vegetable", d0.f),
    GAME("game", d0.b),
    GENDER("gender", d0.j),
    GEOMETRIC("geometric", d0.j),
    HAIR_STYLE("hair-style", d0.d),
    HANDS("hands", d0.h),
    HAND_FINGERS_CLOSED("hand-fingers-closed", d0.h),
    HAND_FINGERS_OPEN("hand-fingers-open", d0.h),
    HAND_FINGERS_PARTIAL("hand-fingers-partial", d0.h),
    HAND_PROP("hand-prop", d0.h),
    HAND_SINGLE_FINGER("hand-single-finger", d0.h),
    HEART("heart", d0.i),
    HOTEL("hotel", d0.k),
    HOUSEHOLD("household", d0.g),
    KEYCAP("keycap", d0.j),
    LIGHT_AND_VIDEO("light & video", d0.g),
    LOCK("lock", d0.g),
    MAIL("mail", d0.g),
    MATH("math", d0.j),
    MEDICAL("medical", d0.g),
    MONEY("money", d0.g),
    MONKEY_FACE("monkey-face", d0.i),
    MUSIC("music", d0.g),
    MUSICAL_INSTRUMENT("musical-instrument", d0.g),
    OFFICE("office", d0.g),
    OTHER_OBJECT("other-object", d0.g),
    OTHER_SYMBOL("other-symbol", d0.j),
    PERSON("person", d0.h),
    PERSON_ACTIVITY("person-activity", d0.h),
    PERSON_FANTASY("person-fantasy", d0.h),
    PERSON_GESTURE("person-gesture", d0.h),
    PERSON_RESTING("person-resting", d0.h),
    PERSON_ROLE("person-role", d0.h),
    PERSON_SPORT("person-sport", d0.h),
    PERSON_SYMBOL("person-symbol", d0.h),
    PHONE("phone", d0.g),
    PLACE_BUILDING("place-building", d0.k),
    PLACE_GEOGRAPHIC("place-geographic", d0.k),
    PLACE_MAP("place-map", d0.k),
    PLACE_OTHER("place-other", d0.k),
    PLACE_RELIGIOUS("place-religious", d0.k),
    PLANT_FLOWER("plant-flower", d0.c),
    PLANT_OTHER("plant-other", d0.c),
    PUNCTUATION("punctuation", d0.j),
    RELIGION("religion", d0.j),
    SCIENCE("science", d0.g),
    SKIN_TONE("skin-tone", d0.d),
    SKY_AND_WEATHER("sky & weather", d0.k),
    SOUND("sound", d0.g),
    SPORT("sport", d0.b),
    SUBDIVISION_FLAG("subdivision-flag", d0.e),
    TIME("time", d0.k),
    TOOL("tool", d0.g),
    TRANSPORT_AIR("transport-air", d0.k),
    TRANSPORT_GROUND("transport-ground", d0.k),
    TRANSPORT_SIGN("transport-sign", d0.j),
    TRANSPORT_WATER("transport-water", d0.k),
    WARNING("warning", d0.j),
    WRITING("writing", d0.g),
    ZODIAC("zodiac", d0.j);

    private static final List R9;
    private final String a;
    private final d0 b;

    static {
        q1.R9 = Arrays.asList(((q1[])q1.S9.clone()));
    }

    private q1(String s1, d0 d00) {
        this.a = s1;
        this.b = d00;
    }

    @k
    public static q1 a(String s) {
        for(Object object0: q1.R9) {
            q1 q10 = (q1)object0;
            if(q10.getName().equals(s)) {
                return q10;
            }
            if(false) {
                break;
            }
        }
        throw new IllegalArgumentException("No EmojiSubGroup found for name: " + s);
    }

    public d0 b() {
        return this.b;
    }

    public static List c() {
        return q1.R9;
    }

    public String getName() {
        return this.a;
    }
}

