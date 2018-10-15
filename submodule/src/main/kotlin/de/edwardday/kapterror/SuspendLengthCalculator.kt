package de.edwardday.kapterror

import kotlinx.coroutines.experimental.yield
import javax.inject.Inject

class SuspendLengthCalculator @Inject constructor() {

    @Suppress("unused")
    suspend fun calculate() {
        yield()
        emptyList<Unit>().forEach { _ -> emptyList<Unit>().map { _ -> } }
    }
}
