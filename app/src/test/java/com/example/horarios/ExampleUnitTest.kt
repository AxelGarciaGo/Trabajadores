package com.example.horarios

import org.junit.Test

import org.junit.Assert.*
import java.time.LocalDate

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun Seniority_isCorrect() {
        val employee=Employe(id=1,
            fullName = "Rodolfo Ibarra Orozco",
            curp = "IORO651220HOCRMN09",
            dateOfAdmission = LocalDate.parse("2000-09-08"),
            budgetKey = "ABCDE12345",
            academicLevel = AcademicLevel.DOCTORAL
        )
        assertEquals(22, employee.getSeniority())

    }
}