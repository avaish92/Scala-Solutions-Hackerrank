val list:List[Int] = List[Int]()
def g(l: Int, value_at_index: Int) {
 list = list :+ value_at_index
  println(value_at_index)
  if (l > 0) g(l - 1, value_at_index)
}

def k(i:Int, num:Int, l:List[Int]) {
  g(num,l(i))
    //println(l(i))
  if (i < l.size) k(i+1,num,l)
}

def f(num: Int, l: List[Int]):List[Int] = {

  val i:Int = 0
  k(i,num,l)
  return l

}

