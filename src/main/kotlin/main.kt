
fun main() {
    val name = "ТриДогНайт"
    var healthPoints = 84
    val regeneration = true
    val isImmortal = false

    // Аура удачи
    val luck = regeneration && healthPoints > 50 || isImmortal //Присваивание переменной значения типа boolean
    val auraLuck = if (luck) "Сопутствует удача" else "Удача отвернулась"
    println(auraLuck)

    val healthStatus = if (healthPoints == 100) {
        "в отличном состоянии."
    }else if(healthPoints in 85..99) {
        if(regeneration)
            "включил режим ускоренной регенерации"
            else
        "в хорошем состоянии."
    }else if(healthPoints in 45..84){
        "ранен"
    }else if(healthPoints in 30..44){
        "сильно ранен"
    } else if (healthPoints in 16..29)
        "еле стоит на ногах"
    else if (healthPoints in 0..15) {
        "вот-вот потеряет сознание"
    }else
        "Приплыли"

    // Состояние игрока
    println(name + " " + healthStatus)


}
