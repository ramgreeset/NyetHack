
fun main() {
    val name = "Радмир"
    var healthPoints = 15
    val isBlessed = true
    val isImmortal = false


    // Аура
    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)
    //Состояние здоровья
    val healthStatus = formatHealthStatus(healthPoints, isBlessed)
    //Отображение сосстояния игрока
    printPlayerStatus(auraColor, isBlessed, name, healthStatus)
    //Кастуем авадакедавру
    castFireball((Math.random()*10).toInt())
}

private fun castFireball(numFireballs: Int){
    println("Авадакедавра сученька.(x$numFireballs)")
}
private fun printPlayerStatus(
    auraColor: String,
    isBlessed: Boolean,
    name: String,
    healthStatus: String
) {
    println("(Аура: $auraColor)" + "(Благословение: ${if (isBlessed) "Да" else "Нет"})")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean, healthPoints: Int, isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal //Присваивание переменной значения типа boolean
    val auraColor = if (auraVisible) "Зеленая" else "Нет ауры"
    return auraColor
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "в отличном состоянии."
        in 85..99 -> if (isBlessed) "легко ранен, но быстро поправляется" else "в хорошем состоянии."
        in 45..84 -> "ранен"
        in 30..44 -> "сильно ранен"
        in 16..29 -> "еле стоит на ногах"
        in 1..15 -> "вот-вот потеряет сознание"
        else ->
            "погиб"
    }
    return healthStatus
}
