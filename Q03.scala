object Scala{  
    def main(args:Array[String]){  
        println(sum(5))
            
    }

    def sum(n:Int):Int = n match {
        case 0 => 0
        case _ => n+sum(n-1)
    }



}  