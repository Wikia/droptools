package com.bendb.dropwizard.common.jersey;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class DefaultInjectableTest {
    @Test
    public void returnsTheSameObjectAlways() {
        DefaultInjectable<Object> di = new DefaultInjectable<>(new Object());
        assertThat(di.getValue()).is(di.getValue());
    }

    @Test
    public void theStaticFactoryWorks() {
        Object obj = new Object();
        assertThat(DefaultInjectable.of(obj).getValue()).is(obj);
    }
}