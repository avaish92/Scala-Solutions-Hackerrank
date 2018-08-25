def f(delim:Int,arr:List[Int]):List[Int] = {
  val x:List[Int] = arr.filter(_ < delim)
  return x
}

