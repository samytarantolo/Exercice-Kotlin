fun main(){
    val petshop = Petshop()

    petshop.ajoutanimal(dog())
    petshop.ajoutanimal(cat())
    petshop.ajoutanimal(parrot())

    for (petshop in petshop.list){
        petshop.WhoIAm()
        petshop.Speak()
    }
}