package com.example.horarios

import java.time.LocalDate

data class Permission (val employee: Employe,
                       val date: LocalDate,
                       val justification: String,){
}