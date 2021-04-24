class Songs(val title:String, val artist:String) {
    fun play(){
        println("Playing the song $title by $artist")
    }
    fun stop(){
        println("Stopped playing $title")
    }

}