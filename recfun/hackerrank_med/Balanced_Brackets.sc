object Solution {
  import scala.collection.mutable.Stack
  var stack = Stack[Char]()
  val i:Int = 0

  def checkStack(i: Int, s:String) {

    var c:Char = s(i)
     

    if( c.equals('(') || c.equals('{') || c.equals('[') ) {
        stack.push(c)
    }

    else {
      if (c.equals(')')) {
        if (stack.isEmpty) stack.push(c)
      else if (stack.top.equals('(')) stack.pop()
    }
    else if(c.equals('}')){
        if(stack.isEmpty) stack.push(c)
        else if(stack.top.equals('{'))  stack.pop()
      }
      else if(c.equals(']')){
        if(stack.isEmpty) stack.push(c)
        else if (stack.top.equals('[')) stack.pop()
      }
    }

    if(i < s.size-1) checkStack(i + 1,s)
  }

  def isBalanced(s: String): String =  {
    // Complete this function
    checkStack(i, s)
    if (stack.isEmpty){
      stack.clear()
      "YES"
    } else {
      stack.clear()
      "NO"
    }
  }


  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var t = sc.nextInt();
    var a0 = 0;
    while(a0 < t){
      var s = sc.next();
      val result = isBalanced(s);
      println(result)
      a0+=1;
    }
  }
}
