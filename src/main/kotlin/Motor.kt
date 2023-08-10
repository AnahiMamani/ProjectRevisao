class Motor {
     private var ligado: Boolean = false //a propriedade private nao podem ser acessaddas de fora da class
     fun ligar(){
         ligado = true
         println("Ligando o carro...")
     }
    fun desligar(){
        ligado =false
        println("Desligando o carro...")
    }
    fun status(): String{
        return if(ligado)"Ligado" else "Desligado"
    }
}