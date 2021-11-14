# NumberLetterCounts

## Description

If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.

##Targets

✅ Task 1 → If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?

##How did I get to this solution?

🇺🇸
1.- divide the quantity by digit, thousand, hundred, ten unit.
example: 345 M = 0, C = 3, D = 4, U = 5

2.- Depending on the position of the previously converted number, its value was added to a string, but in letters.
example: C = 3 string <-threehundred

3.- with a cycle from one to n (no greater than 1000), go concatenating all the numbers previously converted to letters
example: onetwothree….

4.- finally, only count the size of the chain to reach the solution

🇪🇸
1.- dividir la cantidad por dígito, millar, centena, decena unidad.
ejemplo: 345   M=0, C=3, D=4,U=5

2.- dependiendo de la posición del número previamente convertido se agrego a una cadena su valor pero en letras.
ejemplo:  C=3  cadena<-threehundred

3.- con un ciclo desde uno hasta n(no mayor a 1000) ir concatenando todos los números previamente convertidos a letras
ejemplo: onetwothree….

4.- finalmente, solamente contar el tamaño de la cadena para asi llegar a la solución


## Source

`object NumberLetters {`

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
        val thousand=number / 1000
        val hundred= (number % 1000) / 100
        val ten= ((number % 1000) % 100) / 10
        val unit = ((number % 1000) % 100) % 10
        var changeToString=""
        if(thousand==1) changeToString="onethousand"
            when(hundred){
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
            when(ten){
                1->{
                    when (unit) {
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
            if (ten>=2 || ten==0) {
                when (unit) {
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
`}`

### Created by

- **Victor Escalante**
