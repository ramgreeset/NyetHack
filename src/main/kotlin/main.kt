
fun main() {
    val name = "ТриДогНайт"
    var healthPoints = 87
    val regeneration = true
    val isImmortal = false

    // Аура удачи
    val luck = regeneration && healthPoints > 50 || isImmortal //Присваивание переменной значения типа boolean
    val auraLuck = if (luck) "Сопутствует удача" else "Удача отвернулась"

    val healthStatus = if (healthPoints == 100) {
        "в отличном состоянии."
    }else if(healthPoints >= 85) {
        if(regeneration)
            "включил режим ускоренной регенерации"
            else
        "в хорошем состоянии."
    }else if(healthPoints >= 60){
        "ранен"
    }else if(healthPoints >= 45){
        "сильно ранен"
    } else if (healthPoints >= 30)
        "еле стоит на ногах"
    else if (healthPoints >= 15) {
        "вот-вот потеряет сознание"
    }else
        "Приплыли"

    // Состояние игрока
    println(name + " " + healthStatus)

}
