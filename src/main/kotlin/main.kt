
fun main() {
    val name = "Радмир"
    var healthPoints = 5
    val isBlessed = true
    val isImmortal = false



    // Аура
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal //Присваивание переменной значения типа boolean
    val auraColor = if (auraVisible) "Зеленая" else "Нет ауры"


    val healthStatus = healthStatus(healthPoints, isBlessed)

    // Состояние игрока
    println("(Аура: $auraColor)" + "(Благословение: ${if(isBlessed)"Да" else "Нет"})")
    println("$name $healthStatus")


}

private fun healthStatus(healthPoints: Int, isBlessed: Boolean): String {
    val healthStatus = when (healthPoints) {
        100 -> "в отличном состоянии."
        in 85..99 -> if (isBlessed) "включил режим ускоренной регенерации" else "в хорошем состоянии."
        in 45..84 -> "ранен"
        in 30..44 -> "сильно ранен"
        in 16..29 -> "еле стоит на ногах"
        in 1..15 -> "вот-вот потеряет сознание"
        else ->
            "погиб"
    }
    return healthStatus
}