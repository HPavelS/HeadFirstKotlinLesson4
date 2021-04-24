class DVDPlayer(var hasRecorder:Boolean) {
    fun recordDVD(){
        if(hasRecorder) println("DVD recording")
    }

    fun playDVD(){
        println("DVD playing")
    }

}