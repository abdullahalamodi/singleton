object mySingelton {
    private var name:String;
    init {
        name = "singleton object "
    }

    fun printName(){
        println(name);
    }
}

fun main() {
    mySingelton.printName();
}