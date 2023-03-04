
fun main() {
    val name = "ТриДогНайт"
    var healthPoints = 51
    val isBlessed = true
    val isImmortal = false


    // Аура
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal //Присваивание переменной значения типа boolean
    val auraColor = if (auraVisible) "Зеленая" else "Нет ауры"

    val healthStatus = when (healthPoints) {
        100 -> "в отличном состоянии."
        in 85..99 -> if(isBlessed)"включил режим ускоренной регенерации" else "в хорошем состоянии."
        in 45..84 -> "ранен"
        in 30..44 ->"сильно ранен"
        in 16..29 ->"еле стоит на ногах"
        in 0..15 ->"вот-вот потеряет сознание"
        else ->
        "Приплыли"
    }
    // Состояние игрока
    println("(Аура: $auraColor)" + "(Благословение: ${if(isBlessed)"Да" else "Нет"})")
    println("$name $healthStatus")


}