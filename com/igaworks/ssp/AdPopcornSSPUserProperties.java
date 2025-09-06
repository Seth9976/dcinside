package com.igaworks.ssp;

public class AdPopcornSSPUserProperties {
    public static class Builder {
        private int a;
        private int b;
        private String c;
        private String d;

        public Builder() {
            this.a = 0;
            this.b = -1;
            this.c = null;
            this.d = null;
        }

        public final AdPopcornSSPUserProperties build() {
            return new AdPopcornSSPUserProperties(this, null);
        }

        public final Builder country(String s) {
            this.c = s;
            return this;
        }

        public final Builder gender(int v) {
            this.b = v;
            return this;
        }

        public final Builder language(String s) {
            this.d = s;
            return this;
        }

        public final Builder yob(int v) {
            this.a = v;
            return this;
        }
    }

    static abstract class a {
    }

    public final String country;
    public final int gender;
    public final String language;
    public final int yearOfBirth;

    private AdPopcornSSPUserProperties(Builder adPopcornSSPUserProperties$Builder0) {
        this.yearOfBirth = adPopcornSSPUserProperties$Builder0.a;
        this.gender = adPopcornSSPUserProperties$Builder0.b;
        this.country = adPopcornSSPUserProperties$Builder0.c;
        this.language = adPopcornSSPUserProperties$Builder0.d;
    }

    AdPopcornSSPUserProperties(Builder adPopcornSSPUserProperties$Builder0, a adPopcornSSPUserProperties$a0) {
        this(adPopcornSSPUserProperties$Builder0);
    }
}

