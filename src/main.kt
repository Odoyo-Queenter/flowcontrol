fun main(){
    oddNumbers()

    println(identity(arrayOf("Faith","Junior","Angelah","Kimberly","Athanasious","HaizolMunde"))
    )

    robot(5)
    robot(10)
    robot(24)


    multiples()
    

}
fun oddNumbers() {
    for (d in 1..100) {
        if (d  % 2!==0) {
            println(d)
        }

    }
}

//2. Create a function that takes in an array of names and returns the number of
//names
//2. Create a function that takes in an array of names and returns the number of
//names longer than 5 characters (2pts) longer than 5 characters (2pts)
fun identity(names:Array<String>):Int{
    var call = 0
    names.forEach { ed ->
        if (ed .length>5){
            call++

        }

    }
    return call

}
//3.You are creating a robot to serve drinks at a party. The robot is required to
//serve a glass of milk for guests under the age of 6. For guests under the age of
//15 but over the age of 6, the robot serves a bottle of fanta orange. Everybody
//else gets a bottle of coca cola. Create a function that will make these
//decisions, printing out the name of the drink each person gets according to
//their age. (2pts)
fun robot(age:Int){
    if (age<=6){
        println("serve milk")
    }
    else if (age<15 && age>6){
        println("fanta orange")
    }
    else{
        println("cocacola")
    }
}
//4. Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number. (4pts)
fun multiples() {
    for (y in 1..100) {
        if (y % 5== 0) {
            println("Buzz")
        }
        else if (y % 3 == 0) {
            println("Fizz")
        }
        if(y%3==0 && y%5==0){
            println("FizzBuzz")

        }
    }
}
