class Carro constructor(private val motor: Motor) {
    var cor:String? = null

    fun ligar (){
        motor.ligar()
    }
    fun desligar(){
        motor.desligar()
    }
    fun anda(){
        if(motor.estaLigado())
        println("O carro esta em movimento")
    }
    fun buzina(){
        println("BIII BIII *buzina*")
    }
    fun freia(){
        println("Freiando o carro")
    }
}