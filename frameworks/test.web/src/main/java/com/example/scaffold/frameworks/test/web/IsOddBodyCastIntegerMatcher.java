package com.example.scaffold.frameworks.test.web;

import static org.assertj.core.api.Assertions.assertThat;

public final class IsOddBodyCastIntegerMatcher extends BodyCastComparableMatcher {
    IsOddBodyCastIntegerMatcher() {
    }

    @Override
    protected void realMatch(Object value) {
        assertThat((Integer) value).isOdd();
    }
}
