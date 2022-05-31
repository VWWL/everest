package com.example.scaffold.frameworks.persistence.aggregates

import java.util.*
import java.util.function.Function
import java.util.stream.Collectors

class AggregatesResult<E, D, A>(private val data: E, private val asDomain: Function<D, A>) {
    fun self(): E {
        return data
    }

    fun domain(): A {
        return asDomain.apply(ensureExistence(data as D))
    }

    fun domains(): List<A> {
        return (data as List<D>).stream()
            .peek(this::ensureExistence)
            .map(this.asDomain::apply)
            .collect(Collectors.toList())
    }

    private fun ensureExistence(data: D): D {
        return Optional.ofNullable(data).orElseThrow { RuntimeException("error.can-not-get-aggregate") }
    }
}
