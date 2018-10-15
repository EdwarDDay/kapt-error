package de.edwardday.kapterror

import dagger.Component

@Component
@Suppress("unused")
interface ApplicationComponent {

    fun calculator(): SuspendLengthCalculator
}
