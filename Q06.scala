object Scala{  
    def main(args:Array[String]){  
        println(fibseq(10))
            
    }

    def fib(x:Int):Int = x match {
        case 0 =>0
        case 1 =>1
        case _ => fib(x-1)+fib(x-2)
    }

    def fibseq(n:Int):Any={
        if(n>0){
            fibseq(n-1)
        }
        println(fib(n))
    }



}  