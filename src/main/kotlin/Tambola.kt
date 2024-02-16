package org.example

class Tambola(){
    private var crossedNumberCount = 0

    fun rowValidation(
        ticket: ArrayList<ArrayList<String>>,
        numbersAnnounced: ArrayList<String>,
        rowNumber: Int
    ): Boolean {
        var currentNumberCount = 0

        while (currentNumberCount < numbersAnnounced.size) {
            if (numbersAnnounced[currentNumberCount] in ticket[rowNumber]) {
                crossedNumberCount += 1
            }
            if (currentNumberCount == numbersAnnounced.size - 1 && crossedNumberCount == 5) {
                return true
            }
            if (crossedNumberCount == 5) {
                return false
            }
            currentNumberCount += 1
        }
        return false
    }

    fun earlyFiveOrFullHouseValidation(
        ticket: ArrayList<ArrayList<String>>, numbersAnnounced: ArrayList<String>,
        number: Int
    ): Boolean {
        var numberCount = 0
        while (numberCount < numbersAnnounced.size) {
            if (numbersAnnounced[numberCount] in ticket[0] || numbersAnnounced[numberCount] in ticket[1] ||
                numbersAnnounced[numberCount] in ticket[2]
            ) {
                crossedNumberCount += 1
            }
            if (numberCount == numbersAnnounced.size - 1 && crossedNumberCount == number) {
                return true
            }
            if (crossedNumberCount == number) {
                return false
            }
            numberCount += 1
        }
        return false
    }
}