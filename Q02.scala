object Scala{  
    def main(args:Array[String]){  
         primeSeq(1,2)
            
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
    def primeSeq(i:Int,n:Int):Any ={
        if(prime(i)==true){
            println(i)
        }
        if( i<n ){
            primeSeq(i+1,n)
        }
        
    }

} 