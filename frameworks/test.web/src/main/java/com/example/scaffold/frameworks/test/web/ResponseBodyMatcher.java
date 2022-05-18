package com.example.scaffold.frameworks.test.web;

public interface ResponseBodyMatcher {
    /**
     * Delegated to assertj, see also {@link org.junit.jupiter.api.Assertions#assertEquals(Object, Object)}.
     */
    static EqBodyMatcher eq(Object value) {
        return new EqBodyMatcher(value);
    }
    /**
     * Delegated to assertj, see also {@link org.assertj.core.api.AbstractCharSequenceAssert#hasSize(int)}.
     */
    static ResponseBodyMatcher hasSize(int size) {
        return new HasSizeBodyCastStringMatcher(size);
    }
    /**
     * Delegated to assertj, see also {@link org.assertj.core.api.AbstractCharSequenceAssert#isNotEmpty()}.
     */
    static ResponseBodyMatcher isNotEmpty() {
        return new NotEmptyBodyCastStringMatcher();
    }
    /**
     * Delegated to assertj, see also {@link org.junit.jupiter.api.Assertions#assertNotEquals(Object, Object)}.
     */
    static ResponseBodyMatcher notEq(String value) {
        return new NotEqBodyMatcher(value);
    }
    /**
     * Delegated to assertj, see also {@link org.assertj.core.api.AbstractCharSequenceAssert#isNotNull()}.
     */
    static ResponseBodyMatcher isNotNull() {
        return new NotNullBodyMatcher();
    }
    /**
     * Delegated to assertj, see also {@link org.assertj.core.api.AbstractCharSequenceAssert#isNull()}.
     */
    static NullBodyMatcher isNull() {
        return new NullBodyMatcher();
    }
    /**
     * Delegated to assertj, see also {@link org.assertj.core.api.AbstractCharSequenceAssert#isEmpty()}.
     */
    static ResponseBodyMatcher isEmpty() {
        return new EmptyBodyCastStringMatcher();
    }
    /**
     * Delegated to assertj, see also {@link org.assertj.core.api.AbstractCharSequenceAssert#isNullOrEmpty()}.
     */
    static ResponseBodyMatcher isNullOrEmpty() {
        return new IsNullOrEmptyBodyCastStringMatcher();
    }
    void match(Object target);
}