package org.example.lesson_2

fun main() {
    val quantityStaff = 50
    val salaryStaff = 30000
    val quantityInterns = 20
    val salaryInterns = 20000
    val quantityAll = quantityStaff + quantityInterns
    val expensesStaff = quantityStaff * salaryStaff
    val expensesInterns = (quantityInterns * salaryInterns)
    val expensesGeneral = (expensesStaff + expensesInterns)
    val salaryAverage = (expensesGeneral / quantityAll)
    println("Расходы на выплату зарплаты постоянным сотрудникам " + "- " + "$expensesStaff " + "руб.")
    println("Общие расходы на выплату зарплаты сотрудникам " + "- " + "$expensesGeneral " + "руб.")
    println("Средняя зарплата каждого сотрудника " + "- " + "$salaryAverage " + "руб.")
}