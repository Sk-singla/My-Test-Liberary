package com.example.calculation

class Calculation {

    companion object{
        fun add(a:Int,b:Int):Int{
            return a+b
        }

        fun subtract(a:Int,b:Int):Int{
            return a-b
        }

        fun multiply(a:Int,b:Int):Int{
            return a*b
        }
        fun divide(a:Int,b:Int):Int{
            if(b!=0) {
                return a / b
            }
            return 0
        }

    }
}