package com.example.horarios

import java.time.LocalDate

fun hasPermission(employee: Employe, date: LocalDate, permissions: List<Permission>): Boolean {
    val permission = permissions.firstOrNull{it.date==date && it.employee==employee}
    return (permission!=null)
}