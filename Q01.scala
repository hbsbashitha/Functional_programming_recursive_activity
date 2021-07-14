object Scala{  
    def main(args:Array[String]){  
         println(prime(5))
         println(prime(8))
            
    }


    def gcd(a:Int, b:Int):Int= b match {
        case 0 =>a
        case b if (b>a) =>gcd(b,a)
        case _ => gcd(b,a%b)
    }


    def prime(p:Int, n:Int=2): Boolean = n match {
        case x if(p==x) => true
        case x if(gcd(p,x)>1) => false
        case x => prime(p,x+1)
    }

}  