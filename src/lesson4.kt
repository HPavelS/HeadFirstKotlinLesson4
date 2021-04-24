fun main() {
    val dog1 = Dog("Lopy", 30, "Taksa")
//    println(dog1.bark())
    val dog2 = Dog("Kaka", 18, "Moska")
//    println(dog2.bark())
//    println(dog1.weight)
    val dog3 = arrayOf(Dog("Kalo", 39), Dog("Mora", 17, "Auch"))
//    println(dog3[0].bark())
    dog3[1].name = "Mari"
//    println(dog3[1].name)
//    println(dog1.breed)
//    println(dog2.breed)
//    println(dog3[0].breed)
    println(dog1.weightInKgs)
    val dog4 = Dog("Fun", -5)
    dog4.weight = 5
    println(dog4.weight)


    val song1 = Songs("Song1", "Artist1")
    val song2 = Songs("Song2", "Artist2")
    val song3 = Songs("Song3", "Artist3")
//    song1.play()
//    song1.stop()
//    song2.play()
//    song2.stop()

val d = DrumKit(true, true)
//    d.playTopHat()
//    d.playSnare()
    d.hasSnare = false
//    d.playTopHat()
//    d.playSnare()


    val t = TapeDeck()
    t.hasRecorder = true
    t.playTape()
    t.recordTape()

    val b = DVDPlayer(true)
    b.playDVD()
    b.recordDVD()

    println("--------------------------------------------------")
    val r = arrayOf(Rectangle(), Rectangle(), Rectangle(), Rectangle())
    for (x in 0..3){
        r[x].width = (x + 1) * 3
        r[x].height = x + 5
        print("Rectangle $x has area ${r[x].area}. ")
        println("It is ${if(r[x].isSquare) "" else "not "}a square")
    }

}