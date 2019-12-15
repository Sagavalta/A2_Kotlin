fun main(){
    val animalerie = Animalerie()

    animalerie.ajouterAnimal(Chien())
    animalerie.ajouterAnimal(Chat())
    animalerie.ajouterAnimal(Singe())
    animalerie.ajouterAnimal(Chouette())
    animalerie.ajouterAnimal(Puce())

    for (animal in animalerie.list){
        animal.parler()
        animal.quiSuisJe()
    }
}