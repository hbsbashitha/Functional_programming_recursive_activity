object Scala{  
    def main(args:Array[String]){  
        println(iseven(4))
        println(iseven(5))
        println(isodd(4))
        println(isodd(5))
            
    }

    def iseven(x:Int):Boolean = x match {
        case 0 =>true
        case _ => isodd(x-1)
    }

    def isodd(x:Int): Boolean = !(iseven(x))



}  