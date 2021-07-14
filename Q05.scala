object Scala{  
    def main(args:Array[String]){  
        println(sum_even(10))
            
    }

    def sum_even(n:Int):Int = n match {
        case 0 => 0
        case n if(iseven(n)==true) => n+sum_even(n-1)
        case _ =>sum_even(n-1)
    }


    def iseven(x:Int):Boolean = x match {
        case 0 =>true
        case _ => isodd(x-1)
    }

    def isodd(x:Int): Boolean = !(iseven(x))



}  