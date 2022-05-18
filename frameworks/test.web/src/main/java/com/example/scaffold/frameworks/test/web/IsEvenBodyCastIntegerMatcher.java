package com.example.scaffold.frameworks.test.web;

import static org.assertj.core.api.Assertions.assertThat;

public final class IsEvenBodyCastIntegerMatcher extends BodyCastComparableMatcher {
    IsEvenBodyCastIntegerMatcher() {
    }

    @Override
    protected void realMatch(Object value) {
        assertThat((Integer) value).isEven();
    }
}
