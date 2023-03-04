
fun main() {
    val name = "Радмир"
    var healthPoints = 5
    val isBlessed = true
    val isImmortal = false


    // Аура
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal //Присваивание переменной значения типа boolean
//    val auraColor = if (auraVisible) "Зеленая" else "Нет ауры"
    val karma = (Math.pow(Math.random(), (110 - healthPoints) / 100.0)  * 20).toInt()

    val auraColor = when (karma) {
        in 0..5 -> "Красный"
        in 6..10 -> "Оранжевый"
        in 11..15 -> "Пурпурный"
        in 16..20 -> "Зеленый"
        else -> "Нет"
    }

    val healthStatus = when (healthPoints) {
        100 -> "в отличном состоянии."
        in 85..99 -> if(isBlessed)"включил режим ускоренной регенерации" else "в хорошем состоянии."
        in 45..84 -> "ранен"
        in 30..44 ->"сильно ранен"
        in 16..29 ->"еле стоит на ногах"
        in 1..15 ->"вот-вот потеряет сознание"
        else ->
        "погиб"
    }
    // Состояние игрока
    println("(Аура: $auraColor)" + "(Благословение: ${if(isBlessed)"Да" else "Нет"})")
    println("$name $healthStatus")


}