
fun main() {
    val name = "ТриДогНайт"
    var healthPoints = 60
    val regeneration = true
    val isImmortal = false

    // Аура
    val auraVisible = regeneration && healthPoints > 50 || isImmortal //Присваивание переменной значения типа boolean
    if (auraVisible) {
        println("Аура")
    } else {
        println("NONE")
    }

    if (healthPoints == 100) {
        println(name + " в отличном состоянии.")
    }else if(healthPoints >= 85) {
        if(regeneration)
            println(name + " включил режим ускоренной регенерации")
            else
        println(name + " в хорошем состоянии.")
    }else if(healthPoints >= 60){
        println(name + " ранен")
    }else if(healthPoints >= 45){
        println(name + " сильно ранен")
    } else if (healthPoints >= 30)
        println(name + " еле стоит на ногах")
    else if (healthPoints >= 15) {
        println(name + " вот-вот потеряет сознание")
    }else
        println("Приплыли")


}
