
object NumberLetters {
    fun countLetter(number: Int):Int{
        var allNumbers=""
        if (number<=1000) {
            for (i in 1..number) {
                allNumbers += numberToLetter(i)
            }
        }
        return allNumbers.count()
    }
    private fun numberToLetter(number:Int):String{
        val millar=number / 1000
        val centena= (number % 1000) / 100
        val decena= ((number % 1000) % 100) / 10
        val unidad = ((number % 1000) % 100) % 10
        var changeToString=""
        if(millar==1) changeToString="onethousand"
        when(centena){
            1-> changeToString+="onehundred"
            2->changeToString+="twohundred"
            3-> changeToString+="threehundred"
            4->changeToString+="fourhundred"
            5-> changeToString+="fivehundred"
            6->changeToString+="sixhundred"
            7-> changeToString+="sevenhundred"
            8->changeToString+="eighthundred"
            9-> changeToString+="ninehundred"
        }
        when(decena){
            1->{
                when (unidad) {
                    0 -> changeToString += "ten"
                    1 -> changeToString += "eleven"
                    2 -> changeToString += "twelve"
                    3 -> changeToString += "thirteen"
                    4 -> changeToString += "fourteen"
                    5 -> changeToString += "fifteen"
                    6 -> changeToString += "sixteen"
                    7 -> changeToString += "seventeen"
                    8 -> changeToString += "eighteen"
                    9 -> changeToString += "nineteen"
                }
            }
            2->changeToString+="twenty"
            3-> changeToString+="thirty"
            4->changeToString+="forty"
            5-> changeToString+="fifty"
            6->changeToString+="sixty"
            7-> changeToString+="seventy"
            8->changeToString+="eighty"
            9-> changeToString+="ninety"
        }
        if (decena>=2 || decena==0) {
            when (unidad) {
                1 -> changeToString += "one"
                2 -> changeToString += "two"
                3 -> changeToString += "three"
                4 -> changeToString += "four"
                5 -> changeToString += "five"
                6 -> changeToString += "six"
                7 -> changeToString += "seven"
                8 -> changeToString += "eight"
                9 -> changeToString += "nine"
            }
         }
        return changeToString
    }
}